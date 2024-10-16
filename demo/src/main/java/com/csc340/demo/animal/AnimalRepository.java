package com.csc340.demo.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Entity, Integer> {

    List<Entity> findBySpecies(String species);

    List<Entity> findByNameContaining(String namePart);

    @Query(value = "SELECT * FROM animals_db", nativeQuery = true)
    List<Entity> findAllAnimals();


}
