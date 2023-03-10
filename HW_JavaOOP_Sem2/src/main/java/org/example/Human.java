package org.example;

public class Human extends Entity{
    public Human(double jumpLimit, double runLimit) {
        super(jumpLimit, runLimit);
    }

    @Override
    void jump() {
        System.out.println("Человек, прыгает");
    }

    @Override
    void run() {
        System.out.println("Человек, бегает");
    }

    @Override
    boolean passingWall(Wall barrier) {
        if(jumpLimit >= barrier.height){
            System.out.println("Человек успешно перепрыгнул стену!))");
            jumpLimit *= 0.95;
            return true;
        }
        else {
            System.out.println("Человеку не хватило сил на прыжок и он врезался в стену!(((");
            return false;
        }
    }

    @Override
    boolean passingTreadmill(Treadmill barrier) {
        if(runLimit >= barrier.length){
            System.out.println("Человек успешно пробежал нужную дистанцию!))");
            runLimit -= barrier.length;
            return true;
        }
        else {
            System.out.println("Человеку не хватило сил и он упал прям на беговой дорожке!(((");
            return false;
        }
    }
}
