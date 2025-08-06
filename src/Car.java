public class Car {
    String model;
    String color;

    //constrcutor
    Car(String model, String color){
        this.model = model;
        this.color = color;

    }
    //method
    void drive(){
        System.out.println("You drive a "+ this.color +" "+ this.model);
    }
}
