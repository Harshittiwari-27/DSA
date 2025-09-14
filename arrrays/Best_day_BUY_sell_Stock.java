package dsa.arrrays;

public class Best_day_BUY_sell_Stock {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int mini=price[0];
        int maxProfit=0;
        for(int i=0;i<price.length;i++)
        {
            int cost=price[i]-mini;
            maxProfit=Math.max(maxProfit, cost);
            mini=Math.min(mini, price[i]);

        }
        System.out.println(maxProfit);

    }
    
}
