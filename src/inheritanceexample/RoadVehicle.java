package inheritanceexample;

public class RoadVehicle extends Vehicle{

    public void travelOnRoad(){
        System.out.println("These vehicles travels on Road");
    }

    @Override
    public void start() {
        System.out.println("Road vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Road vehicle has stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Road vehicle has fueled");
    }
}
