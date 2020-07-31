package AlgoBay;

import UnProducto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoBayTest {


//-------------------------------------------------------------------

    @Test
    public void test01AgregarProductos() {

        AlgoBay algoBay = new AlgoBay();

        Assert.assertEquals(0, algoBay.getCantidadDeProductos());

        Producto spinner = algoBay.agregarProductoConPrecio("Spinner", 83);

        Assert.assertEquals(1, algoBay.getCantidadDeProductos());

        Assert.assertNotNull(spinner);
    }

//-------------------------------------------------------------------

    @Test
    public void test02ObtenerProducto() {

        AlgoBay algoBay = new AlgoBay();

        algoBay.agregarProductoConPrecio("Moto 5G", 4399);

        Producto celular = algoBay.getProducto("Moto 5G");

        Assert.assertNotNull(celular);
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