import java.util.Scanner;
public class Tugas3{
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);

        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Capuccino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan/minuman yang dicari: ");
        String namaPesanan = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++){
            if (namaPesanan.equalsIgnoreCase(menu[i])){
                ditemukan = true;
                break;
            }  
            
        }
        if (ditemukan){
                System.out.println("Pesanan " + namaPesanan+ " tersedia!");
            } else {
                System.out.println("Pesanan " + namaPesanan + " tidak ditemukan dimenu!");
        }

    }
}