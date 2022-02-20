import java.util.Scanner;

/**
 *
 * @author Zahri
 * Program ini bertujuan untuk melakukan operasi matematika dua integer yang dipisah oleh space
 */
public class soal3_w3 {

    public static void main(String[] args) {
        // kamus data //
        Scanner sc = new Scanner(System.in);
        int angka1,angka2; // data angka bertipe integer
        char operator; // opetator operasi
        
        // algoritma //
        angka1 = keyboard.nextInt();
        operator = keyboard.next().charAt(0); // input operator
        angka2 = keyboard.nextInt();
        if ((angka1>=1 && angka1<=1000) && (angka2>=1 && angka2<=1000)){
            switch (operator){
                case '+' : System.out.println(angka1+angka2);break;
                case '-' : System.out.println(angka1-angka2);break;
                case '*' : System.out.println(angka1*angka2);break;
                case '/' : System.out.println(angka1/angka2);break;
                case '%' : System.out.println(angka1%angka2);break;
            }   
        }
    }
    
}

