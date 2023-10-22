package PRAK201_2210817210025_MuhammadKholidSyaifullah ;

public class Main {
    public static void main(String[] args) {
        Hitungbuah buah1 = new Hitungbuah("Apel", 0.4, 7000, 40) ;
        Hitungbuah buah2 = new Hitungbuah("mangga", 0.2, 3500, 15) ;
        Hitungbuah buah3 = new Hitungbuah("alpukat", 0.25, 10000, 12) ;

        buah1.hasil() ;
        buah2.hasil() ;
        buah3.hasil() ;
    }
}