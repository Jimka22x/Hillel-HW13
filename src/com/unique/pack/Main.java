package com.unique.pack;

import details.Engine;
import professions.Driver;
import vehicle.Car;
import vehicle.Lorry;
import vehicle.SportCar;

public class Main {

    public static void main(String[] args) {
//     1) Автомобили. Создать класс Car в пакете vehicles, Engine в пакете details и Driver в пакете professions.
//        Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
//        Методы start (), stop(), turnRight(), turnLeft(), которые выводят на печать:
//        "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
//        А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
//        Класс Engine содержит поля: мощность, производитель.
//        Класс Driver содержит поля: ФИО, стаж вождения.
//        Создать производный от Car класс - Lorry(грузовик), характеризуемый также грузоподъемностью кузова.
//        Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
//        Пусть класс Driver расширяет класс Person.
//    2*) В класс Person вместо поля возраст добавить поле дата рождения как строка типа "18.12.1985"
//        - добавить метод который выводит количество полных лет на данным момент.
        task1();
    }

    private static void task1() {
        Driver ivan = new Driver("Ivan", "Ivanov", "Ivanovich", 15);
        System.out.println(ivan);

        Engine engine = new Engine(400, "Ford");
        System.out.println(engine);

        Car car = new Car("Honda", "C", 3200, ivan, engine);
        System.out.println(car);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();

        Lorry lorry = new Lorry("MAN", "truck", 5450, ivan, engine, 3000);
        System.out.println(lorry);

        Driver ivanProfessional = new Driver("Ivan", "Michael", "Schumacher", 37);
        Engine engineSport = new Engine(1115, "Koenigsegg");
        SportCar sportCar = new SportCar
                ("Koenigsegg", "S", 1330, ivanProfessional, engineSport, 427.2);
        System.out.println(sportCar);
    }
}
