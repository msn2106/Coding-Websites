package Codechef;

import java.util.Scanner;

public class COLGLF43LA{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long items = sc.nextInt();
            long eggs = sc.nextInt();
            long chocolates = sc.nextInt();
            long omeletteCost = sc.nextInt();
            long milkshakeCost = sc.nextInt();
            long cakeCost = sc.nextInt();

            long leastPrice = Integer.MAX_VALUE;
            for(int cakes = 0; cakes<items;cakes++){
                if(eggs < cakes || chocolates < cakes){
                    break;
                }
                long omelettes = (eggs-cakes)/2;
                long milkshakes = (chocolates-cakes)/2;

                if(cakes + omelettes + milkshakes < items){
                    continue;
                }

                long omeletteReq, milkshakeReq;
                if(omeletteCost < milkshakeCost){
                    omeletteReq = Math.min(omelettes,items-cakes);
                    milkshakeReq = items - cakes - omeletteReq;
                }
                else{
                    milkshakeReq = Math.min(milkshakes, items-cakes);
                    omeletteReq = items - cakes - milkshakeReq;
                }

                long price = cakes * cakeCost + omeletteReq * omeletteCost + milkshakeReq * milkshakeCost;

                leastPrice = Math.min(leastPrice,price);
            }

            if(leastPrice == Integer.MAX_VALUE){
                leastPrice = -1;
            }

            System.out.println(leastPrice);
        }
        sc.close();
    }
}
/*
3
5 4 4 2 2 2
4 5 5 1 2 3
4 5 5 3 2 1
*/