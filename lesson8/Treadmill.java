public class Treadmill implements Blockrun{

    private final int length;

    Treadmill(int length){
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }


}
