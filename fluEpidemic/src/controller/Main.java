package controller;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class Main {
    public static void main(String... args) {
        InitWorld initWorld = new InitWorld();
        initWorld.init();
        initWorld.runTheWorld(2);
    }
}
