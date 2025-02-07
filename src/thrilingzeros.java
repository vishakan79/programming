import java.util.*;
public class thrilingzeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorialZeros(num));
    }
    public static int factorialZeros(int n)
    {
        int result=0;
         int powerOf=5;
        while(n>=powerOf)
        {
            result=result+(n/powerOf);
            powerOf=powerOf*5;
        }
        return result;
    }
}
