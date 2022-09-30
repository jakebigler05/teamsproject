import java.io.Serializable;

public class Course implements Serializable{
    private String subjectName;
    private String teacherName;
    private int gradeNum;
    private boolean currentlyTaken;

    public Course(String subject, String teacher, int grade){
        this.subjectName = subject;
        this.teacherName = teacher;
        this.gradeNum = grade;
    }
    public Course(String subject, String teacher, int grade, boolean current){
        this.subjectName = subject;
        this.teacherName = teacher;
        this.gradeNum = grade;
        this.currentlyTaken = current;
    }
}

