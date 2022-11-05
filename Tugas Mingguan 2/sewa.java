public class sewa {
    String kd_sewa;

    public int total(int harga, int lama_sewa) {
        System.out.println("-");
        return 0;
    }
    public void jenis_mobil1(){
        System.out.println("Anda akan menyewa mobil mpv jenis = ");
    }
    public void jenis_mobil2(){
        System.out.println("Anda akan menyewa mobil suv jenis = ");
    }

    public sewa(String kd_sewa) {
        this.kd_sewa = kd_sewa;
    }

    public String getKd_sewa() {
        return kd_sewa;
    }

    public void setKd_sewa(String kd_sewa) {
        this.kd_sewa = kd_sewa;
    }
}