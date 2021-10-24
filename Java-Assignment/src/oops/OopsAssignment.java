package oops;

abstract class Vehicle {
    int speed;
    long distance;
    Vehicle() {
        speed = 40;
        distance = 200;
    }
    Vehicle(int speed, int distance){
        this.speed = speed;
        this.distance = distance;
    }

    abstract public void run();
    abstract public void stop();

    public void fuel(int rate){
        System.out.println("Rate of Fuel : "+ rate);
    }
    public void fuel(int rate, String type){
        System.out.println("Rate of Fuel :"+ rate +" & Type of Fuel: "+ type);

    }
    public void fuel(char grade, int rate){
        System.out.println("Grade of Fuel: "+ grade + " & Rate of Fuel: "+ rate);

    }
    void display(){
        System.out.println("Vehicle Standard Speed: "+ speed);
        System.out.println("Distance Covered: "+ distance);
    }
}

//  *********************** 2 Wheeler **********************************:
 class TwoWheeler extends Vehicle {

    int noOfTyres;
    TwoWheeler(){
        speed = 20;
        distance = 100;
        noOfTyres = 2;
    }

    public void run(){
        System.out.println("Vehicle is running...");
    }
    public void stop(){
        System.out.println("Vehicle is stopped...");
    }

    public void display(){
        System.out.println("Number of tyres: "+ noOfTyres);
        System.out.println("Speed of TwoWheeler: "+ speed);
        System.out.println("Distance covered by TwoWheeler: "+ distance);
        System.out.println("Standard Speed: "+ super.speed);
        System.out.println("Distance to be covered by Vehicles: "+ super.distance);
    }
}

//************************ 3 Wheeler *******************************
 class ThreeWheeler extends Vehicle {

    int noOfTyres;
     ThreeWheeler(){
        speed = 30;
         distance = 150;
         noOfTyres = 3;
    }

    public void run(){
        System.out.println("Vehicle is running...");
    }
    public void stop(){
        System.out.println("Vehicle is stopped...");
    }

    void display(){
        System.out.println("Number of tyres: "+ noOfTyres);
        System.out.println("Speed of ThreeWheeler: "+ speed);
        System.out.println("Distance covered by ThreeWheeler: "+ distance);
        System.out.println("Standard Speed: "+ super.speed);
        System.out.println("Distance to be covered by Vehicles: "+ super.distance);
    }
}
//************************ 4 Wheeler *******************************
 class FourWheeler extends Vehicle {

    int noOfTyres;
    FourWheeler(){
        speed = 60;
        distance = 200;
        noOfTyres = 4;
    }

    public void run(){
        System.out.println("Vehicle is running...");
    }
    public void stop(){
        System.out.println("Vehicle is stopped...");
    }

    void display(){
        System.out.println("Number of tyres: "+ noOfTyres);
        System.out.println("Speed of Four Wheeler: "+ speed);
        System.out.println("Distance covered by Four Wheeler: "+ distance);
        System.out.println("Standard Speed: "+ super.speed);
        System.out.println("Distance to be covered by Vehicles: "+ super.distance);
    }
}
//************************ 8 Wheeler *******************************
 class EightWheeler extends Vehicle {

    int noOfTyres;
    EightWheeler(){
        speed = 70;
        distance = 1800;
        noOfTyres = 8;
    }

    public void run(){
        System.out.println("Vehicle is running...");
    }
    public void stop(){
        System.out.println("Vehicle is stopped...");
    }

    void display(){
        System.out.println("Number of tyres: "+ noOfTyres);
        System.out.println("Speed of Eight Wheeler: "+ speed);
        System.out.println("Distance covered by Eight Wheeler: "+ distance);
        System.out.println("Standard Speed: "+ super.speed);
        System.out.println("Distance to be covered by Vehicles: "+ super.distance);
    }
}

public class OopsAssignment{
    public static void main(String[] args) {
       Vehicle veh;
       System.out.println("---------------- 2 _wheeler -----------");
        veh = new TwoWheeler();
        veh.display();
        veh.run();
        veh.stop();
        veh.fuel(154);
        veh.fuel(154, "Petrol");
        veh.fuel('A', 154);
        System.out.println("---------------- 3 _wheeler -----------");
        veh = new ThreeWheeler();
        veh.display();
        veh.run();
        veh.stop();
        veh.fuel(140);
        veh.fuel(140, "Diesel");
        veh.fuel('C', 140);
        System.out.println("---------------- 4 _wheeler -----------");
        veh = new FourWheeler();
        veh.display();
        veh.run();
        veh.stop();
        veh.fuel(160);
        veh.fuel(160, "Diesel");
        veh.fuel('B', 160);
        System.out.println("---------------- 8 _wheeler -----------");
        veh = new EightWheeler();
        veh.display();
        veh.run();
        veh.stop();
        veh.fuel(190);
        veh.fuel(190, "Diesel");
        veh.fuel('A', 190);

    }
}