package domain.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Genre extends BaseEntity {

    private String name;
    private List<Category> categories = new ArrayList<>();

    public Genre() {
    }

    public Genre(String name) {

    }

    public Genre(UUID id, String name) {
        this.name = name;
    }

    public Genre(String name, List<Category> categories) {
        this.name = name;
        this.setCategories(categories);
    }

    public Genre(UUID id, String name, List<Category> categories) {
        super.setId(id);
        this.name = name;
        this.setCategories(categories);
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

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        if (categories == null) {
            throw new IllegalArgumentException("categories cannot be null");
        }
        if (categories.isEmpty()) {
            throw new IllegalArgumentException("categories cannot be empty");
        }

        this.categories = categories;
    }

    public void addCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("category cannot be null");
        }
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("category cannot be null");
        }
        this.categories.removeIf(c -> this.categories.contains(category));
    }

}