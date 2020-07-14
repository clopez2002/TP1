package Producto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {

//---------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeProducto () {

        Producto producto = new Producto("Ala Triple Accion 600 cc", 123);
        Assert.assertNotNull(producto);
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

}