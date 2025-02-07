import java.util.*;
public class parlinrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String a,b=" ";
        a=sc.nextLine();
        int ab=a.length();
        for(int i=ab-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }*/
        String str = "akka";
        int i = 0;
        int j = str.length() - 1;
        boolean ans = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                ans = false;
                System.out.println("not parlinrome");
                break;
            }
            i++;
            j--;
        }
        if (ans) {
            System.out.println("parlinrome");
        }
    }
}
