package HackerEarth;
import java.util.*;

public class VCPairs {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                int n = sc.nextInt(); sc.nextLine();
                String s = sc.nextLine();
                char[] ch = s.toCharArray();

                if(n<2){
                    System.out.println("0");
                    break;
                }
                int count = 0;
                for(int i=0;i<ch.length-1;i++){
                    System.out.println("PassF"+i+":"+count);
                    if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'){
                        System.out.println("PassFI"+i+":"+count);
                        if(ch[i+1]=='a'||ch[i+1]=='e'||ch[i+1]=='i'||ch[i+1]=='o'||ch[i+1]=='u'){
                            count++;
                            System.out.println("PassFII"+i+":"+count);
                        }
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
/*Count consonants followed by immediate vowels*/