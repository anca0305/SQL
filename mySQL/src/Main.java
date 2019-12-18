import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Students students = null;
        students.showStudents();
        Teachers teachers = null;
        teachers.createTable();
        Students student = new Students("12", "Popescu", "Ana", "1902703123456", "1990-03-27");
        Students.insertStudents(student);
    }
}
