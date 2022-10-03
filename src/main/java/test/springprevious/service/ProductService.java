package test.springprevious.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.springprevious.model.entity.Product;
import test.springprevious.model.repository.ProductRepo;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public Product updateProduct(Long id, Product product){
        Product newProduct = productRepo.findById(id).get();

        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setPrice(product.getPrice());

        return productRepo.save(newProduct);
    }

    public Product findOneProduct(Long id){
        Optional<Product> product = productRepo.findById(id);
        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAllProduct(){
        return productRepo.findAll();
    }

    public void removeOneProduct(Long id){
        productRepo.deleteById(id);
    }


}