package oops;
//3) Create a class monkey with jump ( ) and bite ( ) methods
//Create a class human which inherits this monkey class
//and implements basic animal interface with eat ( ) and sleep methods
//4) Demonstrate polymorphism using using monkey  class from Q3

class Monkey {
void jump() {
System.out.println("Jumping...");
}
void bite(){
System.out.println("Biting...");
}
}
public class Human extends Monkey {
void eat() {
System.out.println("Eating...");
}

void sleep() {
System.out.println("Sleeping...");
}

public static void main(String[] args){
Monkey ani = new Human();
ani.jump();
ani.bite();
new Human().eat();
new Human().sleep();
}
}