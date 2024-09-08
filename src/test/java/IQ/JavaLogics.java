package IQ;

import java.util.*;

public class JavaLogics {

    public static void main(String[] args) {
//        Java program – input array was
//        given [ 1,1,2,2,3,4,5,5,6,6],
//        Output – [3,4]
//        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
////        List<Integer> result = findNonRepeatedElements(array);
////        System.out.println("Non-repeated elements: " + result);
//        Map<Integer, Integer> countMap = new HashMap<>();
//        for(int a:array){
//            countMap.put(a,countMap.getOrDefault(a,0)+1);
//
//        }
//        System.out.println(countMap.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList()));
//      Find common elements between two arrays
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = {4, 5, 6, 7, 8};
//
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> commonSet = new HashSet<>();
//// Add elements of the first array to the set
//        for (int num : array1) {
//            set1.add(num);
//        }
//// Check for common elements in the second array
//        for (int num : array2) {
//            if (set1.contains(num)) {
//                commonSet.add(num);
//            }
//        }
//        System.out.println(commonSet);
        //   Java program to gives Output:“00003241212” for the Input        String Str = “32400121200”

//        String input = "32400121200";
////        String formattedOutput = String.format("%011d",
////
////                Long.parseLong(input));
//        String formattedOutput = input.replaceAll("0+$", "");
//        System.out.println("Formatted output: " + formattedOutput);

        //  Java program to gives Output:“32412120000” for the Input String Str = “32400121200”
//        String input = "32400121200";
//        String output = rearrangeDigits(input);
//        System.out.println("Output: " + output);
//Java program to gives two Output:“Seleniumautomation”, “12312” for the Input String Str = “selenium123automation12”
        // separateAlphaAndNumeric("selenium123automation12");
//   Java program to gives two Output:“abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
        // separateCharacters("aBACbcEDed");
//        Java program to gives Output: a2b2c3d2   for the Input String Str = “aabbcccdd”
//        System.out.println(getCharacterCount("aabbcccdd"));
//        Java program to print each letter twice  from a given string
        System.out.println("Doubled characters: " + doubleCharacters("hello"));

        //*************************
    }

    public static List<Integer> findNonRepeatedElements(int[] array) {
// Step 1: Count occurrences of each element using a    HashMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            //countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

// Step 2: Identify elements with count equal to 1 (non repeated)

        List<Integer> nonRepeatedElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry :
                countMap.entrySet()) {

            if (entry.getValue() == 1) {
                nonRepeatedElements.add(entry.getKey());
            }
        }
        return nonRepeatedElements;
    }

    public static Set<Integer> findCommonElements(int[] array1,
                                                  int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
// Add elements of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }
// Check for common elements in the second array
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;
    }

    public static String rearrangeDigits(String input) {
// Split the input into parts: digits and non-digits
        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigits = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c) && !String.valueOf(c).equals("0")) {
                digits.append(c);
            } else {
                nonDigits.append(c);
            }
        }
// Concatenate non-digits followed by digits
        return digits.toString() + nonDigits.toString();
    }

    public static void separateAlphaAndNumeric(String input) {
        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphaPart.append(ch);
            } else if (Character.isDigit(ch)) {
                numericPart.append(ch);
            }
        }
        System.out.println("Output in Alpha: " + alphaPart);
        System.out.println("Output in Numeric: " + numericPart);
    }

    public static void separateCharacters(String input) {
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else {
                upperCase.append(ch);
            }
        }
        System.out.println("Output in lowercase: " + lowerCase);
        System.out.println("Output in uppercase " + upperCase);
    }

    public static String getCharacterCount(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
// If the next character is the same, increase the count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {

                count++;
            } else {
// Append the character and its count to the result
                result.append(str.charAt(i)).append(count);
                count = 1; // Reset the count
            }
        }
        return result.toString();
    }

    public static String doubleCharacters(String str) {


        StringBuilder doubled = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            doubled.append(ch).append(ch); // Append each character twice
        }
        return doubled.toString();
    }

    public static void printEvenIndexedCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
