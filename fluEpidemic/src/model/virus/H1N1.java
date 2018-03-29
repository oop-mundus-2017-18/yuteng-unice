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

        this.incubationTime = 1;//潜伏期
        this.recoverTime = 1;//恢复
        this.contagiousTime = 1;//感染

        this.mortalityRate = 0.5;//死亡率
        this.infectionRate = 0.5;//感染率
    }
}
