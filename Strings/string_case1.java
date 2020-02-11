import java.util.*;
public class string_case1{

    public static void main(String [] args){
        String str = "Welcome to Java World";
        
        System.out.println("Q1 "+ str.charAt(5));
        System.out.println("Q2 "+ str.compareToIgnoreCase("Welcome"));
        System.out.println("Q3 "+ str.concat(" - Let us learn"));
        System.out.println("Q4 "+ str.indexOf("a"));
        System.out.println("Q5 "+ str.replace('a','e'));
        System.out.println("Q6 "+ str.substring(4, 10));
        System.out.println("Q7 "+ str.toLowerCase());
      
    }
}