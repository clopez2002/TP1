package AlgoBay;

import Compra.Compra;
import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoBayTestPROPIO {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeAlgoBay () {

        AlgoBay algoBay = new AlgoBay();
        Assert.assertNotNull(algoBay);
    }

//--------------------------------------------------

    @Test
    public void tes02VerificamosQuealgoBayNoTieneProductosAgregados () {

        AlgoBay algoBay = new AlgoBay();
        Assert.assertEquals(0,algoBay.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test03AgregamosUnProductoEnalgoBay () {

        AlgoBay algoBay = new AlgoBay();
        Producto unProducto = algoBay.agregarProductoConPrecio("S6",39999);
        Assert.assertEquals(1,algoBay.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test04VemosQueAlAgregarProductoEnAlgoBayTambienMeLoDevuelve () {

        AlgoBay algoBay = new AlgoBay();
        Producto producto = algoBay.agregarProductoConPrecio("S6",39999);
        Assert.assertNotNull(producto);
    }

//--------------------------------------------------

    @Test
    public void test05AgregamosVariosProductosAlaCompraLuegoPedimosElPrecioDeLosProductosAgregadosAlaCompra () {

        AlgoBay algoBay = new AlgoBay();
        Compra unaCompra = new Compra();
        Producto p1 = new Producto("S6",5000);
        Producto p2 = new Producto("S7",6000);
        Producto p3 = new Producto("S8",7000);
        algoBay.agregarProductoEnCompra(p1,unaCompra);
        algoBay.agregarProductoEnCompra(p2,unaCompra);
        algoBay.agregarProductoEnCompra(p3,unaCompra);
        Assert.assertEquals(18000,algoBay.getPrecioTotalDe(unaCompra));
    }

//--------------------------------------------------

//--------------------------------------------------

}