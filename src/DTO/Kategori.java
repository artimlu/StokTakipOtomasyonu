package DTO;

public class Kategori {

    public Kategori(String kategoriAd) {
        this.kategoriAd = kategoriAd;
    }
    private int id;
    private String kategoriAd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoriAd() {
        return kategoriAd;
    }

    public void setKategoriAd(String kategoriAd) {
        this.kategoriAd = kategoriAd;
    }
}
