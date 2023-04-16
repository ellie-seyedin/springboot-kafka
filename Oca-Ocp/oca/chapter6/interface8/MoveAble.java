package oca.chapter6.interface8;

public interface MoveAble {
    String MIN_DISTANCE = "SMALL";
    abstract String currentPosition();
    void maxSpeed();
    default void relax(){
        System.out.println("No moving!");
    }

    static int maxDistance(){
        return 100;
    }
}
