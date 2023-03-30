package Homework;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = sc.nextFloat();  // сумма вклада
        int countMonth = sc.nextInt(); // количество месяцев
        for (int i = 1; i <= countMonth; i++){
            sum = sum + 0.7f;
        }
        System.out.println(sum);
    }
}
