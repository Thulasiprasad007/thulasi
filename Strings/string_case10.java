import java.util.*;
public class string_case10{
    public static void main(String [] args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in); 
        String s = "";
        String st = sc.nextLine();
        for(int i=0;i<st.length();i++){
            char c = st.charAt(i);
            if(s.contains(String.valueOf(c))){

            }
            else{
                s = s+c;
            }
        }
        System.out.println(s);
    }
} 