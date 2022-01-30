public class Cat implements Competible{

    private final int maxLength;
    private final int maxHeight;
    private String name;

    Cat(String name, int maxHeight, int maxLength){
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public void run(Blockrun treadmill){
    }

    @Override
    public void jump(Blockjump wall){
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public String getName() {
        return name;
    }
}
