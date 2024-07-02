import java.util.Arrays;

public class StudentDemo
{
	public static void main(String[] args)
	{
		Student2[] students = new Student2[4];

		students[0] = new Student2("Fred", 991);
		students[1] = new Student2("Bill", 331);
		students[2] = new Student2("Adam", 412);
		students[3] = new Student2("Chris", 121);

		Arrays.sort(students);

		// Output the sorted array of students
		for (Student2 s : students)
		{
			System.out.println(s.toString());
		}
	}
}