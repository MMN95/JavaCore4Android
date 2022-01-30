public class Dog extends Animal{

    protected static int dogsCount;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void swim(int meters){
        if(meters > 10)
            System.out.println("Пёс " + name + " не сможет проплыть " + meters + "м!");
        else
            System.out.println("Пёс " + name + " проплыл " + meters + "м");
    }

    @Override
    public void run(int meters){
        if (meters > 500)
            System.out.println("Пёс " + name + " не сможет пробежать " + meters + "м!");
        else
            System.out.println("Пёс " + name + " пробежал " + meters + "м");
    }

}
