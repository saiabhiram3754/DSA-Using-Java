// Using Java collection frame work

import java.util.*;

public class Using_JCF{
    public static void main(String[] args){

        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        // Queue is an interface not a class so we didn't objects
        // so we can use the LinkedList or ArrayDeque class as to a objects

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}