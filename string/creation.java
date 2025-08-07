// package string;
import java.util.*;

public class creation {
    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {

//     char arr[] = {'a','b','c','d'};
//     String str = "abc";
//     String str2 = new String("xyz");

   // strings are immutable;

   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();
   System.out.println(name);
   System.out.println(name.length());

   String first = "Sai";
   String last = "Abhiram";
   String fullname = first + " " + last ;
   System.out.println(fullname);
//    System.out.println(first.charAt(1));
    printletter(fullname);

    String s1 = "tony";
    String s2 = "tony";
    String s3 = new String("tony");

    if(s1 == s2){                   // points same object because same value stored 
        System.out.println(" sre equal");
    }
    else {
        System.out.println(" sre not equal");
    }

    if (s1 == s3){     // new memory is created for s3 
        System.out.println(" sre equal");
    }
    else{
        System.out.println(" sre not equal");
    }

    if (s1.equals(s3)){                             // special function 
        System.out.println(" sre equal");         // to check the equal or not
    }
    else{
        System.out.println(" sre not equal");
    }
    sc.close();
}
}
