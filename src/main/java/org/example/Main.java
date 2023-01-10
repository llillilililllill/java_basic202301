package org.example;

import org.example.basic.Dancer;
import org.example.inherit.StreetDancer;
import org.example.inherit.idolDancer;
import org.example.poly.PerformanceTeam;

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

        Dancer idoldancer1 = new idolDancer("아이돌팀1", "아이돌1");
        Object idoldancer2 = new idolDancer("아이돌팀2", "아이돌2");
        idolDancer idoldancer3 = new idolDancer("아이돌팀3", "아이돌3");

        Dancer Streetdancer1 = new StreetDancer("스트릿댄서1", "스트릿1");
        Object Streetdancer2 = new StreetDancer("스트릿댄서2", "스트릿2");
        StreetDancer Streetdancer3 = new StreetDancer("스트릿댄서3", "스트릿3");

        PerformanceTeam Team = new PerformanceTeam();

        Team.joinDancer(idoldancer1);
        Team.joinDancer(Streetdancer1);
    }
}