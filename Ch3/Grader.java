import java.util.Scanner;
public class Grader 
{
    public static void main(String[] args) {
        int score;
        char grade;
        System.out.println("Enter your score: ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt();

        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else
            grade = 'D';

        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);

    }
}
//스위치 케이스문,...?