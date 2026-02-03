package guru.springframework.converters;

import guru.springframework.domain.ProductCategory;
import guru.springframework.repositories.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper{

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "name", target = "category")
    ProductCategory entityToProductCategory(CategoryEntity categoryEntity);

    CategoryEntity productCategoryToCategoryEntity(ProductCategory productCategory);
}
