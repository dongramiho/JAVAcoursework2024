import java.util.Scanner;
public class StringEqualityDemo
{
    public static void main(String[] args)
    {   
        String s1, s2;
        System.out.println("Enter two lines of text: ");
        Scanner keyboard = new Scanner(System.in);
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();

        if (s1.equalsIgnoreCase(s2))
            System.out.println("The two lines are equal.");
        else
            System.out.println("THe two lines are not equal.");
        
    }
}

