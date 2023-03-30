package Homework;

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int multiplication = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
