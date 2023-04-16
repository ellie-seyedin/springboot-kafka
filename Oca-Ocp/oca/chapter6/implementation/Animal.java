package oca.chapter6.implementation;

import oca.chapter6.interface8.JumpAble;
import oca.chapter6.interface8.MoveAble;

public class Animal implements JumpAble, MoveAble {
    public Animal() {
        System.out.println(JumpAble.MIN_DISTANCE);
    }

    @Override
    public String currentPosition() {
        return "Home";
    }

    @Override
    public void maxSpeed() {
        System.out.println("MAX");
    }

    @Override
    public int maxSpeed(int speed) {
        return speed * 2;
    }

    @Override
    public void relax() {
        JumpAble.super.relax();
        System.out.println("No moving!");
    }



    static class Test{
        public static void main(String[] args) {
            Animal animal = new Animal();
            System.out.println(animal.currentPosition());
            int i = animal.maxSpeed(2);
            System.out.println(i);
            animal.relax();
            String maxDistance = JumpAble.maxDistance();
            System.out.println("maxDistance = " + maxDistance);
            int distance = MoveAble.maxDistance();
            System.out.println("distance = " + distance);


        }
    }
}
