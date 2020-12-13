/*
Fazil Basri
1908107010032
Tugas 3git 
*/

public class DemoBarisan{
    public static void main(String[] args) {
        System.out.println("BARISAN ARITMATIKA");
       cetakUrutan20(new BarisanAritmatika(-30, 5)); //isi parameter untuk clas sub
       System.out.println("\n\nBARISAN GEOMETRI");
       cetakUrutan20(new BarisanGeometri(1, 2));
       System.out.println("\n\nBARISAN FIBONACCI");
       cetakUrutan20(new BarisanFibonacci(1,1));
       System.out.println("\n\nBARISAN Pangkat");
       cetakUrutan20(new BarisanPangkat(0,2));
    }
    public static void cetakUrutan20(Barisan barisan) {
        for(int i = 0; i <= 20; i++) { //perulangan 20 kali, 
            System.out.print(barisan.berikutnya() + " "); //memanggil dari class barisan yang naik telah di overrd
       }
    }
}