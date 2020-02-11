public class string_case2{
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("This is StringBuffer"); 
        System.out.println("Q1 "+ sb.append(" - This is a sample program"));
        System.out.println("Q2 "+ sb.insert(21, "Object"));
        System.out.println("Q3 "+ sb.reverse());
        sb.reverse();
        System.out.println("Q4 "+ sb.replace(14, 21, "Builder"));
    }
}