import java.util.*;

public class RestaurantMain {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();

        System.out.println("Pilih makanan yang akan dikurangi stoknya :");
        for(int i=0;i<4;i++ ){
            menu.tampilmakanan(i);
        }
        int x= sc.nextInt()-1;
        System.out.println("Seberapa banyak menu tersebut akan dikurangi");
        int y =sc.nextInt();
        sc.close();
        System.out.println("\nSetelah dikurangi ");
        menu.kurangStock(x,y);
        menu.tampilSalahsatu(x);
    }
}
