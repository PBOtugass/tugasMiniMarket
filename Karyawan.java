import java.util.ArrayList;
/**
 * Created by ASUS on 5/2/2017.
 */
public class Karyawan {

    ArrayList<Karyawan> arrKaryawan = new ArrayList<>();
    //private Hashmap<Integer, Barang> arrBarang = new Hashmap<>();
    public double hitungGaji(){ return 0; }

    public void print(){
        System.out.println("-------Daftar Pegawai-------");
        for(Karyawan k : arrKaryawan){
            k.print();
            System.out.println("");
        }
    }

/* //karena kelas barang belum ada :v
    public Barang cari(int id_barang) {
        //item = arrItem.
        return arrBarang.get(id_barang);
    }
*/
    public static void main(String[] args) {
        Karyawan k=new Karyawan();

        Staff st = new Staff(1,"Annisa Larasati","Sumedang","088120442**",5);
        k.arrKaryawan.add(st);

        Manager m = new Manager(2,"Shandra Nurafifah","Banten","083882******",500000);
        k.arrKaryawan.add(m);
        k.print();
    }
}
