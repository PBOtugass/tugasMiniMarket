package minimarket;

import java.util.ArrayList;

/**
 * Created by yudiwbs on 04/04/2017.
 *
 *  pesanan makanan dari pelanggan
 *
 */

public class TransaksiPenjualan {
    int pelanggan; //nomor meja
    int uang;
    int jumlah;
    int jumBrg;
    private ArrayList<Barang> arrBarang = new ArrayList<>(); //item makan/minum yang dipesan
    private Daftar_barang pilihBrg; //pesanan harus yg ada di menu, static karena semua pesanan sharing menu yg sama

    public TransaksiPenjualan(int pelanggan,int uang, Daftar_barang daftar_brg) {
        this.pelanggan = pelanggan;
        this.uang= uang;
        pilihBrg = daftar_brg;
    }

    public void addBarang(int id_barang) {
        Barang brg = pilihBrg.cari_br(id_barang);
        if (brg != null) {
            arrBarang.add(brg);
        }
    }

    public void print() {
        System.out.println("Pelanggan id:"+pelanggan);
        System.out.println("Uang:"+uang);
        for (Barang brg: arrBarang) {
            brg.printT();
        }
    }

    /*
        hitung tagihan (berapa yg harus dibayar pelanggan).
        dihitung dengan menjumlahkan hargaJual item yang dipesanm
     */
    public void hitungTagihan(int jumlah) {
        int total=0;
        for (Barang brg: arrBarang) {
            total=brg.harga_jual*jumlah;
            brg.jumlah = brg.jumlah-jumlah;
            uang=uang-total;
            brg.harga_total=total;
        }

    }

    /*
        hitung biayar produksi.
        dihitung dengan menjumlahkan hargaProduksi item yang dipesanm
        nanti digunakan untuk menghitung keuntungan
     */



    public static void main(String[] args) {
        //testing
        System.out.println("**** test class Pesanan **** ");
        Daftar_barang daftar_brg = new Daftar_barang();
        daftar_brg.isi();

        System.out.println("===> Testing print pesanan:");
        TransaksiPenjualan p = new TransaksiPenjualan(1,100000,daftar_brg);
        p.addBarang(2);   //barang yang dipilih
        p.hitungTagihan(10);
        p.addBarang(3);
        p.hitungTagihan(8);
        //jumBrg = p.hitungTagihan(3);
        p.print(); //print pesanan pelanggan
    }


}
