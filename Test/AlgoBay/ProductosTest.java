package AlgoBay;

import Excepciones.ErrorProductoNoEstaEnProductos;
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

    @Test (expected = ErrorProductoNoEstaEnProductos.class)
    public void test03AgregamosTresProductosYDevolvemosUnProductoQueSiEsta () throws ErrorProductoNoEstaEnProductos {

        Productos productos = new Productos();
        Producto p1 = new Producto("S6",49999);
        Producto p2 = new Producto("S7",59999);
        Producto p3 = new Producto("S8",69999);
        productos.agregarProductoConPrecio(p1);
        productos.agregarProductoConPrecio(p2);
        productos.agregarProductoConPrecio(p3);
        Assert.assertNotNull(productos.getProducto("S8"));
    }

//-------------------------------------------------------------------

    @Test (expected = ErrorProductoNoEstaEnProductos.class)
    public void test04AgregamosProductosPeroPedimosUnoQueNoEstaEntoncesLanzaExcepcion () throws ErrorProductoNoEstaEnProductos {

        Productos productos = new Productos();
        Producto p1 = new Producto("S6",49999);
        Producto p2 = new Producto("S7",59999);
        Producto p3 = new Producto("S8",69999);
        productos.agregarProductoConPrecio(p1);
        productos.agregarProductoConPrecio(p2);
        productos.agregarProductoConPrecio(p3);
        productos.getProducto("Galaxy Tab");


    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}