import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTwoTest {
    private MainClass m;

    @BeforeEach
    public void init(){
        m = new MainClass();
    }

    @Test
    public void test1() {
        Assertions.assertTrue(m.task2(new int[]{1,4,1,4}));
    }

    @Test
    public void test2(){
        Assertions.assertFalse(m.task2(new int[]{1,2,3,4}));
    }

    @Test
    public void test3(){
        Assertions.assertFalse(m.task2(new int[]{1,1,1,1}));
    }

    @Test
    public void test4(){
        Assertions.assertFalse(m.task2(new int[]{4,4,4,4}));
    }

}
