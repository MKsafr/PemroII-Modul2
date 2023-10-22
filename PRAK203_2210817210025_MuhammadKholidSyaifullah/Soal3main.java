package PRAK203_2210817210025_MuhammadKholidSyaifullah ;

public class Soal3main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai() ;

        //Error karena kurangnya tanda titik koma ( ; )
        // p1.nama = "Roi"
        p1.nama = "Roi" ;

        p1.asal = "Kingdom of Orvel" ;
        p1.setJabatan("Assasin") ;

        //Seharusnya umur juga diisi variable nya
        p1.umur = 17 ;

        System.out.println("Nama Pegawai : " + p1.getNama()) ;
        System.out.println("Asal : " + p1.getAsal()) ;
        System.out.println("Jabatan : " + p1.jabatan) ;

        //Karena kita ingin mengasilkan keluaran umur yang diakhiri dengan kata "Tahun", maka teks tersebut harus dituliskan
        // System.out.println("Umur : " + p1.umur);
        System.out.println("Umur : " + p1.umur + " Tahun") ;
    }
}