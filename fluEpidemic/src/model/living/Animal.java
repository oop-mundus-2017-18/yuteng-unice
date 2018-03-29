package model.living;

import model.state.StateType;
import model.world.Position;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public abstract class Animal extends LivingBeings{
    // after infected, the time of infection is increment
    private int timeInfection;
    // after contagious, the time of contagious is increment
    private int timeContagious;
     //Create a new animal at position in field.
    public Animal(BeingType beingType, Position position)
    {
        super(StateType.SICK, beingType, position);
    }

}
