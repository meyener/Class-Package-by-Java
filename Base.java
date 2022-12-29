package student;

public class Base {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Nisa", "555", "Turkish");
        Teacher t2=new Teacher("hatice", "333", "BIO");
        Teacher t3=new Teacher("Selvi", "111", "REL");
        
        Course turkish=new Course("Turkish", "1", "Turkish");
        turkish.addTeacher(t1);
        Course bio=new Course("Biology", "2", "BIO");
        bio.addTeacher(t2);
        Course rel=new Course("Religion", "3", "REL");
        rel.addTeacher(t3);
    
        Student s1=new Student(turkish, bio, rel, "Ayse", "123", "1");
        s1.addNote(50, 45, 300);
        s1.printNote();
        s1.calcAverage();
        s1.isPass();
        Student s2=new Student(turkish, bio, rel, "Fatma", "234", "2");
        s2.addNote(45, 75, 85);
        s2.printNote();
        s2.calcAverage();
        s2.isPass();
        Student s3=new Student(turkish, bio, rel, "Nisalül", "345", "3");
        s3.addNote(35, 45, 55);
        s3.printNote();
        s3.calcAverage();
        s3.isPass();
        
        
        
        
       

        

    }
    }
    

