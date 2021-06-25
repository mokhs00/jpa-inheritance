package com.mokhs.jpainheritance.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }
}
