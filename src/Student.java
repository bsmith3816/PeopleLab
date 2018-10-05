public class Student extends Person
{
    private double GPA;
    private double height;
    private double weight;


    public Student(double GPA, double height, double weight, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.height = height;
        this.weight = weight;
        this.GPA = GPA;
    }
    public double getGPA()
    {
        return GPA;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String toString() {
        return getFamilyName() + " " + getFirstName();
    }
}
