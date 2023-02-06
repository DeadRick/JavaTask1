package org.example;

// У нас есть аэропорт, который принимал только Европейские авиалинии
// Однако из-за того, что клиенты захотели напрямую летать до Америки,
// у нас возникла проблема...
// В наших самолетах объем топлива измерялся в ЛИТРАХ, однако при
// появлении американских авиалиний, пришлось считать кол-во топлива в
// ГАЛЛОНАХ. Теперь сотрудники путаются и им приходится обращаться к нашей программе, чтобы узнать
// Хватит ли топлива для американского самолёта?

public class Main {
    public static void main(String[] args) {
        Liter liter = new Liter(100);
        Airplane airplane = new Airplane(100);

        if (airplane.isEnough(liter)) {
            System.out.println("В самолет объемом 100 литров хватает топлива! (100 литров)\n");
        } else {
            System.out.println("Топлива не хватает.\n");
        }

        Gallon gallonLot = new Gallon(500);
        Gallon gallonFew = new Gallon(50);

        // Применение адаптера:

        GallonToLiterAdapter gallonLotAdapter = new GallonToLiterAdapter(gallonLot);
        GallonToLiterAdapter gallonFewAdapter = new GallonToLiterAdapter(gallonFew);

        System.out.println("500 Галлонов достаточно, чтобы заправить самолет объемом 100 литров?\n");
        if (airplane.isEnough(gallonLotAdapter)) {
            System.out.println("Столько галлонов достаточно для заправки самолёта!\n");
        } else {
            System.out.println("Столько галлонов НЕ достаточно для заправки самолёта!\n");
        }

        System.out.println("\n50 Галлонов достаточно, чтобы заправить самолет объемом 100 литров?\n");
        if (airplane.isEnough(gallonFewAdapter)) {
            System.out.println("Столько галлонов достаточно для заправки самолёта!\n");
        } else {
            System.out.println("Столько галлонов НЕ достаточно для заправки самолёта!\n");
        }
    }
}