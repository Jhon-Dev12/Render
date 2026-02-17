package com.api.app.controller;

import com.api.app.Repository.ProductRepository;
import com.api.app.modelo.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductRepository repo;

    public ProductoController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/listar")
    public List<Producto> listar() {
        return repo.findAll();
    }
}