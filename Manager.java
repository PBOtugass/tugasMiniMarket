/**
 * Created by ASUS on 10/04/2017.
 * Shandra Nurafifah / 1403543
 * Penddiikan Ilmu Komputer A
 */
public class Manager {
    String id_manager;
    String nama;
    String alamat;
    String nomor_kontak;

    public Manager(String id_manager, String nama, String alamat, String nomor_kontak) {
        //isi
        this.id_manager = id_manager;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_kontak = nomor_kontak;
    }

    public void print() {
        //print isi manager
        System.out.println("Id Manager: "+id_manager);
        System.out.println("Nama: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Nomor kontak: "+nomor_kontak);
    }

    public void cek_transaksi() {

    }

    //jika main(), hasilnya spt ini:
    /*
        +=============================+
        +         Data Manager        +
        +=============================+

        Id Manager: M111
        Nama: Budi
        Alamat: Bandung
        Nomor kontak: 081123456789
    */
    public static void main(String[] args) {
        //testing class
        Manager mngObjek = new Manager("M111","Budi","Bandung","081123456789");
        System.out.println("+=============================+");
        System.out.println("+         Data Manager        +");
        System.out.println("+=============================+\n");
        mngObjek.print();   //panggil method
        mngObjek.cek_transaksi();   //panggil method
    }
}