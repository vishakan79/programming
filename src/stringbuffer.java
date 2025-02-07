import java.util.*;
public class stringbuffer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        doubleDigitsNumTOChar(s);
    }
    public static void convertNumToChar(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                System.out.println(s.charAt(i));
            }
            else {
                int a=Character.getNumericValue(s.charAt(i));
                for(int j=1;j<a;j++)
                {
                    System.out.println(s.charAt(i+1));
                }
            }
        }
    }
    public static void doubleDigitsNumTOChar(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            StringBuffer sb=new StringBuffer();
            while(Character.isDigit(ch))
            {
                sb.append(ch);
                ch=s.charAt(++i);
            }
            int k=Integer.parseInt(sb.toString());
            for(int j=0;j<k;j++)
            {
                System.out.println(ch);
            }
        }
    }

}
