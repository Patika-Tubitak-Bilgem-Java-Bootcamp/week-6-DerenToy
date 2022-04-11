package reservation.entity;


import common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import vehicle.entity.Vehicle;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation", schema = "public")
public class Reservation extends BaseEntity {

    @OneToOne
    private Vehicle vehicle;

    private LocalDate resStartDate;

    private LocalDate resFinishDate;
}
