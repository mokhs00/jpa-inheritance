package com.mokhs.jpainheritance.repository;

import com.mokhs.jpainheritance.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemJpaRepository extends JpaRepository<Item, Long> {
}
