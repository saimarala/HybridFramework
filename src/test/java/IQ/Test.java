package IQ;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};

        // Bubble Sort Algorithm to sort the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                // Compare adjacent strings using compareTo() method
                if (arr[i].compareTo(arr[j]) > 0) {
                    // Swap arr[j] and arr[j+1] if arr[j] is lexicographically greater
                    String temp = arr[i];
                    arr[i] = arr[j ];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted string array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }

        String str = "swiss";
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }


    }
}
