package org.example;

import org.example.beans.Goods;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Goods goods1 = new Goods("세탁기", 30000);
        Goods goods2 = new Goods("세탁기", 30000);

        // soutv
        System.out.println("goods1 = " + goods1);
        System.out.println("goods2 = " + goods2);
        // System.out.println(goods1.hashCode());

        System.out.println("goods1 equals goods2 = " + goods1.equals(goods2));
        System.out.println();

        Set<String> set1 = new  HashSet<>();
        set1.add("짜장면");
        set1.add("짬뽕");
        set1.add("짜장면");
        
        System.out.println("set1 = " + set1);
        System.out.println("set1.size() = " + set1.size());
        System.out.println();

        Set<Goods> set2 = new HashSet<>();
        set2.add(goods1);
        set2.add(goods2);

        System.out.println("set2 = " + set2);
        System.out.println("set2.size() = " + set2.size());
        System.out.println();

        System.out.println(goods1.hashCode());
        System.out.println(goods2.hashCode());
    }
}