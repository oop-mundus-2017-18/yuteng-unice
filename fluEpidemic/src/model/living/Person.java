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
public class Person extends LivingBeings{
    public Person(Position position) {
        super(StateType.HEALTHY, BeingType.PERSON, position);
    }
}
