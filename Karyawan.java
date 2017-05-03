package tubesv1;
import java.util.ArrayList;
/**
 * Created by ASUS on 5/2/2017.
 * Annisa Larasati 1401947
 */
public class Karyawan {
private ArrayList<Barang> arrBarang = new ArrayList<>(); //item makan/minum yang dipesan
    private Daftar_barang pilihBrg; //pesanan harus yg ada di menu, static karena semua pesanan sharing menu yg sama
    Barang cari;
    ArrayList<Karyawan> arrKaryawan = new ArrayList<>();
    //private Hashmap<Integer, Barang> arrBarang = new Hashmap<>();
    public double hitungGaji(){ return 0; }

    public double totalgaji(){
        double total=0;
        for(Karyawan k:arrKaryawan){
            total=total+k.hitungGaji();
        }
        return total;
    }

    public void print(){
        System.out.println("-------Daftar Pegawai-------");
        int i=0;
        for(Karyawan k : arrKaryawan){
            i=i+1;
            System.out.println("id karyawan : "+i);
            k.print();
            System.out.println("");
        }
        System.out.println("total gaji : "+totalgaji());
    }

    
    
    
/* //karena kelas barang belum ada :v
    public Barang cari(int id_barang) {
        //item = arrItem.
        return arrBarang.get(id_barang);
    }
*/
    public static void main(String[] args) {
        Karyawan k=new Karyawan();
     
        
        Staff st = new Staff(1,"dede","Sumedang","088120442**",5);
        k.arrKaryawan.add(st);

        Manager m = new Manager(2,"Budi","Banten","083882******",500000);
        k.arrKaryawan.add(m);
        
        System.out.println("Cari Barang");
        Daftar_barang daftar_brg = new Daftar_barang();
        daftar_brg.isi();
        Barang brg = daftar_brg.cari_br(3);
     
        if (brg != null) {
            System.out.println("Ditemukan!");
                brg.print();
        } else {
            System.out.println("Tidak Ditemukan");
        }
          
        k.print();
    }
}
