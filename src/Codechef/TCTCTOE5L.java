package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TCTCTOE5L {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String[] r1 = br.readLine().trim().split("");
            String[] r2 = br.readLine().trim().split("");
            String[] r3 = br.readLine().trim().split("");

//            for(String s:r1) System.out.print(s+" ");
//            System.out.println();
//            for(String s:r2) System.out.print(s+" ");
//            System.out.println();
//            for(String s:r3) System.out.print(s+" ");
//            System.out.println();

            if((checkDraw(r1,r2,r3) || checkWin(r1,r2,r3)) && !unreachable(r1,r2,r3)){
                System.out.println(1);
            }
            else if((!unreachable(r1,r2,r3)) ){ //&& (!checkDraw(r1,r2,r3))
                System.out.println(2);
            }
            else System.out.println(3);
        }
        br.close();
    }

    //function to check draw condition
    static boolean checkDraw(String[] r1, String[] r2, String[] r3){
        int underScore = 0;
        for(int i=0;i<3;i++){
            if(checkWin(r1,r2,r3)){
                underScore++;
                break;
            }
            if(r1[i].equals("_"))underScore++;
            if(r2[i].equals("_"))underScore++;
            if(r3[i].equals("_"))underScore++;
        }
        //System.out.println(underScore);
        return ((underScore>0) && (underScore!=9))?false:true;
    }

    //function to check win condition
    static boolean checkWin(String[] r1, String[] r2 , String[] r3){
        if(r1[0].equals(r2[1]) && r2[1].equals(r3[2]) && !r1[0].equals("_"))return true; //main diagonal
        if(r1[2].equals(r2[1]) && r2[1].equals(r3[0]) && !r3[0].equals("_"))return true; //alternate diagonal
        //columns wise horizontal check left to right
        for (int i = 0; i < 3; i++) {
            if(r1[i].equals(r2[i]) && r2[i].equals(r3[i]) && !r1[i].equals("_"))return true;
        }
        //vertical row check
        String first = r1[0];
        String second = r2[0];
        String third = r3[0];
        int check1 = 0,check2 = 0, check3 = 0;
        for(int i=1;i<3;i++){
            if(!first.equals(r1[i])){
                check1++;
            }
            if(!second.equals(r2[i])){
                check2++;
            }
            if(!third.equals(r3[i])){
                check3++;
            }
        }
        if(check1 == 0 || check2 == 0 || check3 == 0){
            if(!first.equals("_") && !second.equals("_") && !third.equals("_"))
            return true;
        }
        return false;
    }

    //function to check unreachable state
    static boolean unreachable(String[] r1, String[] r2, String[] r3){
        StringBuilder row1 = new StringBuilder();
        StringBuilder row2 = new StringBuilder();
        StringBuilder row3 = new StringBuilder();
        StringBuilder col1 = new StringBuilder();
        StringBuilder col2 = new StringBuilder();
        StringBuilder col3 = new StringBuilder();

        int xcount = 0, ocount = 0, underScoreR1 = 0, underScoreR2 = 0, underScoreR3 = 0, underScore = 0;
        for (int i = 0; i < 3; i++) {
            row1.append(r1[i]);
            row2.append(r2[i]);
            row3.append(r3[i]);
            if(r1[i].equals("X")) xcount++; if(r2[i].equals("X"))xcount++; if(r3[i].equals("X"))xcount++;
            if(r1[i].equals("O")) ocount++; if(r2[i].equals("O"))ocount++; if(r3[i].equals("O"))ocount++;
            if(r1[i].equals("_")) {
                underScore++;
                underScoreR1++;
            }
            if(r2[i].equals("_")){
                underScore++;
                underScoreR2++;
            }
            if(r3[i].equals("_")){
                underScore++;
                underScoreR3++;
            }
        }
        col1.append(r1[0]); col1.append(r2[0]); col1.append(r3[0]);
        col2.append(r1[1]); col2.append(r2[1]); col2.append(r3[1]);
        col3.append(r1[1]); col3.append(r2[1]); col3.append(r3[2]);
        int underScoreC1 = 0, underScoreC2 = 0, underScoreC3 = 0;
        for (int i = 0; i < 3; i++) {

        }
        return false;
    }
}

/*
Test Case:
3
XOX
XXO
O_O
XXX
OOO
___
XOX
OX_
XO_
 */

/*
Output:
2
3
1
 */
/*tc 2:
3
XXO
OXO
OXX
OXX
XOO
XXO
XXX
OOX
OOX
 */
/* op 2:
1
1
1
 */
