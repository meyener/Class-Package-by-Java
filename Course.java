package student;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;

    Course(String name, String code, String prefix){
        
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        double note=0;

    }
    void addTeacher(Teacher teacher){
        if (prefix.equals(teacher.branch)) 
        {
            this.teacher=teacher;
        }
        else{
            System.out.println("Brans eslesmedi !!! ");
        }
    }
    void printTeacher(){this.teacher.print();}
}
        
