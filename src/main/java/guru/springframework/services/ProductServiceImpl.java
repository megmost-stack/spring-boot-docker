package guru.springframework.services;


import guru.springframework.converters.AuthorMapper;
import guru.springframework.converters.CategoryMapper;
import guru.springframework.converters.ProductMapper;
import guru.springframework.domain.Author;
import guru.springframework.domain.Product;
import guru.springframework.domain.ProductCategory;
import guru.springframework.repositories.AuthorRepository;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.ProductRepository;
import guru.springframework.repositories.entities.CategoryEntity;
import guru.springframework.repositories.entities.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product getProduct(Integer id) {
        Optional<ProductEntity> byId = productRepository.findById(id.longValue());

        if(byId.isPresent()) {
            ProductEntity productEntity = byId.get();
            Product product = ProductMapper.INSTANCE.entityToProduct(productEntity);

            List<ProductCategory> productCategories = new ArrayList<>(productEntity.getCategories().size());
            productEntity.getCategories().forEach(categoryEntity -> {
               productCategories.add(CategoryMapper.INSTANCE.entityToProductCategory(categoryEntity));
            });

            Author author = AuthorMapper.INSTANCE.entityToAuthor(productEntity.getAuthor());
            product.setAuthor(author);

            return product;
        }

        return new Product();

    }

    @Override
    public List<Product> listProducts() {
        List<ProductEntity> productEntityList = productRepository.findAll();
        List<Product> productList = new ArrayList<>(productEntityList.size());
        for (ProductEntity productEntity : productEntityList) {
            Product product = ProductMapper.INSTANCE.entityToProduct(productEntity);

            Author author = AuthorMapper.INSTANCE.entityToAuthor(productEntity.getAuthor());
            product.setAuthor(author);

            Set<CategoryEntity> categoryEntities = productEntity.getCategories();
            List<ProductCategory> productCategoryList = new ArrayList<>(categoryEntities.size());
            for (CategoryEntity categoryEntity : categoryEntities) {
                productCategoryList.add(CategoryMapper.INSTANCE.entityToProductCategory(categoryEntity));
            }

            product.setProductCategories(productCategoryList);

            productList.add(product);
        }
        return List.copyOf(productList);
    }
}
