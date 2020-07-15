package Producto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CantidadDeProductosTest {

//---------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCantidadDeProductos () {

        CantidadDeProductos cantidadDeProductos = new CantidadDeProductos();
        Assert.assertNotNull(cantidadDeProductos);
    }

//---------------------------------------------------------

    @Test
    public void test02ObtenemosCantidadDeProductosPorDefectos () {

        CantidadDeProductos cantidadDeProductos = new CantidadDeProductos();
        Assert.assertEquals(0,cantidadDeProductos.getCantidadDeProductos());
    }

//---------------------------------------------------------

    @Test
    public void test03AgregamosProductoYConsultamosCuantosTenemos () {

        CantidadDeProductos cantidadDeProductos = new CantidadDeProductos();
        Producto producto = new Producto("Ala Matic 600 gr", 125);
        cantidadDeProductos.agregarProducto(producto);
        Assert.assertEquals(1,cantidadDeProductos.getCantidadDeProductos());
    }

//---------------------------------------------------------

//---------------------------------------------------------

}