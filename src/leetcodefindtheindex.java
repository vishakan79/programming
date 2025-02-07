import java.util.*;
public class leetcodefindtheindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hayStack =sc.nextLine();
        String needle=sc.nextLine();
        System.out.println(IndexString(hayStack,needle));
    }
    public static int IndexString(String h,String n)
    {
        for(int i=0;i<=h.length()-1;i++)
        {
            if(h.charAt(i)==n.charAt(0))
            {
                if(h.substring(i,n.length()+i).equals(n))
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
