public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte trashBottle = 127;
        short catsJunior = 2333;
        int cucaracha = 1234567890;
        long rangeRoad = 666L;
        System.out.println(trashBottle);
        System.out.println(catsJunior);
        System.out.println(cucaracha);
        System.out.println(rangeRoad);

        //Задача 2
        System.out.println("Задача 2");
        byte dog = 2;
        short refrigeratorTemp = -159;
        short bonfireTemp = 569;
        int rabbitPopul = 27897;
        long speedSpaceBoat = 987678965549L;
        float smTalePig = 27.12f;
        double smWightTalePig = 2.786;
        boolean dogJunior = dog< 2;

        //Задача 3
        System.out.println("Задача 3");
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int allStudent = ludmilaP + annaS + ekaterinaA;     //всего учеников
        short paper = 480;
        int paperPcs = paper / allStudent;                  //листов бумаги на ученика
        System.out.println("На каждого ученика рассчитано " + paperPcs + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        byte machineBottle = 16;
        byte minutes = 2;
        int forOneMinute = machineBottle / minutes;  //штук в минуту 8
        int firstQuest = 20;
        int for20Min = firstQuest * forOneMinute;
        System.out.println("За "+ firstQuest +" минут машина произвела бутылок " + for20Min + " штук");
        int minuteOneDay = 60 * 24;
        System.out.println("За "+ minuteOneDay +" минут машина произвела бутылок " + forOneMinute * minuteOneDay + " штук");
        int treeDay = minuteOneDay * 3;
        System.out.println("За "+ treeDay +" минут машина произвела бутылок " + forOneMinute * treeDay + " штук");
        int oneMonth = 10 * treeDay;
        System.out.println("За "+ oneMonth +" минут машина произвела бутылок " + forOneMinute * treeDay + " штук");

        //Задача 5
        System.out.println("Задача 5");
        int jarPaints = 120;
        int oneClass = jarPaints / 6;
        int whitePaint = 2;
        int brownPaint = 4;
        System.out.println("В школе, где " +oneClass +" классов, нужно "+ oneClass * whitePaint +" банок белой краски и " + oneClass * brownPaint +" банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        byte oneBanana = 80;                 //гр 1 шт
        int allBananas = oneBanana * 5;      //общий вес бананов
        short weightOfMilk = 105;            //гр
        int glassOfMilk = weightOfMilk * 2;  //вес молока
        byte oneIceCream = 100;              //гр 1 брикет
        int IceCream = oneIceCream * 2;      //гр общий вес мороженого
        byte egg = 70;                       //гр шт
        int allEgg = egg * 4;                //общий вес яиц
        System.out.println("Бананы " + allBananas + "гр");
        System.out.println("Молоко " + glassOfMilk + "гр");
        System.out.println("Мороженое пломбир " + IceCream + "гр");
        System.out.println("Яйца сырые " + allEgg + "гр");
        int allWeighProduct = allBananas + glassOfMilk + IceCream + allEgg;
        System.out.println("Общий вес продуктов " + allWeighProduct + "гр");
        float allWeightProductInKg = allWeighProduct / 1000f;
        System.out.println("Общий вес продуктов " + allWeightProductInKg + "кг");

        //Задача 7
        System.out.println("Задача 7");
        short excessWeightKg = 7;                                           //вес кг на гр
        int excessWeightGr = excessWeightKg * 1_000;
        short lightExercise = 250;
        short hardExercise = 500;
        System.out.println("Нужно сбросить " + excessWeightKg + "кг");
        int diet250 = excessWeightGr / lightExercise;
        int diet500 = excessWeightGr / hardExercise;
        System.out.println("При ежедневном сбросе веса по " + lightExercise + " грамм, понадобится " + diet250 + " дней");
        System.out.println("При ежедневном сбросе веса по " + hardExercise + " грамм, понадобится " + diet500 + " дней");
        int averageDaylyExcess = diet250 / 2 + diet500 / 2;                 //средний время для сброса дней
        int normalExercise = excessWeightGr / averageDaylyExcess;           //средний вес для сброса грамм
        int diet333 = excessWeightGr / normalExercise;
        System.out.println("При ежедневном сбросе веса по " + normalExercise + " грамм, понадобится " + diet333 + " дней");

        //Задача 8
        System.out.println("Задача 8");
        int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        float riseSalary = 0.10f;
        float a = salaryMaria * riseSalary;                              //зп для Марии
        float b = salaryDenis * riseSalary;                              //зп для Дениса
        float c = salaryKristina * riseSalary;                           //зп для Кристины
        float d = salaryMaria * riseSalary + salaryMaria;                //сумма ежегодного подъема зп Мария
        float e = salaryDenis * riseSalary + salaryDenis;                //сумма ежегодного подъема зп Денис
        float f = salaryKristina * riseSalary + salaryKristina;          //сумма ежегодного подъема зп Кристина
        System.out.println("Маша теперь получает " + d + " рублей. Годовой доход вырос на " + a +" рублей");
        System.out.println("Денис теперь получает " + e + " рублей. Годовой доход выросна " + b +" рублей");
        System.out.println("Кристина теперь получает " + f + " рублей. Годовой доход вырос на " + c +" рублей");





    }
}