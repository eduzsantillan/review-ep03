package com.educode.springdatajpacourse.repository;

import com.educode.springdatajpacourse.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
