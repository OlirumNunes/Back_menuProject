/**
 * A DTO (Data Transfer Object) for representing a menu item.
 */
package com.example.menu.food.integration;

/*
 * A DTO (Data Transfer Object) for representing a menu item.
 *
 * @param title the title of the menu item
 * @param image the image URL of the menu item
 * @param price the price of the menu item
 */
public record MenuRequestDTO(String title, String image, Integer price) {
}
