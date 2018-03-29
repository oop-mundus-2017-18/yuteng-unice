package model.world;

import model.living.LivingBeings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
//map
public class World {
    public static final int WORLDSIZE = 5;
    public Map<Position,List<LivingBeings>> map;
    //create the world map
    public World() {
        map = new HashMap<>();
        for (int i = 0; i < WORLDSIZE; i++) {
            for (int j = 0 ; j < WORLDSIZE; j++) {
                Position position = new Position(i, j);
                List<LivingBeings> beings = new ArrayList<LivingBeings>();
                map.put(position, beings);
            }
        }
    }

    public void addBeings(Position position, LivingBeings beings) {
        for (Position p : map.keySet()) {
            if (p.equals(position)) {
                map.get(p).add(beings);
            }
        }
    }

    public List<LivingBeings> getBeings(Position position) {
        for (Position p : map.keySet()) {
            if (p.equals(position)) {
                return map.get(p);
            }
        }
        return null;
    }
}