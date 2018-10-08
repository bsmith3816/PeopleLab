public class Classroom {
    private Teacher teacher;
    private Student[] students;
    public Classroom(Student[] students,Teacher teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }
    public String getSubject()
    {
        return this.teacher.getSubject();
    }
    public double classAverage()
    {
        double GPAsum = 0.0;
        for(int i = 0; i < students.length; i++)
        {
            GPAsum += students[i].getGPA();
        }
        return GPAsum / students.length;
    }
    public void printClass()
    {
        System.out.println(teacher + " " + teacher.getSubject());
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}

