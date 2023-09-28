import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Product product;

    @Before
    public void setUp() {
        product = new Product("Widget", "A small widget", "W123", 9.99);
    }

    @Test
    public void testGetName() {
        assertEquals("Widget", product.getName());
    }

    @Test
    public void testSetName() {
        product.setName("New Widget");
        assertEquals("New Widget", product.getName());
    }

    @Test
    public void testGetDescription() {
        assertEquals("A small widget", product.getDescription());
    }

    @Test
    public void testSetDescription() {
        product.setDescription("A larger widget");
        assertEquals("A larger widget", product.getDescription());
    }

    @Test
    public void testGetID() {
        assertEquals("W123", product.getID());
    }

    @Test
    public void testSetID() {
        product.setID("W456");
        assertEquals("W456", product.getID());
    }

    @Test
    public void testGetCost() {
        assertEquals(9.99, product.getCost(), 0.01);
    }

    @Test
    public void testSetCost() {
        product.setCost(19.99);
        assertEquals(19.99, product.getCost(), 0.01);
    }

    @Test
    public void testToCSVDataRecord() {
        String expectedCSV = "Widget,A small widget,W123,9.99";
        assertEquals(expectedCSV, product.toCSVDataRecord());
    }
}
