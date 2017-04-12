import java.util.Scanner;

/**
 * Created by ASUS on 11/04/2017.
 * Shandra Nurafifah / 1403543
 * Pendidikan Ilmu Komputer A
 */

public class Pembeli {
    int id_pembeli;
    int status;
    String nama;
    String alamat;
    String nomor_kontak;

    public Pembeli(int id_pembeli, String nama, String alamat, String nomor_kontak) {
        //isi
        this.id_pembeli = id_pembeli;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_kontak =nomor_kontak;
    }

    public void print() {
        //print isi pembeli
        System.out.println("  Id Pembeli: "+id_pembeli);
        System.out.println("  Status: Non-Member");
    }

    public void printMember() {
        //print isi pembeli (member)
        System.out.println("  Id Pembeli: "+id_pembeli);
        System.out.println("  Status: Member");
        System.out.println("  Nama: "+nama);
        System.out.println("  Alamat: "+alamat);
        System.out.println("  Nomor kontak: "+nomor_kontak);
    }

public static void main(String[] args) {
        //testing class
        Pembeli pembeliObjek = new Pembeli(1, "Budi","Setiabudhi","081111111111");

        System.out.println("[0]Tidak  [1]Ya");
        Scanner in = new Scanner(System.in);
        System.out.println("Ada kartu member?");
        int status = in.nextInt();
        System.out.println("+=============================+");
        System.out.println("+         Data Pembeli        +");
        System.out.println("+=============================+");
        if(status==0) {
            pembeliObjek.print();   //panggil method
        } else if(status==1){
            pembeliObjek.printMember();   //panggil method
        } System.out.println("-------------------------------\n");
    }
}
