
/**
 * Write a description of interface Garis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Garis implements Pembanding{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Garis(int koordinat_x1, int koordinat_y1, int koordinat_x2, int koordinat_y2){
        x1 = koordinat_x1;
        y1 = koordinat_y1;
        x2 = koordinat_x2;
        y2 = koordinat_y2;
    }
    
    public double panjangGaris(){
        double panjang = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return panjang;
    }
    
    public int bandingkan (Object a, Object b){
        Garis g1 = (Garis) a;
        Garis g2 = (Garis) b;
        return (int) g1.panjangGaris()-(int)g2.panjangGaris();
    }
}
