package ServiceStation;

public class ServiceStation {
    public static void main(String[] args) {
        MethodsForStation car = new Car("Mersedes",4);
        MethodsForStation car2 = new Car("KIA",4);
        MethodsForStation bicycle = new Bicycle("Forward", 2);
        MethodsForStation bicycle2 = new Bicycle("Stels", 2);
        car2.check();
    }
}

