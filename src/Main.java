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

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.7;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Сумма весов боксёров " + totalWeight);
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разность весов боксёров " + weightDifference);
    }
    public static void task7() {
        System.out.println("Задача 7");
        var boxerWeight1 = 76.6;
        var boxerWeight2 = 78.6;
        var weightDifference1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница весов 1: " + weightDifference1);
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница весов 2: " + weightDifference2);
    }
    public static void task8() {
        System.out.println("Задача 8");
        var workingHours1 = 640;
        var workingHours2 = 8;
        var totalEmployees = workingHours1 / workingHours2;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        workingHours1 = totalEmployees * workingHours2;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + workingHours1 + " часа работы может быть поделено между сотрудниками");
    }

}