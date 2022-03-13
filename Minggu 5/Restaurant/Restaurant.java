public class Restaurant {
    private makanan[] foods;

    private static byte id=0;



    public Restaurant() {
        foods = new makanan[10];
        for(int i=0; i<10; i++){
            foods[i]=new makanan("kosong", 0.0,0);
        }
    }
    
public void tambahMenuMakanan(String nama, double harga, int Stock) {
    foods[id].setNama_makanan(nama);
    foods[id].setHarga_makanan(harga);
    foods[id].setStock(Stock);
}

public void tampilMenuMakanan(){
    for(int i =0; i<=id;i++){
        if(!isOutOfStock(i)){
            System.out.println(foods[i].getNama_makanan()+"("+foods[i].getStock()+")"+"\tRp."+foods[i].getHarga_makanan());
        }
    }
}
      
public boolean isOutOfStock(int id){
    if(foods[id].getStock()==0){
        return true;
    }else{
        return false;
    }
}

public void kurangStock(int id, int pengurangan){ //method untuk mengurangi Stock saat ada pemesanan
    foods[id].setStock(foods[id].getStock() - pengurangan);
}


public static void nextId(){
    id++;
}

}