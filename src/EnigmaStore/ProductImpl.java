package EnigmaStore;

import java.util.ArrayList;
import java.util.Random;

public class ProductImpl implements InterfaceProduct{
    ArrayList<Product> list = new ArrayList<>();

    @Override
    public void CreateProduct(Product product) {
        Random idrand = new Random();
        product.id = idrand.nextInt(100);
        list.add(product);
    }

    @Override
    public void UpdateProduct(Integer id, Product product) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).id.equals(id)) {
                int del = list.indexOf(list.get(i));
                list.remove(del);
                }
        }
        product.id = id;
        list.add(product);
    }

    @Override
    public void DeleteProduct(Integer id) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).id.equals(id)) {
                int del = list.indexOf(list.get(i));
                list.remove(del);
            }
        }
    }


    @Override
    public void ViewAllProduct() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getMerek());
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
            }
        }
    }
}
