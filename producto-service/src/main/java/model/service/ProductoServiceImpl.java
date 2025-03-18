package model.service;

import model.entities.Producto;
import model.repositories.IProductoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoservice {

    IProductoRespository productoRespository;

    @Autowired
    public ProductoServiceImpl(IProductoRespository productoRespository) {
        this.productoRespository = productoRespository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRespository.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoRespository.delete(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoRespository.findById(id).orElse(null);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRespository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRespository.findAll();
    }
}
