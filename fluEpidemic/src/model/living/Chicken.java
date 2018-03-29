package model.living;

import model.virus.H5N1;
import model.world.Position;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class Chicken extends Animal{
    public Chicken(Position position) {
        super(BeingType.CHICKEN, position);
        this.type = BeingType.CHICKEN;
        this.virus = new H5N1();
    }
}
