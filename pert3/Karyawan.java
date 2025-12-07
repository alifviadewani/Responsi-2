class Karyawan {
    // Variabel dasar (gunakan protected agar bisa diwarisi)
    protected String nama;
    protected double gajiPokok;

    // Constructor
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan info dasar
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}
