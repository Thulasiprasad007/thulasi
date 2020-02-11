import java.util.regex.*;
import java.util.*;

public class string_case9 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.matches("[0-9-]+")){
            if(Integer.valueOf(s) < 0){
                System.out.println(Math.abs(Integer.valueOf(s)));
            }
            else{
                System.out.println("-1");
            }
        }
             
        else
            System.out.println("-1");

    }
}