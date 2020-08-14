package Adicionales;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarantiaTest {

//-------------------------------------------------------------------}

    @Test
    public void test01CreamosInstanciaDeGarantia () {

        Garantia garantia = new Garantia();
        Assert.assertNotNull(garantia);
    }

//-------------------------------------------------------------------

    @Test
    public void test02VerificamosQueporDefectoNoHayGarantia () {

        Garantia garantia = new Garantia();
        Assert.assertFalse(garantia.tieneGarantia());
    }

//-------------------------------------------------------------------

    @Test
    public void test03EstablecemosQueTenemosGarantia () {

        Garantia garantia = new Garantia();
        garantia.establecerGarantia();
        Assert.assertTrue(garantia.tieneGarantia());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}