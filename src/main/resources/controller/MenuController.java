package controller;

import com.example.menu.food.Menu;
import com.example.menu.food.integration.MenuRepository;
import com.example.menu.food.integration.MenuRequestDTO;
import com.example.menu.food.integration.MenuResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for handling food-related operations.
 */
@RestController
@RequestMapping("food")
public class MenuController {

    /**
     * Repository for handling food-related data.
     */
    @Autowired
    private MenuRepository repository;

    /**
     * Method to create a new food item.
     *
     * @param data The data of the new food item.
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void menuFood(@RequestBody MenuRequestDTO data) {
        Menu menuData = new Menu(data);
        repository.save(menuData);
    }

    /**
     * Method to retrieve all food items.
     *
     * @return A list of all food items.
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<MenuResponseDTO> getAll() {
        return repository.findAll().stream().map(MenuResponseDTO::new).toList();
    }
}
