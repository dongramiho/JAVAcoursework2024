
public class Student extends Person
{
    private int studentNumber;

    public Student( )
    {
        super( ); 
        /*
         super -> 자식클래스에서 상위클래스의 인스턴스 참조
         super() --> 부모 클래스의 생성자를 명시적으로 호출 여기서는 person 호출
         */
        studentNumber = 0;//Indicating no number yet
    }

    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber( )
    {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    public void writeOutput( )
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent) &&
              (this.studentNumber == otherStudent.studentNumber);
    }


    public String toString( )
    {
        return "Name: " + getName( ) +
			   "\nStudent number: "  + studentNumber;
    }

 /* //For Optional Section
    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (!(otherObject instanceof Student))
            return false;
        else
        {
            Student otherStudent = (Student)otherObject;
            return (this.sameName(otherStudent)
                && (this.studentNumber ==
                                otherStudent.studentNumber));
        }
    }
*/

}
