package Testing;
import java.io.*;
import java.util.Random;

// A Java Program to generate test cases for random number

public class RandomNumber
{

    // the number of runs
    // for the test data generated
    static int requiredNumbers = 5;

    // miminum range of random numbers
    static int lowerBound = 0;

    // maximum range of random numbers
    static int upperBound = 1000;

    // Driver Code
    public static void main (String[] args) throws IOException
    {
        Random random = new Random();

        for(int i = 0; i < requiredNumbers; i++)
        {
            int a = random.nextInt(upperBound - lowerBound) +
                    lowerBound;
            System.out.println(a);
        }
    }

    public static int[] random(int requiredNumbers,int lowerBound, int upperBound){
        int[] arr = new int[requiredNumbers];
        Random random = new Random();
        for(int i=0;i<requiredNumbers;i++){
            arr[i] = random.nextInt(upperBound-lowerBound)+lowerBound;
        }
        return arr;
    }
}

// This code is contributed by Madfrost -GFG
