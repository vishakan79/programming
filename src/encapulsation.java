import java.util.*;
class BankAccount
{
    private double balance;
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        if(balance>=0)
        {
            this.balance=balance;
        }
        else {
            System.out.println("Invalid balance amount!");
        }
    }
}
public class encapulsation {
    public static void main(String[] args) {
        BankAccount acc =new BankAccount();
        acc.setBalance(500);
        System.out.println("Account  balance :"+acc.getBalance());
    }
}
