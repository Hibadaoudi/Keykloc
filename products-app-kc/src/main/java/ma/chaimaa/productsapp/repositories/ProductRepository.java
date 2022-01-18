package ma.chaimaa.productsapp.repositories;

import ma.chaimaa.productsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
