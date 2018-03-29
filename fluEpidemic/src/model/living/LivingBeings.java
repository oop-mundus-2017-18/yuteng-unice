package model.living;

import model.state.StateType;
import model.virus.H5N1;
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
    public Position position;
    boolean alive;

    public LivingBeings(StateType stateType, BeingType type, Position position) {
        this.type = type;
        this.virus = null;
        this.alive = true;
        this.stateType = stateType;
        this.position = position;
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
    public void setContagious() {
        stateType = StateType.CONTAGIOUS;
    }
    public void setVirus(Virus virus) {
        this.virus = virus;
    }
    public Position getPosition() {
        return position;
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

    public void show() {
        System.out.println(" StateType:" + stateType+
                "\n BeingType: " +type+
                "\n Position: " + position+
                "\n alive: "+alive);
        if (virus != null) {
            System.out.println(" Virus: " + virus.name);
        } else {
            System.out.println(" Virus: null");
        }
    }
}
