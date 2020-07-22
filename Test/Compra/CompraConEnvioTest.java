package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraConEnvioTest {


//-------------------------------------------------------------------

    @Test
    public void test01CremosInstanciaDeCompraConEnvio () {

        CompraConEnvio compra = new CompraConEnvio();
        Assert.assertNotNull(compra);
    }

//-------------------------------------------------------------------

    @Test
    public void test02AgregamosCuatroProductosAlaCompraYVerificamosLaCantidadDeProductosAgregados () {

        CompraConEnvio compra = new CompraConEnvio();
        Producto producto1 = new Producto("Samsung S6",49999);
        Producto producto2 = new Producto("Samsung S7",59999);
        Producto producto3 = new Producto("Samsung S8",69999);
        Producto producto4 = new Producto("Samsung S9",79999);
        compra.agregarProductoEnCompra(producto1);
        compra.agregarProductoEnCompra(producto2);
        compra.agregarProductoEnCompra(producto3);
        compra.agregarProductoEnCompra(producto4);
        Assert.assertEquals(4,compra.obtenerCantidadDeProductosEnCompra());
    }

//-------------------------------------------------------------------

    @Test
    public void test03CreamosCompraAgregamosCuatroProductosYVerficamosElCostoDeLaCompra () {

        CompraConEnvio compra = new CompraConEnvio();
        Producto producto1 = new Producto("Samsung S6",100);
        Producto producto2 = new Producto("Samsung S7",200);
        Producto producto3 = new Producto("Samsung S8",300);
        Producto producto4 = new Producto("Samsung S9",400);
        compra.agregarProductoEnCompra(producto1);
        compra.agregarProductoEnCompra(producto2);
        compra.agregarProductoEnCompra(producto3);
        compra.agregarProductoEnCompra(producto4);
        Assert.assertEquals(1100,compra.getPrecioTotalDe());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}