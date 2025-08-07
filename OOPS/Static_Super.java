package OOPS;

public class Static_Super {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "jvc";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Horse h = new Horse();

    }
}

class Animal{
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        
        System.out.println("Horse constructor is called");
    }
}

class Student {
    String Name;
    int Rollno;

    static int Percentage(int math,int Chem,int Phy){
        return (math+Chem+Phy) /3;
    }
    static String schoolName;

    void setname(String name){
        this.Name = name;
    }

    String getname(){
        return this.Name;
    }
}


// Constructor Chaining without super keyword

// class Laptop {
//     String brand;
//     int price;

//     Laptop() {
//         this("Lenovo", 50000); // Calls parameterized constructor
//         System.out.println("Default constructor called");
//     }

//     Laptop(String brand, int price) {
//         this.brand = brand;
//         this.price = price;
//         System.out.println("Parameterized constructor called");
//     }

//     void display() {
//         System.out.println("Brand: " + brand + ", Price: " + price);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Laptop l = new Laptop();
//         l.display();
//     }
// }
