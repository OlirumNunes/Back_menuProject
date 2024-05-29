package com.example.menu.controller;

import com.example.menu.food.Menu;
import com.example.menu.food.integration.MenuRepository;
import com.example.menu.food.integration.MenuRequestDTO;
import com.example.menu.food.integration.MenuResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class MenuController {

    @Autowired
    private MenuRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody MenuRequestDTO data){
        Menu menuData = new Menu(data);
        repository.save(menuData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<MenuResponseDTO> getAll(){

        return repository.findAll().stream().map(MenuResponseDTO::new).toList();
    }
}
