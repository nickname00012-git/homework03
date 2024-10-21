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
        float paperSheetsPerPupil;

        // У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        pupils1 = 23;
        pupils2 = 27;
        pupils3 = 30;
        allPaperSheets = 480;

        paperSheetsPerPupil = allPaperSheets / (pupils1 + pupils2 + pupils3);

        System.out.println("На каждого ученика рассчитано " + paperSheetsPerPupil + " листов бумаги.");

        System.out.println();
        System.out.println();



    }
}