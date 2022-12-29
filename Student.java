package student;

public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(Course course1,Course course2,Course course3,String name,String studentNo,String classes){
        this.studentNo=studentNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.name=name;
    }

    void addNote(int note1,int note2,int note3){
        if (note1>=0 && note1<=100) {
            this.course1.note=note1;
        }
        if (note2>=0 && note2<=100) {
            this.course2.note=note2;
        }
        if (note3>=0 && note3<=100) {
            this.course3.note=note3;
        }
    }
    
    void printNote(){
        System.out.println(this.course1.prefix+" notunuz : "+ this.course1.note);
        System.out.println(this.course2.prefix+" notunuz : "+ this.course2.note);
        System.out.println(this.course3.prefix+" notunuz : "+ this.course3.note);
    }
    double calcAverage(){
        average=(this.course1.note+this.course2.note+this.course3.note)/3;
        System.out.println(average);
        return average;
    }
    void isPass(){
        if (average>=50) {
            System.out.println("Dersi gecti!!!");
        } else {
            System.out.println("malesef kaldi");
        }
        
    }

}
