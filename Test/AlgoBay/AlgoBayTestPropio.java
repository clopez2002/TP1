package AlgoBay;

import UnProducto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoBayTestPropio {


//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeAlgoBay () {

        AlgoBay algoBay = new AlgoBay();
        Assert.assertNotNull(algoBay);
    }

//-------------------------------------------------------------------

    @Test
    public void test02AgregamosDosProductosConPrecio () {

        AlgoBay algoBay = new AlgoBay();
        Producto producto1 = algoBay.agregarProductoConPrecio("Samsung Galaxy S6",49999);
        Producto producto2 = algoBay.agregarProductoConPrecio("Samsung Galaxy S7",59999);
        Assert.assertEquals(2,algoBay.getCantidadDeProductos());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}