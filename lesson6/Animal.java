public class Animal {

    protected String name;
    protected static int animalsCount;

    public Animal(String name){
        this.name = name;
        animalsCount++;
    }

    public void swim(int meters){
        System.out.println(name + " проплыл " + meters + "м");
    }

    public void run(int meters){
        System.out.println(name + " пробежал " + meters + "м");
    }


}
