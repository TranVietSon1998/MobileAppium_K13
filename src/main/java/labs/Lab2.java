package labs;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        //Lab 2.1+2.3
        System.out.println("Lab2.1+Lab2.3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz input tour height(m) and weight(kg)");
        System.out.print("Your height: ");
        double height= scanner.nextDouble();
        System.out.print("Your weight: ");
        double weight= scanner.nextDouble();
        System.out.println();

        String result = "BMI of 30 or greater. Plz decrease your weight ==> Bmi should be >18.5 && <24.9";
        double bmi = weight / (height * 2);
        System.out.println("your bmi is: "+bmi);

        if(bmi<=18.5) {
            result = "Underweight. Plz increase your weight ==> Bmi should be >18.5 && <24.9";
        }
        else if(bmi <24.9) {
            result = "Nornal weight. You're so handsome/beautiful";
        }
        else if(bmi<29.9) {
            result = "Overweight.  Plz decrease your weight ==> Bmi should be >18.5 && <24.9";
        }

        System.out.println("Your result is: "+ result);
        System.out.println("===============================");


        //Lab2.2
        System.out.println("Lab2.2");
        System.out.println("Plz input your number:");
        System.out.print("Your number is: ");
        int yourNumber =scanner.nextInt();
        String result1 = (yourNumber%2==0)? "even number" : "odd number";
        System.out.println("Result is: "+result1);



    }
}
