import java.util.*;
public class string_case4{
    public static void main(String [] args){
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        System.out.println("Enter String");
        String st2 = sc.nextLine();
        if( st1.length() < st2.length() ){
            System.out.println("\"" + st1 + st2.substring((st2.length()-st1.length()),st2.length()) +"\"");
        }
        else if( st1.length() > st2.length() ){
            System.out.println("\"" + st1.substring((st1.length()-st2.length()),st1.length()) + st2 +"\"");
        }
        else{
            System.out.println("\"" + st1 + st2 +"\"");
        }
    }
}