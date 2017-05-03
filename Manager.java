package tubesv1;
import java.util.HashMap;

/**
 * Shandra Nurafifah / 1403543
 * Penddiikan Ilmu Komputer A
 */

public class Manager extends Karyawan {
    int id_manager;
    String nama;
    String alamat;
    String no_kontak;
    static String jabatan = "Manager";
    static double gajiDasar = 5500000;
    double bonus;
    HashMap<Integer,Staff> daftarStaff = new HashMap<>();
    public Manager(int id_manager, String nama, String alamat, String no_kontak, double bonus){
        this.id_manager = id_manager;
        this.nama = nama;
        this.alamat = alamat;
        this.no_kontak = no_kontak;
        this.bonus = bonus;
    }
    public void isi() {
        //untuk testing, nantinya bisa diisi dari database
        Staff st;
        st = new Staff(2,"Asep", "Subang","085123456789",2);
        addStaff(st);
        st = new Staff(3,"Ujang", "Lembang","087123456789",4);
        addStaff(st);
    }
    @Override
    public double hitungGaji(){
        double gaji;
        gaji = gajiDasar + this.bonus;
        return gaji;
    }

    public void print(){
        //print isi manager
        System.out.println("  Id manager  : "+id_manager);
        System.out.println("  Nama        : "+nama);
        System.out.println("  Alamat      : "+alamat);
        System.out.println("  Nomor kontak: "+no_kontak);
        System.out.println("  Jabatan     : "+jabatan);
        System.out.println("  Gaji        : Rp "+hitungGaji());
    }
    public void addStaff(Staff st) {
        daftarStaff.put(st.id_staff,st);
    }
    //cari Karyawan berdasarkan id
    public Staff cariStaff(int idStaff) {
        return daftarStaff.get(idStaff);
    }

    //jika main(), hasilnya spt ini:
    /*
        +=============================+
        +         Data Manager        +
        +=============================+
          Id manager  : 1
          Nama        : Budi
          Alamat      : Bandung
          Nomor kontak: 081123456789
          Jabatan     : Manager
          Gaji        : Rp 6000000.0

        ===> Testing cari staff:
        Ditemukan!
        id pegawai : 3
        Nama       : Ujang
        jabatan    : Staff
        Alamat     : Lembang
        No Kontak  : 087123456789
        Gaji       : Rp.1700000.0,-
    */
    public static void main(String[] args){
        Manager m = new Manager(1,"Budi","Bandung","081123456789",500000);
        System.out.println("+=============================+");
        System.out.println("+         Data Manager        +");
        System.out.println("+=============================+");
        m.print();  //panggil method

        m.isi();
        System.out.println("\n===> Testing cari staff:");
        Staff st = m.cariStaff(3); //cari idKaryawan 3
        if (st != null) {
            System.out.println("Ditemukan!");
            st.print(); //hasilnya print Karyawan 3
        } else {
            System.out.println("Tidak Ditemukan");
        }
    }
}
