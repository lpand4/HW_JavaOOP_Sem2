package org.example;

public class Robot extends Entity{
    public Robot(double jumpLimit, double runLimit) {
        super(jumpLimit, runLimit);
    }

    @Override
    void jump() {
        System.out.println("Робот, прыгает");
    }

    @Override
    void run() {
        System.out.println("Робот, бегает");
    }

    @Override
    boolean passingWall(Wall barrier) {
        if(jumpLimit >= barrier.height){
            System.out.println("Робот успешно перепрыгнул стену!))");
            jumpLimit *= 0.95;
            return true;
        }
        else {
            System.out.println("Роботу не хватило сил на прыжок и он рвссыпался на болтики!(((");
            return false;
        }
    }

    @Override
    boolean passingTreadmill(Treadmill barrier) {
        if(runLimit >= barrier.length){
            System.out.println("Робот успешно пробежал нужную дистанцию!))");
            runLimit -= barrier.length;
            return true;
        }
        else {
            System.out.println("Роботу не хватило сил и он ушел чиниться в мастерскую!(((");
            return false;
        }
    }
}
