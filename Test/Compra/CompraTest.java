package Compra;

import UnProducto.Producto;
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
    public void test02AgregamosUnProductoEnLaComra () {

        Compra compra = new Compra();
        Producto unProducto = new Producto("Ala Matic",139);
        compra.agregarProductoEnCompra(unProducto);
        Assert.assertEquals(1,compra.obtenerCantidadDeProductosEnLaCompra());
    }

//-------------------------------------------------------------------

    @Test
    public void test03AgregamosCincoProductosEnLaCompra () {

        Compra compra = new Compra();
        Producto p1 = new Producto("S6",39999);
        Producto p2 = new Producto("S7",49999);
        Producto p3 = new Producto("S8",59999);
        Producto p4 = new Producto("S9",69999);
        compra.agregarProductoEnCompra(p1);
        compra.agregarProductoEnCompra(p2);
        compra.agregarProductoEnCompra(p3);
        compra.agregarProductoEnCompra(p4);
        Assert.assertEquals(4,compra.obtenerCantidadDeProductosEnLaCompra());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}