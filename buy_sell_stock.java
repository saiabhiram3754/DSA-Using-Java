public class buy_sell_stock {
    public static int buy_sell(int prices[]) {

        int buying_price = Integer.MAX_VALUE;
        int max_profit = 0; 

        for (int i = 0; i < prices.length; i++) {
            if(buying_price < prices[i]){
                int profit = prices[i] - buying_price;
                max_profit = Math.max(max_profit, profit);
            }
            else{
                buying_price = prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buy_sell(prices));
    }
}
