package org.example.poly;

import org.example.basic.Dancer;
import org.example.inherit.idolDancer;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTeam {

    private List<Dancer> dancers = new ArrayList<>();

    public void joinDancer(Dancer dancer) {
        dancers.add(dancer);
        System.out.println(dancer.getMyName() + "님이 팀에 가입했습니다.");
        System.out.println("현재 팀원수: " + dancers.size() + "명");
    }

    // 군무연습
    public void groupDance() {
        for (Dancer dancer : dancers) {
            dancer.dance();
        }
    }
}
