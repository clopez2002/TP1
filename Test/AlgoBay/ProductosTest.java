package AlgoBay;

import UnProducto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductosTest {

//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciadeProductos () {

        Productos productos = new Productos();
        Assert.assertNotNull(productos);
    }

//-------------------------------------------------------------------

    @Test
    public void test02AgregamosUnProductoCualquiera () {

        Productos productos = new Productos();
        Producto unProductoCualquiera = new Producto("Ala Matic 600 gr",139);
        productos.agregarProductoConPrecio(unProductoCualquiera);
        Assert.assertEquals(1,productos.getCantidadDeProductos());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}