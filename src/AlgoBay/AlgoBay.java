package AlgoBay;

import Compra.Compra;
import Compra.CompraSimple;
import Compra.CompraConEnvio;
import Compra.CompraConGarantia;
import Compra.CompraConEnvioYGarantia;
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
        return new CompraSimple();
    }

//--------------------------------------------------

    public Compra crearNuevaCompraConEnvio ()
    {
        Compra compra = new CompraConEnvio();
        return compra;
    }

//--------------------------------------------------

    public Compra crearNuevaCompraConGarantia ()
    {
        Compra compra = new CompraConGarantia();
        return compra;
    }

//--------------------------------------------------

    public Compra crearNuevaCompraConEnvioYGarantia ()
    {
        return new CompraConEnvioYGarantia();
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

}
