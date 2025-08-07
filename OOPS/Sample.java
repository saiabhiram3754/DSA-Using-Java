package OOPS;

// public class Sample {
//     public static void main(String args[]){
//         pen p1 = new pen();

//         p1.setcolor("blue");
//         p1.setage(5);
//         System.out.println(p1.color);
//         Bank myacc = new Bank();
//         myacc.username ="abhiram";
//         myacc.password = "abc";  // Private
//         myacc.setpassword("abc");

//     }
// }

// class Bank{
//     public String username;
//     private String password;
//     public void setpassword(String pwd){
//         password = pwd;
//     }
// }
// class pen {
//     int tip;
//     String color;

//     String setcolor(String newcolor){
//         color = newcolor;
//         return color;
//     }
//     int setage( int newage){
//         tip = newage;
//         return tip;
//     }
// }


public class Sample {
    private String name;
    private int age;

    public Sample(String name, int age) {          //constructor
        this.name = name;
        this.age = age;
    }

    public Sample setName(String name) {
        this.name = name;
        return this;
    }

    public Sample setAge(int age) {
        this.age = age;
        return this;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void showCurrentObject() {                   
        System.out.println("Current object: " + this);
    }

    public static void main(String[] args) {
        Sample s = new Sample("Abhiram", 20);
        s.display();
        s.setName("Raja").setAge(21).display();
        s.showCurrentObject();
    }
}
