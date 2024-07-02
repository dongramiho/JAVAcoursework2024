
public class Staff extends Employee2
{
    private int payGrade;

    public Staff( )
    {
        super( );
        payGrade = 0;
    }

    public Staff(String initialName, String initialDepartment, int initialID,
                   int initialPayGrade)
    {
        super(initialName, initialDepartment, initialID);
        setPayGrade(initialPayGrade);
    }

    public void reset(String newName, String newDept, int newID,
	                  int newPayGrade)
    {
        reset(newName, newDept, newID); //Employee2's reset
        setPayGrade(newPayGrade);
    }

    public int getPayGrade( )
    {
        return payGrade;
    }

    public void setPayGrade(String newPayGrade)
    {
        setPayGrade(payGrade);
    }

    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Pay Grade: " + payGrade);
    }

    private void setPayGrade(int newGrade)
    {
        if ((1 <= newGrade) && (newGrade <= 20))
            payGrade = newGrade;
        else
        {
            System.out.println("Illegal pay grade!");
            System.exit(0);
        }
    }

}
