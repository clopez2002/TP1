package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompra () {

        Compra compra = new CompraSimple();
        Assert.assertNotNull(compra);
    }

//--------------------------------------------------

    @Test
    public void test02AgregamosUnProductoCualquieraEnLaCompra () {

        Compra compra = new CompraSimple();
        Producto unProducto = new Producto("S6",39999);
        compra.agregarProductoEnCompra(unProducto);
        Assert.assertEquals(1,compra.getCantidadDeProductos());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}