public class Main {
    public static void main(String[] args) {
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var plus = 4;
        dog = dog + plus;
        cat = cat + plus;
        paper = paper +plus;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5; //вот тут не понял, в джаве из целочисленных дробные нельзя отнимать? должно быть (dog - 3.5)
        cat = cat - 1.6;//или менять переменную dog c var тф double или не в курсе  что тут происходит
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend + 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var massBoxer = oneBoxer + twoBoxer;
        System.out.println("Масса двух боксеров равна " + massBoxer + " кг");
        var razBox = twoBoxer - oneBoxer;
        System.out.println("Весовая разница составляет  " + razBox + " кг");
        razBox = twoBoxer % oneBoxer;//в джаве можно от дробных переменных получать целочисленный остаток?О_о
        System.out.println("Весовая разница составляет  " + razBox + " кг");
        var allTime = 640;
        var timeSmena = 8;
        var employeesInCompany = allTime / timeSmena;
        System.out.println("В компании работает  " + employeesInCompany + " сотрудников");
        employeesInCompany = employeesInCompany + 94;//по условию записываем сюда сразу + 94 человека
        timeSmena = allTime / employeesInCompany;
        System.out.println("Если в компании работает  " + employeesInCompany +  " человек то всего "
                + timeSmena + " часа работы может быть поделено между сотрудниками");



    }
}