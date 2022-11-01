package ServiceStation;

public class Truck extends Car {

    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    public void checkTrailer(){
        System.out.println("Check trailer");
    }
}
