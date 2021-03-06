package com.mokhs.jpainheritance.domain;

import org.springframework.data.annotation.CreatedBy;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseTimeEntity {
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
