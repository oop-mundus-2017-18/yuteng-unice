package model.virus;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class H5N1 extends Virus {
    public H5N1() {
        this.name = VirusType.H5N1;

        this.incubationTime = 2;
        this.recoverTime = 2;
        this.contagiousTime = 2;

        this.mortalityRate = 0.1;
        this.infectionRate = 0.1;
    }
}