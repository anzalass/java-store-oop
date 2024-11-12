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
                    service.CreateProduct();
                    break;
                case 2 :
                    System.out.print("Masukkan id yang ingin Diubah: ");
                    Integer id = scan.nextInt();
                    scan.nextLine();
                    service.UpdateProduct(id);
                    break;
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
