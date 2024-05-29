package com.example.menu.food.integration;

import com.example.menu.food.Menu;

/*
 * A DTO (Data Transfer Object) for representing a menu item in the response.
 */
public record MenuResponseDTO(Long id, String title, String image, Integer price) {

    /*
     * Constructs a {@code MenuResponseDTO} from a {@code Menu} object.
     *
     * @param menu the {@code Menu} object to construct the DTO from
     */
    public MenuResponseDTO(Menu menu) {
        this(menu.getId(), menu.getTitle(), menu.getImage(), menu.getPrice());
    }
}
