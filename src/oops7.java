class animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("Dog is barking...");
    }
}
public class oops7 {
    public static void main(String[] args) {
        dog Dog =new dog();
        Dog.eat();
        Dog.bark();

    }
}
