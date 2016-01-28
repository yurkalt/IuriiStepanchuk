package week2.univer;

/**
 * Created by Iurii on 23.01.2016.
 */
public class TestStaticStudent {



    public static void main(String[] args) {
        Student student1 = new Student("Kolia",5);
        Student student2 = new Student("Vasia",4);

        double money = Student.getMonthMoney();

        student1.addSubject(new Subject(25,"Math"));
        student1.addSubject(new Subject(10,"English"));
        student1.addSubject(new Subject(100,"OOP"));

        Subject res = student1.getSubjects(0);
        System.out.println("Was subject added: " + res.getName().equals("Math"));

        student1.learn("Math",15);
        student1.learn("English",7);
        student1.learn("OOP",79);
        student1.getSubjects(0).passTest();
        student1.getSubjects(1).passTest();
        student1.getSubjects(2).passTest();

        System.out.println("Student was studding 15 hours of Math: " + (student1.getSubjects(0).getStudentHours() == 15));

        System.out.println("What is the mark for exam: " + student1.getSubjects(0).getStudentMark());



       student1.getSubjInfo();
        System.out.println();

        System.out.println("Average student mark = 4? - " + (student1.average()==4));

        System.out.println();

        Subject deleted =  student1.deleteLastSubj();
        System.out.println("Last subject was English. True? - " + deleted.getName().equals("OOP"));
        System.out.println("Deleted? " + (student1.getSubjCount()==2));
    }
}
