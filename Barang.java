// Latihan 8
public class Barang {
    private int id;
    private String nama;
    private String kategori;
    private double harga;

    //Method Constructor
    public class Barang(){
        System.out.println("Object barang telah diciptakan, conctrustor berjalan");
    } 

    //Getter untuk id, nama, kategori, harga
    public int getId(){
        return this.id;
    }
    public String getNama(){
        return this.nama;
    }
    public String getKategori(){
        return this.kategori;
    }
    public double getHarga(){
        return this.harga;
    }

    //Setter untuk id, nama, kategori, harga
    public void setId(int id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }

    //Method naikkanHarga 
    public void naikkanHarga(){
        System.out.println("Harga barang dinaikkan");
    }

    //overloading
    public void naikkanHarga(double kenaikan){
        System.out.println("Harga barang dinaikkan");
    }
}