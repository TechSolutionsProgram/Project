package stringproblems;

import java.util.Scanner;

public class switchdays {

    public static void main(String[] args) {
        System.out.println("Enter a number 1 to 7");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a weekday. Holiday!");
                break;

        }
    }
}
//1. write a program when n=1 to 7 and display the weeks 1=mon,2=tues,...7=sun..else not a weekday