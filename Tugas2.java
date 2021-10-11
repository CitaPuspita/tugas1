import java.util.Scanner;

public class Tugas2 {
    public void deretFaktorial(Scanner scanner){
        //deret faktorial
        System.out.print("Masukkan Bilangan Faktorial : ");
        int faktorial = scanner.nextInt();
        int hasilFaktorial = 1;
        if (faktorial <= 0) {
            System.out.println("Maaf,, Bilangan yang Anda Masukkan Kurang "
                    + "Tepat Silahkan Ulangi Kembali Memasukkan Data Anda antara 0 - 500..!!");
        }
       else if (faktorial >= 500)
       {
           System.out.println("Maaf,, Bilangan yang Anda Masukkan Kurang "
                   + "Tepat Silahkan Ulangi Kembali Memasukkan Data Anda antara 0 - 500..!!");
       }   
       else
        {
            for (int i = faktorial; i > 0; i--) {
            hasilFaktorial*=i;
            System.out.print(i);

            if (i != 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = "+hasilFaktorial);
        }
    }

    public void deretFibonacci(Scanner scanner){
        int limit, nilaiAwal, nilaiSekarang, nilaiAkhir;

        System.out.print("Masukan banyak bilangan yang mau ditampilkan : ");
        limit = scanner.nextInt();
        if ( limit <= 0) {
            System.out.println("Maaf,, Bilangan yang Anda Masukkan Kurang Tepat "
                    + "Silahkan Ulangi Kembali Memasukkan Data Anda antara 0 - 500..!!");
        }
       else if (limit >= 500)
       {
           System.out.println("Silahkan Ulangi Kembali Memasukkan Data Anda antara 0 - 500..!!"
                   + "Maaf,, Bilangan yang Anda Masukkan Kurang Tepat ");
       }   
       else
        {
        nilaiAwal = 1;
        nilaiSekarang = 1;
        
        for (int i = 1; i <= limit; i++) {
            System.out.print(" " + nilaiSekarang + " " );
            nilaiAkhir = nilaiAwal + nilaiSekarang;
            nilaiAwal = nilaiSekarang;
            nilaiSekarang = nilaiAkhir;

            if(nilaiAkhir<=0 && nilaiAkhir>=500){
                System.out.println("=====================================");
                System.out.println("Nilai Lebih dari 500\n");
            }
        }
    }
}
    public void deretGenap(Scanner scanner) {
        int bil,i;
        System.out.print("Masukan bilangan yang mau ditampilkan : ");
        bil = scanner.nextInt();
        for (i=0; i<bil; i++){
             if (i%2==0){
                 System.out.print(" " + i + " ");
             }
        }
    }
    
    public void deretGanjil(Scanner scanner) {
        int bil,i;
        System.out.print("Masukan bilangan yang mau ditampilkan : ");
        bil = scanner.nextInt();
        for (i=0; i<bil; i++){
             if (i%2!=0){
                 System.out.print(" " + i + " ");
             }
         }
    }
    }

class Main2{
    public static void main(String[] args) {
        Tugas2 tugas2 = new Tugas2();

        System.out.print("\n 1. Deret Faktorial\n 2. Deret Fibonacci\n 3. Bilangan Genap \n "
                + "4. Bilangan Ganjil \n Masukkan Pilihan Anda : ");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();

        switch (options){
            case 1:
                tugas2.deretFaktorial(scanner);
                break;
            case 2:
                tugas2.deretFibonacci(scanner);
                break;
            case 3:
                tugas2.deretGenap(scanner);
                break;
            case 4:
                tugas2.deretGanjil(scanner);
                break;
        }
    }
}
