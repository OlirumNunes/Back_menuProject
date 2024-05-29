package com.example.menu.food;

import com.example.menu.food.integration.MenuRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * The Menu class represents a menu item in the application.
 * It has an id, title, image, and price.
 */
@Table(name = "menu")
@Entity(name = "menu")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Menu {

    /**
     * The unique identifier for the menu item.
     * Generated automatically by the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The title of the menu item.
     */
    private String title;

    /**
     * The image URL of the menu item.
     */
    private String image;

    /**
     * The price of the menu item.
     */
    private Integer price;

    /*
     * Constructor that takes a {@link MenuRequestDTO} and initializes the menu item with its details.
     *
     * @param data The {@link MenuRequestDTO} containing the details of the menu item.
     */
    public Menu(MenuRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
