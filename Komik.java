//Latihan 5 Buat subclass Komik dari superclass Buku, tambahkan atribut volume, dan method getVolume
public class Komik extends Buku {
    private int volume;

    public int getVolume(){
        return this.volume;
    }

    //Latihan 7 Buat subclass Komik dari superclass Buku, buat overriding dari method naikkanHarga()
    public void naikkanHarga(){
        System.out.println("Harga komik dinaikkan");
    }
}

//Larihan 8
public class Komik extends Barang {
    private String nama;

    public String getNama(){
        return this.nama;
    }
    public void naikkanHarga(){
        System.out.println("Harga barang telah dinaikkan");
    }
}