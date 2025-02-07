import java.util.*;
public class gcd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(checkGCD(a,b));
    }
    public static  int checkGCD(int n,int m)
    {
        int min=0;
        if(n<m)
        {
            min=n;
        }
        else {
            min=m;
        }
        for(int i=min;i>=1;i--)
        {
            if(n%i==0 && m%i==0 )
            {
                return i;
            }
        }
        return 1;
    }
}
