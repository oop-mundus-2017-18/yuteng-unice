package model.virus;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class H1N1 extends Virus {
    public H1N1() {
        this.name = VirusType.H1N1;

        this.incubationTime = 2;
        this.recoverTime = 4;
        this.contagiousTime = 6;

        this.mortalityRate = 0.9;
        this.infectionRate = 0.85;
    }
}
