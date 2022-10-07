import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("students");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }


        //############## MAIN MENU STARTS HERE ##############
        System.out.println("Welcome to TEAMS: Type the number corresponding to what you require");
        int choice = 0;
        while(choice > -1){
            System.out.println("1: Add Student:");
            System.out.println("2: Add Teacher:");
            System.out.println("3: Add Course:");
            System.out.println("4: Edit Student:");
            System.out.println("5: List Courses:");
            System.out.println("6: List Students:");
            System.out.println("7: Search for Student:");
            System.out.println("8: Exit:");
            System.out.println();

            System.out.println("Choice:");
            choice = sc.nextInt();
            sc.nextLine();
            while(choice == 1){
                System.out.println("Type in name:");
                String studentName = sc.nextLine();
                System.out.println("Type in grade leve:");  
                int gradeLevel = sc.nextInt();
                Student s = new Student(studentName, gradeLevel);
                students.add(s);
            
                choice = 0;
            }
            while(choice == 2){
                System.out.println("Type in name:");
                String teacherName = sc.nextLine();
                System.out.println("Type in years of experience: ");
                int yearsExperience = sc.nextInt();
                Teacher t = new Teacher(teacherName, yearsExperience);
                teachers.add(t);
                choice = 0;
            }
            while(choice == 3){
                System.out.println("Type in course name: ");
                String subjectName = sc.nextLine();
                System.out.println("Type in the name of the teacher that teaches the course: ");
                String teacherName = sc.nextLine();
                System.out.println("Type in the grade which this course is taken: ");
                int gradeNum = sc.nextInt();
                Course c = new Course(subjectName, teacherName, gradeNum);
                courses.add(c);
                choice = 0;
            }
            while(choice == 4){
                    System.out.println("EDIT STUDENT");
                    choice = 0;
                }
            while(choice == 5){
                    System.out.println(courses);
                    choice = 0;
                }
            while(choice == 6){
                    System.out.println(students);
                    choice = 0;
                }
            while(choice == 7){
                    System.out.println("Type in a students name:");
                    String studentSearch = sc.nextLine();
                    for(int i =0 ; i< students.size(); i++){
                        if(students.get(i).getStudentName().equals(studentSearch))
                        System.out.println(students.get(i));
                    }

                    choice = 0;
                }
            while(choice==8){
                System.out.println("YOU HAVE EXITED PROGRAM");
                if( choice ==8){
                try{
                saveData();
                }catch(Exception e){}
                choice = -1;
            }
        }
    }
        }




    //#### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData()throws Exception{
        FileOutputStream f1 = new FileOutputStream("students");
        ObjectOutputStream os = new ObjectOutputStream(f1);
        os.writeObject(students);
        os.close();
        f1.close();

        FileOutputStream f2 = new FileOutputStream("courses");
        os = new ObjectOutputStream(f2);
        os.writeObject(courses);
        os.close();
        f2.close();

        FileOutputStream f3 = new FileOutputStream("teachers");
        os = new ObjectOutputStream(f3);
        os.writeObject(teachers);
        os.close();
        f3.close();
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception{
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);   
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }
}