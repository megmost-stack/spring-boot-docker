package guru.springframework.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString(exclude = "products")
@EqualsAndHashCode(exclude = "products") // WICHTIG
@Entity
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;

    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<ProductEntity> productEntities;
}
