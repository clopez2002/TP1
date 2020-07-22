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

    @Test
    public void test03AgregamosVariosProductosALaCompraLuegoObtenemosElPrecioDeTodosEllos () {

        Compra unaCompra = new Compra();
        Producto producto1 = new Producto("Samsung S6",49999);
        Producto producto2 = new Producto("Samsung S7",59999);
        Producto producto3 = new Producto("Samsung S8",69999);
        Producto producto4 = new Producto("Samsung S9",79999);
        unaCompra.agregarProductoEnCompra(producto1);
        unaCompra.agregarProductoEnCompra(producto2);
        unaCompra.agregarProductoEnCompra(producto3);
        unaCompra.agregarProductoEnCompra(producto4);
        Assert.assertEquals(259996,unaCompra.getPrecioTotalDe());


    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}