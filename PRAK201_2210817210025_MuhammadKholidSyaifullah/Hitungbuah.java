package PRAK201_2210817210025_MuhammadKholidSyaifullah ;

public class Hitungbuah {
    String nama ;
    double berat ;
    double harga ;
    double jumlah ;
    double diskon ;

    public Hitungbuah(String nama, double berat, double harga, double jumlah) {
        this.nama = nama ;
        this.berat = berat ;
        this.harga = harga ;
        this.jumlah = jumlah ;
    }

    public void hasil() {
        System.out.println("Nama Buah : " + nama) ;
        System.out.println("Berat : " + berat) ;
        System.out.println("Harga : " + harga) ;
        System.out.println("Jumlah Beli : " + jumlah + "kg") ;
        double hargaawal = jumlah / berat * harga ;
        System.out.printf("Harga Sebelum Diskon : Rp%.2f\n", hargaawal) ;
        double diskon = harga * 0.02 * 4 * Math.floor(jumlah / 4) ;
        System.out.printf("Total Diskon : Rp%.2f\n", diskon) ;
        double hargaakhir = hargaawal - diskon ;
        System.out.printf("Harga Setelah Diskon : Rp%.2f\n\n", hargaakhir) ;
    }
}