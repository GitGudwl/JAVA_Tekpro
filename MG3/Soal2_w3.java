import java.util.*;
import java.io.*;
/**
 *
 * @author Zahri
 * Program ini bertujuan untuk meningkatkan kemampuan dalam menggunakan syntax printf
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
            
// Lesson Learn //

/* Lesson learn yang saya dapatkan dalam mengerjakan soal ini adalah
 * saya jadi tau bagaimana cara menggunakan input dalam bahasa java, serta pengolahan array juga
 * pemahaman akan penggunaan syntax printf juga ditingkatkan dalam program ini, dimana saya bisa lebih mengetahui fungsi dari printf di bahasa java
 */