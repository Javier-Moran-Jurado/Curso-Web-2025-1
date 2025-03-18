package model.service;

import model.entities.Producto;

import java.util.List;

public interface IProductoservice {
    Producto save(Producto producto);
    void delete(Producto producto);
    Producto findById(Long id);
    Producto update(Producto producto);
    List<Producto> findAll();
}
