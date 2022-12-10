import java.util.Scanner;
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

        //Opsi 1 mobil suv
        mobil cek = new mobil();
        Scanner mobil = new Scanner(System.in);
        System.out.println("Pilihlah jenis mobil yang akan anda sewa = ");
        cek.jenis_mobil();
        System.out.println("Nama Mobil = ");
        cek.nama_mobil= mobil.nextLine();
        System.out.print("Masukkan harga sewa mobil : ");
        //output harga
        cek.harga= (int) mobil.nextDouble();
        System.out.println("Masukkan lama hari : ");
        cek.lama_sewa= (int) mobil.nextDouble();

        //Output
        System.out.println("----DATA PETUGAS DAN PENYEWA----");
        System.out.println("Nama Petugas = " +ptgs.getNama_petugas());
        System.out.println("No.Hp : " +ptgs.getNo_hp());
        System.out.println("---");
        System.out.println("Nama Penyewa = " +pnyw.getNama_penyewa());
        System.out.println("No Hp = " +pnyw.getNo_hp());
        System.out.println("Alamat = " +pnyw.getAlamat());
        //output harga
        System.out.println("--------------------");
        System.out.println("Harga sewa : " + cek.getHarga());
        System.out.println("Lama sewa : "+ cek.getLama_sewa());
        System.out.println("Keseluruhan biaya : "+ cek.getkeseluruhan());
    }
}