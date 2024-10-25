package EnigmaStore;

public interface InterfaceProduct {

    void CreateProduct(Product product);
    void UpdateProduct(Integer id, Product product);
    void DeleteProduct(Integer id);
    void ViewAllProduct();
    void FindByName(String name);

}
