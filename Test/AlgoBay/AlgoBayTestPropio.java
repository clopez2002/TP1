package AlgoBay;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoBayTestPropio {

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
    public void test05AgregamosVariosProductosEnAlgoBayYBuscamosUnoQueSiEsta () {

        AlgoBay algoBay = new AlgoBay();
        Producto p1 = algoBay.agregarProductoConPrecio("S6",39999);
        Producto p2 = algoBay.agregarProductoConPrecio("S7",49999);
        Producto p3 = algoBay.agregarProductoConPrecio("S8",59999);
        Assert.assertEquals(p3,algoBay.getProducto("S8"));
    }

//--------------------------------------------------

//--------------------------------------------------

}