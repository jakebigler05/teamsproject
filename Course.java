import java.io.Serializable;

public class Course implements Serializable, Cloneable{
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
    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public void setSubjectName(String subject){
        subjectName = subject;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherName(String teacher){
        teacherName = teacher;
    }
    public int getGradeNum(){
        return gradeNum;
    }
    public void setGradeNum(int grade){
        gradeNum = grade;
    }
    public boolean getCurrentlyTaken(){
        return currentlyTaken;
    }
    public void setCurrentlyTaken(boolean current){
        currentlyTaken = current;
    }
    public String toString(){
        return subjectName + " by " + teacherName + " Grade: " + gradeNum;
    }
}

