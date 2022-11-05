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

        //Output petugas dan penyewa
        System.out.println("----DATA PETUGAS DAN PENYEWA----");
        System.out.println("Nama Petugas = " +ptgs.getNama_petugas());
        System.out.println("No.Hp : " +ptgs.getNo_hp());
        System.out.println("---");
        System.out.println("Nama Penyewa = " +pnyw.getNama_penyewa());
        System.out.println("No Hp = " +pnyw.getNo_hp());
        System.out.println("Alamat = " +pnyw.getAlamat());

        sewa sw = new sewa("1,2");
        Scanner sewa = new Scanner(System.in);

        //Opsi 1 mobil suv
        sewa cek = new mobil_suv("1");
        mobil_suv sv = new mobil_suv("1");
        Scanner mobil_suv = new Scanner(System.in);
        System.out.println("Pilihlah Jenis Mobil SUV Yang Akan Anda Sewa = ");
        System.out.println("Jenis suv yang dipilih = "+cek.getKd_sewa());
        cek.jenis_mobil1();

        //opsi 2 mobil mpv
        sewa tes = new mobil_mpv("2");
        mobil_mpv mv = new mobil_mpv("2");
        Scanner mobil_mpv = new Scanner(System.in);
        System.out.println("Pilihlah Jenis Mobil MPV Yang Akan Anda Sewa = ");
        System.out.println("Jenis mobil mpv yang dipilih =  "+tes.getKd_sewa());
        tes.jenis_mobil2();
    }
}