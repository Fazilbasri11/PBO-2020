public class Kucing{
    private String nama;
    private int umur;

    public Kucing() {
        umur = 0;
    }

    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahUmur() {
        umur += 1;
    }

    public int getUmur() {
        return this.umur;
    }

    public String getImutRating() {
        if (umur < 2 || umur > 48) {
            return "ngga imut";
        } else if (umur >= 2 && umur <= 8) {
            return "imut banget";
        } else {
            return "imut";
        }
    }

    public void cetakLompat(int jumlompat) {
        for(int a=0; a<jumlompat; a++)
        {
            for(int b=0; b<=a; b++)
            {
                System.out.print("! ");
            }
            System.out.println();
        }
    }
}