package hiber.model;


import  javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
//@Embeddable
@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="car_model")
    public String model;
    @Column(name="car_series")
    public int series;
    public Car() {
    }
    public Car(String car_model, int car_series) {
        this.model=car_model;
        this.series=car_series;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
