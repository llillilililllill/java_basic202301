package org.example.inherit;

import org.example.basic.Dancer;

public class idolDancer extends Dancer {

    private int numberOfFan; // 팬의 수

    public idolDancer(String creName, String myName){
        super(creName, myName);
        this.numberOfFan = 10;
        System.out.println("idolDancer 생성됨");
    }

    private void wink() {
        System.out.println("윙크");
    }
    
    // 오버라이딩: 부모의 메서드를 재정의
    // 부모의 메서드 시그니처(이름, 리턴타입, 파라미터)를 똑같이 맞춰야함
    @Override
    public void dance() {
        super.dance();
        wink();
    }
}
