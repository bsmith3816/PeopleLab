public class Student extends Person
{
    private double GPA;
    private int height;


    public Student(double GPA, int height,String firstName, String familyName)
    {
        super(firstName, familyName);
        this.height = height;
        this.GPA = GPA;
    }
    public double getGPA()
    {
        return GPA;
    }
    public int getHeight() {
        return height;
    }
    public String toString() {
        return getFamilyName() + " " + getFirstName();
    }
}
