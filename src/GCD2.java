import java.util.*;
public class GCD2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(betterGcd(a,b));
    }
    public static int betterGcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else {
                b=a-b;
            }
        }
        return a;
    }
}
