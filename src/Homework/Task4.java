package Homework;
import java.util.Scanner;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int ridNum = random.nextInt(10);
        System.out.println(ridNum);
        int myNumber = 0;

        for(int i = 0; i < 6; i++) {
            myNumber = sc.nextInt();
            if (myNumber == ridNum) {
                System.out.println("You guessed it!");
                break;
            }
            else {
                System.out.println("You didn't guess");
            }
        }
    }
}
