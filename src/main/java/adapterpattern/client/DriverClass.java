package adapterpattern.client;

import adapterpattern.adaptee.WeightMachineForBabies;
import adapterpattern.adapter.WeightMachineAdapter;
import adapterpattern.adapter.WeightMachineAdapterImpl;

public class DriverClass {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
