class UjiPengguna {
    public static void main(String[] args) {
        // Membuat objek pengguna
        Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60.0;
        p.tinggi = 170.0;

        // Tampilkan semua info
        p.tampilInfo();

        // Demonstrasi konstanta final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi\n");

        System.out.println("Jika kita mencoba menulis:");
        System.out.println("p.faktorAktivitas = 1.5;");
        System.out.println("\nMaka compiler akan menolak dengan error:");
        System.out.println("'cannot assign a value to final variable faktorAktivitas'");
    }
}
