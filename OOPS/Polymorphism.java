package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(5, 4);
        cal.sum(2, 4,5);
        cal.sum((float)1.4,(float)2.5);
        System.out.println(cal.sum(5,6)); //11

        Deer d = new Deer();
        d.eats();                     // eats grass
    }
}

class Animial{
    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eats(){
        System.err.println("eats grass");
    }
}

class Calculator{
    int sum (int a,int b){
        return a+b;
    }
    
    float sum (float a,float b){
        return a+b;
    }

    int sum (int a,int b,int c){
        return a+b+c;
    }
}