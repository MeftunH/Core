package SOLID;

public class IOC {
    interface Car {
        void drive();
    }
    interface Engine {
        String start();
    }
    class DieselEngine implements Engine {

        @Override
        public String start() {
            return "Diesel Engine started.";
        }
    }
    class ElectricEngine implements Engine {

        @Override
        public String start() {
            return "Electric Engine started.";
        }
    }
    class GasolineEngine implements Engine {

        @Override
        public String start() {
            return "Gasoline Engine started.";
        }
    }
    //--------------------------------------------------------------------------------
    class AutoCar implements Car {

        Engine engine;
        Car car = new AutoCar(engine);
        public AutoCar(Engine engine) {
            this.engine = engine;
        }

        @Override
        public void drive() {

            String engineStart = engine.start();

        }
    }
}
