@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponse add(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setStock(request.getStock());
        Product saved = productRepository.save(product);
        return toResponse(saved);
    }

    @Override
    public ProductResponse getById(String productId) {
        return productRepository.findById(productId).map(this::toResponse).orElse(null);
    }

    @Override
    public List<ProductResponse> getAll() {
        List<ProductResponse> responses = new ArrayList<>();
        for (Product p : productRepository.findAll()) {
            responses.add(toResponse(p));
        }
        return responses;
    }

    @Override
    public ProductResponse delete(String productId) {
        Optional<Product> productOpt = productRepository.findById(productId);
        if (productOpt.isPresent()) {
            Product product = productOpt.get();
            productRepository.delete(product);
            return toResponse(product);
        }
        return null;
    }

    @Override
    public ProductResponse update(String productId, ProductRequest request) {
        Optional<Product> productOpt = productRepository.findById(productId);
        if (productOpt.isPresent()) {
            Product product = productOpt.get();
            product.setName(request.getName());
            product.setPrice(request.getPrice());
            product.setStock(request.getStock());
            Product updated = productRepository.save(product);
            return toResponse(updated);
        }
        return null;
    }

    private ProductResponse toResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        response.setStock(product.getStock());
        return response;
    }
}
