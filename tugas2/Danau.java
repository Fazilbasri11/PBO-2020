import java.util.Random;
/**

 */
public class Danau
{
    private int jumlahKotak;
    private int[][] kotak;
    Random acak = new Random();
    private int lokasi;
    
    /**
     * Constructor for objects of class Danau
     */
    public Danau()
    {
        this.jumlahKotak = 5;
        buatKotak();
    }

    public int getLokasi(){
        return this.lokasi;
    }
    
    public Danau(int jumKotak)
    {
        this.jumlahKotak = jumKotak;
        buatKotak();
    }
   
    
    private void buatKotak()
    {
        kotak = new int[jumlahKotak][jumlahKotak];
        
        for(int i=0 ; i<jumlahKotak ; i++){
            String s = "";
            for (int j=0 ; j<jumlahKotak ; j++){
                kotak[i][j]=0;
                
            }
           
        }
    }
    
    public void tambahKatak(int baris, int lajur)
    {
        kotak = new int[baris][lajur];
        lokasi = acak.nextInt(baris*lajur);
        int next = acak.nextInt(baris*lajur);
        int nomor = 1;
        for(int i=0 ; i<baris ; i++){
            String s = "";
            for (int j=0 ; j<lajur ; j++){
                if (nomor == lokasi){
                    
                }
                else {
                kotak[i][j]=0;  
                }
                nomor++;
            }   
        }
        
    }
    
    
    public boolean adaKatak(int baris, int lajur)
    {
        boolean a;
        int nilai = 0;
        
        if (nilai == lokasi){
            a = true;
        }
        else {
            a = false;
        }
        
        return a;
    }
    
    public void hapusKatak(int baris, int lajur)
    {
        kotak[baris][lajur] = 0;
    }
    
    
}