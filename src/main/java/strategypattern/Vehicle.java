package strategypattern;

import strategypattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    //constructor injection
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
