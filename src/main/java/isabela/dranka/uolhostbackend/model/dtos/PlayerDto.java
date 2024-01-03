package isabela.dranka.uolhostbackend.model.dtos;

import isabela.dranka.uolhostbackend.model.GroupType;

public record PlayerDto(
        String name,
        String email,
        String phone,
        GroupType groupType
) {
}
