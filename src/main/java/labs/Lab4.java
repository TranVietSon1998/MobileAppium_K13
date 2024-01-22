package labs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4 {

    public static void run() {
        ArrayList<Integer> arrayList = generateArrayList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("=====MENU======");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Search number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    printArrayList(arrayList);
                    break;
                case 2:
                    System.out.println("Max value is: " + findMaxNumber(arrayList));
                    break;
                case 3:
                    System.out.println("Min value is: " + findMinNumber(arrayList));
                    break;
                case 4:
                    searchNumber(arrayList);
                    break;
            }

        } while (choice != 0);
    }

    public static ArrayList<Integer> generateArrayList() {
        ArrayList<Integer> randomNumberList = new ArrayList<>();
        Random random = new Random();

        // Generate 10 random numbers less than 1000 and add them to the ArrayList
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1000); // Generates a random number less than 1000
            randomNumberList.add(randomNumber);
        }

        return randomNumberList;
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.println("Printing ArrayList:");

        for (int number : list) {
            System.out.print(number + "; ");
        }
        System.out.println();
    }

    public static int findMaxNumber(ArrayList<Integer> list) {
        int maxNumber = list.get(0);

        for (int number : list) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public static int findMinNumber(ArrayList<Integer> list) {
        int minNumber = list.get(0);

        for (int number : list) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        return minNumber;
    }

    public static void searchNumber(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        int index = searchNumberInArrayList(list, searchNumber);

        // Print the result based on the search
        if (index != -1) {
            System.out.println("Number " + searchNumber + " found at index " + index);
        } else {
            System.out.println("Number " + searchNumber + " is not in the list.");
        }

    }

    public static int searchNumberInArrayList(ArrayList<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return i + 1; // Return the index if the number is found
            }
        }
        return -1; // Return -1 if the number is not found
    }


//    public static void arrayWithOptions(ArrayList<Integer> arrayList, int option) {
//        switch (option) {
//            case 1: {
//                printArrayList(arrayList);
//                break;
//            }
//            case 2: {
//                int max = findMaxNumber(arrayList);
//                System.out.println("Max number is: " + max);
//                break;
//
//            }
//            case 3: {
//                int min = findMinNumber(arrayList);
//                System.out.println("Min number is: " + min);
//                break;
//
//            }
//            default: {
//                searchNumber(arrayList);
//                break;
//            }
//        }
//
//    }


    public static void main(String[] args) {
        /*
        =====MENU======
        1. Print all numbers
        2. Print maximum value
        3. Print minimum value
        4. Search number
        Explaination
        Option 01: We print all the numbers that we have in the array list
        Option 02: We need to find out the maximum number from array list and print out that value
        Option 03: We need to find out the minimum number from array list and print out that value
        Option 04: We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index. Otherwise, print that number is not in the list
         */
//        ArrayList<Integer> arrayList = generateArrayList();
//        arrayWithOptions(arrayList, 1);
//        arrayWithOptions(arrayList, 2);
//        arrayWithOptions(arrayList, 3);
//        arrayWithOptions(arrayList, 4);
        run();


    }

}
