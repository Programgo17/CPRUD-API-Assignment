package com.csc340.demo.animal;

import jakarta.persistence.*;
@jakarta.persistence.Entity
@Table(name = "animals_db")
public class Entity {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;

    @Column(nullable = false)
    private String name;

    private String scientificName;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String habitat;

    private String description;



    public Entity(String name, String scientificName, String species, String habitat, String description) {
        this.name = name;
        this.scientificName = scientificName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }

    public Entity(){

    }
    public String getDescription() {
        return description;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getSpecies() {
        return species;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
