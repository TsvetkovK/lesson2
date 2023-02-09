package com.tsvetkovk.lesson2;

public class MainApp {

        static class Human {
            public void drive(Car car){
                car.run();
            }

            public void drive (Skateboard skateboard){
                skateboard.runSkate();
            }

            public void drive(Bicycle bicycle) {
                bicycle.running();
            }
        }

        static class Car {
            public void run() {
                System.out.println("Машина поехали");
            }
        }

        static class Skateboard {
            public void runSkate() {
                System.out.println("Скейт поехали");
            }
        }

        static class Bicycle {
            public void running() {
                System.out.println("Велосипед поехал");
            }
        }
/*        Flyable[] flyables = {
                new Duck(),
                new Airplane()
        };

        for(Flyable f: flyables){
             f.fly();
        }

        Flyable somethingFlyable = new Duck();*/

}
