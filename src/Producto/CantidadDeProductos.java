package Producto;

import java.util.ArrayList;

public class CantidadDeProductos {

    private

        ArrayList<Producto> productos;


//---------------------------------------------------------

    public CantidadDeProductos ()
    {
        this.productos = new ArrayList<Producto>();
    }

//---------------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return this.productos.size();
    }

//---------------------------------------------------------

    public void agregarProducto (Producto producto)
    {
        this.productos.add(producto);
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------
}
