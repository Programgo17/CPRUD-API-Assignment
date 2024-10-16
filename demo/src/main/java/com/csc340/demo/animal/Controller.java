package com.csc340.demo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/animals")
public class Controller {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public List<Entity> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{animalId}")
    public Entity getAnimalById(@PathVariable int animalId) {
        return animalService.getAnimalById(animalId);
    }

    @PostMapping("/new")
    public void addNewAnimal(@RequestBody Entity animal) {
        animalService.addNewAnimal(animal);
    }

    @PutMapping("/update/{animalId}")
    public void updateAnimal(@PathVariable int animalId, @RequestBody Entity animal) {
        animalService.updateAnimal(animalId, animal);
    }

    @DeleteMapping("/delete/{animalId}")
    public void deleteAnimal(@PathVariable int animalId) {
        animalService.deleteAnimalById(animalId);
    }

    @GetMapping("/species")
    public List<Entity> getAnimalsBySpecies(@RequestParam String species) {
        return animalService.getAnimalsBySpecies(species);
    }

    @GetMapping("/search")
    public List<Entity> searchAnimalsByName(@RequestParam String namePart) {
        return animalService.searchAnimalsByName(namePart);
    }
}






