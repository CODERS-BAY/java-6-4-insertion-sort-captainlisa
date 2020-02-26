package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {56, 3, -23, 124, 37, -5};
        System.out.println(Arrays.toString(numbers));


        for (int i = 1; i < numbers.length; i++) {
            int unsorted = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > unsorted) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = unsorted;
            System.out.println(Arrays.toString(numbers));
        }

    }

}