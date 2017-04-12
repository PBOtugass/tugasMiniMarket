import sun.security.util.Pem;
import java.util.ArrayList;

/**
 * Created by wanicute on 11/04/2017.
 * Warzuqni Olyan 1403989
 * Pendidikan Ilmu Komputer A
 */
public class Pembeli {
    int id_pembeli;
    String status;
    String upStatus;
    int idUP;
    String nama_member[]= new String[100];
    int counter=0;

    public Pembeli(int id_pembeli, String status) {
        this.id_pembeli = id_pembeli;
        this.status = status;
    }

    public Pembeli(){

    }//bikinan ana

    public String upStatus(int idUP, String upStatus){ //untuk mengupdate status pembeli
        if(this.status.equals(this.idUP)){
            this.status=upStatus;
        }
        return status;
    }

    public void addmember(String nama_member){
        this.nama_member[this.counter]=nama_member;
        System.out.println("nama member :"+this.nama_member[this.counter]);
        this.counter++;
    }

    public void print(){
        int i = 0 ;
        while( i < this.counter){
            System.out.println(this.nama_member[i]);
            i++ ;
        }
    }

    public static void main(String[] args){
        Pembeli pmbl = new Pembeli(123,"non_member");
        pmbl.upStatus="member";
        System.out.println("==Testing print isi==");
        pmbl.print();
    }

}
