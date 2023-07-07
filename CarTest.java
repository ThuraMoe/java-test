public class CarTest {

    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "2019");
        toyota.showInfo();

        Car fit = new Car("fit", "2018");
        fit.showInfo();

        Car honda = new Car("honda", true);
        honda.showInfo();
    }
    
}
