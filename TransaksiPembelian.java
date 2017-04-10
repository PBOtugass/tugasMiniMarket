import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ASUS on 4/10/2017.
 * Annisa Larasati / 1401947
 * Warzuqni Olyan / 140
 * Penddiikan Ilmu Komputer
 */
public class TransaksiPembelian {
    int id_TransaksiP;
    private HashMap<Integer, Barang> arrBarang = new HashMap<>();
    private HashMap<Integer,Suplier> arrSuplier = new HashMap<>();
    private Barang brg;
    private Suplier sup;

    public void addBarang(Barang brg){ arrBarang.put(brg.id_barang,brg);}
    public void addSupplier(Suplier sup){ arrSuplier.put(sup.id_supplier,sup);}

    public Barang cariB(int barangId){
        return arrBarang.get(barangId);
    }

    public Suplier cariS(int suplierId){
        return arrSuplier.get(suplierId);
    }

    public TransaksiPembelian(int id_TransaksiP, int id_staff, int id_supplier, String nama_supplier, String alamat_supplier, String kontak_supplier, int id_barang, String nama, String jenis, int jumlah, int harga_suplier, int harga_jual){
        this.id_TransaksiP=id_TransaksiP;

        if(sup.id_supplier==id_supplier){
            if(brg.id_barang==id_barang){
                brg.upJumlahBarang(id_barang,jumlah);
            }else{
                addBarang(new Barang(brg.id_barang = id_barang,brg.id_supplier, brg.nama_barang, brg.jenis=jenis, brg.jumlah=jumlah,brg.harga_suplier=harga_suplier,brg.harga_jual=harga_jual));
            }
        }else{
            addSupplier(new Suplier(sup.id_supplier=id_supplier,sup.nama_supplier=nama_supplier,sup.alamat_supplier=alamat_supplier,sup.kontak_supplier=kontak_supplier));
            if(brg.id_barang==id_barang){
                brg.upJumlahBarang(id_barang,jumlah);
            }else{
                addBarang(new Barang(brg.id_barang = id_barang,brg.id_supplier, brg.nama_barang, brg.jenis=jenis, brg.jumlah=jumlah,brg.harga_suplier=harga_suplier,brg.harga_jual=harga_jual));
            }
        }
    }
    public void print(){
        for(Suplier sup:arrSuplier.values()){
            for(Barang brg:arrBarang.values()){
                if(sup.id_supplier==brg.id_supplier){

                }
            }
        }
    }


}
