package Lesson_6;

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
    public boolean equals(Object obj) {
        var t = (Cat) obj;
        return id == t.id && Name == t.Name && age == t.age && color == t.color;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
