import java.util.Scanner;
public class ArrayRataNilai12{
    public static void main (String[] args){

        Scanner input =new Scanner(System.in);

        double rata2;
        int [] nilaiMhs =new int[10];
        int total =0;
        int lulus =0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ ": ");
            nilaiMhs[i] = input.nextInt();    
        }
        for (int i =0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70){
                lulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata - rata nilai = " +rata2);
        System.out.println("Jumlah mahasiwa yang lulus adalah " + lulus);
    }
}