package AlgoBay;

import Compra.Compra;
import Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoBayTest {


    private static final double DELTA = 1e-15;

    @Test
    public void test01AgregarProductos() {

        AlgoBay algoBay = new AlgoBay();

        Assert.assertEquals(0, algoBay.getCantidadDeProductos());

        Producto spinner = algoBay.agregarProductoConPrecio("Spinner", 83);

        Assert.assertEquals(1, algoBay.getCantidadDeProductos());

        Assert.assertNotNull(spinner);
    }

    @Test
    public void test02ObtenerProducto() {

        AlgoBay algoBay = new AlgoBay();

        algoBay.agregarProductoConPrecio("Moto 5G", 4399);

        Producto celular = algoBay.getProducto("Moto 5G");

        Assert.assertNotNull(celular);
    }

    @Test
    public void test03CompraSimple() {

        AlgoBay algoBay = new AlgoBay();

        Producto zapatilla = algoBay.agregarProductoConPrecio("Zapatilla", 2100);
        algoBay.agregarProductoConPrecio("Moto 5G", 4300);
        algoBay.agregarProductoConPrecio("Cable usb", 200);

        Producto celular = algoBay.getProducto("Moto 5G");

        Compra compra = algoBay.crearNuevaCompra();

        algoBay.agregarProductoEnCompra(zapatilla, compra);
        algoBay.agregarProductoEnCompra(celular, compra);

        Assert.assertEquals(6400,
                algoBay.getPrecioTotalDe(compra),
                DELTA);
    }

    @Test
    public void test04EnvioCuesta100() {

        AlgoBay algoBay = new AlgoBay();

        Producto zapatilla = algoBay.agregarProductoConPrecio("Zapatilla", 2100);

        Compra compraSimple = algoBay.crearNuevaCompra();
        Compra compraConEnvio = algoBay.crearNuevaCompraConEnvio();

        algoBay.agregarProductoEnCompra(zapatilla, compraSimple);
        algoBay.agregarProductoEnCompra(zapatilla, compraConEnvio);

        Assert.assertEquals(algoBay.getPrecioTotalDe(compraSimple) + 100,
                algoBay.getPrecioTotalDe(compraConEnvio),
                DELTA);
    }

}