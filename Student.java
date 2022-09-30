import java.io.Serializable;

public class Student implements Serializable {
    private String studentName;
    private int gradeLevel;
    private String classesName;
    private String favTeacher;

    public Student(String student, int grade, String classes, String favorite){
        this.studentName = student;
        this.gradeLevel = grade;
        this.classesName = classes;
        this.favTeacher = favorite;
    }
}
