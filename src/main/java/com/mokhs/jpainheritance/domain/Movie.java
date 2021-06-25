package com.mokhs.jpainheritance.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MovieItem")
public class Movie extends Item {
    private String director;
    private String actor;
}
