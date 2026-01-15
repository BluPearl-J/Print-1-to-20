public interface CartService {
    CartResponse add(CartRequest request);
    CartResponse getById(String cartId);
    List<CartResponse> getAll();
    CartResponse delete(String cartId);
}
