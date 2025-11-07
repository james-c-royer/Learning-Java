public class Car {
    private String model;
    private int year;
    private Engine engine;

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    String getModel(){
        return model;
    }
    int getYear(){
        return year;
    }
    Engine getEngine(){
        return engine;
    }

    void start(){
        System.out.printf("This %d %s with a %s engine is starting.%n\n", year, model, engine.getType());
    }
}