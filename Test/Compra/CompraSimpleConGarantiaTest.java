package Compra;

import AlgoBay.AlgoBay;
import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraSimpleConGarantiaTest {

//---------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraSimpleConGarantia () {

        CompraSimpleConGarantia compra = new CompraSimpleConGarantia();
        Assert.assertNotNull(compra);
    }

//---------------------------------------------------------

    @Test
    public void test02CreamosCompraSimpleConGarantiaYVemosPrecio () {

        CompraSimpleConGarantia compra = new CompraSimpleConGarantia();
        Producto zapatillas = new Producto("Zapas zaposas", 2000);
        compra.agregarProductoEnCompra(zapatillas);
        Assert.assertEquals(2200,compra.getPrecioTotalDe(),0);
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

}