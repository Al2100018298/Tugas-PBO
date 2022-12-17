import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int jum, i;
        double total_bayar=0;
        //Deklarasi array
        int [] kode = new int[5];
        int [] jum_hari = new int[5];
        int [] harga = new int[5];
        double [] sub_total = new double[5];
        String [] unit = new String[5];
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
        Scanner input = new Scanner(System.in);
        mobil cek = new mobil();
        System.out.println("Pilihlah jenis mobil yang akan anda sewa = ");
        cek.jenis_mobil();
        System.out.println("Masukan Jumlah Unit Sewa : ");
        jum=input.nextInt();
        System.out.println(" ");
        //Memasukan elemen didalam array
        for (i=0; i<jum;i++){
            System.out.print("Masukan Kode unit Ke-"+(i+1)+" : ");
            kode[i]=input.nextInt();
            System.out.print("Masukan Jumlah Hari unit ke- "+(i+1)+" : ");
            jum_hari[i]=input.nextInt();
            //Menentukan barang berdasarkan kode yang dimmasukan
            switch (kode[i]) {
                case 1 -> {
                    unit[i] = "Avanza";
                    harga[i] = 300000;
                }
                //diskon[i]=0.1;
                case 2 -> {
                    unit[i] = "Innova";
                    harga[i] = 500000;
                }
                //diskon[i]=0.05;
                case 3 -> {
                    unit[i] = "Alphard";
                    harga[i] = 1000000;
                }
                //diskon[i]=0;
                case 4 -> {
                    unit[i] = "Camry";
                    harga[i] = 1000000;
                }
                //diskon[i]=0.2;
                case 5 -> {
                    unit[i] = "Pajero Sport";
                    harga[i] = 800000;
                }
                //diskon[i]=0.1;
                case 6 -> {
                    unit[i] = "Fortuner";
                    harga[i] = 800000;
                }
                //diskon[i]=0.1;
                default -> System.out.println("Kode Barang Tidak Tersedia");
            }
        }


        System.out.println(" ");
        System.out.println("No   Nama Unit     Harga           Jum_Hari    Sub Total");
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jum;i++){
            sub_total[i]=jum_hari[i]*harga[i];
            total_bayar+=sub_total[i];
            System.out.println("----DATA PETUGAS DAN PENYEWA----");
            System.out.println("Nama Petugas = " +ptgs.getNama_petugas());
            System.out.println("No.Hp : " +ptgs.getNo_hp());
            System.out.println("---");
            System.out.println("Nama Penyewa = " +pnyw.getNama_penyewa());
            System.out.println("No Hp = " +pnyw.getNo_hp());
            System.out.println("Alamat = " +pnyw.getAlamat());
            System.out.println(i+1+"    "+unit[i]+"   "+harga[i]+"    "+jum_hari[i]+"     "+sub_total[i]);
        }
        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total Bayar : "+total_bayar);
    }
}