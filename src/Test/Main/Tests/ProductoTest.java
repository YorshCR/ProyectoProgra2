package Main.Tests;

import Main.java.Producto;
import Main.java.Tecnologia;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

//clase para testear los metodos heredados
public class ProductoTest {
    Tecnologia producto = new Tecnologia();
    String TestText = "textoDePrueba";

    @Test
    public void set_get_Descripcion() {
        producto.setDescripcion(TestText);
        assertEquals(producto.getDescripcion(), TestText);
    }

    @Test
    public void set_get_Categoria() {
        producto.setCategoria(TestText);
        assertEquals(producto.getCategoria(), TestText);
    }

    @Test
    public void set_get_Id() {
        producto.setId(1);
        assertEquals(producto.getId(), 1);
    }

    @Test
    public void set_get_Stock() {
        producto.setStock(1);
        assertEquals(producto.getStock(), 1);
    }

    @Test
    public void set_get_Valor() {
        producto.setValor(1.1);
        assertEquals(producto.getValor(), 1.1);
    }

}