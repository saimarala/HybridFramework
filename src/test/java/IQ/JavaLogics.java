package IQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

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
//        System.out.println("Doubled characters: " + doubleCharacters("hello"));
//        Java program to print even indexed characters
//        printEvenIndexedCharacters("this is selenium");
//         Java program to print unique characters

//        printUniqueCharacters("this is selenium");
//        Java program to find if a string is Palindrome
//        String str = "madam";
//        System.out.println(isPalindrome(str));
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
        getMaxOccurringChar("programmming");


        //*************************
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
        HashMap<String,Integer> charCountMap = new HashMap<>();
        for(String s : inputString.split(" "))
        {
            if(charCountMap.containsKey(s))
            {
                charCountMap.put(s,charCountMap.get(s)+1);
            }
            else
            {
                charCountMap.put(s,1);
            }
        }
        System.out.println("Count of Characters in a given string : " +
                charCountMap);
    }

    static void duplicateCharacterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
           if(String.valueOf(c).isBlank()){
               if (charCountMap.containsKey(c)) {
                   charCountMap.put(c, charCountMap.getOrDefault(c,0)+ 1);
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
                String rem = str.substring(0,i) + str.substring(i+1);
                permute(rem,prefix + str.charAt(i));
            }
        }
    }
    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String nstr = "";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                nstr = ch + nstr;
            }
            reverseString = reverseString + nstr + " ";
        }
        System.out.println(inputString);
        System.out.println(reverseString);
    }


}
