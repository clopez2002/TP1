package Adicionales;

import org.junit.Assert;
import org.junit.Test;
import Cupones.Cupon;

import static org.junit.Assert.*;

public class CuponesTest {

//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCupones () {

        Cupones cupones = new Cupones();
        Assert.assertNotNull(cupones);
    }

//-------------------------------------------------------------------

    @Test
    public void test02AgregamosCupon () {

        Cupones cupones = new Cupones();
        Cupon cupon = new Cupon(15);
        cupones.agregarCupon(cupon);
        Assert.assertEquals(1,cupones.cuantosCuponesTengo());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}