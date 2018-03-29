package controller;

import model.living.*;
import model.world.Position;
import model.world.World;

import java.util.List;
import java.util.Random;

import static model.world.World.WORLDSIZE;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class InitWorld {
    World world;
    public  void init() {
        world = new World();
        for (int i = 0; i < 30; i++) {
            addPerson();
            addPig();
            addChiken();
            addDuck();
        }
        showTheWorld();
    }

    public void runTheWorld(int times) {
        System.out.println("!!!!!!!!!!!!!!! Run The World !!!!!!!!!!!!!!!!!!!!!!");
        for (int i = 0; i < times; i++) {
            oneDay();//move position
            Event.infection(world); // infecter the person
            Event.died(world);//kill beings
            Event.recover(world);
            showTheWorld();
        }
    }

    public void addPerson() {
        Random random = new Random();
        Position position = new Position(random.nextInt(WORLDSIZE), random.nextInt(WORLDSIZE));
        Person person = new Person(position);
        world.addBeings(position,person);
    }
    public void addPig() {
        Random random = new Random();
        Position position = new Position(random.nextInt(WORLDSIZE), random.nextInt(WORLDSIZE));
        Pig pig = new Pig(position);
        world.addBeings(position,pig);
    }
    public void addDuck() {
        Random random = new Random();
        Position position = new Position(random.nextInt(WORLDSIZE), random.nextInt(WORLDSIZE));
        Duck duck = new Duck(position);
        world.addBeings(position,duck);
    }
    public void addChiken() {
        Random random = new Random();
        Position position = new Position(random.nextInt(WORLDSIZE), random.nextInt(WORLDSIZE));
        Chicken chicken = new Chicken(position);
        world.addBeings(position,chicken);
    }

    public void oneDay() {
        World tmpWorld = new World();
        for (List<LivingBeings> beings : world.map.values()) {
            for (LivingBeings being : beings) {
                being.position.changePosition();
                tmpWorld.addBeings(being.position,being);
            }
        }
        world = tmpWorld;
    }
    public void showTheWorld() {
        for (List<LivingBeings> beings : world.map.values()) {
            for (LivingBeings being : beings) {
                being.show();
                System.out.println();
            }
        }
    }
}
