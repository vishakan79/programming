import java.util.*;
class car{
    String name;
    car(String b)
    {
        name=b;
    }
    void display()
    {
        System.out.println("name :"+name);
    }
}
public class oops2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a =sc.next();
        car s =new car(a);
        s.display();
    }
}
