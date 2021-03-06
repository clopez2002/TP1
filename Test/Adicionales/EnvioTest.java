package Adicionales;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnvioTest {

//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeEnvio () {

        Envio envio = new Envio();
        Assert.assertNotNull(envio);
    }

//-------------------------------------------------------------------

    @Test
    public void test02VerificamosQuePorDefectoNoHayEnvio () {

        Envio envio = new Envio();
        Assert.assertFalse(envio.tengoEnvio());
    }

//-------------------------------------------------------------------

    @Test
    public void test03EstablecemosEnvio () {

        Envio envio = new Envio();
        envio.establecerEnvio ();
        Assert.assertTrue(envio.tengoEnvio());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}