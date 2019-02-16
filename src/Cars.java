import java.util.Objects;

public class Cars {
    int id;
    String numberOfCar;
    int id_of_Car;
    int yearOfRelease;
    String model;
    double price;
    String color;

    public Cars(int id, String numberOfCar, int id_of_Car, int yearOfRelease, String model, double price, String color) {
        this.id = id;
        this.numberOfCar = numberOfCar;
        this.id_of_Car = id_of_Car;
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return id == cars.id &&
                id_of_Car == cars.id_of_Car &&
                yearOfRelease == cars.yearOfRelease &&
                price == cars.price &&
                Objects.equals(numberOfCar, cars.numberOfCar) &&
                Objects.equals(model, cars.model) &&
                Objects.equals(color, cars.color);
    }

    @Override
    public String toString() {
        return "\n id : "+id + "\n Number: " + numberOfCar + "\n id_of_car: " + id_of_Car + "\n Year of Release: " + yearOfRelease + "\n Model: " + model + "\n Price: "+ price+"\n Color: "+ color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfCar, id_of_Car, yearOfRelease, model, price, color);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public int getId_of_Car() {
        return id_of_Car;
    }

    public void setId_of_Car(int id_of_Car) {
        this.id_of_Car = id_of_Car;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
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
}
