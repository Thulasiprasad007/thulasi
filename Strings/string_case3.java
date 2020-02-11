import java.util.regex.*;

public class string_case3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
        String divide = "\\";
        String regex = "(?<!\\\\)" + Pattern.quote(divide);
        String arr[] = sb.toString().split(regex);
        String add = "";
        for(int i = 0; i < arr.length; i++){
            if( i == 0){
                System.out.println("Drive: " + arr[i] + "\\");
            }
            else if( i == arr.length - 1 ){
                System.out.println("Folders: " + add );
                System.out.println("File: " + arr[i] );
            }
            else if( i == arr.length - 2 ){
                add = add + arr[i];
            }
            else{
                add = add + arr[i] + " || ";
            }
        }

    }
}