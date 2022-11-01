package ServiceStation;

public interface MethodsForStation {
    default void check(){}
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default void checkEngine(){}
    default void checkTrailer(){}

}

