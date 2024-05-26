package kz.shop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(min = 2, max = 50, message = "size must be between 2 and 50")
    private String name;
    @Min(value = 0, message = "minimum is 0")
    private int quantity;
    @Min(value = 0, message = "minimum is 0")
    private double price;
}
