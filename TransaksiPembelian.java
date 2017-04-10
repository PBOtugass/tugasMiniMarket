import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ASUS on 4/10/2017.
 */
public class TransaksiPembelian {
    int id_TransaksiP;
    private HashMap<Integer, Barang> arrBarang = new HashMap<>();
    private HashMap<Integer,Suplier> arrSuplier = new HashMap<>();
    private Barang brg;
    private Suplier sup;

    public void addBarang(Barang brg){ arrBarang.put(brg.id_barang,brg);}
    public void addSupplier(Suplier sup){ arrSuplier.put(sup.id_supplier,sup);}

    public void print(){

        for(Barang brg:arrBarang.values()){
            brg.print();
        }
    }

    public Barang cariB(int barangId){
        return arrBarang.get(barangId);
    }

    public Suplier cariS(int suplierId){
        return arrSuplier.get(suplierId);
    }

    public TransaksiPembelian(int id_TransaksiP, int id_staff, int id_supplier, int id_barang, String nama, String Jenis, int jumlah, int harga_suplier){
    if(sup.id_supplier==id_supplier){
        if(brg.id_barang==id_barang){
            brg.upJumlahBarang(id_barang,jumlah);
        }else{

        }
    }else{

    }
     //    addBarang(new Barang(brg.id_barang = id_barang,brg.nama_barang ));
    }


}
