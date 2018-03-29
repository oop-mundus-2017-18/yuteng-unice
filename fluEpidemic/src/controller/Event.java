package controller;

import model.living.BeingType;
import model.living.LivingBeings;
import model.state.StateType;
import model.virus.Virus;
import model.world.Position;
import model.world.World;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class Event {
    public static void infection(World world) {
        for (Map.Entry<Position, List<LivingBeings>> entry : world.map.entrySet()) {
            for (LivingBeings beings : entry.getValue()) {
                if (beings.getVirus() != null) {
                    Virus virus = beings.getVirus();
                    for (LivingBeings person : entry.getValue()) {
                        if (person.getType().isEquals(BeingType.PERSON) && person.getStateType() == StateType.HEALTHY) {
                            if (Math.random() < virus.getInfectionRate()) {
                                person.setVirus(virus);
                                person.setContagious();
                            }
                        }
                    }
                }
            }
        }
    }
    public static void died(World world) {
        for (List<LivingBeings> beings : world.map.values()) {
            for (LivingBeings being : beings) {
                if (being.getStateType() != StateType.HEALTHY && Math.random() < being.getVirus().getMortalityRate()) {
                    being.setDead();
                }
            }
        }
    }
    public static void recover(World world) {
        for (List<LivingBeings> beings : world.map.values()) {
            for (LivingBeings being : beings) {
                if (being.getAlive() && being.getStateType() != StateType.HEALTHY ) {
                    if (--being.virus.recoverTime == 0) {
                        being.setStateType(StateType.HEALTHY);
                    }
                }
            }
        }
    }
}
