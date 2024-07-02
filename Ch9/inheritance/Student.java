
public class Student extends Person {
    private int studentNumber;

    public Student() {
        super();
        studentNumber = 0;// Indicating no number yet
    }

    public Student(String initialName, int initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber) {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }

    /** === TEST PROGRAM === **/
    public static void main(String[] args) {
        Student joe = new Student("Joe Student", 2001);
        System.out.println(joe);
    }


    /*
     * //TODO 1: exercise Ch. 8.2
     * Overide toString()
     */
     // Overriding toString() method in Person class to include studentNumber 
     //모든 클래스는 String toString() 메소드를 가지고 있다
    @Override 
    public String toString() { 
        return "Name: " + getName() + "\n" +
                "Student Number: " + studentNumber;
    }
    /*
     * //TODO 2: exercise Ch. 8.2
     * Make a better equals() method
     * by overriding the equals() instead of overloading it.
     */
    public boolean equals(Object otherObject) {
        if (otherObject instanceof student){
            Student otherStudent = (Student) otherObject;
            isEqual = this.sameName(otherStudent) &&
                    (this.studentNumber == otherStudent.studentNumber);
            }
        return isEqual;
        }
    }