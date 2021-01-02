public class Pemain
{
    // instance variables - replace the example below with your own
    private String nama;
    private int nilai = 0;
    String rank;

    /**
     * Constructor for objects of class Pemain
     */
    public Pemain(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }
    
    public void setNama()
    {
        this.nama = nama;
    }
    
    public int getNilai()
    {
        return this.nilai;
    }
    
    public void setNilai(int nilaibaru)
    {
        this.nilai = nilaibaru;
    }
    
    /**
     * Method dibawah berfungsi untuk menyatakan apabila tebakan benar,
     * nilai akan ditambah 10
     */
    public void addNilai() 
    {
        nilai += 10;
    }
    
    /**
     * Method dibawah untuk memberikan ranking pemain.
     * Apabila skor > 100, maka pemain akan mendapat Excellent.
     * Apabila skor pemain 50 - 100, maka pemain akan mendapatkan rank GOOD.
     * Apabila skor < 50, maka pemain akan mendapat Bad.
     */
    public void Rank() 
    {
        if(nilai > 100) {
            rank = "WOWW EXCELLENT, ANDA HEBAT!";
        } 
        else if(nilai > 50) {
            rank = "NICE, GOOD!";
        } 
        else {
            rank = "BAD, SILAHKAN COBA LAGI";
        }
        System.out.println("Peringkat Anda: " + rank);
    }
}