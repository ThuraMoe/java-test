public class Car {
    String type;
    String model;

    Car(String type, String model) {
        this.type = type;
        this.model = model;
    }

    Car(String data, boolean isType) {
        if (isType) {
            this.type = data;
        } else {
            this.model = data;
        }
    }

    void showInfo() {
        System.out.println("Type : " + type);
        System.out.println("Model : " + model);
    }
}
