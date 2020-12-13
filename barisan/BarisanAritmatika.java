public class BarisanAritmatika extends Barisan{
    public int kenaikan;
    public BarisanAritmatika(int nilaiAwal, int kenaikan) {
        super(nilaiAwal);
        this.kenaikan=kenaikan;
    }
   
    public void naik() {
        for(int i=nilaiBerikutnya; i<=20; i+=kenaikan){
            System.out.print(i+" ");
        }
    }
}