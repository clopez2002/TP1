package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraConGarantiaTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraConGarantia () {

        CompraConGarantia compra = new CompraConGarantia();
        Assert.assertNotNull(compra);
    }

//--------------------------------------------------

    @Test
    public void test02CreamosCompraConGarantiaYVerificamosQueTieneGarantiaPorDefecto () {

        CompraConGarantia compra = new CompraConGarantia();
        Assert.assertTrue(compra.tengoGarantia());
    }

//--------------------------------------------------

    @Test
    public void test03CreamosCompraConGarantiaVerificamosQueNoTieneProductosAun () {

        CompraConGarantia compra = new CompraConGarantia();
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
    public void test04CreamosCompraAgregamosProductosVerficamosCostoDeLaMismaEs330 () {

        CompraConGarantia compra = new CompraConGarantia();
        Producto p1 = new Producto("S6",100);
        Producto p2 = new Producto("S7",200);
        Producto p3 = new Producto("S8",300);
        compra.agregarProductoEnCompra(p1);
        compra.agregarProductoEnCompra(p2);
        compra.agregarProductoEnCompra(p3);
        Assert.assertEquals(660,compra.getPrecioTotalDe());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}