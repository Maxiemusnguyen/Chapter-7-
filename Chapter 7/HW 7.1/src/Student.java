public class Student {
    private int id;
    private int age;
    private double gpa;
    private int creditHours;
    public Student() {
    }
    public Student(int id, int age, double gpa, int creditHours) {
        super();
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public static void main(String[] args) {

        Student s = new Student(1, 12, 7.8, 12);
        System.out.println(s.getAge());
        s.setAge(13);
        System.out.println(s.getAge());
    }

}