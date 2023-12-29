package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("company","model",2023);
        motorcycle = new Motorcycle("company","model",2023);
    }

//    *Задание 1.
//    Проект Vehicle. Написать следующие тесты с использованием JUnit5:

//    - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void CarIsVehicle() {
        assertInstanceOf(Vehicle.class,car);
    }

//    - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void CarHaveFourWheels() {
        assertEquals(4,car.getNumWheels());
    }

//    - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleHaveTwoWheels() {
        assertEquals(2,motorcycle.getNumWheels());
    }

//    - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void CarTestDrive() {
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }

//    - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void MotorcycleTestDrive() {
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }

//    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void CarParking() {
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }

//    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void MotorcycleParking() {
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }


}