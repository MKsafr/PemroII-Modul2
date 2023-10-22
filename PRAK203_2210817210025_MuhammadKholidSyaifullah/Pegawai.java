package PRAK203_2210817210025_MuhammadKholidSyaifullah ;

public class Pegawai {
    public String nama ;

    //Error karena char hanya bisa menyimpan 1 karakter, sedangkan kita memerlukan untuk menyimpan sebuah kalimat. Seharusnya menggunakan String
    // public char asal ;
    public String asal ;

    public String jabatan ;
    public int umur ;

    public String getNama() {
        return nama ;
    }

    public String getAsal() {
        return asal ;
    }

    //Error karena tidak ada parameter, seharusnya dituliskan
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j ;
    }
}
