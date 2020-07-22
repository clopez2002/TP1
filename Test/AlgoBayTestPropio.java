import AlgoBay.AlgoBay;
import Compra.Compra;
import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

public class AlgoBayTestPropio {

//---------------------------------------------------------

    @Test
    public void test01CreamosInstanciaDeAlgoBay () {

        AlgoBay algoBay = new AlgoBay();
        Assert.assertNotNull(algoBay);
    }

//---------------------------------------------------------

    @Test
    public void test02CreamosProductoConPrecio () {

        AlgoBay algoBay = new AlgoBay();
        Producto producto = algoBay.agregarProductoConPrecio("Spinner",83);

    }

//---------------------------------------------------------

    @Test
    public void test03CreamosCompra () {

        AlgoBay algoBay = new AlgoBay();
        Compra compra = algoBay.crearNuevaCompra();
        Assert.assertNotNull(compra);
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

}