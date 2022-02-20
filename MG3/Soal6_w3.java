import java.math.*;
import java.util.*;

/**
 *
 * @author Zahri
 * Program ini bertujuan untuk melakukan operasi pertambahan dan pengurangan pada 'huge number' yang di inputkan melalui string
 */

public class Soal6_w3 {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String s1,s2;
        s1=input.nextLine();
        s2=input.nextLine();
        input.close();
        System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
        System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
}
