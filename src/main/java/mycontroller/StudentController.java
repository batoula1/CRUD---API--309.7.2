package mycontroller;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class StudentController {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private Long accountNo;
    private Long marks;
}