package Compra;

import AlgoBay.Productos;
import Producto.Producto;

public class Compra {


    private

        Productos productosDeLaCompra;

//--------------------------------------------------

    public Compra ()
    {
        this.productosDeLaCompra = new Productos();
    }

//--------------------------------------------------

    public void agregarProductoEnCompra (Producto productoParaAgregar)
    {
        this.productosDeLaCompra.agregarProductoConPrecio(productoParaAgregar);
    }

//--------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return productosDeLaCompra.getCantidadDeProductos();
    }

//--------------------------------------------------

    public int getPrecioTotalDe ()
    {
        return productosDeLaCompra.getPrecioTotalDe();
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------
}
