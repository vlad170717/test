package com.company;

import java.util.Arrays;
import java.util.

public class Main {

    public static void main(String[] args) {
        double numbers[6];

        Arrays.fill(numbers, 1, 7, RandDoubleGenerator());

        System.out.println(Arrays.toString(numbers));

    }
}
