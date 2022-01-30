public class Cat extends Animal {

    protected static int catsCount;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void swim(int meters){
        System.out.println("Кот " + name + " не умеет плавать!");
    }

    @Override
    public void run(int meters){
        if (meters > 200)
            System.out.println("Кот " + name + " не сможет пробежать " + meters + "м!");
        else
            System.out.println("Кот " + name + " пробежал " + meters + "м");
    }
}
