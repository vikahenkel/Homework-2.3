public class Bicycle extends Transport implements ServiceTyre {

    public Bicycle(String modelName, int wheelsCount) {
       super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void check() {
        checkTyres(this);
    }
}