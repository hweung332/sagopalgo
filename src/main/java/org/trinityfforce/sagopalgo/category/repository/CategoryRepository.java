package org.trinityfforce.sagopalgo.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trinityfforce.sagopalgo.category.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
