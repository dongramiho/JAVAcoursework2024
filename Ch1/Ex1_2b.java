import java.util.Scanner;
public class Ex1_2b {
    public static void main(String[] args) {
       System.out.println("enter two different integers");

       Scanner keyboard =new Scanner(System.in);

       int n1 = keyboard.nextInt();
       int n2 = keyboard.nextInt();

       System.out.println("the number of integers between them");
       if (n1>=n2) {System.out.println(n1-n2+1);}
       else if (n1<=n2) {System.out.println(n2-n1+1);} 


        }
}
