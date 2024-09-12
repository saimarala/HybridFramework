package IQ;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String[] args) {
//        //Reverse Each Word in the given Sentence Using Stream APIs
//        String str= "This is selenium";
//        String words[]=str.split(" ");
//        String reversedString =Stream.of(words).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
//        System.out.println(reversedString);

//        .Find the longest word in the given sentence using streams
//   String str = "This is selenium";
//   String words[]=str.split("\\s");
//        String maxWordLength=Arrays.stream(words).max(Comparator.comparingInt(String::length)).orElse(null);
//        System.out.println(maxWordLength);

// Find union of 2 lists using Java streams
        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        List<Integer> list2=Arrays.asList(4,5,6,7,8);
      List<Integer>  s=Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
      System.out.println(s);
      //common elements in array
      list1.stream().filter(list2::contains).forEach(System.out::println);
      List<String> list = Arrays.asList("Java","Selenium","Automation","Automation Testing");
      list.stream().filter(str->str.contains("Automation")).forEach(System.out::println);

//       // Find the first non repeated number in the given list using streams
//        List<Integer> numbers=Arrays.asList(1,2,3,4,5,3,4,5);
//       Map.Entry<Integer,Long> e= numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream().filter(e1->e1.getValue()==1).findFirst().get();
//       System.out.println(e.getKey());




   }


}
