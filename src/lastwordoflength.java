import java.util.*;
public class lastwordoflength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(findLast(str));
    }
    public static int  findLast(String s)
    {
       String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
