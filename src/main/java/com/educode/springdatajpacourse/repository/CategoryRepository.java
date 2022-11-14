package com.educode.springdatajpacourse.repository;

import com.educode.springdatajpacourse.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
