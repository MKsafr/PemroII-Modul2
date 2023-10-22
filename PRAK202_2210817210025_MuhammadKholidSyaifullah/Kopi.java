package PRAK202_2210817210025_MuhammadKholidSyaifullah ;

public class Kopi {
    String namaKopi ;
    String ukuran ;
    double harga ;
    private String Pembeli ;

    public void info() {
        System.out.println("Nama Kopi : " + namaKopi) ;
        System.out.println("Ukuran : " + ukuran) ;
        System.out.println("Harga : Rp. " + harga);
    }

    public void setPembeli(String Pembeli) {
        this.Pembeli = Pembeli ;
    }

    public String getPembeli() {
        return Pembeli ;
    }

    public double getPajak() {
        return harga * 0.11 ;
    }
}