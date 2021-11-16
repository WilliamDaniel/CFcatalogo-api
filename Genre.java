package domain.entity;

import java.util.UUID;

public class Genre extends BaseEntity {

    private String name;

    public Genre() {
    }

    public Genre(String name) {

    }

    public Genre(UUID id, String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be empty");
        }

        this.name = name;
    }
}