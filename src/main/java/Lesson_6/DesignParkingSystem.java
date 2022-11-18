package Lesson_6;

import java.util.HashMap;
import java.util.Map;

public class DesignParkingSystem {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        ParkingSystem(1, 1, 0);
        System.out.println(addCar(1));
    }

    public static void ParkingSystem(int big, int medium, int small) {
        map.put(1, big);
        map.put(2, medium);
        map.put(3, small);
    }

    public static boolean addCar(int carType) {
        int type = map.get(carType);
        if (type > 0) {
            type--;
            map.put(carType, type);
            return true;
        } else {
            return false;
        }
    }
}
