package com.csc340.demo.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Entity, Integer> {

    @Query(value = "SELECT * FROM animals_db WHERE species = %:species%", nativeQuery = true)
    List<Entity> findBySpecies(String species);

    @Query(value = "SELECT * FROM animals_db WHERE name = %:name%", nativeQuery = true)
    List<Entity> findByName(String name);



    @Query(value = "SELECT * FROM animals_db", nativeQuery = true)
    List<Entity> findAllAnimals();
}