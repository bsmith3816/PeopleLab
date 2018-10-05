public class Student extends Person
{
    private double gpa;
    private int height;


    public Student(double gpa, int height,String firstName, String familyName)
    {
        super(firstName, familyName);
        this.height= height;
        this.gpa= gpa;
    }
    @Override
    public double getGpa()
    {
        return this.gpa;
    }
    public int getHeight()
    {
        return this.height;
    }
    public String getFamilyName()
    {
        return this.familyName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    @Override
    public String toString()
    {
        return firstName+","+familyName;
    }
}
