## Projek akhir PBO 2020 :bus:

```Fazil Basri 1908107010032```

- Code ini bertujuan untuk memenuhi tugas yang diberikan pada praktikum lab pbo 2020
- Code menerapkan sistem CRUD tambah,hapus, dan lihat data.
- Pada code ini terdapat 3 file yaitu, Main.java dalam folder main sebagai file utama untuk menjalankan program, file Bus.java dan file Penumpang.java 
   terdapat dalm folder project.

### Cara kerja kode :
- sistem bus merupakan isi kode ini, yang mana didalam bus hanya terdapat 40 kursi, 20 kursi biasa yang boleh di isi oleh siapa saja, 
  dan 4 kursi prioritas yang hanya bole di isi oleh wanita hamil, usia <10, dan lansia >60.
  Apabila kursi prioritas sudah penuh , maka penumpang bersifat priotitas itu akan duduk di kursi biasa.
- Jika semua kursi penuh maka akan terdapat tampilan penumpang penuh, lalu display data penumpang
- setiap penumpang akan ditampung dalam arraylist, terdapat 3 array list, yaitu arraylist penumpang biasa, arraylist priotitas, dan penumpang berdiri;

### Compile dan Run
- jika pada vsc maka open folder ```bus\kode``` lalu run di main.java
- jika menggunakan cmd/terminal maka compile terlebih dahulu file Bus.java bersamaan dengan Penumpang, 
  lalu dilanjutkan dengan compile file. Main.java
 
 ```javac kode/project/Bus.java kode/project/Penumpang.java```
 
 ```javac kode/main/Main.java```
 
 *RUN !
 ```java kode/main/Main```
 
 untuk lebih jelasnya https://stackoverflow.com/questions/49726564/javac-main-java-is-not-working-in-cmd/49726625  :grinning:

 #### informasi tambahan
  - Code class main.java didalamnya terdapat penggunaan;  perulangan while, switch case,
    if else, try catch  dsb.

  - Code class Bus.java didalam nya terdapat; Arraylist, perulangan for, if else, dsb.

  - Code Class penumpang.java didalamnya terdapat; perulangan for, trycatch, import waktu, to string dsb.

