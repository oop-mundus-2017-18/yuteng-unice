package model.virus;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public abstract class Virus {
    public VirusType name;

    //潜伏期:sick but not contagious (days)
    protected int incubationTime;
    //被传染: people is contagious
    protected int contagiousTime;
    //恢复:individual is recovering
    protected int recoverTime;
    //感染率:infectionRate
    protected double infectionRate;
    //死亡率
    protected double mortalityRate;

    public double getInfectionRate() {
        return infectionRate;
    }
    public double getMortalityRate() {
        return mortalityRate;
    }
    public int getIncubationTime() {
        return incubationTime;
    }
    public int getContagiousTime() {
        return contagiousTime;
    }
    public int getRecoverTime() {
        return recoverTime;
    }
}
