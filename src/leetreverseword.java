import java.util.*;
public class leetreverseword {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(reverseString(str));
    }
    static String reverseString(String s)
    {
        String[] str =s.split(" ");
        StringBuilder sb =new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
