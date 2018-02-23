package model.living;

import model.StateType;
import model.virus.Virus;
import model.world.Position;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public abstract class LivingBeings {
    StateType stateType;
    BeingType type;

    Virus virus;
    Position position;
    boolean alive;

    public LivingBeings(StateType stateType, BeingType type, Position location) {
        this.type = type;
        this.virus = null;
        this.alive = true;
        this.stateType = stateType;
        setPosition(location);
    }

    //check is alive?
    public boolean isAlive() {
        return alive;
    }

    //die
    void setDead() {
        alive = false;
        if (position != null) {
            //clear map
        }
    }

    Position getLocation() {
        return position;
    }

    void setPosition(Position newPosition) {
    }

    public StateType getStateType() {
        return stateType;
    }

    public Virus getVirus() {
        return virus;
    }

    public BeingType getType() {
        return type;
    }

}
