package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> cars = new LinkedList<>();
        Integer[] bikes = new Integer[10];

        for (int i = 0; i < 10; i ++) {
            cars.add(returnInt());
            bikes[i] = returnInt();
        }

        System.out.println(cars);
        cars.sort((Integer::compareTo)); // (o1, o2) -> o1.compareTo(o2)
        System.out.println(cars);

        System.out.println("\n\n");

        System.out.println(Arrays.toString(bikes));
        Arrays.sort(bikes/*, Collections.reverseOrder()*/); // Reverse order available
        System.out.println(Arrays.toString(bikes));
    }

    public static int returnInt() {
        Random generatedNumber = new Random();
        return generatedNumber.nextInt(50);
    }
}