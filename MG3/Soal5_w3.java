import java.math.*;
import java.util.*;

public class Soal5_w3 {

    static long gabung(int a, int b,int c, int d)
    {
 
        // convert integer ke string
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = Integer.toString(c);
        String s4 = Integer.toString(d);
 
        // menggabungkan kedua string
        String s = s1 + s2 +s3 + s4;
 
        // Convert gabungan string ke long
        long gabung = Long.parseLong(s);
 
        // return the formed integer
        return gabung;
    }

    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int plat1= sc.nextInt();
       int plat2=sc.nextInt();
       int plat3=sc.nextInt();
       int plat4=sc.nextInt();
       sc.close();
       long gabungan=gabung(plat1, plat2, plat3, plat4);
       if((gabungan-999999)%5 ==0){
           System.out.println("berhenti");
       }
       else{
           System.out.println("jalan");
       }
    }
}

// sample input terbalik.