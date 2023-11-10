public interface ServiceEngine {


    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
