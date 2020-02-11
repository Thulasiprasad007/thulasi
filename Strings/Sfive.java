import java.util.StringTokenizer;
public class Sfive {
      public static boolean formattingDate(String s){
            boolean b1 = false;
            StringTokenizer t = new StringTokenizer(s,"/");
            int n1 = Integer.parseInt(t.nextToken());
            int n2 = Integer.parseInt(t.nextToken());
            String s2 = t.nextToken();
            int n3 = Integer.parseInt(s2);
            int n4 = s2.length();
            if(n4 == 4) {
                  if(n3%4 == 0) {
                        if((n2 == 2)&&(n1 <= 29))
                              b1 = true;
                        else if((n2 == 4)||(n2 == 6)||(n2 == 9)||(n2 == 11)&&(n1 <= 30))
                              b1=true;
                        else if((n2 == 1)||(n2 == 3)||(n2 == 5)||(n2 == 7)||(n2 == 8)||(n2 == 10)||(n2 == 12)&&(n1 <= 31))
                              b1=true;
                  } else {
                        if((n2 == 2)&&(n1 <= 28))
                              b1 = true;
                        else if((n2 == 4)||(n2 == 6)||(n2 == 9)||(n2 == 11)&&(n1 <= 30))
                              b1 = true;
                        else if((n2 == 1)||(n2 == 3)||(n2 == 5)||(n2 == 7)||(n2 == 8)||(n2 == 10)||(n2 == 12)&&(n1 <= 31))
                              b1 = true;
                  }
            }
            return b1;
      }
      public static void main(String[] args) {
            String s = "31/13/2012";
            boolean b = formattingDate(s);
            if(b == true)
                  System.out.println("Date is in dd/MM/yyyy format (True)");
            else
                  System.out.println("Date is not in dd/MM/yyyy format (False)");
            }
}