package Main.Tests;
import Main.java.Producto;
import Main.java.Tecnologia;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class TecnologiaTest {
    Tecnologia tecnologia = new Tecnologia();
    String TestText = "textoDePrueba";

    @Test
    public void set_get_Fabricante() {
        tecnologia.setFabricante(TestText);
        assertEquals(tecnologia.getFabricante(), TestText);
    }

    @Test
    public void set_get_Garantia() {
        tecnologia.setGarantia(TestText);
        assertEquals(tecnologia.getGarantia(), TestText);
    }

}