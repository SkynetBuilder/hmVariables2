public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 100;
        short b = 10_000;
        int c = 1_000_000;
        long d = 1000000000000L;
        float e = 1.001f;
        double f = 1.0000000001;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lpClass = 23;
        byte asClass = 27;
        byte eaClass = 30;
        int allPaper = 480;
        int oneStudentPaper = allPaper / (lpClass + asClass + eaClass);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlesPerMinute = 16 / 2;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела "+ bottlesPer20Minutes + " штук бутылок");
        int bottlesPerDay =  bottlesPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела "+ bottlesPerDay + " штук бутылок");
        int bottlesPer3Days = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела "+ bottlesPer3Days + " штук бутылок");
        int bottlesPerMonth = bottlesPerDay * 30; //Для месяца в 30 дней//
        System.out.println("За месяц машина произвела "+ bottlesPerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classes = 120 / (whitePaint + brownPaint);
        int whitePaintBuckets = classes * 2;
        int brownPaintBuckets = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintBuckets + " банок белой краски и " + brownPaintBuckets +" банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milk100MlWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight= 70;
        int breakfastInGrams = bananaWeight * 5 + milk100MlWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        float breaksastInKilos = breakfastInGrams / 1_000f;
        System.out.println("В спортзавтраке " + breakfastInGrams + " г или " + breaksastInKilos + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weightToLose = 7;
        int worseDiet = weightToLose * 1000 / 250;
        int betterDiet = weightToLose * 1000 / 500;
        int averageDiet = (worseDiet + betterDiet) / 2;
        System.out.println("Cпортсмен похудеет на 7 кг за " + worseDiet + " дней, теряя по 250 грамм в день; за " + betterDiet + " дней, теряя по 500 грамм в день; за " + averageDiet + " дней в среднем");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        float mashaSalary = 67_760;
        float denisSalary = 83_690;
        float kristinaSalary = 76_230;
        float mashaAnnualSalary = mashaSalary * 12;
        float denisAnnualSalary = denisSalary * 12;
        float kristinaAnnualSalary = kristinaSalary * 12;
        mashaSalary = (mashaSalary * 0.1f)+mashaSalary;
        denisSalary = (denisSalary * 0.1f)+denisSalary;
        kristinaSalary = (kristinaSalary * 0.1f)+kristinaSalary;
        float mashaAnnualIncrease = mashaSalary * 12 - mashaAnnualSalary;
        float denisAnnualIncrease = denisSalary * 12 - denisAnnualSalary;
        float kristinaAnnualIncrease = kristinaSalary * 12 - kristinaAnnualSalary;
        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + mashaAnnualIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + denisAnnualIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей. Годовой доход вырос на " + kristinaAnnualIncrease + " рублей");
    }
}