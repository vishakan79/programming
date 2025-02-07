import java.util.*;
public class GCD3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println( optimizeGcd(a,b));
    }
    static int  optimizeGcd(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0)
        {
            return a;
        }
        else {
            return b;
        }
    }
}
