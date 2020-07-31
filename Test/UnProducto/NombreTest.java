package UnProducto;

import org.junit.Assert;
import org.junit.Test;

public class NombreTest {

//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeNombre () {

        Nombre nombre = new Nombre("Ala Matic");
        Assert.assertNotNull(nombre);
    }

//-------------------------------------------------------------------

    @Test
    public void test02ObtenemosNombreDelProducto () {

        Nombre unNombre = new Nombre("Samsung Galaxy S6");
        Assert.assertEquals("Samsung Galaxy S6",unNombre.getName());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}