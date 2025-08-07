package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        // shark.eat();
        // shark.breath();
        shark.eat();
        // shark.gills = "5";
        // shark.Name = "shark";
    }
}

class Animial {
    String Name;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

class fish extends Animial{
    String gills;

    void eat(){
        System.out.println("gills");
    }
}
