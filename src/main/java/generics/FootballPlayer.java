package generics;

import lombok.Builder;

@Builder
public class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }
}
