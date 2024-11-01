import java.util.Scanner;
public class Tugas1{
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);

        double rata2;
        double total =0;
        int BnykNilai;
        int nilaiTertinggi = 0, nilaiTerendah = 100;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        BnykNilai = input.nextInt();

        int nilai [] = new int[BnykNilai];
        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i +1) + ": ");
            nilai[i] = input.nextInt();

            if (nilai[i] > nilaiTertinggi){
            nilaiTertinggi = nilai[i];
            } 
            else if (nilai[i] < nilaiTerendah){
                nilaiTerendah = nilai[i];
            }    
        } 
        for (int i = 0; i < nilai.length; i++){
                total += nilai[i];
            }

        rata2 = total / BnykNilai;
        System.out.println("Rata rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);


    }
}    