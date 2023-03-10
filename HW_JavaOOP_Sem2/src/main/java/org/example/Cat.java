package org.example;

public class Cat extends Entity{
    public Cat(double jumpLimit, double runLimit) {
        super(jumpLimit, runLimit);
    }

    @Override
    void jump() {
        System.out.println("Кот, прыгает");
    }

    @Override
    void run() {
        System.out.println("Кот, бегает");
    }

    @Override
    boolean passingWall(Wall barrier) {
        if(jumpLimit >= barrier.height){
            System.out.println("Кот успешно перепрыгнул стену!))");
            jumpLimit *= 0.95;
            return true;
        }
        else {
            System.out.println("Коту не хватило сил на прыжок и он врезался в стену!(((");
            return false;
        }
    }

    @Override
    boolean passingTreadmill(Treadmill barrier) {
        if(runLimit >= barrier.length){
            System.out.println("Кот успешно пробежал нужную дистанцию!))");
            runLimit -= barrier.length;
            return true;
        }
        else {
            System.out.println("Коту не хватило сил и он упал прям на беговой дорожке!(((");
            return false;
        }
    }
}
