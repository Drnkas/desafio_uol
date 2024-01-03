package isabela.dranka.uolhostbackend.infra;

import isabela.dranka.uolhostbackend.model.GroupType;
import isabela.dranka.uolhostbackend.service.CodinameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CodinameHandler {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CodinameService service;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVENGERS){
            String firstMatch = service.getAvengersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvengersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
