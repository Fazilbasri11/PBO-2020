/*
Fazil Basri
1908107010032
*/
package kode.main;
import java.util.Scanner;


// import package class
import kode.project.Penumpang;
import kode.project.Bus;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihanUser,nama;
        char inputHamil;
        boolean isLanjutkan = true, hamil,berhasilNaik;
        int umur,id,saldo;
        Penumpang penumpang;

        Bus bus = new Bus();
        while (isLanjutkan) { //while ini bertujuan untuk menanyakan user untuk melanjutkan kemenu selanjutnya
            Penumpang.clearScreen();
            System.out.println("\n==================================");
            System.out.println("Data Penumpang Bus TransKoetaRadja");
            System.out.println("==================================");
            Penumpang.time();
            System.out.println("1. Lihat seluruh penumpang");
            System.out.println("2. Tambah data penumpang");
            System.out.println("3. Hapus data penumpang");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = input.next();
            int jmlh = bus.getJumlahPenumpangBiasa() + bus.getJumlahPenumpangPrioritas();

            switch (pilihanUser) {

                // pilihan 1 untuk menampilkan seluruh penumpang
                case "1":
                    if(jmlh == 0){
                        System.out.println("\nPenumpang Belum Ada Loh!");
                    }else{
                        System.out.println("\n======================");
                        System.out.println("LIST SELURUH PENUMPANG");
                        System.out.println("======================");
                        bus.display();
                    }
                    break;
                
                // Pilihan 2 untuk Menmbahkan penumpang    
                case "2":
                    if (jmlh < 40){ // jika jumlah penumpang kurang dari 40 maka bisa dilanjutkan
                        System.out.println("\n=====================");
                        System.out.println("TAMBAH DATA PENUMPANG");
                        System.out.println("=====================");

                        try{ //Agar tidak terjadi input eror 
                            System.out.print("Id_Penumpang (int) : ");id=input.nextInt();
                            System.out.print("Nama               : ");nama=input.next();
                            System.out.print("Umur         (int) : "); umur=input.nextInt();
                            System.out.print("Hamil        (y/n) : "); inputHamil = input.next().charAt(0);
                            if (inputHamil == 'y') {
                            hamil = true;
                            }else {
                                hamil = false;
                            }
                            penumpang = new Penumpang(id, nama, umur, hamil, 10000);
                            System.out.println("Saldo : " + penumpang.getSaldo());
                            berhasilNaik = bus.naik(penumpang);
                            System.out.println("Sisa Saldo : " +penumpang.sisaSaldo());
                            bus.display();
                            
                        }catch(Exception e) { // exeption random, untuk mempersingkat kode
                            System.err.println("<err ditemukan> Kesalahan input, mohon ulangi");
                        }
                    }

                    //  Jika penumpang sudah penuh 40, maka akan masuk ke kondisi else ini
                    else{
                        System.out.println("==Penumpang Penuh!==");
                        bus.display();
                    }
                    break;

                // Pilihan 3 untuk menghapus menurunkan penumpang berdasrakan input nama    
                case "3":
                    if(jmlh == 0){
                        System.out.println("\nPenumpang Belum Ada Loh!");
                    }else{
                        System.out.println("\n==================");
                        System.out.println("HAPUS DATA PENUMPANG");
                        System.out.println("====================");
                        bus.display();
                        System.out.println("\ninput nama yang dihapus :");nama=input.next();
                        bus.turun(nama);
                        bus.display();
                    }
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");    
            }
            isLanjutkan = kode.project.Penumpang.getYesorNo("Apakah ingin melanjutkan");
        }
    }      
}