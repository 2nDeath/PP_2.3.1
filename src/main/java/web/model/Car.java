package web.model;

public class Car {
    private String model;

    private int series;

    private int weight;

    public Car() {

    }

    public Car(String model, int series, int weight) {
        this.model = model;
        this.weight = weight;
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", weight=" + weight +
                '}';
    }
}
