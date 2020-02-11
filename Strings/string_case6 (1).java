import java.util.*;
public class string_case6{
    public static void main(String [] args){
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        System.out.println("Enter String");
        String st2 = sc.nextLine();
        String re1 = st1.replaceAll("[a-zA-Z]","");
        System.out.println(re1);
        String re2 = st2.replaceAll("[a-zA-Z]","");
        System.out.println(re2);
        System.out.println(re1.equals(re2));
    }
}