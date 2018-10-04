public class Teacher extends Person{
    private String subject, title;
    public Teacher(String subject, String title){
        super("Teacher");
        this.subject = subject;
        this.title = title;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String toString(){
        return title + ". " + familyName;
    }
}
