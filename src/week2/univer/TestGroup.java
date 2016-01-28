package week2.univer;

/**
 * Created by Iurii on 24.01.2016.
 */
public class TestGroup {

    public static void main(String[] args) {
        MyDate myDate = new MyDate(1990,7,12);

        Student student1 =
                new Student("Oleg", myDate,
                        new Address("UA","Kiev","peremogy sqr", 34),
                        new Contact("+343434334", null));
        Student student2 =
                new Student("Oleg", myDate,
                        new Address("UA","Odessa","derebasovskaya st", 2),
                        new Contact("+34300000", null));

        Group group = new Group("ACO-11");



        group.addStudent(student1);
        group.addStudent(student2);
        System.out.println(group.asString());

        System.out.println();
        System.out.println((group.getSize() == 2) + " addStudent");

        Student found = group.findById(student1.getIdNum());
        System.out.println((found != null) + " findById");

        Student[] filteredByCity = group.filterByCity("Kiev");
        System.out.println((filteredByCity != null && filteredByCity.length == 1) + " filterByCity");

        Student[] filteredByName = group.filterByName("Oleg");
        System.out.println((filteredByName != null && filteredByName.length == 2) + " filterByName");

        student1.getSubjects(0).passTest();

        group.deleteLastStudent();
        System.out.println((group.getSize() == 1) + " deleteLast");
        System.out.println();

        Student[] sorted = group.sort();

        System.out.println(group.asString());

    }
}
