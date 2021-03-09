import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskOneTest {
    private MainClass m;

    @BeforeEach
    public void init(){
        m = new MainClass();
    }

    @Test
    public void test1(){
        Assertions.assertArrayEquals(new int[]{},m.task1(new int[]{0,1,2,3,4}));
    }

    @Test
    public void test2(){
        Assertions.assertArrayEquals(new int[]{3,2,1,0},m.task1(new int[]{4,4,3,2,1,0}));
    }

    @Test
    public void test3(){
        Assertions.assertArrayEquals(new int[]{},m.task1(new int[]{1,2,3,2,1}));
    }

    @Test
    public void test4() {
        Assertions.assertThrows(RuntimeException.class, () -> m.task1(new int[]{1,2,3,2,1}));
    }

}
