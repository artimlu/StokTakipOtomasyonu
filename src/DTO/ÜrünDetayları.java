package DTO;


public class ÜrünDetayları {
    private String ürünAdı;
    private int ürünMiktarı;
    private String kategoriAdı;
    
    public ÜrünDetayları(String ürünAdı, int ürünMiktarı, String kategoriAdı) {
        this.ürünAdı = ürünAdı;
        this.ürünMiktarı = ürünMiktarı;
        this.kategoriAdı = kategoriAdı;
    }

    public String getÜrünAdı() {
        return ürünAdı;
    }

    public void setÜrünAdı(String ürünAdı) {
        this.ürünAdı = ürünAdı;
    }

    public int getÜrünMiktarı() {
        return ürünMiktarı;
    }

    public void setÜrünMiktarı(int ürünMiktarı) {
        this.ürünMiktarı = ürünMiktarı;
    }

    public String getKategoriAdı() {
        return kategoriAdı;
    }

    public void setKategoriAdı(String kategoriAdı) {
        this.kategoriAdı = kategoriAdı;
    }


}
