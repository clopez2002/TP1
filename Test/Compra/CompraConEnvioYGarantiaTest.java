package Compra;

import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraConEnvioYGarantiaTest {

//---------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraConEnvioYGarantia () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Assert.assertNotNull(compra);
    }

//---------------------------------------------------------

    @Test
    public void test02CreamosCompraYVerificamosCostoConEnvioYGarantia () {

        CompraConEnvioYGarantia compra = new CompraConEnvioYGarantia();
        Producto zapatillas = new Producto("Zapas zaposas", 2000);
        compra.agregarProductoEnCompra(zapatillas);
        Assert.assertEquals(2300,compra.getPrecioTotalDe(),0);
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------


}