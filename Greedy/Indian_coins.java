import java.util.*;
public class Indian_coins{
    public static void main(String[] args){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countcoins = 0;
        int Amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<coins.length; i++){
            if(coins[i] <= Amount){
                while(coins[i] <= Amount){
                    countcoins++;
                    ans.add(coins[i]);
                    Amount = Amount - coins[i];
                }
            }
        }

        System.out.println("total coins (min) required are: " + countcoins);

        for(int i =0 ; i< ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }

    }
}