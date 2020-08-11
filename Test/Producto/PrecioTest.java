package Producto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrecioTest {


//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDePrecio () {

        Precio precio = new Precio(166);
        Assert.assertNotNull(precio);
    }

//--------------------------------------------------

    @Test
    public void test02ObtenemosPrecio () {

        Precio precio = new Precio(256);
        Assert.assertEquals(256,precio.obtenerPrecio());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------


}