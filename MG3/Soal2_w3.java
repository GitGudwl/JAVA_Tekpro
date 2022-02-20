import java.util.*;
import java.io.*;
/**
 *
 * @author Zahri
 * Program ini bertujuan untuk melakukan print dengan kriteria tertentu menggunakan fungsi printf
 */

public class Soal2_w3 {
        public static void main(String[] args) {
            //kamus data
            Scanner sc = new Scanner(System.in);
            String[] s1 =new String[3]; 
            int[] x = new int[3];
            //algoritma
            for(int loop=0;loop<3;loop++){
                s1[loop]=sc.next();
                x[loop]=sc.nextInt();
            }
            sc.close();;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                System.out.printf("%-15s%03d%n",s1[i],x[i]);
            }
            System.out.println("================================");
        }
}
            
