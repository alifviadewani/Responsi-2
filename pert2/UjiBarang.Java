class UjiBarang {
    public static void main(String[] args) {

        // Barang pertama: Gitar (pakai constructor 1)
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga gitar
        gitar.ubahHarga(1500000.0);

        // Tambah stok gitar
        gitar.tambahStok(5);

        // Barang kedua: Drum (data lengkap)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        // Tampilkan informasi
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
