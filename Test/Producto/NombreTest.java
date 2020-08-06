package Producto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NombreTest {


//--------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeNombre () {

        Nombre nombre = new Nombre("Ala Matic");
        Assert.assertNotNull(nombre);
    }

//--------------------------------------------------

    @Test
    public void test02ObtenemosNombreDelProducto () {

        Nombre nombre = new Nombre("Galaxy");
        Assert.assertEquals("Galaxy",nombre.obtenerNombre());
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}