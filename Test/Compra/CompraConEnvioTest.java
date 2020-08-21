package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraConEnvioTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraConEnvio () {

        CompraConEnvio compra = new CompraConEnvio();
        Assert.assertNotNull(compra);
    }

//--------------------------------------------------

    @Test
    public void test02CreamosCompraConEnvioYVerficamosQueNoTieneProductos () {

        CompraConEnvio compra = new CompraConEnvio();
        Assert.assertEquals(0,compra.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test03CreamosCompraConEnvioAgregamos3Productos () {

        CompraConEnvio compra = new CompraConEnvio();
        Producto p1 = new Producto("S6",100);
        Producto p2 = new Producto("S7",200);
        Producto p3 = new Producto("S8",300);
        compra.agregarProductoEnCompra(p1);
        compra.agregarProductoEnCompra(p2);
        compra.agregarProductoEnCompra(p3);
        Assert.assertEquals(3,compra.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test04CreamosCompraConEnvioAgregamos3ProductosDe100CadaUnoElPrecioFinalEl400 () {

        CompraConEnvio compra = new CompraConEnvio();
        Producto p1 = new Producto("S6",100);
        Producto p2 = new Producto("S7",100);
        Producto p3 = new Producto("S8",100);
        compra.agregarProductoEnCompra(p1);
        compra.agregarProductoEnCompra(p2);
        compra.agregarProductoEnCompra(p3);
        Assert.assertEquals(400,compra.getPrecioTotalDe());

    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}