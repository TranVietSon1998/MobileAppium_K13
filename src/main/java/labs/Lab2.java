package labs;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        //Lab 2.1+2.3
        System.out.println("Lab2.1+Lab2.3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz input tour height(m) and weight(kg)");
        System.out.print("Your height: ");
        double height = scanner.nextDouble();
        System.out.print("Your weight: ");
        double weight = scanner.nextDouble();
        System.out.println();


        double bmi = weight / (height * 2);
        double minNormalWeight = 18.5 * (height * 2);

        double maxNormalWeight = 24.9 * (height * 2);

        String result = "BMI of 30 or greater. Plz decrease your weight ==> You should increase " + (weight - maxNormalWeight) + " kg";


        System.out.println("your bmi is: " + bmi);

        if (bmi <= 18.5) {
            result = "Underweight. Plz increase your weight ==> You should increase " + (minNormalWeight - weight) + " kg";
        } else if (bmi <= 24.9) {
            result = "Nornal weight. You're so handsome/beautiful";
        } else if (bmi < 29.9) {
            result = "Overweight.  Plz decrease your weight ==> You should decrease " + (weight - maxNormalWeight) + " kg";
        }

        System.out.println("Your result is: " + result);
        System.out.println("===============================");


        //Lab2.2
        System.out.println("Lab2.2");
        System.out.println("Plz input your number:");
        System.out.print("Your number is: ");
        int yourNumber = scanner.nextInt();
        String result1 = (yourNumber % 2 == 0) ? "even number" : "odd number";
        System.out.println("Result is: " + result1);


    }
}
