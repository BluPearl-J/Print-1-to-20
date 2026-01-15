package org.example.dtos.requests;
import lombok.Data;
@Data
public class ProductRequest {
    public String name;
    public double price;
    public int stock;
}
