package Producto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrecioTest {

//---------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDePrecio () {

        Precio precio = new Precio(60);
        Assert.assertNotNull(precio);
    }

//---------------------------------------------------------

    @Test
    public void test02ObtenemosPrecio () {

        Precio precio = new Precio(125);
        Assert.assertEquals(125,precio.obtenerPrecio());
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

}