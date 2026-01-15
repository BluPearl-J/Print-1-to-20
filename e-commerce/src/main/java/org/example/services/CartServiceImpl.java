public interface ProductService {
    ProductResponse add(ProductRequest request);
    ProductResponse getById(String productId);
    List<ProductResponse> getAll();
    ProductResponse delete(String productId);
    ProductResponse update(String productId, ProductRequest request);
}
