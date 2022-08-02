public class Main {
    public static void main(String[] args) {

        //первая задача
       byte a = 121;
       short b = 433 ;
       int c = 1234;
       long d = 678957567L;

       float f = 456.34343f;
       double g = 6785.3434353656;
       boolean t = true;
       char j = 22;

       //Вторая задача
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float allBoxerWeight = firstBoxerWeight+secondBoxerWeight;// Вес двух боксеров
        System.out.println("Общий вес двух боксеров "+allBoxerWeight+" кг");
        float differenceWeight = (secondBoxerWeight%firstBoxerWeight);
        System.out.println("Разница в вессе "+differenceWeight+" кг");

        //Третья задача
        float oneBananWeight = 80;       //По заданию 5 бананов
        float onePackMilkWeight = 105;   //По заданию 2 упаковки молока
        float onePackIceCreamWeight= 100;//По заданию 2 упаковки мороженного
        float oneEgs = 70;               //По заданию 4 яйца
        float allProductForCocteilWeight= (oneBananWeight*5)+(onePackMilkWeight*2)+(onePackIceCreamWeight*2)+(oneEgs*4);
        float weightInKilogramm = allProductForCocteilWeight/1000;
        System.out.println("Общий вес завтрака "+(weightInKilogramm)+" кг");

        //Четвертая задача
        int weightLoss = 7000;//killograms
        int weightLossForDay = 250;
        int daysOfLoss = weightLoss /weightLossForDay;
        System.out.println(+daysOfLoss+ " дней нужно чтобы сбросить вес если терять в день по 250 грамм");
        int weightLossForDay2 = 500;
        int daysOfLoss2 = weightLoss /weightLossForDay2;
        System.out.println(+daysOfLoss2+ " дней нужно чтобы сбросить вес если терять в день по 500 грамм");
        int averageNumberOfCalories= (weightLossForDay+weightLossForDay2)/2;
        int averageNumberOfDays = 7000/averageNumberOfCalories;
        System.out.println(averageNumberOfDays+" Дней чтобы похудеть");

        //Пятая задача
        int mashaSalary= 67760;
        int denisSalary= 83690;
        int kristinaSalary= 76230;

        int salaryIncreasemasha = (mashaSalary/100)*10;
        int salaryIncreasedenis = (denisSalary/100)*10;
        int salaryIncreasekristina = (kristinaSalary/100)*10;
        int SalaryMashaAfterIncrease = mashaSalary+salaryIncreasemasha;
        int SalaryDenisAfterIncrease = denisSalary+salaryIncreasedenis;
        int SalaryKristinaAfterIncrease = kristinaSalary+salaryIncreasekristina;
        System.out.println("Зарплата Маши в месяц после повышения зарплаты "+SalaryMashaAfterIncrease+" руб");
        System.out.println("Зарплата Дениса в месяц после повышения зарплаты "+SalaryDenisAfterIncrease+" руб");
       System.out.println("Зарплата Кристины в месяц после повышения зарплаты "+SalaryKristinaAfterIncrease+" руб");
        int yearSalaryMasha = mashaSalary*12;
        int yearSalaryDenis = denisSalary*12;
        int yearSalaryKristina = kristinaSalary*12;



        int yearSalaryMashaAfterIncrease = SalaryMashaAfterIncrease*12;
        int yearSalaryDenisAfterIncrease = SalaryDenisAfterIncrease*12;
       int yearSalaryKristinaAfterIncrease = SalaryKristinaAfterIncrease*12;
       int mashaDifferenceSalary = yearSalaryMashaAfterIncrease%yearSalaryMasha;
       int denisDifferenceSalary =yearSalaryDenisAfterIncrease%yearSalaryDenis;
       int kristinaDifferenceSalary = yearSalaryKristinaAfterIncrease%yearSalaryKristina;
        System.out.println("Годовой доход Маши вырос на "+mashaDifferenceSalary+" руб");
        System.out.println("Годовой доход Дениса вырос на "+denisDifferenceSalary+" руб");
        System.out.println("Годовой доход Критстины вырос на "+kristinaDifferenceSalary+" руб");






















    }
}