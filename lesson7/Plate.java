public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Еды в тарелке: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if ((food -= n) < 0){
            food += n;
        }
    }

    public void addFood(int foodCount){
        setFood(foodCount + food);
    }

}
