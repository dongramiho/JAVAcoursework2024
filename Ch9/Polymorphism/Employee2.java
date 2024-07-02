
// Employee class; this is named Employee2 to distinguish it
// from the Employee class from Practice Program 1
public class Employee2 extends Person
{
    private int employeeID;
    private String department;

    public Employee2( )
    {
        super( ); // person에서...
        employeeID = 0;//Indicating no number yet
        department = "";
    }

    public Employee2(String initialName, String initialDepartment, int initialID)
    {
        super(initialName);
        department = initialDepartment;
        employeeID = initialID;
    }

    public void reset(String newName, String newDepartment, int newID)
    {
        setName(newName);
        department = newDepartment;
        employeeID = newID;
    }

    public int getEmployeeID( )
    {
        return employeeID;
    }

    public void setEmployeeID(int newID)
    {
        employeeID = newID;
    }

    public void writeOutput( )
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Dept: " + department);
        System.out.println("Employee ID: " + employeeID);
    }

    public boolean equals(Employee2 otherEmployee)
    {
        return this.hasSameName(otherEmployee) &&
              (this.employeeID == otherEmployee.employeeID);
    }


    public String toString( )
    {
        return "Name: " + getName( ) +
        	   "\nDept: " + department +
			   "\nEmployee ID: "  + employeeID;
    }
}
