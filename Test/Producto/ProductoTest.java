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

    @Test
    public void test02ObtenemosNombreDelProducto () {

        Producto unProducto = new Producto("Samsung S6",49999);
        Assert.assertEquals("Samsung S6",unProducto.getProductName());
    }

//---------------------------------------------------------

    @Test
    public void test03ObtenemosPrecioDelProducto () {

        Producto unProducto = new Producto("Samsung S6",49999);
        Assert.assertEquals(49999,unProducto.getPrecio(),0);
    }

//---------------------------------------------------------

//---------------------------------------------------------

}