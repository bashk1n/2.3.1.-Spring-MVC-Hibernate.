package web.model;

public class Car {
    private String modelCar;

    private int price;

    private String color;

    public Car() {
    }

    public Car(String modelCar, int price, String color) {
        this.modelCar = modelCar;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return modelCar;
    }

    public void setModel(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + modelCar + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
