package Codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BOLT4L
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        float fastestTime = 9.58f;
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                float k1 = sc.nextFloat();
                float k2 = sc.nextFloat();
                float k3 = sc.nextFloat();
                float v = sc.nextFloat();
                float chefSpeed = k1*k2*k3*v;
                float chefTime = 100/chefSpeed;
                double roundedChefTime = Math.round(chefTime*100.0)/100.0;
                float finalTime = (float)roundedChefTime;
                //System.out.println(chefSpeed+","+chefTime+","+roundedChefTime+","+finalTime);
                if(finalTime < fastestTime)System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}
//Learned how to round of float to 2 decimal places.