package org.example.inherit;

import org.example.basic.Dancer;
import org.example.basic.Rapper;

import static java.lang.System.*;

public class StreetDancer extends Dancer
        implements Rapper {

    public StreetDancer(String crewName, String myName) {
        super(crewName, myName);
    }

    @Override
    public void dance() {
        out.println("비보잉을 합니다.");
    }

    @Override
    public void rap() {

    }
}
