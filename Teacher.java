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
}
