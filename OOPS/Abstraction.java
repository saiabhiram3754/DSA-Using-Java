package OOPS;


public class Abstraction {
    public static void main(String[] args) {
        // horse h = new horse();
        // h.eats();
        // h.walk();
        // System.out.println(h.color);

        // hen H = new hen();
        // H.eats();
        // H.walk();

        // mustang myhorse = new mustang();   
        // output is first animal constructor and horse constructor 
        // and mustang constructor is called

        Queen q =new Queen();
        q.moves();

        bear b =new bear();
        b.eats();
        b.meat();

    }
}


interface Herbiviours {
    void eats();
}

interface carniviours {
    void meat();
}

class bear implements Herbiviours,carniviours{
    public void eats(){
        System.out.println("eats grass");
    }
    public void meat(){
        System.out.println("eats meat");
    }
}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("moves in all directions");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("moves in right,left,top,bottom");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("moves in all direction by in step");
    }
}


abstract class Animal{
    String color;

    Animal(){
        color = " brown";
        System.out.println("Animial constructor is called");
    }
    void eats(){
        System.out.println("eats");
    }
    abstract void walk();
}

class horse extends Animal{
    horse(){
        System.out.println("horse constructor is called");
    }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("wlaks with 4 legs");
    }
}

class mustang extends horse {
    mustang(){
        System.out.println("mustang constructor is called");
    }
}

class hen extends Animal{
    hen(){
        System.out.println("hen constructor is called");
    }
    void changecolor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks with 2 legs");
    }
}