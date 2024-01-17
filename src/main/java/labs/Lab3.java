package labs;

import java.util.Arrays;

public class Lab3 {

    public static void sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Find the index of the minimum element in the remaining unsorted array
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        //Lab3.1
        System.out.println("Lab3.1");
        int[] intArr = {1, 5, 3, 7, 6, 4};

        int oddCount = 0;
        int evenCount = 0;

        for (int num : intArr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);

        //Lab3.2
        System.out.println("Lab3.2");
        int maxValue = intArr[0]; // Initialize with the first element
        int minValue = intArr[0]; // Initialize with the first element

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > maxValue) {
                maxValue = intArr[i];
            }

            if (intArr[i] < minValue) {
                minValue = intArr[i];
            }
        }

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);

        //Lab3.3
        System.out.println("Lab3.3");
       sortArray(intArr);

        // Printing the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Lab3.4
        System.out.println("Lab3.4");
        int[] intArr1 = {1, 2, 3, 4, 5};
        int[] intArr2 = {9, 8, 0, 10, 6};

        int a1 = intArr1.length;
        int a2 = intArr2.length;

        int a3 = a1 + a2;

        int[] intArr3 = new int[a3];

        for (int i = 0; i < a1; i = i + 1) {
            intArr3[i] = intArr1[i];
        }

        for (int i = 0; i < a2; i = i + 1) {
            intArr3[a1 + i] = intArr2[i];
        }

//        Arrays.sort(intArr3);
        sortArray(intArr3);
        System.out.println("Merge 2 SORTED integer array into one SORTED array");
        for (int num : intArr3) {
            System.out.print(num + " ");
        }


    }

}

