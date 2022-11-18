package Lesson_6;

import java.util.Objects;

public class Cat {
    int id=0;
    int age;
    String Name;
    String color;


    public Cat(int id, String name, String color, int age) {
        this.id = id;
        this.Name = name;
        this.color = color;
        this.age = age;

    }

    @Override
    public String toString() {
        return String.format(" id: %d; Кличка: %s; Окрас: %s; Возраст: %d.", id, Name, color, age);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(Name, cat.Name) && Objects.equals(color, cat.color);
    }


    @Override
    public int hashCode() {
        return id;
    }
}
