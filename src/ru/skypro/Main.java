package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char dot = 46;
        System.out.println(dot);
        System.out.println(dogIsAdult);

    // Задание 2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float bothBoxer = firstBoxer + secondBoxer;
        System.out.println("общий вес двух боксеров " + bothBoxer + "кг! ");
        float bothBoxer2 = secondBoxer - firstBoxer;
        System.out.println("разница в весе двух боксеров составляет " + bothBoxer2 + "кг! ");


    // Задача 3
        byte bananas = 5;
        byte oneBananasGram = 80;
        byte packetMilk = 2;
        byte packetOneMilkGram = 105;
        byte iceCream = 2;
        byte onePackagingIceCream = 100;
        byte egg = 4;
        byte oneEggGram = 70;
        int totalWeightGram = bananas * oneBananasGram + packetMilk * packetOneMilkGram + iceCream * onePackagingIceCream + egg * oneEggGram;
        System.out.println("общий вес в граммах составляет " + totalWeightGram + "гр ");
        double convertToKg = 1000;
        double kg = totalWeightGram / convertToKg;
        System.out.println("если граммы перевести в кг выходит что спортсмен употребил " + kg + "кг");

    // Задача 4
        short targetKg = 7;
        short targetGr = 7000;
        short weightLossMinGr = 250;
        short weightLossMaxGr = 500;
        int completeTargetMin = targetGr / weightLossMinGr;
        System.out.println("необходимое кол-во дней " + completeTargetMin);
        int completeTargetMax = targetGr / weightLossMaxGr;
        System.out.println("необходимое кол-во дней " + completeTargetMax);
        int average = (completeTargetMax + completeTargetMin) / 2;
        System.out.println("среднее количество дней необходимое для спортсмена " + average + " день");

    // Задача 5
        int wageMasha = 67760;
        int wageDenis = 83690;
        int wageKris = 76230;
        double newWageMasha = (67760 * 0.1) + wageMasha;
        System.out.println("зарплата Маши после повышения стала составлять " + newWageMasha + " рублей");
        double newWageDenis = (83690 * 0.1) + wageDenis;
        System.out.println("зарплата Дениса после повышения стала составлять " + newWageDenis + " рублей");
        double newWageKris = (76230 * 0.1) + wageKris;
        System.out.println("зарплата Кристины после повышения стала составлять " + newWageKris + " рублей");
        int annualSalaryMasha = 67760 * 12;
        int annualSalaryDenis = 83690 * 12;
        int annualSalaryKris = 76230 * 12;
        double annualSalaryMashaNew = newWageMasha * 12;
        double annualSalaryDenisNew = newWageDenis * 12;
        double annualSalaryKrisNew = newWageKris * 12;
        double differenceMasha = annualSalaryMashaNew - annualSalaryMasha;
        double differenceDenis = annualSalaryDenisNew - annualSalaryDenis;
        double differenceKris = annualSalaryKrisNew - annualSalaryKris;
        System.out.println("годовой доход Маши вырос на " + differenceMasha + " рублей");
        System.out.println("годовой доход Дениса вырос на " + differenceDenis + " рублей");
        System.out.println("годовой доход Кристины вырос на " + differenceKris + " рублей");



    }
}
