public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int    variableInt = 40000;
        byte   variableByte = 120;
        short  variableShort = -32001;
        long   variableLong = 9000000000L;
        float  variableFloat = 329.875f;
        double variableDouble = -45.78787878799;

        // примитивные целочисленные
        System.out.println("Значение переменной с типом int равно " + variableInt);
        System.out.println("Значение переменной с типом byte равно " + variableByte);
        System.out.println("Значение переменной с типом short равно " + variableShort);
        System.out.println("Значение переменной с типом long равно " + variableLong);

        // примитивные с плавающей точкой
        System.out.println("Значение переменной с типом float равно " + variableFloat);
        System.out.println("Значение переменной с типом double равно " + variableDouble);

        System.out.println("Задача 2");

        float  floatValue = 27.12f;
        long   longValue = 987678965549L;
        double doubleValue = 2.786;
        short  shortValue = 569;
        short  shortValue2 = -159;
        int    intValue = 27897;
        byte   byteValue = 67;

        // про вывод в консоль ничего не написано, но выведем
        System.out.println(floatValue + "," + longValue + "," + doubleValue + "," + shortValue + "," +
                shortValue2 + "," + intValue + "," + byteValue);
        System.out.println("...Переменные инициализированы успешно...");


        System.out.println("Задача 3");

        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergevna = 27;
        byte studentsEkaterinaAndrevna = 30;
        short boughtPaper = 480;

        // по старшинству переменных, а так же по условию (нам нужны только целые листы бумаги,
        // округленные в меньшую сторону) мы выбираем int.
        int studentPaper = boughtPaper / ( studentsLudmilaPavlovna + studentsAnnaSergevna + studentsEkaterinaAndrevna );

        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        System.out.println("Задача 4");

        byte bottlePerMinute = 16 / 2; // тут мы любим оптимизацию
        int bottlePerTwentyMinutes = bottlePerMinute * 20; // количество бутылок за 20 минут
        int bottlePerDay = bottlePerMinute * 60 * 24; // количество бутылок в день
        int bottlePer3Day = bottlePerMinute * 60 * 24 * 3; // // количество бутылок за трое суток
        int bottlePerMonth = bottlePerMinute * 60 * 24 * 31; // количество бутылок в май-месяц

        // выводим результат
        System.out.println("За двадцать минут машина произвела " + bottlePerTwentyMinutes + " штук бутылок");
        System.out.println("За одни сутки машина произвела " + bottlePerDay + " штук бутылок");
        System.out.println("За трое суток машина произвела " + bottlePer3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");

        System.out.println("Задача 5");

        // не будем представлять 2(белая) и 4(коричневая) банки краски в виде констант, будем лениться
        byte cansClass = 2 + 4;
        byte classTotal = (byte) (120 / cansClass); // делим банки для школы на банки для класса,
                                                    // и извратимся с приведением к типу

        int whiteTotal = classTotal * 2; // белой краски
        int brownTotal = classTotal * 4; // коричневой краски

        System.out.println("В школе, где "+ classTotal + " классов, нужно " +
                whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");

        System.out.println("Задача 6");

        byte bananaGram = 80;
        float milkMlGram = 105f / 100; // может и излишне, но соблюдем условие задачи про кол-во в рецепте
                                       // вычислив заранее кол-во грамм в одном милилитре
        byte iceCreamGram = 100;
        byte eggGram = 70;

        // с граммами мы будем оперировать с типом int - нам не нужно тратить лишнюю память
        int breakFastGram = (int) (5 * bananaGram +  200 * milkMlGram + 2 * iceCreamGram + 4 * eggGram);
        float breakFastKg = (float) breakFastGram / 1000; // приведем к типу float тип int

        System.out.println("Вес спортзавтрака в граммах: " + breakFastGram);
        System.out.println("Вес спортзавтрака в килограммах: " + breakFastKg);

        System.out.println("Задача 7");

        int reducePerDay250 = 7000 / 250;
        int reducePerDay500 = 7000 / 500;

        int reducePerDayMiddle = ( reducePerDay250 + reducePerDay500 ) / 2;

        System.out.println("Дней похудения по 250гр: " + reducePerDay250);
        System.out.println("Дней похудения по 500гр: " + reducePerDay500);
        System.out.println("Дней похудения среднее: " + reducePerDayMiddle);

        System.out.println("Задача 8");

        // инициализируем зарплату
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryCristy = 76230;

        // расчитаем прибавку к зарплате
        int salaryMashaInc = salaryMasha * 10 / 100;
        int salaryDenisInc = salaryDenis * 10 / 100;
        int salaryCristyInc = salaryCristy * 10 / 100;

        // заменим старую зарплату новой
        salaryMasha += salaryMashaInc;
        salaryDenis += salaryDenisInc;
        salaryCristy += salaryCristyInc;


        // выведем результат с учетом расчетов аналитика по оптимизации, приняв во мнимание расход
        // ресурса процессора на подсчет итогов годового дохода во время вывода отчета,
        // между ресурсами памяти. Победил отчет, так как руководитель редко его запрашивает
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " +
                salaryMashaInc * 12 + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " +
                salaryDenisInc * 12 + " рублей");
        System.out.println("Кристина теперь получает " + salaryCristy + " рублей. Годовой доход вырос на " +
                salaryCristyInc * 12 + " рублей");


    }
}