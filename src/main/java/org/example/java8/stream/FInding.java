package org.example.java8.stream;

import static org.example.java8.stream.Dish.menu;

public class Finding {
    public static void main(String[] args) {

        // anyMatch: 주어진 스트림에서 적어도 한 요소와 일치하는게 있는지 확인
        // 요리목록중에 채식주의자가 먹을 수 있는 요리가 하나라도 있는가?
        boolean flag1 = menu.stream()
                .anyMatch(dish -> dish.isVegeterian());

        System.out.println("flag1 = " + flag1);

        System.out.println("==============================");

        boolean flag2 = menu.stream()
                .anyMatch(d -> d.getCalories() < 100);

        System.out.println("flag2 = " + flag2);

        // allMatch : 모든 요소가 조건에 일치하는지 확인
        // 요리 목록의 모든 요리가 1000칼로리 미만인가??

        boolean flag3 = menu.stream()
                .allMatch(d -> d. getCalories() < 1000);

        System.out.println("flag3 = " + flag3);

        // nonMatch: allMatch의 반대연산

    }
}