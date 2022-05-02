package com.student;

import java.io.*;

public class FileTextCheck {

    public static void main(String[] args) {

        User u1 = new User("Sudhakar", 27, "Male");
        User u2 = new User("Richa", 25, "Female");

        try {
            FileOutputStream fos = new FileOutputStream(new File("/home/orange/Desktop/myObjects.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(u1);
            oos.writeObject(u2);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(new File("/home/orange/Desktop/myObjects.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);

            User pr1 = (User) ois.readObject();
            User pr2 = (User) ois.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static class User implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
        private String gender;

        User(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
        }
    }
}

