package guru.springframework.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@ToString(exclude = {"author", "categories"})
@EqualsAndHashCode(exclude = {"author", "categories"}) // WICHTIG
@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    private Integer id;
    private String name;
    private String subtitle;
    private String description;
    private BigDecimal price;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<CategoryEntity> categories = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
}
