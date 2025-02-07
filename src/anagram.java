import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        s=s.toLowerCase();
        t=t.toLowerCase();
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean z=Arrays.equals(a,b);
        if(z)
        {
            System.out.println("anagram");
        }
        else {
            System.out.println("not  a anagaram");
        }
    }
}
