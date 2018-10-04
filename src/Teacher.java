public class Teacher extends Person{
    private String subject, title;

    public Teacher(String subject, String title, String firstName, String familyName){
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
        this.getFirstName() = firstName;
        this.getFamilyName() = familyName;
    }
    public String getSubject(){
        return subject;
    }
    public String toString(){
        return title + ". " + familyName;
    }
}
