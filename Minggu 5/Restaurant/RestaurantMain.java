public class RestaurantMain {
    
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        menu.kurangStock(0, 5);
        menu.kurangStock(1, 5);
        menu.kurangStock(3, 5);
        System.out.println("\nMengurangi Stock......");
        System.out.println();
        menu.tampilMenuMakanan();
    }
}
