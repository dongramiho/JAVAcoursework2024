import java.util.Scanner;
public class Ex1_2b_Answer {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요.");
        int firstnumber = keyboard.nextInt();

        System.out.println("두번쨰 정수를 입력하세요");
        int secondNumber = keyboard.nextInt();

        int count = secondNumber - firstnumber + 1 ; 

        System.out.println("두 정수 사이의 정수 개수는" + count + "개 입니다.");

        // 이렇게 하면 만약 First number가 Second number보다 크면? -가 나온다...

    }

}
