package guru.springframework.converters;


import guru.springframework.domain.Product;
import guru.springframework.repositories.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper{

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "id", target="id")
    @Mapping(source = "name", target="courseName")
    @Mapping(source = "subtitle", target="courseSubtitle")
    @Mapping(source = "description", target="courseDescription")
    @Mapping(source = "imageUrl", target="imageUrl")
    @Mapping(source = "price", target="price")
    Product entityToProduct(ProductEntity productEntity);

    ProductEntity productToProductEntity(Product product);
}