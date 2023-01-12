package org.example.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.awt.SystemColor.menu;

public class main {
    /*
        요리 목록에서 칼로리가 400칼로리보다 작은 요리들만 추출해서
        칼로리가 낮은순서대로 오름차정렬한 후
        그 요리의 이름들만 추출해서 리스트로 만들고 싶어요
     */

    // 스트림을 사용하지 않은 코드
    public static List<String> getHealthyDishName1(List<Dish> menu) {
        // 400칼로리 미만 요리만 담을거임
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if(dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
         }

        lowCaloricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });

        // 요리의 이름을 담을 리스트
        List<String> dishNames = new ArrayList<>();
        for (Dish lowCaloricDish : lowCaloricDishes) {
            dishNames.add(lowCaloricDish.getName());
        }

        return dishNames;
    }

    // 스트림을 사용한 코드

    public static void main(String[] args) {
        
        List<String> dishName1 = getHealthyDishName1(Dish.menu);
        System.out.println("dishName1 = " + dishName1);
        System.out.println();

    }
}
