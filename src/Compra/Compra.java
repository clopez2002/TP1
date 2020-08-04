package Compra;

import UnProducto.Producto;

import java.util.ArrayList;

public abstract class Compra{

    protected

    ArrayList<Producto> productosDeLaCompra;

//-------------------------------------------------------------------

    public Compra ()
    {
        this.productosDeLaCompra = new ArrayList<Producto>();
    }

//-------------------------------------------------------------------

    public void agregarProductoEnCompra (Producto unProductoParaAgregar)
    {
        this.productosDeLaCompra.add(unProductoParaAgregar);
    }

//-------------------------------------------------------------------

    public int obtenerCantidadDeProductosEnLaCompra ()
    {
        return this.productosDeLaCompra.size();
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}
