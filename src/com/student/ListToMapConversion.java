package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapConversion {
        public static void main(String[] args) {
            List<Hosting> list = new ArrayList<>();
            list.add(new Hosting(1, "liquidweb.com", 80000));
            list.add(new Hosting(2, "linode.com", 90000));

            List<Hosting> upcomingList = new ArrayList<>();
            upcomingList.add(new Hosting(1, "liquidweb.com", 80000));
            upcomingList.add(new Hosting(2, "linode.com", 90000));
            upcomingList.add(new Hosting(3, "digitalocean.com", 120000));
            upcomingList.add(new Hosting(4, "aws.amazon.com", 200000));
            upcomingList.add(new Hosting(5, "mkyong.com", 1));

            List<String> movieCode = list.stream().map(a->a.getId()+"").collect(Collectors.toList());

            System.out.println(movieCode);

            Function<Hosting, String> funMovie = a->a.getId()+"";
            Function<Hosting, Hosting> funMovie2 = a->a;
            Map<String,Hosting> filterMap = upcomingList.stream().filter(u->movieCode.contains(u.getId()+""))
                    .collect(Collectors.toMap(funMovie, funMovie2));
            System.out.println(filterMap);

            System.out.println(list);

            for(Hosting h : list) {
               if(filterMap.containsKey(h.getId()+"")){
                   System.out.println("Data found   "+h.getId()+"");
                   h.setName(h.getName()+" done");
               }else{
                   System.out.println("Data not found  "+h.getId()+"");
               }
            }

            System.out.println(list);
    }
}

class Hosting {
    private int Id;
    private String name;
    private long websites;

    @Override
    public String toString() {
        return "Hosting{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", websites=" + websites +
                '}';
    }

    @Override
    public boolean equals(Object b){
        if(this==b){
            return true;
        }
        if(! (b instanceof Hosting) ){ return false;}

        Hosting host = (Hosting) b;
        return websites== host.websites && Objects.equals(name,host.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,websites);
    }

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }
}