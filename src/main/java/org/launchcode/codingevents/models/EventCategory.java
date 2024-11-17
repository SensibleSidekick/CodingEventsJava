package org.launchcode.codingevents.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class EventCategory extends AbstractEntity{

    @NotNull
    @NotBlank
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    public EventCategory(@Size(min=3, message = "Name must be at least 3 characters long.") String name){
        this.name = name;
    }

    public EventCategory(){}

    public @Size(min = 3, message = "Name must be at least 3 characters long") String getName() {
        return name;
    }

    public void setName(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
