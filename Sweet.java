package com.sweetshopmanagementsystem;

import java.util.Objects;

public abstract class Sweet {

    enum Color{
        RED, GREEN, WHITE, GREEN_WHITE;
    }

    enum Category{
        VEG, SUGARLESS, GHEE, BENGALI_SWEET;
    }

    Color color;
    int price;
    String id;
    Category category;
    String name;

    @Override
    public String toString() {
        return "Sweet{" +
                "color=" + color +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", category=" + category +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return Objects.equals(id, sweet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
