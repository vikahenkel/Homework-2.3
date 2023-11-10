public interface ServiceTruck {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
