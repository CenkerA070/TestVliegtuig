import org.junit.Assert;
import org.junit.Test;

public class VliegtuigTest {
    private Vliegtuig vliegtuig = new Vliegtuig("b", "b", 0, 0, false);
    private Vliegveld schiphol = new Vliegveld(50, true, true);

    @Test
    public void opstijgenTest() {
        // hierbij testen wij of de vliegtuig mag opstijgen of niet
        Assert.assertFalse(schiphol.kanOpstijgen(true, 1001, 49));
        Assert.assertTrue(schiphol.kanOpstijgen(true, 2000, 51));
        Assert.assertFalse(schiphol.kanOpstijgen(false, 900, 45));
        Assert.assertTrue(schiphol.kanOpstijgen(true, 500, 1250));
        Assert.assertTrue(schiphol.kanOpstijgen(true, 750, 500));
    }

    @Test
    public void landgewichtPrijsTest() {
        // hierbij testen wij de prijzen met alleen de gewichten van de lading
        schiphol.setLandToestemming(true);

        Vliegtuig v1 = new Vliegtuig("b", "b", 0, 900, false);
        Vliegtuig v2 = new Vliegtuig("b", "b", 0, 2500, false);
        Vliegtuig v3 = new Vliegtuig("b", "b", 0, 7000, false);
        Vliegtuig v4 = new Vliegtuig("b", "b", 0, 1700, false);
        Vliegtuig v5 = new Vliegtuig("b", "b", 0, 402, false);
        Vliegtuig v6 = new Vliegtuig("b", "b", 0, 4999, false);
        Vliegtuig v7 = new Vliegtuig("b", "b", 0, 1000, false);
        Vliegtuig v8 = new Vliegtuig("b", "b", 0, 10000, false);


        Assert.assertEquals(100, schiphol.landPrijs(v1), 0.001);
        Assert.assertEquals(500, schiphol.landPrijs(v2), 0.001);
        Assert.assertEquals(2500, schiphol.landPrijs(v3), 0.001);
        Assert.assertEquals(500, schiphol.landPrijs(v4),0.001);
        Assert.assertEquals(100, schiphol.landPrijs(v5),0.001);
        Assert.assertEquals(500, schiphol.landPrijs(v6),0.001);
        Assert.assertEquals(100, schiphol.landPrijs(v7),0.001);
        Assert.assertEquals(2500, schiphol.landPrijs(v8),0.001);
    }

    @Test
    public void berekenLandPrijsMetAlles() {
        // hierbij testen wij de prijzen met alles erbij
        schiphol.setLandToestemming(true);

        Vliegtuig v1 = new Vliegtuig("v1", "Duitsland", 0, 1000, true);
        Vliegtuig v2 = new Vliegtuig("v2", "Oostenrijk", 3, 900, true);
        Vliegtuig v3 = new Vliegtuig("v3", "Nederland", 1, 2500, false);
        Vliegtuig v4 = new Vliegtuig("v4", "Nederland", 500, 6000, true);
        Vliegtuig v5 = new Vliegtuig("v5", "Nederland", 0, 500, false);
        Vliegtuig v6 = new Vliegtuig("v6", "Japan", 5, 1100, true);



        Assert.assertEquals(900, schiphol.landPrijs(v1), 0.001);
        Assert.assertEquals(950, schiphol.landPrijs(v2), 0.001);
        Assert.assertEquals(605, schiphol.landPrijs(v3), 0.001);
        Assert.assertEquals(5337.5, schiphol.landPrijs(v4),0.001);
        Assert.assertEquals(121, schiphol.landPrijs(v5),0.001);
        Assert.assertEquals(1550, schiphol.landPrijs(v6),0.001);

    }





}
