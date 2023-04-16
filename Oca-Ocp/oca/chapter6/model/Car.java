package oca.chapter6.model;

import oca.chapter6.interface8.Alarm;
import oca.chapter6.interface8.Vehicle;

public class Car implements Vehicle, Alarm {

    private String brand;

    // constructors/getters

    @Override
    public String getBrand() {
        return brand;
    }


    public String speedUp() {
        return "The car is speeding up.";
    }

    public String slowDown() {
        return "The car is slowing down.";
    }

    public String turnAlarmOn(){
        return Alarm.super.turnAlarmOn() + " " + Vehicle.super.turnAlarmOn();
    }

    public String turnAlarmOff(){
        return Alarm.super.turnAlarmOff() + " " + Vehicle.super.turnAlarmOff();
    }
}
