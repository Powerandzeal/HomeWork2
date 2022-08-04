public class Main {
    public static void main(String[] args) {
        task5();
    }

        public static void task1(){
        byte a = 121;
        short b = 433;
        int c = 1234;
        long d = 678957567L;

        float f = 456.34343f;
        double g = 6785.3434353656;
        boolean t = true;
        char j = 22;
    }

       public static void task2() {


           float firstBoxerWeight = 78.2f;
           float secondBoxerWeight = 82.7f;
           float allBoxerWeight = firstBoxerWeight + secondBoxerWeight;// Вес двух боксеров
           System.out.println("Общий вес двух боксеров " + allBoxerWeight + " кг");
           float differenceWeight = Math.abs(secondBoxerWeight - firstBoxerWeight);
           System.out.println("Разница в вессе " + differenceWeight + " кг");
       }

        public static void task3() {


            int banana = 5;
            int oneBananWeight = 80;

            int milk = 200/100;
            int onePackMilkWeight = 105;   //По заданию 2 упаковки молока

            int iceCreamWeight = 2;
            int onePackIceCreamWeight = 100;//По заданию 2 упаковки мороженного

            int egs = 4;
            int oneEgsWeight = 70;               //По заданию 4 яйца
            int allProductForCocteilWeight = (oneBananWeight * banana) + (onePackMilkWeight * milk) + (onePackIceCreamWeight * iceCreamWeight) + (oneEgsWeight * egs);

            int gramsInKg = 1000;
            double weightInKilogramm = allProductForCocteilWeight /(gramsInKg*1.0);
            System.out.println("Общий вес завтрака " + (weightInKilogramm) + " кг");
        }

        public static void task4 () {


            int weightLoss = 7;//killograms
            int gramsInKg = 1000;
            int weightLossForDay = 250;
            int weightIngrams = gramsInKg*weightLoss;
            int daysOfLoss = weightIngrams / weightLossForDay;
            System.out.println(+daysOfLoss + " дней нужно чтобы сбросить вес если терять в день по 250 грамм");
            int weightLossForDay2 = 500;
            int daysOfLoss2 = weightIngrams / weightLossForDay2;
            System.out.println(+daysOfLoss2 + " дней нужно чтобы сбросить вес если терять в день по 500 грамм");
            int avgDays = (daysOfLoss + daysOfLoss2) / 2;

            System.out.println(avgDays + " Дней чтобы похудеть");
        }

        public static void task5 () {

            int percent = 10;
            double multiplier = percent / (100 * 1.0);

            int mashaSalary = 67_760;
            int denisSalary = 83_690;
            int kristinaSalary = 76_230;

            int salaryIncreasemasha = (int) (mashaSalary + (mashaSalary * multiplier));
            int salaryIncreasedenis = (int) (denisSalary + (denisSalary * multiplier));
            int salaryIncreasekristina = (int) (kristinaSalary + (kristinaSalary * multiplier));

            int mashaDifference = (salaryIncreasemasha - mashaSalary) * 12;
            int denisDifference = (salaryIncreasedenis - denisSalary) * 12;
            int kristinaDifference = (salaryIncreasekristina - kristinaSalary) * 12;

            System.out.println("Зарплата Маши в месяц после повышения  " + mashaDifference + " руб."+" Годовой доход вырос на "+mashaDifference);
            System.out.println("Зарплата Дениса в месяц после повышения  " + denisDifference + " руб."+" Годовой доход вырос на "+denisDifference);
            System.out.println("Зарплата Кристины в месяц после повышения   " + kristinaDifference + " руб."+ "Годовой доход вырос на "+kristinaDifference);
        }
























}