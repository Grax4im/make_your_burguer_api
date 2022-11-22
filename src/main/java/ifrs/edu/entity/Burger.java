package ifrs.edu.entity;

import java.util.List;
import java.util.ArrayList;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Burger extends PanacheEntity{
    private String carne;
    private String pao;
    private List<String> opcionais = new ArrayList<>();
    private String status;
}