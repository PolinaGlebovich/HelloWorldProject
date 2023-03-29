package by.glebovich;
import java.util.Scanner;

public class ThirdLessonClasswork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int myParam = scanner.nextInt();  // nextLine();
//        //String username = scanner.next();
//        if (myParam > 5) {
//            System.out.println("myParam is greater than 5!");
//        } else if (myParam > 3){
//            System.out.println("Is greater than 3!");
//        } else{
//            System.out.println("Is not greater than 3!");
//        }

        //int temperature: 20 - hot, 5 - 20 - warm, -100 5 - cool
//
//        int temperature = scanner.nextInt();
//
//        if(temperature >= 20){
//            System.out.println("Hot!");
//        } else if(temperature >= 5){
//            System.out.println("Warm!");
//        } else if(temperature >= -100) {
//            System.out.println("Cool!");
//        } else{
//            System.out.println("I don't know :(");
//        }
//        String result = (temperature >= 20)? "hot": (temperature >= 5)? "warm": "cool";
//        System.out.println(result);

        System.out.println("Enter the month number:");
        int month = scanner.nextInt();

        switch (month){
            case 12: case 1: case 2:
                System.out.println("this is winter");
                break;
            case 3: case 4: case 5:
                System.out.println("this is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("this is summer");
            case 9: case 10: case 11:
                System.out.println("this is autumn");
                break;
            default:
                System.out.println("this is not a month number");
        }
    }
}
