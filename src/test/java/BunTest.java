import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    @Test
    public void testGetName() {
        Bun bun = new Bun("Тест", 2.5f);
        Assert.assertEquals("Тест", bun.getName());
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun("Тест", 4.5f);
        Assert.assertEquals(4.5f, bun.getPrice(), 0.0f);
    }

}