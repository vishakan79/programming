import java.util.*;
class student
{
    String name;
    String rollno;
    Float cpba;
    student(String name,String rollno,Float cpba)
    {
        this.name=name;
        this.rollno=rollno;
        this.cpba=cpba;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("cbpa:"+cpba);
    }

}
public class oops3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      String b=sc.next();
      Float c=sc.nextFloat();
      sc.nextLine();
        String a1=sc.next();
        String b1=sc.next();
        Float c1=sc.nextFloat();
      student s =new student(a,b,c);
      student s1 =new student(a1,b1,c1);
      s.display();
      s1.display();
    }
}
