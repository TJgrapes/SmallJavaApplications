class Car {

private int doors;

private int wheels;

private String model;

private String engine;

private String color;

public void setModel(String model) {

this.model = model;

}

public String getModel() {

return this.model;

}

}

class CarTest {

    public static void main (String[] args) {

	Car myCar = new Car();

	myCar.setModel("Buick");

	System.out.println(myCar.getModel());
        
    }
    
    
}