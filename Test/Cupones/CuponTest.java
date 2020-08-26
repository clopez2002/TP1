package Cupones;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuponTest {

//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeCupon () {

        Cupon cupon = new Cupon(25);
        Assert.assertNotNull(cupon);
    }

//--------------------------------------------------

    @Test
    public void test02ObtenemosDescuentoDelCupon () {

        Cupon cupon = new Cupon(15);
        Assert.assertEquals(15,cupon.obtenerDescuento());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------


}