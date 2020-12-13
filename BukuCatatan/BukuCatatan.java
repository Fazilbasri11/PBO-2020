/**
 * Write a description of class BukuCatatan here.
 *
 * @Fazil Basri 1908107010032
 * @version (a version number or a date)
 */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class BukuCatatan
{
    // instance variables - replace the example below with your own
    //private String tanggalDiuat;
    //private String judul;
    private ArrayList<String> catatan;
    List<String> all = new ArrayList();
    /**
     * Constructor for objects of class BukuCatatan
     */
    public BukuCatatan()
    {
        // initialise instance variables
       catatan = new ArrayList<>();
    }
   
    public void tambahCatatan (String isi)
    {
        catatan.add(isi);
    }
    
    public void hapusCatatan(int indeks)
    {
        if ((indeks >= 0 )&&(indeks <= catatan.size())){
        catatan.remove(indeks);
        } else{
            System.out.println("Index not found");
        }
        //tambah pengujian
    }
    
    public void hapusCatatan(String isi)
    {
        if(catatan.contains(isi)) {
          catatan.remove(isi);
        }
        //tambah pengujian apakah isinya ada apa tidak
    }
    
    public void ubahCatatan(int indeks,String dataBaru)
    {
        if ((indeks >= 0 )&&(indeks <= catatan.size())){
        catatan.set(indeks, dataBaru);
        } else{
            System.out.println("Index not found");
        }
                
    }
    
    public String bacaCatatan(int indeks)
    {
        if ((indeks >= 0 )&&(indeks <= catatan.size())){
        return catatan.get(indeks);
        } else{
            System.out.println("Index not found");
        }
        return null;
    }
    
    public int jumlahCatatan()
    {
       return catatan.size(); 
    }
    
    public void tampilSemuaCatatan()
    {
       Iterator read = catatan.iterator();
       
       while (read.hasNext()){
           System.out.println(read.next()); 
        }
        
    }
    
}