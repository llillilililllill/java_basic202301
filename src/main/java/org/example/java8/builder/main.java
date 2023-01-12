package org.example.java8.builder;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {

        // 회원정보 생성
//        Member m = new Member("abc1234", "1234", null, null, 22, ture);

//        Member m = new Member("ab1234", "1234");

        Member m = Member.builder()
                .account("abc1234")
                .password("1234")
                .age(22)
                .regDate(LocalDateTime.now())
                .build();

        Board.builder()
                .content("글 내용")
                .writer("김똘끼")
                .id(100L)
                .title("제목이야")
                .build();
    }
}