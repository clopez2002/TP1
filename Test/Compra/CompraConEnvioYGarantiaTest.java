package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraConEnvioYGarantiaTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraConEnvioYGarantia () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Assert.assertNotNull(compra);
    }

//--------------------------------------------------

    @Test
    public void test02VemosQueCompraConEnvioYGarantiaNoTieneProductosPorDefecto () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Assert.assertEquals(0,compra.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test03VemosQueCompraConEnvioYGarantiaTieneEnvio () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Assert.assertTrue(compra.tieneEnvio());
    }

//--------------------------------------------------

    @Test
    public void test04VemosQueCompraConEnvioYGarantiaTieneGarantia () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Assert.assertTrue(compra.tieneGarantia());
    }

//--------------------------------------------------

    @Test
    public void test05Agregamos3ProductosAlaCompra () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
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
    public void test06Agregamos3ProductosAlaCompraYVerificamosElPrecioFinalConEnvioYGarantia () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Producto p1 = new Producto("S6",100);
        Producto p2 = new Producto("S7",200);
        Producto p3 = new Producto("S8",300);
        compra.agregarProductoEnCompra(p1);
        compra.agregarProductoEnCompra(p2);
        compra.agregarProductoEnCompra(p3);
        Assert.assertEquals(760,compra.getPrecioTotalDe());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}