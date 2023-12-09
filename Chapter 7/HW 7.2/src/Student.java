import java.util.Scanner;
public class Student
{ int id;String name;
    public void toString(Student o) {
        System.out.println(id+" "+name+" "+o.id+" "+o.name) ;
    }
    public Boolean equals(Student o) {
        if(id==o.id)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student m[]=new Student[2];
        System.out.println("Enter student id and name of 1st student:");
        m[0]=new Student();
        m[0].id=sc.nextInt();
        sc.nextLine();
        m[0].name=sc.nextLine();
        System.out.println("Enter student id and name of 1st student:");
        m[1]=new Student();
        m[1].id=sc.nextInt();
        sc.nextLine();
        m[1].name=sc.nextLine();
        if(m[0].equals(m[1]))
            m[0].toString(m[1]);
    }
}