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

    @Test
    public void test04AgregamosTresCuponesConDistintoDescuentoEntoncesBuscamosElMayorDescuento () {

        Cupones cupones = new Cupones();
        Cupon c1 = new Cupon(10);
        Cupon c2 = new Cupon(20);
        Cupon c3 = new Cupon(30);
        cupones.agregarCupon(c1);
        cupones.agregarCupon(c2);
        cupones.agregarCupon(c3);
        Assert.assertEquals(30,cupones.buscarMayorDescuento());
    }

//-------------------------------------------------------------------

    @Test
    public void test05SiTengoCuponesAlPreguntarDevuelveTrue () {

        Cupones cupones = new Cupones();
        Cupon c1 = new Cupon(10);
        Cupon c2 = new Cupon(20);
        Cupon c3 = new Cupon(30);
        cupones.agregarCupon(c1);
        cupones.agregarCupon(c2);
        cupones.agregarCupon(c3);
        Assert.assertTrue(cupones.tengoCupones());
    }

//-------------------------------------------------------------------

    @Test
    public void test06PruebaDondeEfectuamosDescuento () {

        Cupones cupones = new Cupones();
        Cupon c1 = new Cupon(10);
        Cupon c2 = new Cupon(20);
        Cupon c3 = new Cupon(30);
        cupones.agregarCupon(c1);
        cupones.agregarCupon(c2);
        cupones.agregarCupon(c3);
        Assert.assertEquals(1400,cupones.efectuarDescuento(2000));
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}