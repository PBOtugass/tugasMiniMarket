/**
 * Created by Ade Kurniawan on 03/05/2017.
 * Ade Kurniawan 1400650
 */
//package tubesv1;
import java.util.ArrayList;
import java.util.HashMap;

public class TransaksiSupp {
    int id_pembelian,total_harga,id_supplier,id_staff;
    private HashMap<Integer,TransaksiSupp> arrPembelian = new HashMap<>();
    private ArrayList<Barang> arrBarang = new ArrayList<>(); //item makan/minum yang dipesan
    Barang barang;

    public TransaksiSupp(int id_pembelian,int id_staff, int id_supplier,Barang barang, int total_harga){
        this.id_pembelian = id_pembelian;
        this.id_supplier = id_supplier;
        this.barang = barang;
        this.total_harga = total_harga;
        this.id_staff =id_staff;
    }


    public void addPembelian(TransaksiSupp Ts) {
        arrPembelian.put(Ts.id_pembelian,Ts);
    }

    public void printT(){
        for (TransaksiSupp Ts:arrPembelian.values()) {
            Ts.print();
            System.out.println("-------------------------------");
        }
    }
    public void print(){
        System.out.println("Id Pembelian :"+id_pembelian);
        System.out.println("Id barang :"+barang.id_barang);
        System.out.println("Id Staff :"+id_staff);
        System.out.println("Nama Barang :"+barang.nama_barang);
        System.out.println("Harga Beli :"+barang.harga_suplier);
        System.out.println("Jumlah Barang :"+barang.jumlahbeli);
        System.out.println("total harga:"+total_harga);
    }


    public static void main(String [] args){
        TransaksiSupp transaksiSupp;
        Barang brg = new Barang(1,"Indomie","Mie",1,1,1,1,1,1);
        TransaksiSupp ts = new TransaksiSupp(1,1,1,brg, 200000);
        ts.addPembelian(ts);   //barang yang dipilih
        brg = new Barang(2,"Sedap","Mie",2,2,2,2,2,1);
        ts = new TransaksiSupp(1,1,1,brg, 200000);
        ts.addPembelian(ts);   //barang yang dipilih
        ts.printT();
    }
}
