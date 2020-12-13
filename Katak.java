/*
Fazil Basri
1908107010032
Program katak loncat
*/

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Katak {
    public static int pilih,nilai,i,jawab,ulang,a; //deklarasi untuk seluruh isi class

    public static void main(String[] args) { //tampilan menu awal
        Scanner sc = new Scanner(System.in);
        System.out.println("==========KATAK LOMPAT! LOMPAT!!==========");

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


        String nama;							 //deklarasi untuk nama user
        System.out.print("Masukkan Nama : ");
        nama=sc.nextLine();
        System.out.println("\nSelamat datang "+nama+"!");
        System.out.println("Pilih level permainan : \n1. Easy         (25 Batu)\n2. Intermediate (100 Batu)\n3. Difficult    (225 Batu)\n4. Lihat Tutorial game");
        fungsi();

   }
   	//input menu oleh user
    public static void fungsi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan level yang kamu pilih : "); pilih = sc.nextInt(); //PILIHAN
        if      (pilih==1){fungsi1();}
        else if (pilih==2){fungsi2();}
        else if (pilih==3){fungsi3();}
        else if (pilih==4){Tutorial();}
        else {System.out.println("Angka yang kamu masukkan salah, tidak ada level "+pilih);}
    }
    
    //level 1
    public static void fungsi1() {
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

        if      (nilai<50)              
        		{System.out.println("\nNilai kamu "+nilai+" kamu kurang beruntung");}            
        else if (nilai>=50&&nilai<100)  
        		{System.out.println("\nNilai kamu "+nilai+" HEBAT!");}                      //PENILAIAN  
        else 
        		{System.out.println("\nSelamat! Nilai kamu mencapai "+nilai+" ISTIMEWA!");}

       for (int awal=1; awal<2; ){		//perulangan agar kembali ke awal jika salah user input
        	System.out.println("\nApakah kamu ingin bermain lagi? (1. Ya)/(2. Tidak)");
        	ulang = sc.nextInt();
        	switch (ulang) {
           		case 1: fungsi();  break;
           		case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
           		default: System.out.println("Angka yang kamu masukkan salah"); continue;
       		}
   		} 
    }
    //level 2
    public static void fungsi2() {
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

        if 		(nilai<50)              
        		{System.out.println("Nilai kamu "+nilai+" kamu kurang beruntung");}                 
        else if (nilai>=50&&nilai<100)  
        		{System.out.println("Nilai kamu "+nilai+" HEBAT!");}                       
        else                            
        		{System.out.println("Selamat! Nilai kamu mencapai "+nilai+" ISTIMEWA!");}  

        for (int awal=1; awal<2; ){
        	System.out.println("\nApakah kamu ingin bermain lagi? (1. Ya)/(2. Tidak)");
        	ulang = sc.nextInt();
        	switch (ulang) {
           		case 1: fungsi(); break;
           		case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
           		default: System.out.println("Angka yang kamu masukkan salah"); continue;
       		}
   		} 	
    }
    //level3
    public static void fungsi3() {
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
          
            if (jawab==r)   {nilai=nilai+10; System.out.println("KAMU HEBAT! Katak berada di batu "+r);}
            else            {nilai=nilai+0;  System.out.println("OPS SALAH! Katak berada di batu "+r);}
        }
        if      (nilai<50)              
        		{System.out.println("Nilai kamu "+nilai+" kamu kurang beruntung");}                  
        else if (nilai>=50&&nilai<100)  
        		{System.out.println("Nilai kamu "+nilai+" HEBAT!");}                          
        else                            
        		{System.out.println("Selamat! Nilai kamu mencapai "+nilai+" ISTIMEWA!");}  

         for (int awal=1; awal<2; ){
        	System.out.println("\nApakah kamu ingin bermain lagi? (1. Ya)/(2. Tidak)");
        	ulang = sc.nextInt();
        	switch (ulang) {
           		case 1: fungsi();break;
           		case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
           		default: System.out.println("Angka yang kamu masukkan salah");continue;
       		}
   		} 
    }
     //tutorial
    public static void Tutorial(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("- Pada permainan ini terdapat 3 level yaitu : Easy, Intermediate, Difficult.");
    	System.out.println("- Kamu akan menebak katak yang berpindah secara acak tiap kamu memilih batu ");
    	System.out.println("- Level Easy (25 Batu), Level2. Intermediate (100 Batu), Level 3. Difficult    (225 Batu)");
    	System.out.println("- Memilih batu dengan menekan numpad/Angka pada keyboardmu");
        System.out.println("- Kamu punya 20x kesempatan untuk menebak di batu mana katak tersebut berada");
        System.out.println("- Dapatkan point 10 jika kamu benar menebak \n");
        for (int awal=1; awal<2; ){
        	System.out.println("\nApakah kamu ingin bermain sekarang? (1. Ya)/(2. Tidak)");
        	ulang = sc.nextInt();
        	switch (ulang) {
           		case 1: fungsi(); break;
           		case 2: System.out.println("Semoga harimu menyenangkan!");System.exit(0);
           		default: System.out.println("Angka yang kamu masukkan salah"); continue;
       		}
   		} 
    }
}