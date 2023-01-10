package org.example.inherit;

import org.example.basic.Dancer;
import org.example.basic.Rapper;
import org.example.basic.Singer;

import static java.lang.System.*;

public class idolDancer extends Dancer
        implements Singer, Rapper {

    private int numberOfFan; // 팬의 수

    public idolDancer(String creName, String myName){
        super(creName, myName);
        this.numberOfFan = 10;
        out.println("idolDancer 생성됨");
    }

    private void wink() {
        out.println("윙크");
    }
    
    // 오버라이딩: 부모의 메서드를 재정의
    // 부모의 메서드 시그니처(이름, 리턴타입, 파라미터)를 똑같이 맞춰야함
    @Override
    public void dance() {
        wink();
    }

    @Override
    public void sing() {
        out.println("노래");
    }

    @Override
    public void rap() {

    }
}
