package Lesson_6;

import java.util.HashSet;
import java.util.Set;

public class dataCats {
    public static void main(String[] args) {


        Cat c1 = new Cat(1, "Barsik", "White", 3);
        Cat c2 = new Cat(2, "Mint", "Gray", 2);
        Cat c3 = new Cat(3, "Foxy", "Ginger", 2);
        Cat c4 = new Cat(4, "Foxy", "Ginger", 2);
        Cat c5 = new Cat(4, "Foxy", "Ginger", 2);

        System.out.println(c4.equals(c5));

        Set<Cat> cats = new HashSet<>();
        cats.add(c1); //#1
        cats.add(c2); //#2
        cats.add(c3); //#3
        cats.add(c4); //#4
        cats.add(c5); //#5

        for (var c : cats) {
            System.out.println(c);
        }
    }
}
