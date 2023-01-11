package org.example.java8.lambda;
@FunctionalInterface    // 람다를 사용할 수 있는 인터페이스인지 검증
// 람다 사용 전제 조건: 인터페이스의 추상메서드가 단 하나일 것
public interface ApplePredicate {

    // 사과를 주고 필터조건을 오버라이딩하면 참, 거짓을 반환
    boolean test(Apple apple);

    static void abc() {

    }

    default void def() {

    }

}
