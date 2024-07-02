import java.util.Scanner;
public class Ex2_1b {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a degree in Faharenheit:");
        double Faharenheit = keyboard.nextDouble();
        double celsius = (5*(Faharenheit-32.0))/9.0;

        System.out.println(Faharenheit + " degree in Faharenheit is equal to " + celsius);
    }

}