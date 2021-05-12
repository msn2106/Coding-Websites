package WiproJan2021;

import java.util.*;

public class TCSNQT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Float> map = new HashMap<>();
        map.put(1,50.0f);
        map.put(2,140.0f);
        map.put(3,70.0f);
        map.put(4,60.0f);
        map.put(5,120.0f);
        map.put(0,100.0f);
        map.put(6,20.0f);
        map.put(7,30.0f);
        map.put(8,200.0f);
        map.put(9,25.0f);


        System.out.println("**MENU**"+"\n"+"ITEM NUMBER = AMOUNT OF ITEM"+"\n"+"PLEASE ENTER ITEM NUMBER FOLLOWED BY QTY");
        System.out.println("FOR SELECTING MULTIPLE ITEM PRESS 'Y' and FOR EXITING PRESS 'N'");
        System.out.println(map.toString());
        float price = 0.0f;
        int item;
        while(true){
            System.out.println("Enter item:");
            item = sc.nextInt();
            System.out.println("Enter qty:");
            int qty = sc.nextInt();
            if(item <0 || item > 9 || qty <0){
                item = -1;
                break;
            }
            price = price + itemamt(map,item,qty);
            System.out.println("Do you wish to continue:");
            char ch = sc.next().charAt(0);
            if(ch != 'Y' && ch != 'N'){
                item = -2;
                break;
            }
            if(ch == 'N') break;
        }

        //checking range of input
        if(item == -1){
            System.out.println("INVALID ITEM NUMBER OR QTY");
            return;
        }
        if(item == -2){
            System.out.println("INVALID CHOICE");
            return;
        }

        System.out.println(price);
        sc.close();
    }

    //function to calculate total amount of an item
    static float itemamt(Map<Integer,Float> map, int item, int qty){
        return  map.get(item)*qty;
    }
}
//working fine. Was easy but, left in exam.