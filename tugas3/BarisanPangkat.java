public class BarisanPangkat extends Barisan{
    int nilai;
    int pangkat;
    public BarisanPangkat(int nilaiAwal, int pangkat){
        super(1);
        this.pangkat=pangkat;
        nilai=0;
    }
    
    @Override
    public void naik() { 
       super.nilaiBerikutnya = (int) Math.pow(nilai, pangkat); //rumus untuk pangkat, menggunakan math.pow
       int dipangkat = nilai++; // untuk menambahkan angka, namun pangkat tetap 2
    }      
}
