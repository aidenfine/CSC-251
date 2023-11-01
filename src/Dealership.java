public class Dealership {
    String name;
    int numOfCars;
    double avgPrice;
    int distance;
    Dealership(String name, int numOfCars, double avgPrice, int distance ){
        this.name = name;
        this.numOfCars = numOfCars;
        this.avgPrice = avgPrice;
        this.distance = distance;
    }
    void sale(){
        System.out.println(this.name + "made a sale");
    }

    void bought() {
        System.out.println(this.name + "bought a car");
        int numOfCars = this.numOfCars - 1;
        System.out.println(numOfCars + "is the new number of cars");
    }
}
