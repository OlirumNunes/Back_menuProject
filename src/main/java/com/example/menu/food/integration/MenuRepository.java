package com.example.menu.food.integration;

import com.example.menu.food.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This interface extends the Spring Data JPA Repository for the {@link Menu} entity.
 * It provides basic CRUD (Create, Read, Update, Delete) operations for the Menu entity.
 *
 * @see Menu
 * @see JpaRepository
 */
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
