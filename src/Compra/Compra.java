package Compra;

import UnProducto.Producto;

import java.util.ArrayList;

public class Compra extends Compras {

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
