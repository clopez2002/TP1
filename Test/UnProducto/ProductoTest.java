package UnProducto;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProductoTest {



//-------------------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeProducto () {

        Producto producto = new Producto("Ala Matic",165);
        Assert.assertNotNull (producto);
    }

//-------------------------------------------------------------------

    @Test
    public void test02ObtenemosNombreDelProducto () {

        Producto unProducto = new Producto("Galaxy Tab",39999);
        Assert.assertEquals("Galaxy Tab",unProducto.getProductoName());
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