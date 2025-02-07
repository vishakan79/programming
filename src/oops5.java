import java.util.*;
class Account
{
    private int accno;
    private String name;
    private double bal;
    public int  getAccno()
    {
        return accno;
    }
    public String getName()
    {
        return name;
    }
    public double getBal()
    {
        return bal;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    Account(int accno,String name,double bal)
    {
        this.accno=accno;
        this.name=name;
        this.bal=bal;
    }
    public void withdraw(double amt)
    {
        bal=bal+amt;
        System.out.println(amt+"credited");
        System.out.println(bal+"remaining");
    }
    public void deposit(double amt)
    {
        bal=bal+amt;
        System.out.println(amt+"credited");
        System.out.println(bal+"remaining");
    }
}
public class oops5 {
    public static void main(String[] args) {
        Account a1=new Account(123,"Naveen",500);
        System.out.println(a1.getBal());
        System.out.println(a1.getName());
        a1.setName("vishakan");
        System.out.println(a1.getName());
        a1.deposit(1000);
        System.out.println(a1.getBal());

    }
}
