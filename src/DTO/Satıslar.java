package DTO;

public class Satıslar {
    private int id;
    private String satilan_ürün;
    private int satış_miktarı;
    private int ürün_karı;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSatilan_ürün() {
        return satilan_ürün;
    }

    public void setSatilan_ürün(String satilan_ürün) {
        this.satilan_ürün = satilan_ürün;
    }

    public int getSatış_miktarı() {
        return satış_miktarı;
    }

    public void setSatış_miktarı(int satış_miktarı) {
        this.satış_miktarı = satış_miktarı;
    }

    public int getÜrün_karı() {
        return ürün_karı;
    }

    public void setÜrün_karı(int ürün_karı) {
        this.ürün_karı = ürün_karı;
    }

    public Satıslar(int id, int satış_miktarı, int ürün_karı) {
        this.id = id;
        this.satış_miktarı = satış_miktarı;
        this.ürün_karı = ürün_karı;
    }
    
}
