package ServiceStation;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Check engine ");
    }
}