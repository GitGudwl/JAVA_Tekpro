import java.math.*;
import java.util.*;

/**
 *
 * @author Zahri
 * Program ini bertujuan untuk melakukan penggabungan 4 buah variabel integer, dengan tujuan untuk melakukan pengolahan guna menentukan system buka tutup jalan.
 */

public class Soal5_w3 {

    static long gabung(int a, int b,int c, int d)
    {
        /**
* metoda ini berguna untuk menggabungkan 4 buah integer
* @param a adalah parameter pertama.
* @param b adalah parameter kedua.
* @param c adalah parameter ketiga.
* @param d adalah parameter keempat.
* @return long untuk mengembalikan nilai berupa long.
*/
 
        // convert integer ke string
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = Integer.toString(c);
        String s4 = Integer.toString(d);
 
        // menggabungkan kedua string
        String s = s1 + s2 +s3 + s4;
 
        // Convert gabungan string ke long
        long gabung = Long.parseLong(s);
 
        // mengembalikan nilai long hasil penggabungan
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
