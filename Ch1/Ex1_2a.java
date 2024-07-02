import java.util.Scanner;

public class Ex1_2a {
    public static void main(String[] args) {
        System.out.print("enter your birth year");
        int n1, n2;

        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = 2024 - n1 +1;
        System.out.println("Your age is");
        System.out.println(n2);
    }

}
