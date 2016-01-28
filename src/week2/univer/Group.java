package week2.univer;

import java.util.Arrays;

/**
 * Created by Iurii on 23.01.2016.
 */
public class Group {
    private int freePlace = 0;
    private String groupName;
    private Student[] students = new Student[24];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student greenStudent){
        students[freePlace] = greenStudent;
        freePlace++;
    }

    public Student deleteLastStudent(){
        freePlace--;
        students[freePlace] = null;
        return null;
    }

    public Student findById(String id){
        if(id == null){
            System.err.println("id is null");
            return null;
        }

        for (int i = 0; i < freePlace; i++) {
            if(students[i].getIdNum().equals(id)){
                return students[i];
            }
        }

        System.err.println("No student found");
        return null;
    }

    public Student[] filterByName(String name){
        Student[] res = new Student[freePlace];

        int curr = 0;
        for (int i = 0; i < freePlace; i++) {
            if(students[i].getName().equals(name)){
                res[curr] = students[i];
                curr++;
            }
        }

        return Arrays.copyOf(res,curr);
    }

    public Student[] filterByCity(String city){
        Student[] res = new Student[freePlace];

        int curr = 0;
        for (int i = 0; i < freePlace; i++) {
            Address address = students[i].getAddress();
            if(address != null && address.getCity().equals(city)){
                res[curr] = students[i];
                curr++;
            }
        }

        return Arrays.copyOf(res,curr);
    }

    public String asString(){
        String res = "GROUP NAME " + groupName +
                "\n"+ "Count " + freePlace + "\n";

        for (int i = 0; i < freePlace; i++) {
            Student student = students[i];
            res += student.asString() + "\n";
        }


        return res;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getSize(){
        return freePlace;
    }

    public Student[] sort() {
        return null;
    }
}
