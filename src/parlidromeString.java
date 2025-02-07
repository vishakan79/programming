import java.util.*;
public class parlidromeString {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      String str =sc.nextLine();
      checkString(str);
    }
    static void checkString(String str)
    {
       String rev="";
       for(int i=str.length()-1;i>=0;i--)
       {
           rev=rev+str.charAt(i);
       }
       if(str.toLowerCase().equals(rev.toLowerCase()))
       {
           System.out.println("parlirome");
       }
       else {
           System.out.println("not parlirome");
       }
    }
}
