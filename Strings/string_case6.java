import java.util.*;
public class string_case6{
    public static void main(String[]args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Enter the string");
        String s1 = sc.next();

        s = s.replaceAll("[a-zA-Z]","a");
        s = s.replaceAll("[0-9]","b");
        s1 = s1.replaceAll("[a-zA-Z]","a");
        s1 = s1.replaceAll("[0-9]","b");

        int j = 0;

        // System.out.println(s);
        // System.out.println(s1);

        if( s.length() == s1.length() ){
            for(int i = 0; i < s.length(); i++){
                if( s.charAt(i) == 'a' && s1.charAt(i) == 'a' ){
                    // System.out.println("a");
                    j++; 
                }  
                else if(s.charAt(i) == 'b' && s1.charAt(i) == 'b'){
                    // System.out.println("b");
                    j++;
                }
                else if( s.charAt(i) == s1.charAt(i) ){
                    // System.out.println("c");
                    j++;
                }
                else {
                    System.out.println("false");
                    break;
                }
            }
        }
        else{
            System.out.println("false");
        }
        // System.out.println(j);
        if( j == s.length()  ){
            System.out.println("true");
        }
    }
}