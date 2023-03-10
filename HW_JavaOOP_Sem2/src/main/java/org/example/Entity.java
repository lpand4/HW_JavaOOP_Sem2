package org.example;

public abstract class Entity {
    public double jumpLimit;
    public double runLimit;

    public Entity(double jumpLimit, double runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    abstract void jump();
    abstract void run();
    abstract boolean passingWall(Wall barrier);
    abstract boolean passingTreadmill(Treadmill barrier);



}
