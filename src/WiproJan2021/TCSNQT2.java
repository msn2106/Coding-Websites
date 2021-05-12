package WiproJan2021;

import java.util.*;

public class TCSNQT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cities = {"Malaysia","Australia","Germany","Dubai","France"};
        int users = 5;
        int city = 5;
        int[][] rank = new int[users][city];
        int[] maxone = new int[city];
        int max = 0;
        for(int i=0;i<5;i++){
            int j=0;
            for (j = 0; j < 5; j++) {
                rank[i][j] = sc.nextInt();
                if(rank[i][j]<1 || rank[i][j]>5){
                    max = -1;
                    break;
                }
                if(rank[i][j]==1){
                    max = j;
                }
            }
            if(max == -1){
                break;
            }
            maxone[i]=max;
        }
        //checking for invalid input
        if(max == -1){
            System.out.println("INVALID INPUT");
            return;
        }
        System.out.println(Arrays.toString(maxone));
        //finding city with max 1 ratings
        int c = 0;
        for (int i = 0; i < city; i++) {
            if(maxone[i]>c){
                c=maxone[i];
            }
        }

        //printing city/ies with max 1 rating
        for (int i = 0; i < city; i++) {
            if(maxone[i] == c){
                System.out.println(cities[i]);
            }
        }
        sc.close();
    }
}
//still not working right