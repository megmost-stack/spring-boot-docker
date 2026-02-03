package guru.springframework.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@ToString(exclude = "products")
@EqualsAndHashCode(exclude = "products")
@Entity
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @Column(name = "category_id")
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<ProductEntity> products = new HashSet<>();
}
