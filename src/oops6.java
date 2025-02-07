class  students
{
    String name;
    String regno;
    int subject1;
    int subject2;
    int subject3;
    int result=0;
    students(int subject1,int subject2,int subject3)
    {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setRegno(String regno)
    {
        this.regno=regno;
    }
    public String getRegno()
    {
        return regno;
    }
    int percentage()
    {
        result=subject1+subject2+subject3;
        return result;
    }

}
public class oops6 {
    public static void main(String args[])
    {
        students st =new students(78,89,90);
        st.setName("vishakan");
        System.out.println(st.getName());
        st.setRegno("23LEC010");
        System.out.println(st.getRegno());
        System.out.println(st.percentage());
    }
}
