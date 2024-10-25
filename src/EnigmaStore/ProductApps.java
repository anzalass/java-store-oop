package EnigmaStore;

import java.util.Scanner;

public class ProductApps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ProductImpl service = new ProductImpl();

        while (true) {
            System.out.println("-".repeat(30));
            System.out.println("Main Menu");
            System.out.println("-".repeat(30));
            System.out.println("1. Tambah Product");
            System.out.println("2. Ubah Product");
            System.out.println("3. Hapus Product");
            System.out.println("4. Lihat Semua");
            System.out.println("5. Cari Product Berdasarkan");
            System.out.println("-".repeat(30));
            System.out.print("Masukkan Pilihanmu: ");
            int inputmenu;
            inputmenu = scan.nextInt();
            scan.nextLine();

            switch (inputmenu) {
                case 1:
                    System.out.print("Masukkan Nama Barang: ");
                    String name = scan.nextLine();

                    System.out.print("Masukkan Merk Barang: ");
                    String merk = scan.nextLine();
                    Product product = new Product(0, "anzalas", "mahal");
                    product.nama = name;
                    product.merek = merk;
                    service.CreateProduct(product);
                    break;
                case 2 :
                    System.out.print("Masukkan id yang ingin Diubah: ");
                    Integer id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Nama Barang Baru: ");
                    String namebaru = scan.nextLine(); // Membaca nama barang baru

                    System.out.print("Merk Barang Baru: ");
                    String merkbaru = scan.nextLine(); // Membaca merk barang baru

                    Product product2 = new Product(0, "anzalas", "mahal");
                    product2.nama = namebaru;
                    product2.merek = merkbaru;
                    service.UpdateProduct(id, product2);
                case 3 :
                    System.out.print("Masukkan id yang ingin Dihapus: ");
                    Integer idhapus = scan.nextInt();
                    scan.nextLine();
                    service.DeleteProduct(idhapus);
                case 4:
                    service.ViewAllProduct();
                    break;
                case 5 :
                    System.out.print("Masukkan nama yang ingin dicari : ");
                    String cariproduct = scan.nextLine();
                    service.FindByName(cariproduct);
            }
        }
    }
}
