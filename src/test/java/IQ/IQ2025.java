package IQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IQ2025 {


    public static void main(String[] args) {
        String str="This$selenium&se@123";
        System.out.println(reverseEachWord(str));
        
        
        //Given an array {1,3,3,4,5,6,6,7,8,9,9} when user enters a search element, the program should display the index number where the element is found. If the element is repeated it should display all those indices. If it is not present in the given array program should display "element not found" in java
        int[] array = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        
        //String str "this123selenium - sum the nly numeric and displau outpuy:this6selenium in java
        String input = "this 123 selenium";
        int sum = 0;

        // Calculate sum of digits
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        // Replace digits with the sum
        String result = input.replaceAll("\\d+", String.valueOf(sum));

        System.out.println("Output: " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        boolean found = false;
        System.out.print("Element found at index/indices: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        } else {
            System.out.println(); // For a clean line break after indices
        }
        scanner.close();
    }

 public static String reverseEachWord(String str){
        
        String [] words=str.split("[^a-zA-Z0-9]+");
        int i=0;
        List<Character> specialChars=new ArrayList<>();
        for (char c:str.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                specialChars.add(c);
            }
        }        
        StringBuilder result=new StringBuilder();
        for(String word:words){
            result.append(new StringBuilder(word).reverse());
            if(i<specialChars.size()){
                result.append(specialChars.get(i++));
            }
        }
        System.out.println(result);
        return result.toString().trim();        
 }
}



