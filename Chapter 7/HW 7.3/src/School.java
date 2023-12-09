import java.util.ArrayList;
import java.util.Iterator;

public class School {

    private ArrayList<Student> students;


    public School() {
        students = new ArrayList<>();

    }


    public void addStudent(Student aStudent) {
        students.add(aStudent);
    }

    public void removeStudent(Student aStudent) {

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student theStudent = iterator.next();
            if (theStudent.getStudentName().equals(aStudent.getStudentName())
                    && theStudent.getStudentAge() == aStudent.getStudentAge()) {
                iterator.remove();
            }
        }
    }

    public Student findYoungestStudent() {

        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentAge() < students.get(index).getStudentAge()) {
                index = i;
            }
        }

        if (students.size() == 0) return null;
        else return students.get(index);


    }

    public Student findOldestStudent() {

        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentAge() > students.get(index).getStudentAge()) {
                index = i;
            }
        }

        if (students.size() == 0) return null;
        else return students.get(index);


    }

    @Override
    public String toString() {
        return students.toString();
    }
}