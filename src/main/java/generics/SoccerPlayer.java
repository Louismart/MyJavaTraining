package generics;

import lombok.Builder;

@Builder
public class SoccerPlayer extends Player {
    public SoccerPlayer(String name) {
        super(name);
    }
}
