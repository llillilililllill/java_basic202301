package org.example.java8.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static org.example.java8.stream.Dish.*;

public class Mapping {

    public static void main(String[] args) {

        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println(dishNames.size());
        System.out.println("dishNames = " + dishNames);

        System.out.println("======================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());

        System.out.println("wordLengths = " + wordLengths);

        System.out.println("============================");

        List<Integer> nums = List.of(1,2,3,4,5);

        // nums의 값들을 각각 제곱해서 새로운 리스트를 얻어내고 싶다.
        List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .collect(toList());

        System.out.println("squares = " + squares);

        System.out.println("===========================");

        // 요리목록의 총 칼로리 수 구하기
        int totalCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        System.out.println("totalCalories = " + totalCalories);

        // 육류요리의 평균 칼로리
        double meatAverageCalories = menu.stream()
                .filter(d -> d.getType() == Type.MEAT)
                .mapToInt(Dish::getCalories)
                .average()
                .getAsDouble()
                ;

        // Optional은 자동 널체크 지원 : ifPresent
//        meatAverageCalories
//                .ifPresent(cal -> System.out.println("cal: " + cal));

        System.out.println("meatAverageCalories = " + meatAverageCalories);


        // 만약에 DB에서 특정 게시물의 정보를 조회했는데 게시물이 없으면 null
        // Article article = repository.findByArticle(330);
        // if (article != null) article.getTitle();




    }
}