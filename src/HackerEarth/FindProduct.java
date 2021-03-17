package basicIO;

import java.util.Scanner;
class FindProduct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        double prod=1.0,mod=Math.pow(10,9)+7;
        for(int i=0;i<size;i++){
            prod = (prod*arr[i])%mod;
        }
        System.out.println(Math.round(prod));
        sc.close();
    }
}
