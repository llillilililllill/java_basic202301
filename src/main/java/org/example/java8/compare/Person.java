package org.example.java8.compare;

import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person implements  Comparable<Person>{

    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        /*
            비교 대상 객체 2개를 전달받아서
            (this, o)
            
            비교 대상(o)이 더 크면 음수,
            같으면 0
            작으면 양수 리턴
         */
        return this.age - o.getAge();
    }
}