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
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String student){
        studentName = student;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }
    public void setGradeLevel(int grade){
        gradeLevel = grade;
    }
    public String getClassesName(){
        return classesName;
    }
    public void setClassesName(String classes){
        classesName = classes;
    }
    public String getFavTeacher(){
        return favTeacher;
    }
    public void setFavTeacher(String favorite){
        favTeacher = favorite;
    }
//     public String getBestClass(){
//         return 
//     }
//     public String calculateGPA(){
//         return
//     }
//     public String addCourse(){
//         return
//     }
//     public String removeCourse(){
//         return
//     }
//     public String toString(){
//         return
//     }
}
