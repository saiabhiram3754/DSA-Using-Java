package OOPS;

public class Copyconstructor {
    public static void main(String[] args) {
        student s1 = new student(); 
        s1.name = "abhiram";        
        s1.age = 20;
        s1.password ="abc";
        s1.marks[0] = 20;
        s1.marks[1] = 30;
        s1.marks[2] = 40;

        student s2 = new student(s1); 
        s2.age = 30;
        s1.marks[2] = 100;
        System.out.println(s2.age); 
        for (int j = 0; j < s2.marks.length; j++) {
            System.out.println(s2.marks[j]);
        }
        
    }
}

class student {
    int age;
    String name;
    int marks[];
    String password;

    student() {
        marks = new int[3]; 
    }
// shallow copy              output as 20,30,100
    // student(student s1) {
    //     marks = new int[3]; 
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    // deep copy             output as 20,30,40
    student (student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
