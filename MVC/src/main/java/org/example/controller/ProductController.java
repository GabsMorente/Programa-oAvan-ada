package org.example.controller;

import org.example.model.entities.Product;
import org.example.model.repository.ProductRepository;

import java.util.List;

public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(String nome, double preco) {
        Product produto = new Product(nome, preco);
        repository.save(produto);
    }

    public List<Product> listarProdutos() {
        return repository.findAll();
    }
}
