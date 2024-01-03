package isabela.dranka.uolhostbackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import isabela.dranka.uolhostbackend.model.dtos.PlayerDto;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private String phone;
    private String codiname;
    private GroupType groupType;

    public Player(PlayerDto dto) {
        this.name = dto.name();
        this.email = dto.email();
        this.phone = dto.phone();
        this.groupType = dto.groupType();
    }
}

