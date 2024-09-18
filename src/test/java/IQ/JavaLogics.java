package IQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class JavaLogics {

    private static final Logger log = LoggerFactory.getLogger(JavaLogics.class);

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
//        int[] array3 = {4, 5, 6, 7, 8};

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set3 = new HashSet<>();
//        Set<Integer> commonSet = new HashSet<>();
//// Add elements of the first array to the set
//        for (int num : array1) {
//            set1.add(num);
//        }
//        for (int num : array3) {
//            set3.add(num);
//        }
// Check for common elements in the second array
//        for (int num : array2) {
//            if (set1.contains(num) && set3.contains(num)) {
//                commonSet.add(num);
//            }
//        }
//        System.out.println(commonSet);
//        Integer[] array1 = {1, 2, 3, 4, 5};
//        Integer[] array2 = {4, 5, 6, 7, 8};
//        Integer[] array3 = {4, 5, 6, 7, 8};
//        // Convert arrays to sets
//        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
//        Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));
//        Set<Integer> set3 = new HashSet<>(Arrays.asList(array3));
//
//        // Find common elements by retaining only common ones in set1
//        set1.retainAll(set2);  // set1 now contains only elements present in both set1 and set2
//        set1.retainAll(set3);  // set1 now contains only elements present in all three sets
//        System.out.println(set1);

//        Second Largest and Second Smallest Numbers:
//        int[] arr = {12, 35, 1, 10, 34, 2};
//
//        // Sort the array
//        Arrays.sort(arr);
//
//        // Second smallest is the s+econd element (arr[1])
//        int secondSmallest = arr[1];
//
//        // Second largest is the second-to-last element (arr[arr.length - 2])
//        int secondLargest = arr[arr.length - 2];
//
//        System.out.println("Second Smallest: " + secondSmallest);
//        System.out.println("Second Largest: " + secondLargest);
//        SecondLargestAndSmallest(arr);
//
//        // Print the common elements
//        System.out.println("Common elements: " + set1);
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
//         separateAlphaAndNumeric("selenium123automation12");

//   Java program to gives two Output:“abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
//         separateCharacters("aBACbcEDed");
//        Java program to gives Output: a2b2c3d2   for the Input String Str = “aabbcccdd”
//        System.out.println(getCharacterCount("aabbcccdd"));
//        Java program to print each letter twice  from a given string
//        System.out.println("Doubled characters: " + doubleCharacters("hello"));
//        Java program to print even indexed characters
//        printEvenIndexedCharacters("this is selenium");
//         Java program to print unique characters

//        printUniqueCharacters("this is selenium");
//        Java program to find if a string is Palindrome
//        String str = "madama";
//       System.out.println(isPalindrome(str));
//        Java program to find all permutations of a given string
//        permute("abc", "");
//        Java program to reverse each word of a given string

//        reverseEachWordOfString("Java is good programming langauges");
//       Java program to find duplicate characters in a string
//        duplicateCharacterCount("Learn Java Programming");
//        //Java program to count Occurrences of Each Character in String

//        CharacterCount("Test Automation Java Automation");
//      Java program to count the number of words in a string
//        String s="hello world";
//        int count = 1;
//        for (int i = 0; i < s.length() - 1; i++) {
//            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
//                count++;
//            }
//        }
//        System.out.println(count);
// Array consists of integers and special characters,sum only integers
//        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
//        System.out.println("Sum of integers in the array: "+sumIntegers(array));
//          . Find the Second Largest Element in an Array
//        int[] arr = {12, 35, 1, 10, 34, 1};
//        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
//        for (int num : arr) {
//            if (num > first) {
//                second = first;
//                first = num;
//            } else if (num > second && num != first) {
//                second = num;
//            }
//        }
//        System.out.println(second);

//   Find the Factorial of a Number using Recursion
//        System.out.println(factorial(5));
//Find the Maximum Occurring Character in a String
//               getMaxOccurringChar("programmming");
//  Java program to find Palindrome number
//        if (isPalindrome(1001)) {
//            System.out.println(1001 + " is a palindrome.");
//        } else {
//            System.out.println(1001 + " is not a palindrome.");
//        }
//Java program to count Odd and Even number from given array
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] count = countOddAndEven(array);
//        System.out.println("Even numbers count: " + count[1]);
//        System.out.println("Odd numbers count: " + count[0]);
 //Java program – input array was given [ 1,1,2,2,3,4,5,5,6,6] Output – [3,4]
//        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
//        List<Integer> result = findNonRepeatedElements1(array);
//        System.out.println("Non-repeated elements: " + result);
        // Find the Common Elements in Two Array
