

public class OptionalRunning {
    public static void main(String[] args) {

      Car car = new Car("Hyunda ELANTRA" , "2020");

        if(car.getModel().isPresent()){
            String model = car.getModel().get();
            System.out.println(model.toUpperCase());
        } else{
            System.out.println("model is not provided!");
        }
    }
}
