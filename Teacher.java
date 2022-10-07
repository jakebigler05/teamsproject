import java.io.Serializable;

public class Teacher implements Serializable {
    private String teacherName;
    private int yearsExperience;
  
    public Teacher(String name, int experience){
        this.teacherName = name;
        this.yearsExperience = experience;
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
}
