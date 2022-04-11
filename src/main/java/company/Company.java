package company;

import common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import vehicle.entity.Vehicle;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company", schema = "public")
public class Company extends BaseEntity {

    private String city;

    @OneToMany
    private List<Vehicle> vehicle;

}
