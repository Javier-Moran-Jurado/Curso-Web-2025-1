package model.repositories;

import model.entities.Producto;
import org.springframework.data.repository.CrudRepository;

/**@
 * Interface que hereda de CrudRepository para realizar las operaciones de CRUD sobre la entidad Producto
 * CRUD: Create, Retrieve, Update, Delete
 */

public interface IProductoRespository extends CrudRepository<Producto, Long> {
    Long Id(long id);

    Long id(long id);
}
