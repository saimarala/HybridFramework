package IQ;


//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
//import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class  Logics {

    public static void main(String[] args) {
//        //swap two numbers
//				int x=10,y=20;
//				x=x+y;
//				y=x-y;
//				x=x-y;
//				System.out.println(x);
//				System.out.println(y);

        //fibonacci series
//				int n1=0,n2=1,num=10;
//				int n3=0;
//				System.out.print(n1+" "+n2);
//				for(int i=2;i<num;i++) {
//					n3=n1+n2;
//					System.out.print(" "+n3);
//					n1=n2;
//					n2=n3;
//				}
        // amother
//        int number = 6;
//        int first = 0, second = 1, next=0;
//        System.out.println("Fibonacci series is ");
//        for ( int i = 0; i<=number; i++)
//        {
//            System.out.print(first + " ");
//            next = second+first;
//            first = second;
//            second = next;
//        }

        //factorial

//				int fact=1,num=5;
//
//				for(int i=1;i<=num;i++) {
//					fact*=i;
//				}
//				System.out.println("factorial "+num+"is: "+fact);

 ///       System.out.println(factorial(5));




//				// *
//				// **
//				// ***
//
//				for(int i=1;i<=5;i++) {
//					for(int j=1;j<=i;j++) {
//						System.out.print("*");
//					}
//					System.out.println("");
////				}
//
//					int l=5;
//				for(int i=1;i<=l;i++) {
//					for(int k=l-1;k>=i;k--) {
//						System.out.print(" ");
//					}
//					for(int j=1;j<=i;j++) {
//						System.out.print("*");
//					}
//					System.out.println("");
//				}
//        //*
        // ***
        // *****
        // *******
        //*********
//				int l=5;
//				for(int i=1;i<=5;i++) {
//						//spaces
//					for(int k=l-1;k>=i;k--) {
//						System.out.print(" ");
//					}
//
//					for(int j=1;j<=i;j++) {
//						System.out.print("*");
//						System.out.print(j+" ");
//					}
//
//					for(int w=1;w<i;w++) {
//						System.out.print("*");
//						System.out.print(w+" ");
//					}
//					System.out.println("");
//				}
        //number pattern
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
//		for(int i=1;i<=5;i++){
//			for (int j=1;j<=i;j++){
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
        //*
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*

//		for(int i=1;i<=5;i++){
//			for (int j=1;j<=i;j++){
//				//System.out.print(j+" ");
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i=5-1;i>=1;i--){
//			for (int j=1;j<=i;j++){
//				//System.out.print(j+" ");
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//        		try {
//        			while(2>1) {
//
//        				System.out.println("hi");
//
//        				int x=1;
//        				System.out.println(x);
//        				int y=x++;
//        				if(x==10) {
//        					break;
//        				}
//                        x=y;
//        		}
//        		}
//        		catch(Exception e) {
//
//        		}
        //multiplication table
//								System.out.println("enter data");
//								Scanner sc=new Scanner(System.in);
//								int num=sc.nextInt();
//                                String str=sc.next();
//							int num=5;
//								for(int i=1;i<=10;i++) {//
//									System.out.println(num+"*"+i+"="+(num*i));
//								}
        //sum of given number

//        		int num =123;
//        		int sum=0;
//        		Scanner sc=new Scanner(System.in);
//        		System.out.println("enter the num");
//        		num=sc.nextInt();
//        		while(num>0) {
//        			sum+=num%10;
//        			num/=10;
//        		}
//               	System.out.println(sum);


        //Palindrome number

//						int num=343;
//						int sum=0;
//						int  temp=num;
//						while(num>0) {
//							sum=(sum*10)+num%10;
//							num/=10;
//						}
//						//reverse a number
//						System.out.println(sum);
//						if(temp==sum) {
//							System.out.println("Palindrome number"+sum);
//						}
//						else {
//							System.out.println("not Palindrome number");
//						}

        //Armstrong number

//						int num=153;
//						int rem=0;
//						int sum=0;
//						int temp=num;
//
//        while(num!=0) {
//            rem=num%10;
//            sum+=(rem*rem*rem);
//            num/=10;
//        }
//        if(sum==temp) {
//            System.out.println(temp+" Armstrong number");
//        }
//        else {
//            System.out.println(sum+" not Armstrong number");
////        }
//
//        //Anagram Or Not
//        String s1="Silent";
//        String s2="Listen";
//        boolean status= true;
//        s1=s1.replaceAll("\\s","");
//        s2.replaceAll("\\s","");
//        if(s1.length()!=s2.length()){
//            status=false;
//        }else {
//            char c1[]=s1.toLowerCase().toCharArray();
//            char c2[]=s2.toLowerCase().toCharArray();
//            Arrays.sort(c1);
//            Arrays.sort(c2);
//            Arrays.equals(c1,c2);
//        }
//        if(status){
//            System.out.println("Anagram");
//        }else {
//            System.out.println("not anagram");
//        }


        //even or odd
//
//        		int num=50,rem=0;
//        		String x="56";
//        					//	rem=num%2;
//        		if(num%2==0) {
//        			System.out.println("even");
//        		}
//        		else {
//        			System.out.println("odd");
//
//                }

//        int rem=0,arraysize=5;
//        		int myarray[]=new int[arraysize];
//
//        		myarray[0]=23;
//        		myarray[1]=60;
//        		myarray[2]=50;
//        		myarray[3]=45;
//        		myarray[4]=30;
//
//        		int myarray[]=new int[] {20,50,23,3450,90};
//        		System.out.println(myarray.length);
//
//        		for(int i=0;i<=myarray.length-1;i++) {
//        			//rem=myarray[i]%2;
//
//        			if(myarray[i]%2==0) {
//        				System.out.println("even");
//        			}else {
//        				System.out.println("odd");
//        			}
//        		}


        //		for(int i=0;i<5;i++) {
        //			if(i%2==0) {
        //				System.out.println("even");
        //			}else {
        //				System.out.println("odd");
        //			}
        //		}

        ////		System.out.println(tot);
//						String a="google";
//						String 	p[]=a.split("o");
//						System.out.println(p.length);
//					//	System.out.println(p[2]);
//						for(int i=0;i<p.length;i++) {
//							System.out.println(p[i]);
//						}
        //*********************


        //reverse a stirng
//
//        String z = "";
//				char e='i';
//				int c=0;
//				String str="this is selenium";
//				//op :muineles si siht
//				for(int i=str.length()-1;i>=0;i--) {
//					//char w=str.charAt(i);
//					//z=z+str.charAt(i);
//					//z=z+w;
//                    z+=str.charAt(i);
//				}
//				System.out.println(z);

        //no of appereances of char
        //		System.out.println("enter a char");
        //		String a=sc.nextLine();
        //		String b=a.toLowerCase();
//                     String x = "id ii this is selenium";
//						char e='i';
//						int c=0;
//
//						for(int i=0;i<x.length();i++) {
//							char w=x.charAt(i);
//
//							if(w==e) {
//								c++;
//							}
//
//						}
//						System.out.println(c);
//        for (char ch:x.toCharArray()){
//            if(ch==e){
//              c++;
//            }
//        }
//        System.out.println(c);
//        String e1="is";
//        long count=x.chars().filter(e->(char)e=='i').count();
//        System.out.println("char count : "+count);

//		int x=0;
//		System.out.println(x++);
//		System.out.println(x);
        //no of word count

//        		System.out.println("enter a word");
////        		String w=sc.nextLine();
//						int c=0;
//						String w="selenium";
//						String x="selenium selenium asas  sasa";
//						String p[]=x.split(" ");
//
//						for(int i=0;i<p.length;i++) {
//							//String act=p[i];
//							if(p[i].equalsIgnoreCase(w)) {
//								//c=c+1;
//                                c+=1;
//							}
//						}
//						System.out.println(c);
//
        //// length can be used for int[], double[], String[]
        // to know the length of the arrays.

        // length() can be used for String, StringBuilder, etc
        // String class related Objects to know the length of the String

//				//			//reverse word*******************
//						String reversedString="";
//						String str="this is selenium";
//						//op: siht si muineles
//						String words[]=str.split(" ");
//						for(int i=0;i<words.length;i++) {
//								String word=words[i];
//								String reverseWord="";
//							for(int j=word.length()-1;j>=0;j--) {
//								//reverseWord=reverseWord+word.charAt(j);
//                                reverseWord +=word.charAt(j);
//
//								}
//							//reversedString = reversedString+reverseWord+" ";
//                            reversedString += reverseWord+" ";
//						}
//					System.out.println(reversedString.trim());

//				//selenium is this
//				String str="this is selenium";
//				String words[]=str.split("\\s");
//				String reverse="";
//				for(int i=words.length-1;i>=0;i--) {
//					//reverse=reverse+words[i]+" ";
//                    reverse+=words[i]+" ";
//				}
//        for (int i=0;i< words.length;i++){
//            reverse =words[i]+" +"+reverse;
//        }
//				System.out.println(reverse.trim());
//				//ascendening order
//					int arr[]= {1,9,6,2,5,8};
//					int n=arr.length;
//					//System.out.println(n);
//                             Arrays.sort(arr);
//                             System.out.println("arrays sort ; "+Arrays.toString(arr));
//
//					int temp=0;
//					for(int i=0;i<arr.length;i++){
//						for(int j=i+1;j<arr.length;j++) {
//							if(arr[i]>arr[j]) {
//								temp=arr[i];
//								arr[i]=arr[j];
//								arr[j]=temp;
//							}
//						}
//					}
////				    for (int i = 0; i < arr.length; i++) {
////				        System.out.print(arr[i] + " ");
////				    }
//				    for (int a:arr){
//				        System.out.print(a+" ");
//                    }
//					System.out.println();
//            System.out.println(n);
        //split alphanumeric
		//		StringBuffer alpha=new StringBuffer(),num=new StringBuffer(),special=new StringBuffer();
//				String num1="";
//				String alp="";
//				String spec="";
//
//				String str="geeks01$$for02geeks03!@!!";
//				for(char ch:str.toCharArray()) {
//					if(Character.isDigit(ch)) {
//						//num.append(str.charAt(i));
//						 num1+=ch;
//                       //  alpha.append(ch);
//					}else if(Character.isAlphabetic(ch)) {
//						//alpha.append(str.charAt(i));
//						alp+=ch;
//					}else {
//						//special.append(str.charAt(i));
//						spec+=ch;
//					}
// 				}
//             //   System.out.println(alpha);
//				System.out.println(num1);
//				System.out.println(alp);
//				System.out.println(spec);

        //infinite for loop

//				for(;;) {
//					System.out.println("sel");
//				}
        //prime or not

        //list of prime numbers
//				int limit=100;
//				int flag;
//				for(int i=2;i<limit;i++) {
//                    flag = 0;
//                    for (int j = 2; j < i; j++) {
//                        if (i % j == 0) {
//                            flag = 1;
//                            break;
//                        }
//                    }
//                    if (flag == 0) {
//                        System.out.print(i + " ");
//                    }
//                }
//
//
//        for (int i = 2; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        Avg of prime numbers
//        int sum=0,count=0;
//        for (int i=2;i<=100;i++){
//            if (isPrime(i)){
//                sum+=i;
//                count++;
//            }
//
//        }
//        if (count > 0) {
//            double average = (double) sum / count;
//            System.out.println("Average of prime numbers in the range: " + average);
//        } else {
//            System.out.println("No prime numbers found in the given range.");
//        }



//        //largest number & smallest number
//        int[] arr = {1, 3, 5, 7, 9};
//        int largest = arr[0], smallest =arr[0];
//
//
//        for (int num : arr) {
//            if (num > largest) {
//                largest = num;
//            }else
//                if(num< smallest){
//                smallest=num;
//        }
//    }
//        System.out.println("largest :"+largest);
//        System.out.println("smallest :"+smallest);


        //list even & odd

//				int num=50;
//				for(int i=1;i<=num;i++) {
//					if(i%2!=0) {
//						System.out.print("odd num :"+i+" ");
//						System.out.println();
//					}else {
//						System.out.print("even num :"+i+" ");
//
//					}
//				}
        //We all know that JVM divides the all  allocated memory to a Java program into two parts. one is Stack and another one is heap.
        // Stack is used for execution purpose and heap is used for storage purpose.
        // In that heap memory, JVM allocates some memory specially meant for string literals.
        // part of the heap memory is called String Constant Pool.
        //For example, when you create string objects using string literal like below, they will be stored in the String Constant Pool.
//				String s1="sel";
//				String s2="sel";
//				System.out.println(s1==s2);//true
//				System.out.println(s1.equals(s2));//true
////				//And when you create string objects using new keyword like below, they will be stored in the heap memory.
//				String s3=new String("sel");
//				String s4=new String("sel");
//				System.out.println(s3==s4);//false
//				System.out.println(s3.equals(s4));//true
////				//In simple words, there can not be two string objects with same content in the string constant pool.
////				But, there can be two string objects with the same content in the heap memory.
//				String s5=new String("Hello");
//				String s6="Hello";
//				System.out.println(s5 == s6);//false
//				System.out.println(s5.equals(s6));//true

        //switch case

//				String n="3";
//				switch(n) {
//				case "1":
//					System.out.println("one");
//					break;
//				case "2":
//					System.out.println("two");
//					break;
//				case "3":
//					System.out.println("three");
//					break;
//				case "4":
//					System.out.println("four");
//					break;
//				case "5":
//					System.out.println("five");
//					default:
//						System.out.println("not matchinh");
//        	}
        //concatenation
//				int a=100;
//				int b=200;
//				String x="hello";
//				String y="world";
//				double c=12.33;
//				double d=10.33;
//
//				System.out.println(a+b);
//				System.out.println(x+y);
//				System.out.println(a+b+x+y);
//				System.out.println(x+y+a+b);
//				System.out.println(x+y+(a+b));//adding a+b
//				System.out.println(a+b+x+y+a+x+b+y);
//				System.out.println(a+b+x+y+a+b);
//				System.out.println(c+d);
//				System.out.println(x+y+c+d);

        //swap two strings
//				String a="hello";
//				String b="world";
//				System.out.println("before swapping");
//				System.out.println("the value of a is:"+a);
//				System.out.println("the value of b is:"+b);
//
//				//append a and b
//		System.out.println("test :"+b.substring(1,2));
//				a=a+b;//helloworld
//				//store initial string a in string b
//				b=a.substring(0,a.length()-b.length());
//				//store initial string b in string a
//				a=a.substring(b.length());//
//				System.out.println("after swapping");//
//				System.out.println("the value of a is:"+a);
//				System.out.println("the value of b is:"+b);
        //Remove the duplicates in the string
//				String names2[]= {"java","JavaScript","Ruby","java","Ruby","dd"};
//
//				Set<String> store=new HashSet<String>(List.of(names2));
//				for(String name:names2) {
//					if(store.add(name)==false) {
//						System.out.println("duplicate element is :"+name);
//						//store.remove(name);
//					}
//				}
//				System.out.println(store);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(2);
//        arrayList.add(9);
//        arrayList.add(1);
//        arrayList.add(6);
//        arrayList.add(2);
//        arrayList.add(5);
//       System.out.println( removeDuplicates(arrayList));

//				Integer names[]= {1,2,3,4,5,1,2};
//				Set<Integer>store=new HashSet<Integer>();
//				System.out.println(store);
//				for(Integer name:names) {
//					if(store.add(name)==false) {
//						System.out.println("duplicate element is :"+name);
//						store.remove(name);
//					}
//				}
//				System.out.println(store);
//

       // Set<Integer>dataSet1=new HashSet<Integer>();
//        Set<String>dataSet1=new HashSet<String>();
//       Set<String>dupSet=Arrays.asList(names).stream().filter(e->!dataSet.add(e)).collect(Collectors.toSet());
//        System.out.println("sai test"+names1.stream().filter(e->dataSet.add(e)).collect(Collectors.toSet()));
//        Set<String>RemovedupSet=Arrays.stream(names).filter(e->dataSet1.add(e)).collect(Collectors.toSet());
//        Arrays.stream(names).filter(e->dataSet.add(e)).forEach(System.out::println);
///        System.out.println(dupSet);
//        System.out.println(RemovedupSet);
        //Set
//		List<Integer> numbers=Arrays.asList(1,2,2,4,4,3,5,6,7,8,9,1,0,-1,-1,-2);
//		List<String> names=new ArrayList<>(Arrays.asList("Java","Ruby","Selenium","Java","Pyton","test","test"));
//		Set<String> linkedHashSet=new LinkedHashSet<>(names);
//		System.out.println(linkedHashSet);
//		Set<Integer> hashSet=new HashSet<>(numbers);
//		System.out.println(hashSet);
//		List<Integer>  numbersListWithoutDuplicate=new ArrayList<>(hashSet);
//		System.out.println(numbersListWithoutDuplicate);
		//JDk 8 -Stream :
//		Set<String> marks=names.stream().distinct().collect(Collectors.toSet());
//		Set<String> set=names.stream().collect(Collectors.toSet());
//		System.out.println(names.stream().distinct().collect(Collectors.toSet()));
//		System.out.println(marks);
//		System.out.println("set:"+marks);
//		System.out.print("last :"+names.stream().collect(Collectors.toSet()));

//
//			int a=1000,b=3000,c=300;
//				if(a>b && a>c){// a && B it executes both the conditions
//        // a && b if first condition is true then only it executes second condition
//        //a || b if first condition is false then only it executes second condition
//					System.out.println("a is greater");
//					}
//				else if(b>c){
//					System.out.println("b is greater");
//				}
//				else {
//					System.out.println("c is greater");
//				}
//
//	int a=1000,b=3000,c=300;
//        if(a<b && a<c){
//            System.out.println("a is smaller");
//        }
//        else if(b<c){
//            System.out.println("b is smaller");
//        }
//        else {
//            System.out.println("c is smaller");
//        }
//int z= a>b?a:b;


//				String[] str = { "GEEKS", "FOR", "GEEKS" };
//		        System.out.println(str[0].length());
//
//		        String str="he selenium";
//		        StringBuffer s=new StringBuffer(str);
//		        System.out.println(s.reverse());

        //how to find missing numbers in array
//
//				int a[]= {1,3,4,5};
//				int sum=0;
//				for(int i=0;i<a.length;i++) {
//					sum+=a[i];
//				}
//				System.out.println(sum);
//				int sum1=0;
//				for(int j=1;j<=5;j++) {
//					sum1+=j;
//				}
//				System.out.println(sum1);
//				System.out.println("missing number:"+(sum1-sum));
//
//                //or
//        Scanner scanner = new Scanner(System.in);
//
//        // Input array size
//        System.out.print("Enter the number of elements (including the missing number): ");
//        int n = scanner.nextInt();
//
//        // Initialize the array
//        int[] arr = new int[n - 1];
//        System.out.println("Enter " + (n - 1) + " numbers:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        // Calculate the sum of the first n natural numbers
//        int totalSum = n * (n + 1) / 2;
//
//        // Calculate the sum of the array elements
//        int arraySum = 0;
//        for (int num : arr) {
//            arraySum += num;
//        }
//
//        // The missing number is the difference between the total sum and the array sum
//        int missingNumber = totalSum - arraySum;
//
//        // Print the missing number
//        System.out.println("The missing number is: " + missingNumber);

//        int arr[]={2,3,4,5};
//        int actualSum=0,expSum=0,total=5;
//        expSum=total*((total+1)/2);
//        for (int i:arr){
//            actualSum+=i;
//        }
//       System.out.println(expSum-actualSum);
//        int[] arr = {1, 2, 4, 5, 6};
//        int n = arr.length + 1;
//        int total = n * (n + 1) / 2;
//        for (int num : arr) {
//            total -= num;
//        }
//        System.out.println(total);


////        //write a java program to merge two sorted arrays
//        int a[]={1,3,5,7,9} ,b[]={2,10,6,8};
//        Map<Integer,Boolean>mp=new HashMap<>();
////////        for (int i=0;i<a.length;i++){
////////            mp.put(a[i],true);
////////        }
////////        for (int i=0;i<b.length;i++){
////////            mp.put(b[i],true);
////////        }
//        for (int ar:a){
//            mp.put(ar,true);
//        }
//        for (int ar:b){
//            mp.put(ar,true);
//        }
       // mp.entrySet().forEach(System.out::println);
////      //  System.out.println(mp);
//        System.out.println(mp.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList()));
//        mp.entrySet().stream().map(e->e.getKey()).forEach(System.out::println);
//        //count no of vowels
//			String str="this is selenium";
//			char ch[]=str.toCharArray();
//			int count=0;
//			for(char c:ch) {
//
//				switch(c){
//				case 'a':
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':
//					count++;
//					//break;
//				}
//
//			}
//			System.out.println(count);

//			int count=0;
//				String str="this is selenium";
//				String str2="";
//				char ch[]=str.toCharArray();
//				for(int i=0;i<str.length();i++) {
//					char w=str.charAt(i);
//					if(w=='a' ||w=='e'||w=='i'||w=='o'||w=='u') {
//						System.out.print(w+" ");
//						count++;
//				}	else {
//					str2=str2+w;
//				}
//			}
//				System.out.println("");
//				System.out.println(count);
//				System.out.println(str2);
//       long vowelsCount=str.chars().filter(w->(char)w=='a' ||w=='e'||w=='i'||w=='o'||w=='u').count();
//       System.out.println("vowels count:"+vowelsCount);


//        6. Count Vowels and Consonants
//
//                String str = "Automation1";
//
//                int vowels = 0, consonants = 0;
//                for (char c : str.toCharArray()) {
//                    if ("aeiouAEIOU".indexOf(c) != -1) {
//                        vowels++;
//                    }
//                    else if (Character.isLetter(c)) {
//                        consonants++;
//                    }
//                }
//                System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);



//			for (char w:ch){
//				//if(w=='a' ||w=='e'||w=='i'||w=='o'||w=='u') {
//                if(vowelCheck(w)) {
//					System.out.print(w+" ");
//					count++;
//				}	else {
//					str2 = str2 + w;
//				}
//			}
//		        //System.out.println("");
//				System.out.println(count);
				//System.out.println(str2);
//				String s="java";
//				String s1="java";
//				s1="selenium";
//				//s=s1;
//				System.out.println(s.hashCode());
//				System.out.println(s1.hashCode());

        //Write a code to check whether one string is a rotation of another?
//				String str1 = "avajava";
//		        String str2 = "javaava";
//        String str1 = "abcdeb", str2 = "deabca";
//        String st3=str1.concat(str2);
//		        if(st3.contains(str2) && str1.length()==str2.length()) {
//		        	System.out.println("rotation");
//		        }
//		        else {
//		        	System.out.println("not rotation");
//		        }
//        String str1 = "abcde", str2 = "deabc";
//
//        if(str1.length() != str2.length()||str1.isEmpty()){
//            System.out.println("Second string is not a rotation of first string");
//        }
//        else {
//            //Concatenate str1 with str1 and store it in str1
//            str1 = str1.concat(str1);
//
//            //Check whether str2 is present in str1
//            if(str1.indexOf(str2) != -1)
//                System.out.println("Second string is a rotation of first string");
//            else
//                System.out.println("Second string is not a rotation of first string");
//        }
//

//		        How do you count the number of occurrences of each character in a string?
//
//		        String s="mmababctamantlslmag";
//		        int count = 0 ;
//		        for (int i = 0; i < s.length(); i++) {
//
//		            for (int j = 0; j < s.length(); j++) {
//
//		                if(s.charAt(i)==s.charAt(j))
//		                {
//		                	count++;
//		                }
//		            }
//		            System.out.println(s.charAt(i)+"--"+count);
//		            String d1=String.valueOf(s.charAt(i)).trim();
//		            s=s.replaceAll(d1,"");
//		            count = 0;
//		        }

        //HashMap
//				String str="Selenium sai sai ";
//				Map<Character ,Integer> charCountMap=new HashMap<>();
//				//char[]ch=str.toCharArray();
//				for(char c:str.toLowerCase().toCharArray()) {
//				   if(!String.valueOf(c).isBlank()){// returns true if the string is empty or contains only white space//
//                  // The java string isEmpty() method checks if this string is empty.
//                 // It returns true, if the length of the string is 0 otherwise false
//                      // //  if(!String.valueOf(c).isEmpty()){
//                  //  if(StringUtils.isNotBlank(String.valueOf(c))){
//                        if(charCountMap.containsKey(c)) {
//						//charCountMap.put(c, charCountMap.get(c)+1);
//                            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
//					}else {
//						charCountMap.put(c, 1);
//					}
//                    }
//				}
////		        for(Map.Entry entry :charCountMap.entrySet()) {
//		        	System.out.println(entry.getKey()+"  "+entry.getValue());
//		        }
//		        System.out.println("test "+charCountMap.entrySet().stream().map(e->e.getKey()+" "+e.getValue()).collect(Collectors.toList()));
//                charCountMap.entrySet().stream().map(e->e.getKey()+" "+e.getValue()).forEach(System.out::println);
//        charCountMap.entrySet().stream().forEach(System.out::println);
//                System.out.println(charCountMap.entrySet());
////          //find occurance of duplicates
//		System.out.println("find occurance of duplicates");
    //     Set<Character> chrs=charCountMap.keySet();
//				for (char c:charCountMap.keySet()){
//				    if (charCountMap.get(c)>1){
//				        System.out.println(c+":"+charCountMap.get(c));
//                    }
//                }
//				System.out.println("keySet");
//				System.out.println(charCountMap.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()+" "+e.getValue()).collect(Collectors.toList()));

        // How do you count the number of occurrences of each word in a string?
//		String str="This Is Selenium with Java is";
//		String[] words=str.toLowerCase().split(" ");
//		Map<String,Integer>wordcount=new HashMap<>();
//		for (String word :words){
//		//if(!word.isBlank()){// its not required
//            if(wordcount.containsKey(word)){
//                wordcount.put(word,wordcount.get(word)+1);
//            }else{
//                wordcount.put(word,1);
//            }
//       // }
//		}
//          // How do you count the number of occurrences of each character in a string?
//		for(Map.Entry en:wordcount.entrySet()){
//			System.out.println(en.getKey()+":"+en.getValue());
//
//		}
////		System.out.println("Stream"+wordcount.entrySet().stream().map(e->e.getKey()+":"+e.getValue()).collect(Collectors.toList()));
//		//       //*****************************************find occurance of duplicates
//		System.out.println("find occurance of duplicates");
//		Set<String>wordstring=wordcount.keySet();
//		for (String word:wordstring){
//			if(wordcount.get(word)>1){
//				System.out.println(word+":"+wordcount.get(word));
//			}
//		}
//        System.out.println("Steam and filter"+wordcount.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()+":"
//               +e.getValue()).collect(Collectors.toList()));
//        wordcount.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()+":"+e.getValue()).forEach(System.out::println);

//
// ystem.out.println(digimap.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()+":"+e.getValue()).collect(Collectors.toList()));
//        String names[] = {"Java", "Selenium", "Java", "Sel", "Sel"};
//        String val="";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String e : names) {
//            Integer count = hm.get(e);
//            if (count == null) {
//                hm.put(e, 1);
//            } else {
//                hm.put(e, ++count);
//            }
//        }
//        List<String>ls=Arrays.asList(names);
//        for(String name:ls){
//            if(hm.containsKey(name)){
//                hm.put(name,hm.get(name)+1);
//            }else {
//                hm.put(name,1);
//            }
//        }
//        System.out.println(hm);
//        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
//        for (Map.Entry<String, Integer> entry : entrySet) {
//            if (entry.getValue() > 1) {
//                System.out.println( entry.getKey()+":"+entry.getValue());
//                //  val=val+" "+entry.getKey();
//            }
//        }
        //  System.out.println("Duplicate element:" + val);

        //Java program to print alphabets
//		        for(char ch='a';ch<='z';ch++) {
//		        	System.out.println(ch);
//		        }


//        for (int i=65;i<=90;i++){
//            System.out.print((char)(i));
//        }
//        System.out.println();
//        for (int i=97;i<=122;i++){
//            System.out.print((char)i);
//        }

        //ip address
        // System.out.println(InetAddress.getLocalHost());

//		        String str="the order 1233456 has been placed";
//		        String p[]=str.split(" ");
//                System.out.println(str.split(" ")[2]);
//		        System.out.println(p[2]);
//
        //only one word reverse
//		        String str1="This is selenium java";
//
//
//		        String[]p=str1.split(" ");
//		        String z="";
//             String rstr="";
//		        for(int i=0;i<p.length;i++) {
//		        	//String exp=p[i];
//
//		        	if(p[i].equals("selenium")) {
//		        		for(int j=0;j<p[i].length();j++) {
//		        			//z+=p[i].charAt(j);
//                            rstr =p[i].charAt(j)+rstr;
//
//		        		}
//		        	}
//
//		        }
////
//		System.out.println(rstr);
//		str1=str1.replace("selenium",rstr);
//		System.out.println(str1);


        //Print hello world without using semi colon (;)
        //1
//		if(System.out.printf("hello world "+"\n")==null){
//		}
//		//2
//		if(System.out.append("hello world"+"\n")==null){
//        }
//		//3
//        if(System.out.append("hello world"+"\n").equals(null)){
//        }
//        //4
//        for (int i=0;i<1;System.out.println("hello world")){
//            i++;
//        }

//        //  output numbers from 1 to 100 without using numbers in your code
//              int one = 'Z' / 'Z';//1
//        String s1 = "..........";
//        for (int i = 'Z' / 'Z'; i <= s1.length() * s1.length(); i++) {
//            System.out.println(i);
//        }

//        //a-97 b-98 c-99 d-99
//        for (int i='a'/'a';i<='d';i++){
//            System.out.println(i);
//        }
//
//        		int count=0;
//		while(count<100){
//			count++;
//			System.out.println(count);
//		}

//        		int count=0;
//		while(count<100){
//
//			System.out.println(++count);
//		}
//          printNum(1,'d');
//         printNum(1,100);
//       String max="**********";
//         IntStream.range('a'/'a','e').forEach(e->System.out.println(e));
//        IntStream.range(1,101).forEach(System.out::println);

        //Compare two int numbers (Integer caching)
//        //-128 to 127
//        Integer num1=100;
//        Integer num2=100;
//        if(num1==num2){
//            System.out.println("both are equal");
//        }else{
//            System.out.println("both are not equal");
//        }
//        //What will be the output when you divide a number by zero?
        //Number=Integer,Double,Float
//        System.out.println(9.0 / 0);//Infinity
//        System.out.println(22.33f / 0);//Infinity
        //       System.out.println(10 / 0.0);//Infinity
//        System.out.println(19.999999d / 0);//Infinity
////        System.out.println(1/0);//Arithmetic exception
////        System.out.println(0/0);//Arithmetic exception
//        System.out.println(0.0 / 0);//NaN
//        System.out.println(0.0 / 0.0);//NaN
//        System.out.println(12.33 / 0.0);//Infinity

        //Find the sum of natural numbers
//        int total=0 , count=1 , num=10;
//        while(num>=count){
//          //  total=total+count;
//            total+=count++;
//           // count++;
//        }
//        System.out.println(total);
        // or
//        int n = 10, sum = n * (n + 1) / 2;
//        System.out.println(sum);
//        System.out.println(n * (n + 1) / 2);
// . Check for Perfect Number
//        int num = 28, sum = 0;
//        for (int i = 1; i <= num / 2; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(num == sum);
        //remove white spaces
//        String str="    this is selenium   ";
//        System.out.println(str.trim().replaceAll(" ",""));
//		String val=StringUtils.deleteWhitespace(str);

//		System.out.println(StringUtils.deleteWhitespace(str));
//		String DeletedWhiteSpaces="";
//		for(int i=0;i<str.length();i++){
////			if(str.charAt(i)!=' ' && str.charAt(i)!='\t'){
//				DeletedWhiteSpaces +=str.charAt(i);
//			}
//		}
//		System.out.println(DeletedWhiteSpaces);
//		String str1="this is selenium (java) and tutorial automation";
//		System.out.println(str1.charAt(19));
//		System.out.println(str1.indexOf('a',str1.indexOf('j')));
//		System.out.println(str1.indexOf("is"));
//		System.out.println(str1.substring(1,3));
//		System.out.println(str1.substring(str1.indexOf('(')+1,str1.indexOf(')')));
//		System.out.println(str1.substring(0,str1.indexOf(" ")));

//		String filePath="C:\\Users\\marala\\Desktop\\selenium.txt";
//		int charCount=0;
//		int wordCount=0;
//		int lineCount=0;
//		BufferedReader reader=null;
//		Map<String,Integer>wordMap=new HashMap<>();
//		try {
//			reader = new BufferedReader(new FileReader(filePath));
//			String currentLine = reader.readLine();
//			while (currentLine != null) {
//			    String words[]=currentLine.toLowerCase().split(" ");
//			    for (String word :words){
//			        if(wordMap.containsKey(word)){
//			            wordMap.put(word,wordMap.get(word)+1);
//                    }else {
//			            wordMap.put(word,1);
//                    }
//                }
//			    currentLine=reader.readLine();
//			}
//
//
//			}catch(FileNotFoundException e){
//				e.printStackTrace();
//			}catch(Exception e){
//				e.printStackTrace();
//			}finally {
//		    try{
//                reader.close();
//            }catch (Exception e){
//
//            }
//        }
//        wordMap.entrySet().stream().map(e->e.getKey()+" "+e.getValue()).forEach(System.out::println);

        //Maximum number of parameters we can take for a method in java?
        //ans : byte short int boolean float classtype-254(non static) and 255 (static)
        //double and long --->127(static and non static)
        //this is java code


//        // how to find length of string in java without using length method
//        String str = "Testing ";
//        System.out.println(str.trim().toCharArray().length);
//        System.out.println(str.trim().lastIndexOf(""));
//        System.out.println(getLength(str));

//        //Get the Count of Words is a Given Capitalized String
//            String str=" this is Selenium Automation SDET";
//            int c=0;
//        if (Character.isLowerCase(str.trim().charAt(0))){
//            c++;
//        }
//            for (int i=0;i<str.length();i++) {
//                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                    c++;
//                }
//            }
//            System.out.println(c);
//        for (int i=0;i<str.length();i++){
//            if (Character.isUpperCase(str.charAt(i))){
//                c++;
//            }
//        }
//        for (char ch :str.toCharArray()){
//            if(ch>='A' && ch<='Z'){
//                c++;
//            }
//        }
//        System.out.println(c);
//
////        for (char ch :str.toCharArray()){
////            if(Character.isUpperCase(ch)){
////                c++;
////            }-+
//
////        }
//        System.out.println(c);
        //streams
//        long count1=str.chars().filter(e->e>=65&& e<=90).count();
//       long count2= str.chars().filter(e->Character.isUpperCase(e)).count();
//       long count3=str.chars().filter(e->e>='A'&&e<='Z').count();
//       System.out.println(count1);
//        System.out.println(count2);
//        System.out.println(count3);
//        //how to generate Random Numbers in Java using Random, Math and ThreadLocalRandom.
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(random.nextInt());
//            System.out.println(random.nextBoolean());
//            System.out.println(random.nextDouble());
//            System.out.println(random.nextFloat());
//            System.out.println(random.nextGaussian());
//        }
//        System.out.println("______________");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Math.random());
//        }
//        System.out.println("______________");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ThreadLocalRandom.current().nextInt());
//            System.out.println(ThreadLocalRandom.current().nextDouble());
//            System.out.println(ThreadLocalRandom.current().nextBoolean());
//            System.out.println(ThreadLocalRandom.current().nextFloat());
//            System.out.println(ThreadLocalRandom.current().nextLong());
//        }
//        System.out.println("_____range_________");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(random.nextInt(50));
//            System.out.println(Math.random() * 100);
//            System.out.println(ThreadLocalRandom.current().nextInt(0, 15));
//        }
//
//        System.out.println("test :" + Math.pow(10, 5));
//        System.out.println(randomNumberGenerator(6));
//        //Print your name 1000 times without using any loop in Java
//        String str="selenium";
//        String s="i";
//        s=s.replaceAll("i","iiiiiiiiii");
//        s=s.replaceAll("i","iiiiiiiiii");
//        s=s.replaceAll("i","iiiiiiiiii");
//        s=s.replaceAll("i",str+"\n");
//        System.out.println(s);
//        printName("sai",2);
//        String str="this is selenium";
//        System.out.println(str.replace('i','z'));//the replace() method
//        replaces all the occurrences of old char with new char
//        System.out.println(str.replaceAll("(.*)is(.*)","was"));// replaceAll() method
//        replaces all the occurrences of old string with the new string.
//        String a="a",b="b",c="c";
//        System.out.println(a.concat(b).concat(c));
        				String str = "this # Is$ selenium123 Testing4";
//				str = str.replaceAll("[a-zA-Z0-9]", "");
//				str=str.replaceAll("[^0-9]","");
//				str=str.replaceAll("[^a-zA-Z0-9 ]", "");
//				System.out.println(str);

//        String str="test12345";
//       String digit= str.replaceAll("[^0-9]","");
//       System.out.println(digit);
       String str2="Education";
       str2=str2.replaceAll("[^aeiouAEIOU]","");
       System.out.println(str2);

//        String str = "Automation";
//        StringBuilder reversed = new StringBuilder(str).reverse();
//        System.out.println(reversed);

        //Array rotation
//        int input[]={1,2,3,4,5};
//        Collections.rotate(Arrays.asList(input),3);
//        System.out.println(Arrays.toString(input));
//     System.out.println(" Random :"+RandomStringUtils.randomAlphabetic(10));
    }

    public static void printNum(int stNum, int endNum) {
        if (stNum <= endNum) {
            System.out.println(stNum);
            stNum++;
            printNum(stNum, endNum);
        }

    }

    public static int getLength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }

        } catch (IndexOutOfBoundsException e) {
            return i;
        }
    }

    public static String randomNumberGenerator(int number) {
        Random rand = new Random();
        int num = (int) Math.pow(10, number);
        int randomNumber = 0;
        do {
            randomNumber = rand.nextInt(num);
        } while (randomNumber == 0);

        return Integer.toString(randomNumber);
    }

    public boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char c1[] = str1.toLowerCase().toCharArray();
            char c2[] = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }

    public static boolean vowelCheck(char c){
        return c=='a' ||c=='e'||c=='i'||c=='o'||c=='u';
    }

    // Method to check if a number is prime
    //Code to find the average of all prime numbers in a given range
    //in java
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Prime numbers are greater than 1
        }

        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // The number is prime
    }
    public static void printName(String name, int count) {
        if (count == 0) {
            return; // Base case: stop when count reaches 0
        }
        System.out.println(name);
        printName(name, count - 1); // Recursive call with decremented count
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }


}