
public class Student2 extends Person // TODO1: Added 'implements Comparable'
{
    private int studentNumber;

    public Student2() {
        super();
        studentNumber = 0;// Indicating no number yet
    }

    public Student2(String initialName, int initialStudentNumber) {
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

    public boolean equals(Student2 otherStudent) {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }

    public String toString() {
        return "Name: " + getName() +
                "\nStudent number: " + studentNumber;
    }

    // TODO1: implement int compareTo() method
    // This version compares using the ID number.
    public int compareTo(Object o) {
        if ((o != null) && (o instanceof Student2)) {
            Student2 otherStudent = (Student2) o;
            if (studentNumber < otherStudent.studentNumber)
                return -1;
            else if (studentNumber > otherStudent.studentNumber)
                return 1;
            else
                return 0;
        }
        return -1; // Default if other object is not a Student2
    }

    /*
     * SOLUTION:
     * // This version compares using the studentNumber
     * public int compareTo(Object o)
     * {
     * if ((o != null) &&
     * (o instanceof Student2))
     * {
     * Student2 otherStudent = (Student2) o;
     * if (studentNumber < otherStudent.studentNumber)
     * return -1;
     * else if (studentNumber > otherStudent.studentNumber)
     * return 1;
     * else
     * return 0;
     * }
     * return -1; // Default if other object is not a Student2
     * }
     */
    // This version compares using the name
    /*
     * .
     * public int compareTo(Object o)
     * {
     * if ((o != null) &&
     * (o instanceof Student2))
     * {
     * Student2 otherStudent = (Student2) o;
     * return getName().compareTo(otherStudent.getName());
     * }
     * return -1; // Default if other object is not a Student2
     * }
     */
}
