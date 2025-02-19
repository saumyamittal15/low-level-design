package strategypattern;

import strategypattern.strategy.DriveStrategy;
import strategypattern.strategy.NormalDriveStrategy;
import strategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
