package com.example;

public class Main {

    public static void main(String[] args) {

        // 🔹 Objeto con constructor por defecto
        Product product1 = new Product();
        product1.setId("P001");
        product1.setName("Laptop");
        product1.setPrice(2500.0);
        product1.setStock(10);

        Product product2 = new Product("P002", "Mouse", 80.0, 50);
        
        System.out.println("Nombre del producto 1: " + product1.getName());
        System.out.println("Precio del producto 2: " + product2.getPrice());
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
