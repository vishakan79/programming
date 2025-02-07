import java.util.*;
public class countString {
    public static void main(String[] args) {

        StringTotal();
    }
    public static void StringTotal()
    {
        String str="hello world";
        int count=0;
        for(int i= 0;i<str.length();i++)
        {
            if(str.charAt(i) !=' ')
            {
                count++;

            }

        }
        System.out.println(count);
    }
}
