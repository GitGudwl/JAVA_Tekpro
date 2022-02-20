import java.util.Scanner;

/**
 *
 * @author Zahri
 * Program ini bertujuan untuk melakukan perhitungan gaji pegawai dengan kriteria tertentu sebagaimana dalam soal.
 */

public class Soal4_w3 {

    public static void main(String[] args) {
        //kamus data
        Scanner sc=new Scanner(System.in);
        int barang = sc.nextInt();
        sc.close();
             if (barang >=80){
                 System.out.println(500000+(barang*50000*35/100));
             }
             else if (barang>=40 && barang <80){
                System.out.println(500000+(barang*50000*25/100));
             }
             else if (barang >= 15 && barang <40){
                System.out.println(500000+(barang*50000*10/100));
             }
             else {
                System.out.println(500000-(50000*15/100));
             }
        }
 }
 

        


