import java.lang.String;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

/**
 * Created by Ade Kurniawan on 10/04/2017.
 */
public class Staff {
    int id_staff;
    String nama;
    String alamat;
    String jk;
    String telepon;
    String jabatan;

    public Staff(int id_staff,String nama, String alamat, String jk, String telepon, String jabatan){
        this.id_staff = id_staff;
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.telepon = telepon;
        this.jabatan = jabatan;
    }

    public int getId_staff() {
        return id_staff;
    }

    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }

    public String getJk() {
        return jk;
    }
    public String getTelepon() {
        return telepon;
    }

    public String getJabatan() {
        return jabatan;
    }

    public static void main(String[] args){

    }
}
