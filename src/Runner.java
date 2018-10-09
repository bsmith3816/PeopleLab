public class Runner {
    static String[] firstNames = {"Bob","Sherry","Abraham","Donald","Goofy","Alex","Carol","Erasmus","Fa","George","Hillary","Irelia","Jacky","Kyle","Momo","Nono","Peggy","Queen","Sarah","Terry","U","Weather","Xemnas","Yolo","Zawarudo"};
    static String[] familyNames = {"Chen","Li","Lee","Shen","Qi","Chang","Chen","Jiang","Ng","Nguyen","Kim","Wong","Wang","Lin","Liu","Huang","Zhang","Zheng","Tang","Hong"};

    public static Student randomStudent(){
        Student randomStudent = new Student((int)(Math.random() * 4), (int)(Math.random() * 6), (int)(Math.random() * 200), firstNames[(int)Math.random() * firstNames.length], familyNames[(int)Math.random() * familyNames.length]);
        return randomStudent;
    }

    public static void main(String[] args){
        Teacher teacher = new Teacher("Biology","Mr.","Fisher","Davis");
        Student[] students = new Student[30];

        for(int i = 0; i < 30; i++){
            Student s = randomStudent();
            students[i] = s;
        }

        Classroom room = new Classroom(students, teacher);
        room.printClass();
    }
}