package Controller;

import model.entities.Producto;
import model.service.IProductoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/producto-service")
public class ProductoRestController {

    private IProductoservice productoservice;

    @Autowired
    public ProductoRestController(IProductoservice productoservice) {
        this.productoservice = productoservice;
    }

    @GetMapping("/productos")
    public List<Producto> getProducto() {
        return productoservice.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto getProductoById(@PathVariable("id") long id){
        return productoservice.findById(id);
    }

    @PostMapping("/productos")
    public Producto save (@RequestBody Producto producto){
        return productoservice.save(producto);
    }

    @DeleteMapping("/productos")
    public void delete (@RequestBody Producto producto){
        productoservice.delete(producto);
    }

    @PutMapping("/productos")
    public Producto update (@RequestBody Producto producto){
        return productoservice.update(producto);
    }

}
