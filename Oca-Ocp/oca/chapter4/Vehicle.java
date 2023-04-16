package oca.chapter4;

public abstract class Vehicle {}
class Car extends Vehicle{}
class Bus extends Vehicle{}

class Test1{
    Vehicle[] vehicles = {new Bus(), new Car()};
}


