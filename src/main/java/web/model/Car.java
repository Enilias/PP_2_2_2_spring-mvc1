package web.model;
@SuppressWarnings("unused")
public class Car {
    private String brand;
    private int series;
    private int age;

    public Car(String brand, int series, int age) {
        this.brand = brand;
        this.series = series;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
