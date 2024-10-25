package EnigmaStore;

import java.time.LocalDate;

public class Product {
    protected Integer id;
    protected String nama;
    protected String merek;
    protected LocalDate tanggal ;




    public Product(Integer id,String nama, String merek) {
        this.id = id;
        this.nama = nama;
        this.merek = merek;
        this.tanggal = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public String getMerek() {
        return merek;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
}
