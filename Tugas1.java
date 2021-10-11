package tugas.pkg1; 
//import package scanner untuk inputan
import java.util.Scanner;

public class Tugas1 {
     public static void main(String[] args){
        //untuk memasukkan input scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyak Layer: ");
        int tinggi = input.nextInt(); //Mendapatkan Input
       
        //Menghitung Jumlah Tinggi Piramida
        for(int t=1; t<=tinggi; t++){
            //Menghitung Jumlah Spasi per Baris
            for(int s=t; s<=tinggi; s++){
                System.out.print(" ");
            }
            //Menghitung Jumlah Bintang per Baris
            for(int b=0; b<=(t*2)-2; b++){
                System.out.print("*");
            }
            
              System.out.println(); //Membuat Baris Baru
        }
    }
}