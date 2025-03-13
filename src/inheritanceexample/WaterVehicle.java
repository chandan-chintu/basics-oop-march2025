package inheritanceexample;

public class WaterVehicle extends Vehicle{



    public void travelOnWater(){
        super.color="White";
        System.out.println("These vehicles travels on Water");
        System.out.println(" water vehicle color is : "+super.color);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Water vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Water vehicle has stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Water vehicle has fueled");
    }
}
