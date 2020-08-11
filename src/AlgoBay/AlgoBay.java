package AlgoBay;

import Compra.Compra;
import Excepciones.ErrorProductoNoEstaEnProductos;
import Producto.Producto;

public class AlgoBay {

    private

        Productos productos;

//--------------------------------------------------

    public AlgoBay ()
    {
        this.productos = new Productos();
    }

//--------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return this.productos.getCantidadDeProductos ();
    }

//--------------------------------------------------

    public Producto agregarProductoConPrecio (String nombre, int precio)
    {
        Producto unProducto  = new Producto(nombre, precio);
        this.productos.agregarProductoConPrecio(unProducto);
        return unProducto;
    }

//--------------------------------------------------

    public Producto getProducto (String descripcionDelProductoABuscar) throws ErrorProductoNoEstaEnProductos
    {
        return productos.getProducto (descripcionDelProductoABuscar);
    }

//--------------------------------------------------

    public Compra crearNuevaCompra ()
    {
        return new Compra();
    }

//--------------------------------------------------

    public void agregarProductoEnCompra (Producto unProducto, Compra unaCompra)
    {
        unaCompra.agregarProductoEnCompra(unProducto);
    }

//--------------------------------------------------

    public int getPrecioTotalDe (Compra unaCompra)
    {
        return unaCompra.getPrecioTotalDe();
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}
