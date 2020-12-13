public class BarisanAritmatika extends Barisan{
    public int kenaikan;
    public BarisanAritmatika(int nilaiAwal, int kenaikan) {
        super(nilaiAwal); //mengambil dari class barisan
        this.kenaikan=kenaikan;
    }
    
    @Override
    public void naik(){
        nilaiBerikutnya += kenaikan; //rumus untuk aritmatika
    }
}    
