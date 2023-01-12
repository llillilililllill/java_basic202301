package org.example.java8.stream.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class main {
    public static void main(String[] args) {

            Trader raoul = new Trader("Raoul", "Cambridge");
            Trader mario = new Trader("Mario", "Milan");
            Trader alan = new Trader("Alan", "Cambridge");
            Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰값).
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList())
                .forEach(out::println);
        out.println("=================================================");
        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // 거래목록에서 거래자들을 추출한 다음에 거래자 안에있는 도시 이름을 추출
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList())
                .forEach(out::println);
        out.println("=================================================");

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차 정렬
        transactions.stream()
                .map(t -> t.getTrader())
                .filter(td -> td.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList())
                .forEach(out::println);
        out.println("=================================================");
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환
        transactions.stream()
                .map(t -> t.getTrader(). getName())
                .distinct()
                .sorted(String::compareTo)      // 정렬 리스트 대상이 String이나 숫자타입이면 Comparator을 안써도 정렬
                .collect(toList())
                .forEach(out::println);

        out.println("=================================================");

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                        .anyMatch(p -> p.getTrader().getCity().equals("Milan"));
        out.println("flag1 = " + flag1);

        out.println("=================================================");

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int sum = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        out.println("sum = " + sum);

        out.println("=================================================");

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int maxValue = transactions.stream()
                .mapToInt(t -> t.getValue())
                .max()
                .getAsInt();

        out.println("maxValue = " + maxValue);

        out.println("=================================================");

        // 연습 8. 가장 작은 거래액을 가진 고래정보 탐색
        Optional<Transaction> smallestTransaction = transactions.stream()
                .min(comparing(Transaction::getValue));

        smallestTransaction.ifPresent(out::println);
    }
}
