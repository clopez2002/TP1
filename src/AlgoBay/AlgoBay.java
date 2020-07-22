package AlgoBay;

import Compra.Compra;
import Excepciones.ErrorProductoNoEstaAgregado;
import Producto.CantidadDeProductos;
import Producto.Producto;

public class AlgoBay {

    private

        Producto producto;
        CantidadDeProductos cantidadDeProductos;

//---------------------------------------------------------

    public AlgoBay ()
    {
        this.cantidadDeProductos = new CantidadDeProductos();

    }

//---------------------------------------------------------
    public int getCantidadDeProductos ()
    {
        return this.cantidadDeProductos.getCantidadDeProductos();
    }

//---------------------------------------------------------

    public Producto agregarProductoConPrecio(String nombre, int precio)
    {
        Producto producto = new Producto(nombre,precio);
        this.cantidadDeProductos.agregarProducto (producto);
        return producto;
    }

//---------------------------------------------------------

    public Producto getProducto (String nombreProducto)
    {
        return this.cantidadDeProductos.getProducto (nombreProducto);
    }

//---------------------------------------------------------

    public Compra crearNuevaCompra ()
    {
        return new Compra();
    }

//---------------------------------------------------------

    public void agregarProductoEnCompra (Producto unProducto, Compra unaCompra)
    {
        Producto unProductoBuscado = cantidadDeProductos.getProducto(unProducto.getProductName());
        unaCompra.agregarProductoEnCompra (unProductoBuscado);
    }

//---------------------------------------------------------

    public int getPrecioTotalDe (Compra unaCompra)
    {
        int total = 0;
        return total;
    }

//---------------------------------------------------------

    public int obtenerCantidadDeProductosEnCompra (Compra unaCompra)
    {
        return unaCompra.obtenerCantidadDeProductosEnCompra();
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------

}
