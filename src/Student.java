public class Student extends Person
{
    private double gpa;
    private int height;


    public Student(double gpa, int height,String firstname, String familyname)
    {
        super(firstname, familyname);
        this.height= height;
        this.gpa= gpa;
    }
    @Override
    public double getGpa()
    {
        return gpa;
    }
    public int getHeight()
    {
        return height;
    }
    
}
