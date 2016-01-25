package week2;

/**
 * Created by Iurii on 24.01.2016.
 */
public class Subject {
    private String name;
    private int totalHours;
    private int studentHours = 0;
    private int studentMark;

    public Subject(int totalHours, String name, int mark) {
        this.totalHours=totalHours;
        this.name = name;
        this.studentMark = mark;
    }

    public boolean passTest () {
        return true;
    }
    public String getInfo () {
        return null;
    }

    public String getName() {
        return name;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public int getStudentHours() {
        return studentHours;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public void setStudentHours(int studentHours) {
        this.studentHours = studentHours;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }
}
