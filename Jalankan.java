package kasir;
import java.util.Scanner;


public class Jalankan {
    public static void main(String[] args) {
        String Namakas;
         Scanner ren = new Scanner (System.in);

         System.out.println("======-----SCRIPT PROGRAM by:-----======");
            System.out.print
(" __  __        ____                _  _\n" +
"|  \\/  |_ _   |  _  \\ __ _ _     _| |(_)\n" +
"| |\\/| | '_|  | |_) / _ \\ '_ \\ / _` || |\n" +
"| |  | | |    |  _ <  _ / | | | (_| || |\n" +
"|_|  |_|_| () |_| \\_\\_ _|_| |_|\\____||_|\n");
        System.out.println("=======----==-----======-----==----======\n"); 
        System.out.println("-----=====KASIR TOKO“JayaBaru”=====-----");
        System.out.print("--===NAMA KASIR : ");
        Namakas = ren.next();
     
            tambkasir start=new tambkasir(0, 0, 0);
            start.kategori();
            start.merek();
            start.jenis();
            start.warna();
            start.print();
            start.jumlahbeli();
            start.kembalian();
            
            
            System.out.println("-=Nama merek sepatu : "+start.merek);
            System.out.println("-=Kategori          : "+start.kategori);
            System.out.println("-=Warna             : "+start.warna);
            System.out.println("-=Jenis             : "+start.jenis);
            System.out.println("=====================================");
            System.out.println("Kasir\t:"+Namakas);
            System.out.println("=====================================");
            System.out.println("...TERIMAKASIH ATAS KUNJUNGAN ANDA...");
            start.Undian();
             
    
        
    }
    
}
    

