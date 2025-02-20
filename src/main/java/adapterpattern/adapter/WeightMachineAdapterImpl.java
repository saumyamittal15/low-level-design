package adapterpattern.adapter;

import adapterpattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    //Adapter adapts adaptee
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPound() * .45;
    }
}
