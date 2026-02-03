package guru.springframework.converters;

import guru.springframework.domain.Author;
import guru.springframework.repositories.entities.AuthorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Mapping(source="firstname", target="firstName")
    @Mapping(source="lastname", target="lastName")
    @Mapping(source="imageUrl", target="image")
    Author entityToAuthor(AuthorEntity authorEntity);

    AuthorEntity authorToAuthorEntity(Author author);
}
