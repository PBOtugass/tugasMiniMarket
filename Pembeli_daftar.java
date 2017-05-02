import java.util.HashMap;

/**
 * Created by ASUS on 11/04/2017.
 * Shandra Nurafifah / 1403543
 * Pendidikan Ilmu Komputer A
 */
public class Pembeli_daftar {
    private HashMap<Integer, Pembeli> arrPembeli = new HashMap<>();

    /*
     tambah pembeli ke arrPembeli
 */
    public void addPembeli(Pembeli pb) {
        arrPembeli.put(pb.id_pembeli,pb);
    }

    public void print() {
        System.out.println("+=============================+");
        System.out.println("+          Data Member        +");
        System.out.println("+=============================+\n");
        //print semua pembeli
        for (Pembeli pb:arrPembeli.values()) {
            pb.printMember();
            System.out.println("-------------------------------");
        }
    }

    //cari pembeli di hashamp berdsarkan id pembeli
    public Pembeli cari(int pembeliId) {
        System.out.println("\n+=============================+");
        System.out.println("+      Cari Data Member       +");
        System.out.println("+=============================+\n");
        //pembeli = arrPembeli
        return arrPembeli.get(pembeliId);
    }

    public void isi() {
        //untuk testing, nantinya bisa diisi dari database
        Pembeli pb;
        pb = new Pembeli(1, "Budi", "Setiabudhi", "081111111111");
        addPembeli(pb);
        pb = new Pembeli(2, "Wati", "Lembang", "082222222222");
        addPembeli(pb);
        pb = new Pembeli(3, "Asep", "Dago", "083333333333");
        addPembeli(pb);
    }

    public static void main(String[] args) {
        //test cari
        Pembeli_daftar daftar = new Pembeli_daftar();
        daftar.isi();
        daftar.print();
        Pembeli pb = daftar.cari(3);
        pb.printMember();
    }
}
