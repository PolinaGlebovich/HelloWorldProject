package Homework;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
    int number = sc.nextInt();
    int sum = 0;

    for(int i = 1; i <= number; i++){
        sum += i;
    }
        if(number > 100 || number < 1){
            System.out.println("Enter another number");
        } else {
            System.out.println(sum);
        }
    }

}
