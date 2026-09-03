package car.example.constructor.injection;

public class Car {
    private Specifications spf;

    public Car(Specifications spf) {
        this.spf = spf;
    }

    public void displayDetails(){
        System.out.println("Car Details : "+ spf.toString());
    }
}
