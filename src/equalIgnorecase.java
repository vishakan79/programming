import java.util.Scanner;

public class equalIgnorecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        String u =sc.nextLine();
        System.out.println(s.equalsIgnoreCase(t));
        System.out.println(t.equalsIgnoreCase(u));
    }
}
