
/**
 * Created by ASUS on 5/2/2017.
 */
public class Staff extends Karyawan {
    int id_staff;
    String nama;
    String alamat;
    String no_kontak;
    static String jabatan = "Staff";
    static double gajiDasar = 1500000;
    double jamLembur;

    public Staff(int id_staff, String nama, String alamat, String no_kontak, double jamLembur){
        this.id_staff=id_staff;
        this.nama=nama;
        this.alamat=alamat;
        this.no_kontak=no_kontak;
        this.jamLembur=jamLembur;
    }

    @Override
    public double hitungGaji(){
        double gaji;
        gaji = gajiDasar+ this.jamLembur*50000;
        return gaji;
    }
    public void print(){
        System.out.println("id pegawai : "+id_staff);
        System.out.println("Nama       : "+nama);
        System.out.println("jabatan    : "+jabatan);
        System.out.println("Alamat     : "+alamat);
        System.out.println("No Kontak  : "+no_kontak);
        System.out.println("Gaji       : Rp."+hitungGaji()+",-");
    }

    public static void main(String[] args){
        System.out.println("----testing----");
        Staff st = new Staff(1,"Annisa Larasati","Sumedang","088120442**",5);
        st.print();
    }
}
