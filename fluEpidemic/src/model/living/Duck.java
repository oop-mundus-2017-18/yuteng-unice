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
public class Duck extends Animal{
    public Duck(Position position) {
        super(BeingType.DUCK, position);
        this.type = BeingType.DUCK;
        this.virus = new H5N1();
    }
}
