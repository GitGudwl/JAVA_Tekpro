import java.util.*;


/**
 *
 * @author Zahri
 * Program ini bertujuan untuk menghitung sejumlah string, yang dipisahkan melalui beberapa character, kemudian menampilkannya lagi di layar.
 */

public class Soal1_w3{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
        } else{
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}
