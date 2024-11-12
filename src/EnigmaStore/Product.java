package EnigmaStore;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Product {
    protected Integer id;
    protected String nama;
    protected String merek;
    protected Integer harga;
    protected LocalDate tanggal ;
    static  Scanner scan = new Scanner(System.in);


    public Product() {
        Random idrand = new Random();
        this.id = idrand.nextInt(100);
        this.tanggal = LocalDate.now();
    }

    public Integer getHarga() {
        return harga;
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

    public void setNama() {
        boolean isvalid = false;
        do {
            System.out.print("Masukkan Nama Barang: ");
            String name = scan.nextLine();
            if (name.isEmpty() && this.nama != null) {
                isvalid = true;
                continue;
            }
            if (name.length() < 3 || name.length() > 50) {
                System.out.println("Nama Harus Sesuai");
                continue;
            }
            isvalid = true;
            this.nama = name;
        } while (!isvalid);

    }

    public void setMerek() {
        boolean isvalid = false;
        do {
            System.out.print("Masukkan Merk Barang: ");
            String merk = scan.nextLine();
            if (merk.isEmpty() && this.merek != null) {
                isvalid = true;
                continue;
            }
            if (merk.length() < 3 || merk.length() > 30) {
                System.out.println("Merek Harus Sesuai");
                continue;
            }
            this.merek = merk;
            isvalid = true;
        } while (!isvalid);

    }

    public void setHarga() {
        boolean isvalid = false;
        do {
            System.out.print("Masukan Harga Barang :");
            String harga =  scan.nextLine();

            if (harga.isEmpty() && this.harga > 0) {
                isvalid = true;
                continue;
            }

            if(Integer.parseInt(harga)<0) {
                System.out.println("Harga harus positif");
                continue;
            }
            this.harga = Integer.parseInt(harga);
            isvalid = true;
        }
        while (!isvalid);

    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
}
