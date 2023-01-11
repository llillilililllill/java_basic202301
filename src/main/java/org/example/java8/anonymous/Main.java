package org.example.java8.anonymous;

public class Main {

    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }
    public static void main(String[] args) {

        // 덧셈기능을 구현한 계산기 객체를 생성
        Calculator addCal = new AddCalculator();
        System.out.println(addCal.operate(10, 20));
        System.out.println();

        // 뺄셈기능 (내부 클래스)
        Calculator subCal = new SubCalculator();
        System.out.println(subCal.operate(100, 20));
        System.out.println();

        // 곱셈기능 (익명 클래스)
        Calculator multiCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        System.out.println(multiCal.operate(20, 5));
        System.out.println();

        // 나눗셈 기능 (람다)
        Calculator divCal = (n1, n2) -> n1 /n2;
        System.out.println(divCal.operate(100, 50));
        System.out.println();
        
        PowerOperator op = (n1, n2, cal) -> cal.operate(n1, n2);
        
        int r1 = op.power(50, 60, (n1, n2) -> n1 + n2);
        System.out.println("r1 = " + r1);
        System.out.println();
        
        int r2 = op.power(500, 3, (n1, n2) -> n1 * n2);
        System.out.println("r2 = " + r2);
        System.out.println();
    }
}
