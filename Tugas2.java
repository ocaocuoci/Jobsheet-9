import java.util.Scanner;
public class Tugas2{
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);
        
        int jmlPesanan;
        int total = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = input.nextInt();
        input.nextLine();

        String [] namaPesanan = new String [jmlPesanan];
        int  [] hargaPesanan = new int [jmlPesanan];
         
        for (int i = 0; i < jmlPesanan; i++){
            System.out.print("Masukkan pesanan (makanan/minuman) ke-" + (i + 1) + ": ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga pesanan (makanan/minuman): ");
            hargaPesanan[i] = input.nextInt();
            input.nextLine();
        } 
        for (int harga : hargaPesanan){
            total += harga;
        }
        System.out.println();
        System.out.println("Daftar makanan/minuman yang dipesan");
        for (int i= 0; i < jmlPesanan; i++){
            System.out.println("-" + namaPesanan[i] + ": Rp " + hargaPesanan[i]);
        }
        System.out.println();
        System.out.println("Total biaya yang harus dibayarkan: " +total);

        

    }
}   