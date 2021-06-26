package com.mokhs.jpainheritance.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 기본 전략 SINGLE_TABLE
@DiscriminatorColumn(name = "ITEM_TYPE") // 싱글 테이블 전략에서 type을 나타낼 컬럼명을 지정할 수 있음. 기본값은 DTYPE
public class Item extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;

    public Item(String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
