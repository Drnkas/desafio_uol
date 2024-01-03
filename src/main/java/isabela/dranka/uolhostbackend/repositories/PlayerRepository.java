package isabela.dranka.uolhostbackend.repositories;

import isabela.dranka.uolhostbackend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {


}
