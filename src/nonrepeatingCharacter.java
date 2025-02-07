import java.util.*;
public class nonrepeatingCharacter {
    public static void main(String[] args) {

    }
    public static char findFirstNonRepeatingCharacter(String str)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char current =str.charAt(i);
            boolean isrepeating=false;
            for(int j=0;j<n;j++)
            {
                if(i!=j && current ==str.charAt(j))
                {
                    isrepeating =true;
                    break;
                }
            }
            if(!isrepeating)
            {
                return current;
            }
        }
        return '\0';

    }
}