//        int[] arr1 = {1, 2, 3, 4,5};
//        int[] arr2 = {3, 4, 5, 6};
//        int[] arr3 = {3, 4, 5, 6};
//
//        System.out.println(findCommonElements(arr1,arr2,arr3));
//     .


//        int year = 2028;
//        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        System.out.println(isLeap);

        //*************************
    }
    public static int[] countOddAndEven(int[] array) {
        int[] count = new int[2]; // Index 0 for odd count, Index 1 for
        // even count
        for (int num : array) {
            if (num % 2 == 0) {
                count[1]++; // Increment even count
            } else {
                count[0]++; // Increment odd count
            }
        }
        return count;
    }
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;
        while (num != 0) {
           // int digit = num % 10;
            reversedNumber = (reversedNumber * 10) + num % 10;
            num = num/10;
        }
        return originalNumber == reversedNumber;
    }

    static void   SecondLargestAndSmallest(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array should contain at least two elements");
            return;
        }

        // Initialize variables
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // Find the smallest and largest numbers
        for (int a :arr) {
            if (a < smallest) {
                secondSmallest = smallest;
                smallest = a;
            } else if (a < secondSmallest && a != smallest) {
                secondSmallest = a;
            }

            if (a> largest) {
                secondLargest = largest;
                largest = a;
            } else if (a > secondLargest && a != largest) {
                secondLargest = a;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE || secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second smallest or second largest exists.");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        }

    }

    static void getMaxOccurringChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
//        char maxChar = str.charAt(0);
//        int maxCount = 0;
        char maxChar = ' ';
        int maxCount = -1;
//        for (char c : charCount.keySet()) {
//            if (charCount.get(c) > maxCount) {
//                maxCount = charCount.get(c);
//                maxChar = c;
//            }
//        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println(maxChar);

    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int sumIntegers(String[] array) {
        int sum = 0;
        for (String element : array) {
            try {
                int num = Integer.parseInt(element);
                sum += num;
            } catch (NumberFormatException e) {
// Ignore non-integer elements
            }
        }
        return sum;
    }

    static void CharacterCount(String inputString) {
        HashMap<String, Integer> charCountMap = new HashMap<>();
        for (String s : inputString.split(" ")) {
            if (charCountMap.containsKey(s)) {
                charCountMap.put(s, charCountMap.get(s) + 1);
            } else {
                charCountMap.put(s, 1);
            }
        }
        System.out.println("Count of Characters in a given string : " +
                charCountMap);
    }

    static void duplicateCharacterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (!String.valueOf(c).isBlank()) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        //   Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters in : " + inputString);
        for (Character ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }

    public static List<Integer> findNonRepeatedElements(int[] array) {
// Step 1: Count occurrences of each element using a    HashMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
           // countMap.put(num, countMap.getOrDefault(num, 0) + 1);
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

    public static List<Integer> findNonRepeatedElements1(int[] array) {
// Step 1: Count occurrences of each element using a    HashMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {

            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

// Step 2: Identify elements with count equal to 1 (non repeated)

//        List<Integer> nonRepeatedElements = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry :
//                countMap.entrySet()) {
//
//            if (entry.getValue() == 1) {
//                nonRepeatedElements.add(entry.getKey());
//            }
//        }
        return countMap.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
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
    public static Set<Integer> findCommonElements(int[] array1,
                                                  int[] array2,int[] array3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
// Add elements of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            set2.add(num);
        }
// Check for common elements in the second array
        for (int num : array3) {
            if (set1.contains(num) && set2.contains(num)) {
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
      //  return digits.toString() + nonDigits.toString();
        return nonDigits.toString()+digits.toString() ;
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
        for (char c:str.toCharArray()) {
            //char ch = str.charAt(i);
            doubled.append(c).append(c); // Append each character twice
        }
        //System.out.println(doubled);
        return doubled.toString();
    }

    public static void printEvenIndexedCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void printUniqueCharacters(String str) {
// Assume ASCII characters (0-127), use boolean array to track  character occurrences
        boolean[] unique = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!unique[ch]) {
                unique[ch] = true;
                System.out.print(ch + " ");
            }
        }
    }

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {

            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, prefix + str.charAt(i));
            }
        }
    }

    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String nstr = "";
            //  char ch;
            for (int j = 0; j < word.length(); j++) {
                //    ch = word.charAt(j);
                nstr = word.charAt(j) + nstr;
            }
            reverseString = reverseString + nstr + " ";
        }
        System.out.println(inputString);
        System.out.println(reverseString.trim());
    }


}
