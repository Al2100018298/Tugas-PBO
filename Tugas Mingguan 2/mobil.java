public class mobil extends sewa {
    int harga;
    int lama_sewa;
    String nama_mobil;
    @Override
    public void jenis_mobil() {
        System.out.println(" 1. Avanza, 250000/hari");
        System.out.println(" 2. X-pander, 300000/hari");
        System.out.println(" 3. Fortuner, 500000/hari");
        System.out.println(" 4. Pajero, 550000/hari");
        System.out.println(" 5. Innova, 450000/hari");
        System.out.println(" 6. Supra, 900000/hari");
    }


    @Override
    double getkeseluruhan() {
        return harga*lama_sewa;
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

    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }
}