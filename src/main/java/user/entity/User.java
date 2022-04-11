package user.entity;


import common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import reservation.entity.Reservation;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reservation", schema = "public")
public class User extends BaseEntity {
    private String email;
    private String username;
    private String password;

    @OneToMany
    private List<Reservation> reservation;
}
