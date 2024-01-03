package isabela.dranka.uolhostbackend.service;

import isabela.dranka.uolhostbackend.infra.CodinameHandler;
import isabela.dranka.uolhostbackend.model.GroupType;
import isabela.dranka.uolhostbackend.repositories.PlayerRepository;
import isabela.dranka.uolhostbackend.model.Player;
import isabela.dranka.uolhostbackend.model.dtos.PlayerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;
    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType) {
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
