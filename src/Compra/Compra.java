package Compra;

import Producto.Producto;

import java.util.ArrayList;

public abstract class Compra {

    protected

        ArrayList<Producto> compra;

//---------------------------------------------------------

    public Compra ()
    {
        this.compra = new ArrayList<Producto>();
    }

//---------------------------------------------------------

    public void agregarProductoEnCompra (Producto unProductoAAgregar)
    {
        this.compra.add(unProductoAAgregar);
    }

//---------------------------------------------------------

    public int obtenerCantidadDeProductosEnCompra ()
    {
        return this.compra.size();
    }


//---------------------------------------------------------

    public abstract int getPrecioTotalDe ();
    /*
    {
        int total = 0;
        for (Producto unProducto : compra)
            total += unProducto.getPrecio();
        return total;
    }
*/
//---------------------------------------------------------



}
