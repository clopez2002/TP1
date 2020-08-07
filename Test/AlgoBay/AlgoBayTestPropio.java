package AlgoBay;

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

//--------------------------------------------------

//--------------------------------------------------

}