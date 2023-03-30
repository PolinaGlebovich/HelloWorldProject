package Homework;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int color = sc.nextInt();

        switch (color){
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Purple");
                break;
            default:
                System.out.println("This is not a color");
        }
    }
}
