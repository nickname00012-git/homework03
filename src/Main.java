public class Main {
    public static void main(String[] args) {

        int taskN;

        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 03  >>>>");
        System.out.println();

        taskN = 0;

        // Task 1

        int     varInt;
        byte    varByte;
        short   varShort;
        long    varLong;
        float   varFloat;
        double  varDouble;

        taskN += 1;

        varInt = 65000;
        varByte = 100;
        varShort = 32000;
        varLong = 1000000000L;
        varFloat = 1.0000001f;
        varDouble = 1.000000000000001;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        System.out.println("Значение переменной 'varInt' с типом 'int' равно            " + varInt);
        System.out.println("Значение переменной 'varByte' с типом 'byte' равно          " + varByte);
        System.out.println("Значение переменной 'varShort' с типом 'varShort' равно     " + varShort);
        System.out.println("Значение переменной 'varLong' с типом 'varLong' равно       " + varLong);
        System.out.println("Значение переменной 'varFloat' с типом 'varFloat' равно     " + varFloat);
        System.out.println("Значение переменной 'varDouble' с типом 'varDouble' равно   " + varDouble);

        System.out.println();
        System.out.println();


        // Task 2

        taskN += 1;

        short varShort2;
        short varShort3;
        float varFloat2;

        varByte = 67;
        varShort = 569;
        varShort2 = -159;
        varShort3 = 27897;
        varLong = 987_678_965_549L;
        varFloat = 27.12f;
        varFloat2 = 2.786f;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        System.out.println("Значение переменной 'varByte' с типом 'byte' равно          " + varByte);
        System.out.println("Значение переменной 'varShort' с типом 'varShort' равно     " + varShort);
        System.out.println("Значение переменной 'varShort2' с типом 'varShort' равно    " + varShort2);
        System.out.println("Значение переменной 'varShort3' с типом 'varShort' равно    " + varShort3);
        System.out.println("Значение переменной 'varLong' с типом 'varLong' равно       " + varLong);
        System.out.println("Значение переменной 'varFloat' с типом 'varFloat' равно     " + varFloat);
        System.out.println("Значение переменной 'varFloat2' с типом 'varFloat' равно    " + varFloat2);

        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short pupils1;
        short pupils2;
        short pupils3;
        short allPaperSheets;
        short paperSheetsPerPupil;

        // У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        pupils1 = 23;
        pupils2 = 27;
        pupils3 = 30;
        allPaperSheets = 480;

        paperSheetsPerPupil = (short) (allPaperSheets / (pupils1 + pupils2 + pupils3));

        System.out.println("На каждого ученика рассчитано " + paperSheetsPerPupil + " листов бумаги.");

        System.out.println();
        System.out.println();


        // Task 4

        taskN += 1;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        byte bottlesPerMinute = 16/2;
        short minutesPerDay = 60*24;
        int bottlesProduced;

        bottlesProduced = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesProduced + " штук бутылок.");

        bottlesProduced = bottlesPerMinute * minutesPerDay;
        System.out.println("За 1 сутки машина произвела " + bottlesProduced + " штук бутылок.");


        bottlesProduced = bottlesPerMinute * minutesPerDay * 3;
        System.out.println("За 3 суток машина произвела " + bottlesProduced + " штук бутылок.");


        bottlesProduced = bottlesPerMinute * minutesPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesProduced + " штук бутылок.");


        System.out.println();
        System.out.println();


        // Task 5

        taskN += 1;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short numberOfClassrooms;
        short whitePaintCans;
        short brownPaintCans;
        byte numberOfPaintCans = 120;
        short whitePaintCansPerClassroom = 2;
        short brownPaintCansPerClassroom = 4;

        numberOfClassrooms = (short) (numberOfPaintCans / (whitePaintCansPerClassroom + brownPaintCansPerClassroom));
        whitePaintCans = (short) (numberOfClassrooms * whitePaintCansPerClassroom);
        brownPaintCans = (short) ( numberOfClassrooms * brownPaintCansPerClassroom);

        System.out.println("В школе, где " + numberOfClassrooms + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски.");

        System.out.println();
        System.out.println();

        // Task 6

        taskN += 1;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short massOfBananas = 5 * 80;
        short massOfMilk = 200 / 100 * 105;
        short massOfIceCream = 2 * 100;
        short massOfEggs = 4 * 70;
        short breakfastMassInGrams;
        float breakfastMassInKilograms;

        breakfastMassInGrams = (short) (massOfBananas + massOfMilk + massOfIceCream + massOfEggs);
        breakfastMassInKilograms = (float) (breakfastMassInGrams) / 1000;
        System.out.println("Вес завтрака спортсмена в граммах:      " + breakfastMassInGrams + " г");
        System.out.println("Вес завтрака спортсмена в килограммах:  " + breakfastMassInKilograms + " кг");

        System.out.println();
        System.out.println();

        // Task 7

        taskN += 1;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        short massToLossPerDay = 250;
        short massToLossInKg = 7;
        short daysToMassLoss1;
        short daysToMassLoss2;

        daysToMassLoss1 = (short) (massToLossInKg * 1000 / massToLossPerDay);
        System.out.println("Нужно дней для снижения веса на 7 кг (по " + massToLossPerDay + " гр в день):   " + daysToMassLoss1);

        massToLossPerDay = 500;
        daysToMassLoss2 = (short) (massToLossInKg * 1000 / massToLossPerDay);
        System.out.println("Нужно дней для снижения веса на 7 кг (по " + massToLossPerDay + " гр в день):   " + daysToMassLoss2);

        daysToMassLoss2 = (short) ((daysToMassLoss1 + daysToMassLoss2) / 2);
        System.out.println("В среднем нужнно дней для снижения веса на 7 кг:   " + daysToMassLoss2);

        System.out.println();
        System.out.println();

        // Task 8

        taskN += 1;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        float zpMashaCur = 67760f;
        float zpDenisCur = 83690f;
        float zpKristinaCur = 76230f;

        float zpMashaNew = zpMashaCur * 1.1f;
        float zpDenisNew = zpDenisCur * 1.1f;
        float zpKristinaNew = zpKristinaCur * 1.1f;

        float zpMashaInc = zpMashaNew * 12f - zpMashaCur * 12f;
        float zpDenisInc = zpDenisNew * 12f - zpDenisCur * 12f;
        float zpKristinaInc = zpKristinaNew * 12f - zpKristinaCur * 12f;

        System.out.println("Маша теперь получает " + zpMashaNew + " рублей. Годовой доход вырос на " + zpMashaInc + " рублей.");
        System.out.println("Денис теперь получает " + zpDenisNew + " рублей. Годовой доход вырос на " + zpDenisInc + " рублей.");
        System.out.println("Кристина теперь получает " + zpKristinaNew + " рублей. Годовой доход вырос на " + zpKristinaInc + " рублей.");

        System.out.println();
        System.out.println();


    }
}