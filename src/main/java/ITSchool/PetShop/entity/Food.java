package ITSchool.PetShop.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String foodType;

    @Column
    private String description;

    @Column
    private int weight;

    @Column
    private String flavour;

    @Column
    private String petType;
}
