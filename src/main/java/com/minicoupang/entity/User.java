package com.minicoupang.entity;

import com.minicoupang.vo.UserStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Table(name = "users")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String email;

    private String passwordHash;

    private String name;

    private String phone;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private Integer stock;

    private Instant createdAt;

    private Instant updatedAt;

}
