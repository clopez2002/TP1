package Producto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeProducto () {

        Producto producto = new Producto("S6",39999);
        Assert.assertNotNull(producto);
    }

//--------------------------------------------------

    @Test
    public void test02ObtenemosNombreDelProducto () {

        Producto producto = new Producto("Ala Matic",139);
        Assert.assertEquals("Ala Matic",producto.obtenerNombredelProducto());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}