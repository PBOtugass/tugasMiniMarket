import java.util.ArrayList;

/**
 * Created by Ade Kurniawan on 12/04/2017.
 */
public class InputStaff {
    ArrayList<Staff> liststaff; //variabel listmahasiswa bertipe ArrayList

    public InputStaff() { //constructor
        liststaff = new ArrayList (); //instansiasi dari variabel listmahasiswa
    }

    public void insertData(int id_staff,String nama, String alamat, String jk, String telepon, String jabatan) { //method untuk memasukkan data NIM, Nama, dan Alamat ke dalam ArrayList
        Staff inistaff = new Staff(id_staff, nama, alamat,jk,telepon,jabatan); //objek mhs yang bertipe mahasiswa
        liststaff.add(inistaff); //menambahkan data objek mhs ke dalam ArrayList listmahasiswa
    }

    public ArrayList<Staff> getALL() { //method untuk mengambil data yang disimpan dalam ArrayList listmahasiswa
        return liststaff; //mengembalikan nilai dari variabel listmahasiswa
    }

    public void deleteData(int index) { //method untuk menghapus data di ArrayList berdasarkan index Arraynya
        liststaff.remove(index);
    }
}
