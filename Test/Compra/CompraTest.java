package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraTest {

//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompra () {

        Compra compra = new Compra();
        Assert.assertNotNull(compra);
    }

//-------------------------------------------------------------------

    @Test
    public void test02AgregamosProductoACompra () {

        Compra unaCompra = new Compra();
        Producto unProducto = new Producto("Samsung S6",49999);
        unaCompra.agregarProductoEnCompra(unProducto);
        Assert.assertEquals(1,unaCompra.obtenerCantidadDeProductosEnCompra());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}