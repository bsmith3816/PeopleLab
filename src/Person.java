public abstract class Person {
    public Person(String firstName, String familyName){
        super("Person");
        this.firstName = firstName;
        this.familyName = familyName;
    }
    @Override
    public String getFirstName(){
        return firstName;
    }
    @Override
    public String getFamilyName(){
        return familyName;
    }
    public boolean equals(Person p){
        if(firstName.equals(familyName)){
            return true;
        }
        return false;
    }

}
