import java.io.Serializable;

public class Teacher implements Serializable {
    private String teacherName;
    private int yearsExperience;
    private String classesTeaching;

    public Teacher(String name, int experience, String classes){
        this.teacherName = name;
        this.yearsExperience = experience;
        this.classesTeaching = classes;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherName(String name){
        teacherName = name;
    }
    public int getYearsExperience(){
        return yearsExperience;
    }
    public void setYearsExperience(int experience){
        yearsExperience = experience;
    }
    public String getClassesTeaching(){
        return classesTeaching;
    }
    public void setClassesTeaching(String classes){
        classesTeaching = classes;
    }
    // public String addCourse(){
    //     return
    // }
    // public String removeCourse(){
    //     return
    // }
    // public String toString(){
    //     return
    // }
}
