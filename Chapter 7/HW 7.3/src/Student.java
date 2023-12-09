public class Student {

    private String studentName;
    private int studentAge;

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}