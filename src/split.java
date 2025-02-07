import java.util.*;
public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringSplit(s);
    }
    public static void StringSplit(String a)
    {
        String []m=a.split(" ");
        for(int i=m.length-1;i>=0;i--)
        {
            System.out.println(m[i]+" ");
        }
    }
}
