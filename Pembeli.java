package tubesv1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Shandra Nurafifah / 1403543
 * Penddiikan Ilmu Komputer A
 */
public class Pembeli {
    int id_pembeli;
    ArrayList<Pembeli> arrPembeli = new ArrayList<>();

    public void print(){
        for(Pembeli pb : arrPembeli){
            pb.print();
            System.out.println("+-----------------------------+");
        }
    }

    public static void main(String[] args) {
        Pembeli pb = new Pembeli();
        System.out.println("[0]Tidak  [1]Ya");
        Scanner in = new Scanner(System.in);
        System.out.println("Ada kartu member?");
        int status = in.nextInt();
        System.out.println("+=============================+");
        System.out.println("+         Data Pembeli        +");
        System.out.println("+=============================+");
        if(status==0) {
            Nonmember Nm = new Nonmember(1);
            pb.arrPembeli.add(Nm);
        } else if(status==1){
            Member m = new Member(111,"Otoy","Cibiru","081111111111",0.1);
            pb.arrPembeli.add(m);
        }
        pb.print();
    }
}
