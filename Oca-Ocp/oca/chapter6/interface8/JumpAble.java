package oca.chapter6.interface8;

public interface JumpAble {
    int MIN_DISTANCE = 10;
    abstract String currentPosition();
    int maxSpeed(int speed);

    default void relax(){
        System.out.println("No jumping!");
    }

    static String maxDistance(){
        return "forest";
    }

}
