package com.dndspells.myspellbook.Model;

import jakarta.validation.constraints.NotEmpty;

public class SpellDTO {
    @NotEmpty(message = "Insert a name")
    private String name;

    @NotEmpty(message = "Insert a type")
    private String type;

    @NotEmpty(message = "Insert a school")
    private String school;

    @NotEmpty(message = "Insert a description")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
