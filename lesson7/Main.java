
public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(10);
        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Рыжик", 15);
        cats[1] = new Cat("Васька", 3);
        cats[2] = new Cat("Мурзик", 2);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.catInfo();
            plate.info();
        }

        plate.addFood(5);
        plate.info();

    }
}
