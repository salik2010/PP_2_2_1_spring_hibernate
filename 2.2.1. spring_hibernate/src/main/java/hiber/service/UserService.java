package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void add1(Car car);
    List<User> listUsers();
    List<User> select(String model,int series);
}
