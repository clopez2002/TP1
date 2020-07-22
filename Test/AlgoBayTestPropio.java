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
        Assert.assertNotNull(producto);

    }

//---------------------------------------------------------

    @Test
    public void test03CreamosCompra () {

        AlgoBay algoBay = new AlgoBay();
        Compra compra = algoBay.crearNuevaCompra();
        Assert.assertNotNull(compra);
    }

//---------------------------------------------------------

    @Test
    public void test04AgregamosProductosEnCompraVerificamosCuantosProductosAgregamos () {

        AlgoBay algoBay = new AlgoBay();
        Compra unaCompra = algoBay.crearNuevaCompra();
        Producto producto1 = new Producto("Samsung S6",49999);
        Producto producto2 = new Producto("Samsung S7",59999);
        Producto producto3 = new Producto("Samsung S8",69999);
        Producto producto4 = new Producto("Samsung S9",79999);
        algoBay.agregarProductoEnCompra(producto1,unaCompra);
        algoBay.agregarProductoEnCompra(producto2,unaCompra);
        algoBay.agregarProductoEnCompra(producto3,unaCompra);
        algoBay.agregarProductoEnCompra(producto4,unaCompra);
        Assert.assertEquals(4,algoBay.obtenerCantidadDeProductosEnCompra(unaCompra));

    }

//---------------------------------------------------------

//---------------------------------------------------------

}