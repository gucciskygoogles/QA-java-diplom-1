import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 0.5f);
        Assert.assertEquals(0.5f, ingredient.getPrice(), 0.0f);
    }

    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Lettuce", 0.3f);
        Assert.assertEquals("Lettuce", ingredient.getName());
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Mustard", 0.4f);
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }

}