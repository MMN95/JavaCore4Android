import java.util.ArrayList;

public class Box <F extends Fruit>{

    private final ArrayList<F> fruitAmount = new ArrayList<>();
    private float boxWeight = 0;

    public void addFruit(F fruit){
        fruitAmount.add(fruit);
    }

    public float getWeight(){
        boxWeight = 0;
        if(fruitAmount.size() == 0) return 0;
            for (F f : fruitAmount) {
                boxWeight += f.weight;
            }
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> box){
        return boxWeight == box.boxWeight;
    }

    public void pourFruits(Box<F> box) {
        box.fruitAmount.addAll(fruitAmount);
        fruitAmount.clear();
    }
}
