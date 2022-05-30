package com.student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8NewFeatures {

    public static void main(String[] args) {
        List<String> list1 = List.of("A","B","C","D","E","F");
        String string1  = "ABCDEFGHIJKL";
        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10,10);
//        ArrayList
//        HashMap
        Map<String,Long> map1 = Arrays.stream(string1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);

        System.out.println(Arrays.stream(string1.split("")).filter(res->res.equalsIgnoreCase("a")).collect(Collectors.toList()));

        Map<String,String> map2 = list1.stream().collect(Collectors.toMap(a->a,a->a));
        System.out.println(map2);

        System.out.println("Average "+ list2.stream().mapToDouble(a->a).average().orElse(0.0));

        System.out.println("SUM "+ list2.stream().mapToInt(a->a).sum());

        System.out.println("SUM "+ list2.stream().reduce(0,Integer::sum));

        System.out.println("SUM "+ list2.stream().collect(Collectors.summingInt(Integer::intValue)));

        System.out.println("Max "+list2.stream().max(Integer::compareTo).orElse(0));

        System.out.println("Max Reverse "+list2.stream().max(Comparator.reverseOrder()).orElse(0));

        System.out.println("Second Max "+list2.stream().sorted(Comparator.reverseOrder()).skip(1).max(Integer::compareTo).get());

        System.out.println("SecondLast number "+list2.stream().skip(2).limit(4).collect(Collectors.toList()));

        List<Child> childList1 = List.of(new Child(1,"Shive",List.of("shiva@123","shiva@234")),
                new Child(2,"Shive2",List.of("shiva@1234","shiva@2345")));

        System.out.println("Children names "+childList1.stream().map(a->a.getName()).collect(Collectors.toList()));

        System.out.println("Children Emails with map "+ childList1.stream().map(a->a.getEmails()).collect(Collectors.toList()));

        System.out.println("Children Email with flatmap "+childList1.stream().flatMap(a->a.getEmails().stream().skip(1)).collect(Collectors.toList()));
    }

}
class Child{
    private int id;
    private String name;
    private List<String> emails;

    public Child() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Child(int id, String name, List<String> emails) {
        this.id = id;
        this.name = name;
        this.emails = emails;
    }

    public boolean equals(Object o1){
        if(o1==this){
            return true;
        }
        if (! (o1 instanceof Child))
            return false;

        Child child1 = new Child();
        child1 = (Child) o1;

        return child1.getName().equalsIgnoreCase(this.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}