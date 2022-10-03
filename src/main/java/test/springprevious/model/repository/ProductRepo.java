package test.springprevious.model.repository;

import org.springframework.data.repository.CrudRepository;

import test.springprevious.model.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
}
