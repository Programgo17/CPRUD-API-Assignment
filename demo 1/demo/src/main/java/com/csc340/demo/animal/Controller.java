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
    public List<Entity> addNewAnimal(@RequestBody Entity animal) {
        animalService.addNewAnimal(animal);
        return animalService.getAllAnimals();
    }

    @PutMapping("/update/{animalId}")
    public Entity updateAnimal(@PathVariable int animalId, @RequestBody Entity animal) {
        animalService.updateAnimal(animalId, animal);
        return animalService.getAnimalById(animalId);
    }

    @DeleteMapping("/delete/{animalId}")
    public List<Entity> deleteAnimal(@PathVariable int animalId) {
        animalService.deleteAnimalById(animalId);
        return animalService.getAllAnimals();
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