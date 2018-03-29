package model.living;

import model.virus.H1N1;
import model.world.Position;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class Pig extends Animal{
    public Pig(Position position) {
        super(BeingType.PIG, position);
        this.type = BeingType.PIG;
        this.virus = new H1N1();
    }
}
