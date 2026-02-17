package com.api.app.Repository;

import com.api.app.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto,Integer> {



}
