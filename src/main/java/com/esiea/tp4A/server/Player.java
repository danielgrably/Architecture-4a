package com.esiea.tp4A.server;

import com.esiea.tp4A.domain.*;

enum PlayerStatus {
    alive,
    dead
};

public class Player {
    private final String name;
    public final PlayerStatus status;
    private MarsRover rover;

    Player(String inName) {
        name = inName;
        status = PlayerStatus.alive;
        rover = new MarsRoverMove(0, 0, Direction.NORTH);
    }

    String getName() {
        return name;
    }

    MarsRover getRover() {
        return rover;
    }

    void setRover(MarsRover newRover) {
        rover = newRover;
    }
}
