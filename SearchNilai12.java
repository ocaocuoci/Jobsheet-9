import java.util.Scanner;
public class SearchNilai12{
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);


        int key = 0;
        int hasil =-1;
        int nilai;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        nilai = input.nextInt();

        int ArrayNilai []= new int [nilai];

        for (int i = 0; i < ArrayNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i + 1)+": ");
            ArrayNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = input.nextInt();
        
        for (int i =0; i < ArrayNilai.length; i++){
             if (key == ArrayNilai[i]){
                hasil = (i+1);
                break;
            } 
        }
          
        System.out.println();
        System.out.println("Nilai " +key + " Berada di indeks ke-" +hasil);
        System.out.println();

    }
}