public class Main {
    public static void main(String[] args) {
       task8();
    }
    public static void task1() {
        byte books = 32;
        short apples = 21000;
        int forks = 9873263;
        long oranges = 8666488913L;
        float salt = 5.75f;
        double sugar = 110.230;

        System.out.println("Значение переменной books с типом byte равно " + books);
        System.out.println("Значение переменной apples с типом short равно " + apples);
        System.out.println("Значение переменной forks с типом int равно " + forks);
        System.out.println("Значение переменной oranges с типом long равно " + oranges);
        System.out.println("Значение переменной salt с типом float равно " + salt);
        System.out.println("Значение переменной sugar с типом double равно " + sugar);
    }

    public static void task2() {
        double a = 27.12;
        long b = 987_678_965_549L;
        float c = 2.786f;
        boolean e = false;
        short f = 569;
        short g = -159;
        int i = 27897;
        byte j = 67;
    }

    public static void task3() {
        int studentsClassOne = 23;
        int studentsClassTwo = 27;
        int studentsClassThree = 30;
        int sumPapers = 480;

        int sumStudens = studentsClassOne + studentsClassTwo + studentsClassThree;
        int papersForOneStudent = sumPapers / sumStudens;

        System.out.println("На каждого ученика рассчитано " + papersForOneStudent + " листов бумаги");
    }

    public static void task4() {
        int machinePerformance2Min = 16;
        int machinePerformance1Min = machinePerformance2Min / 2;
        int min20 = 20;
        int dayOne = 24 * 60;
        int daysTree = dayOne * 3;
        int month = dayOne * 30;

        int machinePerformanceMin20 = machinePerformance1Min * min20;
        int machinePerformanceDayOne = machinePerformance1Min * dayOne;
        int machinePerformanceDayTree = machinePerformance1Min * daysTree;
        int machinePerformanceMonth = machinePerformance1Min * month;

        System.out.println("За 20 минут машина произвела " + machinePerformanceMin20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + machinePerformanceDayOne + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformanceDayTree + " штук бутылок");
        System.out.println("За мксяц машина произвела " + machinePerformanceMonth + " штук бутылок");
    }

    public static void task5() {
        int sumTinOfPaint = 120;
        int tinOfWhitePaintForOneClass = 2;
        int tinOfBrownPaintForOneClass = 4;

        int sumTinOfPaintForOneClass = tinOfWhitePaintForOneClass + tinOfBrownPaintForOneClass;
        int classes = sumTinOfPaint / sumTinOfPaintForOneClass;
        int sumWhiteTinOfPaint = classes * tinOfWhitePaintForOneClass;
        int sumBrownTinOfPaint = classes * tinOfBrownPaintForOneClass;

        System.out.println("В школе, где " + classes + " классов, нужно " + sumWhiteTinOfPaint + " банок белой краски и " + sumBrownTinOfPaint + " банок коричневой краски");
    }

    public static void task6() {
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int breakfastInGrams = bananas + milk + iceCream + eggs;
        int oneKilo = 1000;
        double breakfastInKg = breakfastInGrams / (double) oneKilo;

        System.out.println("Вес завтрака в граммах = " + breakfastInGrams);
        System.out.println("Вес завтрака в граммах = " + breakfastInKg);
    }

    public static void task7() {
        int excessWeightKg = 7;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int oneKgInGram = 1000;
        int excessWeightGram = excessWeightKg * oneKgInGram;
        int daysWeightLoss1 = excessWeightGram / weightLoss1;
        int daysWeightLoss2 = excessWeightGram / weightLoss2;
        float daysMeanWeightLoss = (daysWeightLoss1 + daysWeightLoss2) / 2f;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм ему потребуется " + daysWeightLoss1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм ему потребуется " + daysWeightLoss2 + " дней");
        System.out.println("Чтобы добиться результата похудения спортсмену может потребоваться " + daysMeanWeightLoss + " день в среднем");
    }

    public static void task8() {
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        byte salaryPercent = 10;
        float valueSalaryPercent = 1 + 10 / 100f;
        float mashaSalaryNew = mashaSalary * valueSalaryPercent;
        float denisSalaryNew = denisSalary * valueSalaryPercent;
        float kristinaSalaryNew = kristinaSalary * valueSalaryPercent;
        int months = 12;
        int mashaSalaryYear = mashaSalary * months;
        float mashaSalaryYearNew = mashaSalaryNew * months;
        float mashaSalaryDifference = mashaSalaryYearNew - mashaSalaryYear;
        int denisSalaryYear = denisSalary * months;
        float denisSalaryYearNew = denisSalaryNew * months;
        float denisSalaryDifference = denisSalaryYearNew - denisSalaryYear;
        int kristinaSalaryYear = kristinaSalary * months;
        float kristinaSalaryYearNew = kristinaSalaryNew * months;
        float kristinaSalaryDifference = kristinaSalaryYearNew - kristinaSalaryYear;
        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryNew + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей.");
    }
}