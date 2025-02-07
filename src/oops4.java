import java.util.*;
class human
{
    String name;
    int age;
    static int population;
    human(String name,int age,int population)
    {
        this.name=name;
        this.age=age;
        this.population=population;
    }
    void details()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Population"+population);
    }
}
public class oops4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int  b=sc.nextInt();
        int c=sc.nextInt();
        sc.nextLine();
        String a1=sc.nextLine();
        int  b1=sc.nextInt();
        int c1=sc.nextInt();
        human poeple =new human(a,b,c);
        human poeple1 =new human(a1,b1,c1);
        poeple.details();
        poeple1.details();

    }
}
