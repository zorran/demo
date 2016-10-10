package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String login;
    public String name;
}
