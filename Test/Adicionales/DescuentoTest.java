package Adicionales;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescuentoTest {

//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeDescuento () {

        Descuento descuento = new Descuento(20);
        Assert.assertNotNull(descuento);
    }

//-------------------------------------------------------------------

    @Test
    public void test02ObtenemosDescuento () {

        Descuento descuento = new Descuento(15);
        Assert.assertEquals(15,descuento.obtenerDescuento());
    }


//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------



}