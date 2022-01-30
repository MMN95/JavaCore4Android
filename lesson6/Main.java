public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Тишка");
        Cat cat3 = new Cat("Борис");
        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Мухтар");

        cat1.run(200);
        cat2.run(201);
        cat3.swim(5);

        dog1.run(501);
        dog2.run(500);
        dog1.swim(10);
        dog2.swim(11);


        //суммарный подсчёт всех животных, котов и собак
        System.out.println("\nВсего создано " + Animal.animalsCount + " животных: ");
        System.out.println("Собак: " + Dog.dogsCount + ", котов: " + Cat.catsCount);

    }

}
