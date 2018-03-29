package model.world;

import model.living.LivingBeings;
import model.living.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class WorldTest {
    World world;
    @Before
    public void setUp() {
        world = new World();
    }

    @Test
    public void addBeings() {
        Position position = new Position(1, 1);
        Person person = new Person(position);
        world.addBeings(position,person);
        LivingBeings actual = world.getBeings(position).get(0);
        LivingBeings expected = person;
        assertEquals(expected, actual);
    }


}