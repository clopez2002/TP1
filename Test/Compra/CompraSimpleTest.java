package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraSimpleTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraSimple () {

        CompraSimple compraSimple = new CompraSimple();
        Assert.assertNotNull(compraSimple);
    }

//--------------------------------------------------

    @Test
    public void test02VemosQueCompraSimpleNoTieneEnvio () {

        CompraSimple compraSimple = new CompraSimple();
        Assert.assertFalse(compraSimple.tieneEnvio());
    }

//--------------------------------------------------

    @Test
    public void test03CompraSimpleSeCreaSinProductos () {

        CompraSimple compra = new CompraSimple();
        Assert.assertEquals(0,compra.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test04Agregamos4ProductosAlaCompra () {

        CompraSimple compra = new CompraSimple();
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
    public void test05CreamosCompraSimpleAgregamos3ProductosEntoncesElPrecioFinalEs600 () {

        CompraSimple compra = new CompraSimple();
        Producto p1 = new Producto("S6",100);
        Producto p2 = new Producto("S7",200);
        Producto p3 = new Producto("S8",300);
        compra.agregarProductoEnCompra(p1);
        compra.agregarProductoEnCompra(p2);
        compra.agregarProductoEnCompra(p3);
        Assert.assertEquals(600,compra.getPrecioTotalDe());

    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}