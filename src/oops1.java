import java.util.*;
class employee {
   String name;
   int id;
   int  salary;
   void display()
   {
       System.out.println("name :"+name);
       System.out.println("id :"+id);
       System.out.println("salary:"+salary);

   }
}
public class oops1 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      employee em =new employee();
      em.name=sc.next();
      em.id=sc.nextInt();
      em.salary=sc.nextInt();
      em.display();
    }
}
