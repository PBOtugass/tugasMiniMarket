/**
 * Created by Ade Kurniawan on 12/04/2017.
 */
public class MainStaff {
    public static void main(String[] args) {
        InputStaff input = new InputStaff();
        input.insertData(1, "Adde", "Bandung","laki-laki","09090","manager"); //menginputkan data dalam index 0
        input.insertData(2, "Ade", "Bandung","laki-laki","09090","manager"); //menginputkan data dalam index 1
        //setelah input data, berarti data telah masuk dalam ArrayList

        System.out.println("Data Mahasiswa dalam ArrayList:");
        System.out.println("-----------------------------");
        for (Staff mhs : input.getALL()) { //input.getALL() berisi list data objek mahasiswa
            System.out.println("ID      : " + mhs.getId_staff());
            System.out.println("Nama    : " + mhs.getNama());
            System.out.println("Alamat  : " + mhs.getAlamat());
            System.out.println("JK      : " + mhs.getJk());
            System.out.println("Telepn  : " + mhs.getTelepon());
            System.out.println("Jabatan : " + mhs.getJabatan());
            System.out.println("-----------------------------");
        }
    }
}
