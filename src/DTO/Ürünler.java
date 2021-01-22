package DTO;

public class Ürünler {
    
    private int id;
    private String ürün_adı;
    private String ürün_kategorisi;
    private String ürün_alış_fiyatı;
    private String ürün_stok;
    private String tarih;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getÜrün_adı() {
        return ürün_adı;
    }

    public void setÜrün_adı(String ürün_adı) {
        this.ürün_adı = ürün_adı;
    }

    public String getÜrün_kategorisi() {
        return ürün_kategorisi;
    }

    public void setÜrün_kategorisi(String ürün_kategorisi) {
        this.ürün_kategorisi = ürün_kategorisi;
    }

    public String getÜrün_alış_fiyatı() {
        return ürün_alış_fiyatı;
    }

    public void setÜrün_alış_fiyatı(String ürün_alış_fiyatı) {
        this.ürün_alış_fiyatı = ürün_alış_fiyatı;
    }

    public String getÜrün_stok() {
        return ürün_stok;
    }

    public void setÜrün_stok(String ürün_stok) {
        this.ürün_stok = ürün_stok;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    

      public Ürünler(int id, String ürün_adı, String ürün_kategorisi, String ürün_alış_fiyatı, String ürün_stok, String tarih) {
        this.id = id;
        this.ürün_adı = ürün_adı;
        this.ürün_kategorisi = ürün_kategorisi;
        this.ürün_alış_fiyatı = ürün_alış_fiyatı;
        this.ürün_stok = ürün_stok;
        this.tarih = tarih;
    }
    

}