package lessons;

import java.util.Scanner;

public class Lesson2_IfElseCondition {
    public static void main(String[] args) {

        // == : so sanh bang`
        //!=: khac bang

        //Get input from user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("plz input arrival time: ");
//        int arrivalTime = scanner.nextInt();
//        final int EXPECTED_TIME = 7;
//
//        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;
//        System.out.println("1. Dat xe ra");
//        System.out.println("2. Chay ra quan");
//        if (isHeOnTime) {
//            System.out.println("let talk");
//        } else {
//            System.out.println("write a letter");
//        }


        ///// Multiple if else
        // <18 | 18-55 | >55
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your age: ");
        int clientAge = scanner.nextInt();
        if(clientAge<18) {
            System.out.println("khong ban ruou");
        } else if (clientAge >=18 && clientAge<=55) {
            System.out.println("ban thoai mai");

        }
        else {
            System.out.println("ban 2 chai");
        }


    }
}
