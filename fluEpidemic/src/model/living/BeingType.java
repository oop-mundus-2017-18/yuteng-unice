package model.living;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public enum BeingType {
    PERSON("person"),
    CHICKEN("chicken"),
    DUCK("duck"),
    PIG("pig");

    private String being = "";

    BeingType(String being) {
        this.being = being;
    }
    public String toString() {
        return this.being;
    }
    public boolean isEquals(BeingType beingType) {
        return this.being.equalsIgnoreCase(beingType.toString());
    }
}
