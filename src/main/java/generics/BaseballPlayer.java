package generics;

import lombok.Builder;

@Builder
public class BaseballPlayer extends Player {
    public BaseballPlayer(String name) {
        super(name);
    }
}
