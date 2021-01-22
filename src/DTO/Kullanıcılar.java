package DTO;

public class Kullanıcılar {

    private int id;
    private String kullanıcıAdı;
    private String kullanıcıSifre;

    public Kullanıcılar(String kullanıcıAdı, String kullanıcıSifre) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.kullanıcıSifre = kullanıcıSifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public String getKullanıcıSifre() {
        return kullanıcıSifre;
    }

    public void setKullanıcıSifre(String kullanıcıSifre) {
        this.kullanıcıSifre = kullanıcıSifre;
    }

}
