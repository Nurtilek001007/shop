package kz.shop.controller;

import kz.shop.model.Order;
import kz.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> getAllProducts() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> getProduct(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/")
    public Order createProduct(@RequestBody Order product) {
        return orderService.createOrder(product);
    }

    @PutMapping("/{id}")
    public Order updateProduct(@PathVariable Long id, @RequestBody Order product) {
        product.setId(id);
        return orderService.updateOrder(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}
