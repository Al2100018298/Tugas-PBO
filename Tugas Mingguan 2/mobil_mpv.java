public class mobil_mpv extends sewa {
    int harga;
    int lama_sewa;
    public mobil_mpv(String kd_sewa) {
        super(kd_sewa);
    }

    @Override
    public void jenis_mobil1() {
        System.out.println(" 1. Avanza, 250000/hari");
        System.out.println(" 2. X-pander, 300000/hari");
    }

    @Override
    public int total(int harga, int lama_sewa) {
        return harga * lama_sewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(int lama_sewa) {
        this.lama_sewa = lama_sewa;
    }
}