package by.glebovich.Classwork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Lesson4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        int[] arr2 = new int[5];
        System.out.println("Third element:" + arr[2]);
        System.out.println("Third element:" + arr2[2]);
        arr2[2] = 10;
        System.out.println("Third element:" + arr2[2]);
        System.out.println(arr.length);

        for (int i = 0; i < arr2.length; i++) {
            Random random = new Random(10);
            arr2[i] = random.nextInt(10);
            System.out.println("arr2[" + i);
        }

        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
            System.out.println(arr3[i]);
        }


    }
}