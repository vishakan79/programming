import java.util.Scanner;

public class indexofmethod
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int in=str.indexOf("win");
        System.out.println(in);
        int ab =str.indexOf("sha",1);
        System.out.println(ab);
    }
}
