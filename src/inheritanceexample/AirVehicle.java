package inheritanceexample;

public class AirVehicle extends Vehicle{

    public void travelOnAir(){
        System.out.println("These vehicles travels on Air");
    }

    @Override
    public void start() {
        System.out.println("Air vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Air vehicle has stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Air vehicle has fueled");
    }
}
