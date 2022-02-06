package ITSchool.PetShop.entity;

import lombok.*;
import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Accessories")
public class Accessories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String colour;

    @Column
    private String petType;

    @Column
    private int price;

    @Column
    private String material;

    @Column
    private int weight;
}
