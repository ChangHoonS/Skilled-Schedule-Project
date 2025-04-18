package com.example.schedule.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user")
public class User extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    // Entity는 기본 생성자가 필요하기 때문에 만들어줌 (새로운 생성자 만들면 기본 생성자가 사라지기 때문)
    public User() {
    }

    // 회원가입에 필요한 생성자를 만들어줌 (Lv2 단계에서는 비밀번호를 넣지 않음)
//    public User(String username, String email) {
//        this.username = username;
//        this.email = email;
//    } 3단계에서 필드에 password를 넣어주고 유저 생성(회원가입)시 pasword 넣어주기

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void updateUsername(String username) {
        this.username = username;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void updatePassword(String password) {
        this.password = password;
    }
}