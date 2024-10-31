import java.util.Scanner;
public class ArrayRataNilai12{
    public static void main (String[] args){

        Scanner input =new Scanner(System.in);

        double rata2Lulus, rata2TdkLulus, jmlLulus =0, jmlTdkLulus = 0;
       
        int total =0;
        int lulus =0;
        int tidakLulus = 0;;
        int jmlMhs;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = input.nextInt();
        
         int [] nilaiMhs =new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ ": ");
            nilaiMhs[i] = input.nextInt();    
        }
        for (int i =0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                jmlLulus += nilaiMhs[i];
                lulus++;
            } else {
                jmlTdkLulus += nilaiMhs[i];
                tidakLulus++;
            }
        } 
        rata2Lulus = (lulus > 0) ? jmlLulus / lulus : 0;
        rata2TdkLulus = (tidakLulus > 0) ? jmlTdkLulus / tidakLulus :0;
        System.out.println("Rata - rata nilai lulus= " +rata2Lulus);
        System.out.println("Rata - rata nilai tidak lulus= " +rata2TdkLulus);
    }
}