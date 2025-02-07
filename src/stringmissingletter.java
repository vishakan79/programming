import java.util.*;
public class stringmissingletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c="";
        for(char ch:a.toCharArray())
        {
            if(!b.contains(String.valueOf(ch)))
            {
                c+=ch;
            }
        }
        System.out.println(c);
    }
}
