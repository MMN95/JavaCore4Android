public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else
            satiety = false;
    }

    public void catInfo(){
        if (satiety)
            System.out.println("Кот " + name + " наелся" );
        if (!satiety)
            System.out.println("Коту " + name + " не хватает еды");
    }
}
