package org.example.java8.builder;

import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter @ToString
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode
public class Member {

    private final String account; // 계정명  ( 필수  )
    private final String password; // 패스워드 ( 필수 )
    private String email; // 이메일
    private LocalDateTime regDate; // 가입일자
    private int age; // 나이
    private boolean emailSend; // 이메일 수신여부

    public Member(String account, String password) {
        this.account = account;
        this.password = password;
    }
    // 빌더 패턴 구현
    // 빌더 호출 메서드
    public static MemberBuilder builder() {
        return new MemberBuilder();
    }


    public static class MemberBuilder {
        private String account; // 계정명  ( 필수  )
        private String password; // 패스워드 ( 필수 )
        private String email; // 이메일
        private LocalDateTime regDate; // 가입일자
        private int age; // 나이
        private boolean emailSend; // 이메일 수신여부

        // 내부 기본생성자를 private으로
        private MemberBuilder() {}

        // 빌더 메서드들을 선언
        public MemberBuilder account(String account) {
            this.account = account;
            return this;
        }
        public MemberBuilder password(String password) {
            this.password = password;
            return this;
        }
        public MemberBuilder email(String email) {
            this.email = email;
            return this;
        }
        public MemberBuilder regDate(LocalDateTime regDate) {
            this.regDate = regDate;
            return this;
        }
        public MemberBuilder age(int age) {
            this.age = age;
            return this;
        }
        public MemberBuilder emailSend(boolean emailSend) {
            this.emailSend = emailSend;
            return this;
        }

        // 빌딩 완료 메서드
        public Member build() {
            Member member = new Member(account, password);
            member.setAge(age);
            member.setEmail(email);
            member.setRegDate(regDate);
            member.setEmailSend(emailSend);
            return member;
        }

    }
}






