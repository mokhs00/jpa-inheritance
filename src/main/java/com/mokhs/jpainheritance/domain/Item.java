package com.mokhs.jpainheritance.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 기본 전략 SINGLE_TABLE
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
}
