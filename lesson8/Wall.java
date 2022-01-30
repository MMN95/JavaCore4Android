public class Wall implements Blockjump{

    private final int height;

    Wall(int height){
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }


}
