package com.upskill.assignment_5;

import java.util.Arrays;
import java.util.List;

public class Assignment_5_1 {

    public static int findLargest(List<Integer> numbers) {
        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 0, 5, 0, 25);
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }
}