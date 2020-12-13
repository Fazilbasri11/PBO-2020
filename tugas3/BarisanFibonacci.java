public class BarisanFibonacci extends Barisan{
    public int nilaiSebelumnya;  
    public BarisanFibonacci(int nilaiAwal, int nilaiSebelumnya) {
        super();
        this.nilaiSebelumnya=1;
    }

    @Override
    public void naik() {
        int x = 1; //rumus untuk fibonanca
        x = nilaiSebelumnya + super.nilaiBerikutnya;
        super.nilaiBerikutnya = nilaiSebelumnya;
        nilaiSebelumnya = x;
    }
}