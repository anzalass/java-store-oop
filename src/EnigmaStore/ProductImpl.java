package EnigmaStore;

import java.util.ArrayList;
import java.util.Random;

public class ProductImpl implements InterfaceProduct {
    ArrayList<Product> list = new ArrayList<>();

    @Override
    public void CreateProduct() {

        Product newProduct = new Product();
        newProduct.setNama();
        newProduct.setMerek();
        newProduct.setHarga();
        list.add(newProduct);
        System.out.println("Product Berhasil Ditambahkan");
    }

    @Override
    public void UpdateProduct(Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                list.get(i).setNama();
                list.get(i).setMerek();
                list.get(i).setHarga();
                return;
            }
        }


    }

    @Override
    public void DeleteProduct(Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                int del = list.indexOf(list.get(i));
                list.remove(del);
                return;

            }
        }
        System.out.println("ID tidak ditemukan");
    }


    @Override
    public void ViewAllProduct() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getMerek());
            System.out.println(list.get(i).getHarga());
            System.out.println(list.get(i).getTanggal());

        }
    }

    @Override
    public void FindByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).nama.equals(name)) {
                System.out.println(list.get(i).nama);
                System.out.println(list.get(i).merek);
                System.out.println(list.get(i).tanggal);
                System.out.println(list.get(i).harga);
            }
        }
    }
}
