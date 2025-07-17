package noemibaglieri.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "toppings")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
