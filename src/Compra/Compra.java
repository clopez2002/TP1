package Compra;

import Adicionales.Envio;
import AlgoBay.Productos;
import Producto.Producto;

public abstract class Compra {


    protected

        Productos productosDeLaCompra;
        Envio envio;

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
