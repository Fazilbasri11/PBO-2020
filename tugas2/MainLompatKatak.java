import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a description of class MainLompatKatak here.
 *
 * @author (Fazil Basri)
 * @version (a version number or a date)
 */
public class MainLompatKatak
{
    private boolean play;

    public MainLompatKatak(){
        play = true;
    }

    public void mainkan(){
        Random batu = new Random();
        Danau dn;
        Pemain n; //= new Pemain();
        Scanner input = new Scanner(System.in);
        int level, lokasi, baris, lajur;

         //tampilan waktu
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        int min = time.get(Calendar.MINUTE);
        int day = time.get(Calendar.DAY_OF_MONTH);
        int month = time.get(Calendar.MONTH) + 1;
        int year = time.get(Calendar.YEAR);
        System.out.println(+ day + "/" + month + "/"+ year + "-"+ hour + ":" + min);
         if (hour < 12)
         System.out.println("Good Morning!");
        else if (hour < 17 && !(hour == 12))
         System.out.println("Good Afternoon");
        else if (hour == 12)
        System.out.println("Good Noon");
        else
        System.out.println("Good Evening");
        
        System.out.print("Masukkan Namamu : ");
        n = new Pemain(input.nextLine());
        
        System.out.println("\nMenu Level\n");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Pilih Level : ");
        level = input.nextInt();
        
        if(level == 1){
        int nilai,jawab,ulang;
        Scanner sc = new Scanner(System.in);
        for (int a=1; a<=5; a++) {System.out.print(a+"  ");} System.out.println(""); //menampilkan spasi tiap batu atau angka yang ditampilkan
        for (int a=6; a<=10; a++) {System.out.print(a+"  ");} System.out.println("");
        for (int a=11; a<=15; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=16; a<=20; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=21; a<=25; a++) {System.out.print(a+" ");} System.out.println("");
            nilai=0;
        for (int i=1; i<=20; i++) {
            int r=(int)(1+(Math.random()*24)); //r digunakan sebagai deklarasi untuk menampung tebakan user
            System.out.print("Kesempatan ke-"+i+", Tebak posisi katak : ");
            jawab = sc.nextInt();
          

            if (jawab==r)   
                {nilai=nilai+10; System.out.println("KAMU HEBAT! Katak berada di batu "+r);}
                 else            
                {nilai=nilai+0;  System.out.println("OPS SALAH! Katak berada di batu "+r);}
        }

            if   (nilai<50)              
                {System.out.println("\nNilai kamu "+nilai+" kamu kurang beruntung");}            
             else if (nilai>=50&&nilai<100)  
                {System.out.println("\nNilai kamu "+nilai+" HEBAT!");}                      //PENILAIAN  
             else 
                {System.out.println("\nSelamat! Nilai kamu mencapai "+nilai+" ISTIMEWA!");}

             for (int awal=1; awal<2; ){      //perulangan agar kembali ke awal jika salah user input
            System.out.println("\nApakah kamu ingin bermain lagi? (1. Ya)/(2. Tidak)");
            ulang = sc.nextInt();
                switch (ulang) {
                case 1: mainkan();  break;
                case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
                default: System.out.println("Angka yang kamu masukkan salah"); continue;
               }
            } 
        }
        if(level == 2){
        int nilai,jawab,ulang;
        Scanner sc = new Scanner(System.in);
        for (int a=1; a<=9; a++) {System.out.print(a+"  ");} 
        for (int a=10; a<=20; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=21; a<=40; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=41; a<=60; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=61; a<=80; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=81; a<=100; a++) {System.out.print(a+" ");} System.out.println("");
            nilai=0;
        for (int i=1; i<=20; i++) {
            int r=(int)(1+(Math.random()*99));
            System.out.print("Kesempatan ke-"+i+", Tebak posisi katak : ");
            jawab = sc.nextInt();
          

            if (jawab==r)   
                {nilai=nilai+10; System.out.println("KAMU HEBAT! Katak berada di batu "+r);}
                 else            
                {nilai=nilai+0;  System.out.println("OPS SALAH! Katak berada di batu "+r);}
        }

            if   (nilai<50)              
                {System.out.println("\nNilai kamu "+nilai+" kamu kurang beruntung");}            
             else if (nilai>=50&&nilai<100)  
                {System.out.println("\nNilai kamu "+nilai+" HEBAT!");}                      //PENILAIAN  
             else 
                {System.out.println("\nSelamat! Nilai kamu mencapai "+nilai+" ISTIMEWA!");}

             for (int awal=1; awal<2; ){      //perulangan agar kembali ke awal jika salah user input
            System.out.println("\nApakah kamu ingin bermain lagi? (1. Ya)/(2. Tidak)");
            ulang = sc.nextInt();
                switch (ulang) {
                case 1: mainkan();  break;
                case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
                default: System.out.println("Angka yang kamu masukkan salah"); continue;
               }
            } 
        }
        if(level == 3){
        int nilai,jawab,ulang;
        Scanner sc = new Scanner(System.in);
       for (int a=1; a<=9; a++) {System.out.print(a+"   ");} 
        for (int a=10; a<=45; a++) {System.out.print(a+"  ");} System.out.println("");
        for (int a=46; a<=90; a++) {System.out.print(a+"  ");} System.out.println("");
        for (int a=91; a<=99; a++) {System.out.print(a+"  ");}
        for (int a=100; a<=135; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=136; a<=180; a++) {System.out.print(a+" ");} System.out.println("");
        for (int a=181; a<=225; a++) {System.out.print(a+" ");} System.out.println("");
            nilai=0;
        for (int i=1; i<=20; i++) {
            int r=(int)(1+(Math.random()*225));
            System.out.print("Kesempatan ke-"+i+", Tebak posisi katak : ");
            jawab = sc.nextInt();
          

            if (jawab==r)   
                {nilai=nilai+10; System.out.println("KAMU HEBAT! Katak berada di batu "+r);}
                 else            
                {nilai=nilai+0;  System.out.println("OPS SALAH! Katak berada di batu "+r);}
        }

            if   (nilai<50)              
                {System.out.println("\nNilai kamu "+nilai+" kamu kurang beruntung");}            
             else if (nilai>=50&&nilai<100)  
                {System.out.println("\nNilai kamu "+nilai+" HEBAT!");}                      //PENILAIAN  
             else 
                {System.out.println("\nSelamat! Nilai kamu mencapai "+nilai+" ISTIMEWA!");}

             for (int awal=1; awal<2; ){      //perulangan agar kembali ke awal jika salah user input
            System.out.println("\nApakah kamu ingin bermain lagi? (1. Ya)/(2. Tidak)");
            ulang = sc.nextInt();
                switch (ulang) {
                case 1: mainkan();  break;
                case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
                default: System.out.println("Angka yang kamu masukkan salah"); continue;
               }
            } 
        } 
        System.out.println("Nama  : " + n.getNama());
        System.out.println("Nilai : " + n.getNilai());
    }
    
    public static void main(String[] args){
        MainLompatKatak main = new MainLompatKatak();
        main.mainkan();
    }
}