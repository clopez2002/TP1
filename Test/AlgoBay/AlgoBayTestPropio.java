package AlgoBay;

import Excepciones.ErrorProductoNoEstaEnProductos;
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

    @Test
    public void test03AgregamosVariosProductosYBuscamosUnoEnParticular () throws ErrorProductoNoEstaEnProductos {

        AlgoBay algoBay = new AlgoBay();
        algoBay.agregarProductoConPrecio("S6",39999);
        algoBay.agregarProductoConPrecio("S7",49999);
        algoBay.agregarProductoConPrecio("S8",59999);
        try {
            Producto unProducto = algoBay.getProducto("S8");
            Assert.assertNotNull(unProducto);
        }
        catch (ErrorProductoNoEstaEnProductos p)
        {

        }
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}