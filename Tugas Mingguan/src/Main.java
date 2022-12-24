import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //Scanner petugas dan input data
        petugas ptgs = new petugas();
        Scanner Petugas = new Scanner(System.in);
        System.out.println("---Petugas Sewa Mobil");
        System.out.println("Nama = ");
        ptgs.nama_petugas = Petugas.nextLine();
        System.out.println("No.Hp = ");
        ptgs.no_hp = Petugas.nextLine();

        //Scanner penyewa dan input data
        penyewa pnyw = new penyewa();
        Scanner Penyewa = new Scanner(System.in);
        System.out.println("---Penyewa Mobil");
        System.out.println("Nama = ");
        pnyw.nama_penyewa = Penyewa.nextLine();
        System.out.println("No.Hp = ");
        pnyw.no_hp = Penyewa.nextLine();
        System.out.println("Alamat = ");
        pnyw.alamat = Penyewa.nextLine();

        //Proses Pemilihan Sewa
        mobil cek = new mobil();
        System.out.println("Pilihlah jenis mobil yang akan anda sewa = ");
        cek.jenis_mobil();
        System.out.println(" ");

        try {
            File file = new File("nota.txt");
            PrintWriter output = new PrintWriter(file);
            //Menampilkan total bayar
            cek.getkeseluruhan();
            //Output Petugas Dan Penyewa
            System.out.println("----DATA PETUGAS DAN PENYEWA----");
            System.out.println("Nama Petugas = " +ptgs.getNama_petugas());
            System.out.println("No.Hp : " +ptgs.getNo_hp());
            System.out.println("---");
            System.out.println("Nama Penyewa = " +pnyw.getNama_penyewa());
            System.out.println("No Hp = " +pnyw.getNo_hp());
            System.out.println("Alamat = " +pnyw.getAlamat());

            output.println("                      NOTA SEWA MOBIL                  ");
            output.println("Data Petugas--");
            output.println("Nama Petugas            = "+ptgs.getNama_petugas());
            output.println("No Telp Petugas         = "+ptgs.getNo_hp());
            output.println("");
            output.println("--------");
            output.println("Data Penyewa--");
            output.println("Nama Penyewa            = "+pnyw.getNama_penyewa());
            output.println("Nama Telepon            = "+pnyw.getNo_hp());
            output.println("Nama Alamat             = "+pnyw.getAlamat());
            output.println("");
            output.println("--------");
            output.println("Data Unit & Rincian Harga--");
            output.println("Unit Yang Akan Disewa   = "+ Arrays.toString(cek.unit));
            output.println("Harga Sewa Unit Per-Hari= "+ Arrays.toString(cek.harga));
            output.println("Jumlah Hari Sewa        = "+ Arrays.toString(cek.jum_hari));
            output.println("Rincian Total           = "+ Arrays.toString(cek.sub_total));
            output.println("Keseluruhan Biaya       = "+cek.total_bayar);
            output.println("");
            output.println("--------");
            output.println("Simpan Bukti Sewa");
            output.println("Terima Kasih Telah Mempercayakan Kami Sebagai Pilihan Anda");
            output.close();
        }catch (FileNotFoundException e) {
            System.out.println("Melebihi batas input sewa");
        }

    }
}