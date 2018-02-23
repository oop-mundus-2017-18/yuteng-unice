package model.virus;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public enum VirusType {
    H1N1("H1N1"),
    H5N1("H5N1");
    private String name = "";

    VirusType(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
