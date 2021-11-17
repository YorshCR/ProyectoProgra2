package Main.Tests;

import Main.java.Electrodomesticos;
import junit.framework.TestCase;

public class ElectrodomesticosTest extends TestCase {
    Electrodomesticos electrodomesticos = new Electrodomesticos();
    String TestText = "textoDePrueba";

    public void test_set_get_Marca() {
        electrodomesticos.setMarca(TestText);
        assertEquals(electrodomesticos.getmarca(), TestText);
    }

}