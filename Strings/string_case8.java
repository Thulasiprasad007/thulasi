import java.util.*;
public class string_case8{
    public static void main( String [] args ){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        char a [] = st.toCharArray();
        char b [] = new char[a.length];
        int k = 0;
        for( int i = 0; i < a.length; i++ ){
            for( int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    b[k] = a[j];
                    k++;
                }
            }
        }
        String sk = "";
        for(int i= 0; i < k; i++ ){
            sk = sk + b[i];
            st = st.replace(sk,"");
            sk = "";
        }

        System.out.println( st.length() ); 
    }
}