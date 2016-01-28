package week2.univer;

/**
 * Created by Iurii on 23.01.2016.
 */
public class Student {
    private static double monthMoney = 790;
    private static int idCounter = 0;
    private String idNum;
    private String name;
    private int rank;

    private int subjCount=0;
    private Subject [] subjects = new Subject [10];


    private MyDate birthday;
    private Address address;
    private Contact contact;

    public Student() {
    }

    // run before constructors
    {
        this.idNum = String.valueOf(idCounter);
        idCounter++;
    }

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public Student(String name, MyDate birthday,
                   Address address, Contact contact) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
    }

    public static double getMonthMoney() {
        return monthMoney;
    }

    public static void staticMeth(){
        //rank++;
    }


    public void nonStaticMeth(){
        monthMoney++;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }


    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void learn(String math, int hours) {
        for (int i = 0; i <subjCount ; i++) {
            if (subjects[i].getName().equals(math)) {
            subjects[i].setStudentHours(subjects[i].getStudentHours()+hours);
            }

        }
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public Subject getSubjects(int id) {
       return subjects[id];
    }

    public void addSubject(Subject input) {
        subjects[subjCount]=input;
        subjCount++;
    }

    public int getSubjCount() {
        return subjCount;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void getSubjInfo () {
        System.out.println();
        System.out.println(String.format("student %s info: ", this.name));
        for (int i = 0; i < subjCount ; i++) {
            System.out.println(String.format("Subject: %s, total hours: %s, student learned hours: %s",
                    subjects[i].getName(),subjects[i].getTotalHours(), subjects[i].getStudentHours()));
        }
    }

    public double average () {
        float sum = 0;
        for (int i = 0; i < subjCount ; i++) {
            sum += subjects[i].getStudentMark();
        }
     return sum /subjCount;
    }

    public String asString(){
        return String.format("id %s, name %s, birthday %s, address %s",
                idNum, name, birthday.asString(), address.asString());
    }

    public Subject deleteLastSubj() {
        Subject deleted = subjects[subjCount-1];
        subjects[subjCount-1] = null;
        subjCount--;
        return deleted;
    }
}
