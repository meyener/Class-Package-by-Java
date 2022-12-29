package student;

public class Teacher {
    String name;
    String mbno;
    String branch;

    Teacher(String name, String mbno,String branch){
        this.name=name;
        this.mbno=mbno;
        this.branch=branch;

    }

    void print(){
        System.out.println("Name of teacher : "+name);
        
        System.out.println("Phone number of teacher : "+mbno);
        
        System.out.println("Branch of teacher : "+branch);
    }
    
}
