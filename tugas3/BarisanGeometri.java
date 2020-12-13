public class BarisanGeometri extends Barisan{
    public int rasioPengali;
    public BarisanGeometri(int nilaiAwal, int rasioPengali){
        super(nilaiAwal); //mengambil dari class brisan
        this.rasioPengali=rasioPengali;
    }
    
    @Override
    public void naik() {
        nilaiBerikutnya *= rasioPengali; //rumus untuk geometri
    }
}