package vehicle.entity;

import common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import vehicle.enums.VehicleType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicle", schema = "public")
public class Vehicle extends BaseEntity {
    private Integer dailyPrice;
    private LocalDateTime validtyStartDate;
    private LocalDateTime validtyFinishDate;
    private VehicleType type;
    private int additionalPrice;
}
