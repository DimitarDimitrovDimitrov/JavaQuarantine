package com.ArraysInit;

public class Main {

    public static void main(String[] args) {

        String[] animals = {"Bat", "Rabbit", "Possum"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        int[] windows = new int[3];

        windows[0] = 95;
        windows[1] = 98;
        windows[2] = 2000;

        for (int i = 0; i < windows.length; i++) {
            System.out.println(windows[i]);
        }

        int[] numbers = {1, 2, 3, 4};
        System.out.println(sum(numbers));

    }

    public static int sum(int[] numbers) {
        int sum = 0;

        for (int i : numbers)
            sum += i;

        System.out.print("The sum is ");
        return sum;
    }

}
