package org.example;

import org.example.basic.Dancer;
import org.example.inherit.StreetDancer;
import org.example.inherit.idolDancer;

public class Main {
    public static void main(String[] args) {

        Dancer dancer = new Dancer( "총알탄", "춤신춤왕");
        dancer.dance();
        System.out.println();

        idolDancer idolDancer = new idolDancer("IU", "이지은" );

        StreetDancer streetDancer = new StreetDancer("길거리춤꾼", "박항서");

        idolDancer.dance();
        System.out.println();

        streetDancer.dance();
    }
}