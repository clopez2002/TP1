package AlgoBay;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoBayTest {


    private static final double DELTA = 1e-15;

    @Test
    public void test01AgregarProductos() {

        AlgoBay algoBay = new AlgoBay();

        Assert.assertEquals(0, algoBay.getCantidadDeProductos());

        Producto spinner = algoBay.agregarProductoConPrecio("Spinner", 83);

        Assert.assertEquals(1, algoBay.getCantidadDeProductos());

        Assert.assertNotNull(spinner);
    }

}