package Compra;

import Adicionales.Envio;
import AlgoBay.Productos;
import Producto.Producto;

public abstract class Compra implements iCobrable{


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
        int totalDeLosProductos = 0;
        totalDeLosProductos = productosDeLaCompra.getPrecioTotalDe();
        return this.cobrarExtras(totalDeLosProductos);
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
