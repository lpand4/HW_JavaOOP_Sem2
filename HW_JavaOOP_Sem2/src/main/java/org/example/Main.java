package org.example;

public class Main {
    public static void main(String[] args) {
        //Инициализируем список участников
        Entity[] testers = new Entity[]{new Cat(130, 20),
                new Robot(70, 100),
                new Human(100, 3),
                new Human(90, 21)};
        //Инициализируем полосу препятствий
        Barriers[] barriersWay = new Barriers[]{new Wall(50),
                new Treadmill(4),
                new Wall(60),
                new Treadmill(15),
                new Treadmill(1.1)};

        //Проходим каждого из участников по полосе препятствий
        System.out.println("\n---------------------НАЧИНАЕМ ЗАБЕГИ!!!!---------------  \n");
        for (int k = 0; k < testers.length; k++) {
            boolean result = true;
            int count = 0;
            for (int i = 0; i < barriersWay.length; i++) {
                if (result) {
                    if (barriersWay[i] instanceof Wall) {
                        result = testers[k].passingWall((Wall) barriersWay[i]);
                    } else {
                        result = testers[k].passingTreadmill((Treadmill) barriersWay[i]);
                    }

                } else {
                    break;
                }
            }
            if (result)
                System.out.println("Тестировщик молодец, смог пройти все испытания!!!");
            else
                System.out.println("Тестировщик не справился с полосой препятствий!((");
            if (k != testers.length - 1)
                System.out.println("\n---------------------СЛЕДУЮЩИЙ ЗАБЕГ!!!!---------------  \n");
        }
        System.out.println("\nВсе забеги завершились!");
    }
}