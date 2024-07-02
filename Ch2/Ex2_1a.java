import java.util.Scanner;
public class Ex2_1a {
    public static void main(String[] args)
    {
        int year, n1, n2; 
        System.out.println("Enter four-digit integer");
        Scanner keyboard = new Scanner(System.in);

        year = keyboard.nextInt();

        n1 = year / 1000;
        n2 = year % 1000;

        System.out.println(n1);
        
        n1 = n2 / 100;
        n2 = n2 % 100;
        
        System.out.println(n1);

        n1 = n2 / 10;
        n2 = n2 % 10;

        System.out.println(n1);
        System.out.println(n2);

    }
    
}
