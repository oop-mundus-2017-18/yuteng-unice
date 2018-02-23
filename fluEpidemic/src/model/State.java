package model;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public enum State {
    HEALTHY("healthy"),
    SICK("sick"),
    CONTAGIOUS("contagious"),
    RECOVERING("recovering"),
    DEAD("dead");

    private String state = "";

    //Constructor
    State(String state) {
        this.state = state;
    }
    //Method to change status to String
    public String toString() {
        return this.state;
    }
}
