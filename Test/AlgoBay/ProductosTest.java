package AlgoBay;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductosTest {


//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeProductos () {

        Productos productos = new Productos();
        Assert.assertNotNull(productos);
    }

//--------------------------------------------------

    @Test
    public void test02LaCantidadDeProductosProDefectoDebenSerCero () {

        Productos productos = new Productos();
        Assert.assertEquals(0,productos.getCantidadDeProductos());
    }

//--------------------------------------------------

    @Test
    public void test03AgregamosTresProductosYVerficamosQueLaCantidadDeProductosAhoraEsTres () {

        Productos productos = new Productos();
        Producto p1 = new Producto("S6",39999);
        Producto p2 = new Producto("S7",49999);
        Producto p3 = new Producto("S8",59999);
        productos.agregarProductoConPrecio(p1);
        productos.agregarProductoConPrecio(p2);
        productos.agregarProductoConPrecio(p3);
        Assert.assertEquals(3,productos.getCantidadDeProductos());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------


}