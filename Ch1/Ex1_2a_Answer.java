import java.util.Scanner;
public class Ex1_2a_Answer {
    public static void main(String[] args) {
        System.out.println("당신의 출생년도를 입력하세요.");

        Scanner keyboard = new Scanner(System.in);
      
        int birthYear = keyboard.nextInt();
        int currentyear = 2024;
        int age = currentyear - birthYear;
        
    System.out.println("당신의 나이는" + (age+1) + "입니다");

    

    }
}
