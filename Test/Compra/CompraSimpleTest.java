package Compra;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraSimpleTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCompraSimple () {

        CompraSimple compraSimple = new CompraSimple();
        Assert.assertNotNull(compraSimple);
    }

//--------------------------------------------------

    @Test
    public void test02VemosQueCompraSimpleNoTieneEnvio () {

        CompraSimple compraSimple = new CompraSimple();
        Assert.assertFalse(compraSimple.tieneEnvio());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}