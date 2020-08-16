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
        this.envio = new Envio();
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
        int precio = 0;
        precio = productosDeLaCompra.getPrecioTotalDe();
        return precio;
    }

//--------------------------------------------------

    public boolean tieneEnvio ()
    {
        return this.envio.tengoEnvio();
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------
}
