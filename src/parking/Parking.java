package parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public void add(Car car) {
        if (capacity > data.size()) {
            data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        return data.removeIf(m -> m.getManufacturer().equals(manufacturer) && m.getModel().equals(model));
    }

    public Car getLatestCar() {
        Car oldestCar = null;
        for (Car car : data) {
            if (oldestCar == null || car.getYear() > oldestCar.getYear()) {
                oldestCar = car;
            }
        }
        return oldestCar;
        // или 2 вариант
       // return data.stream().max(Comparator.comparing(Car::getYear)).orElse(null);
    }

    public Car getCar(String manufacturer, String model) {
        return data.stream().filter(car -> car.getManufacturer().equals(manufacturer)
        && car.getModel().equals(model)).findFirst().orElse(null);

        //   Car result = null;
        //        for (Car car : this.data) {
        //            if (result == null || result.getYear() < car.getYear()) {
        //                result = car;
        //            }
        //        }
        //        return result;
    }

    public int getCount() {
        return data.size();
    }
    public String getStatistics() {
        StringBuilder builder = new StringBuilder(String.format("The cars are parked in %s:%n", type));
        data.forEach(e -> builder.append(e).append(System.lineSeparator()));
        return builder.toString().trim();
    }
}
