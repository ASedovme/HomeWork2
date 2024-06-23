public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");


        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

    System.out.println("Задача 2");
    dog = dog +4;
    System.out.println("dog " + dog);
    cat = cat +4;
    System.out.println("cat " + cat);
    paper = paper + 4;
    System.out.println("paper " + paper);

    System.out.println("Задача 3");
    dog = dog - 3.5;
    System.out.println("dog " + dog);
    cat = cat - 1.6;
    System.out.println("cat " + cat);
    paper = paper - 7639;
    System.out.println("paper " + paper);

    System.out.println("Задача 4");
    var friend = 19;
    System.out.println(friend);
    friend = friend +2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);

    System.out.println("Задача 5");
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

    System.out.println("Задача 6");
    var boxFirst = 78.2;
    var boxSecond = 82.7;
    var boxer = boxFirst + boxSecond;
    System.out.println("Масса двух тяжелых " + boxer + "кг");

    System.out.println("Задача 7");
    boxer = boxSecond % boxFirst;
    System.out.println(boxer);

    System.out.println("Задача8");
    var allTime = 640;
    var timePeople = 8;
    var peoples = allTime / timePeople;
    System.out.println("Всего работников в компании - " + peoples + " человек");
    peoples = peoples + 94;
    allTime = peoples * timePeople;
    System.out.println("Если в компании работает " + peoples +" человек, всего " + allTime + " часов работы может быть поделено между сотрудниками");
    }}