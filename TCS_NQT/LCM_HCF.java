import java.util.*;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();   //  big number 
        int n2 = sc.nextInt();  // small nummber

        if(n2 > n1){
            int temp = n1; 
            n1 = n2;
            n2 = temp;
        }

        // LCM loop
        for (int i = n1; i <= n1 * n2; i = i + n1) {
            if (i % n2 == 0 && i % n1 == 0) {
                System.out.println("LCM : " + i);
                break;
            }
        }

        //HCF loop
        for(int i = n2; i >= 1; i = i--) {
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println("HCF : " + i);
                break;
            }
        }

        sc.close();
    }
}