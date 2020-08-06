package AlgoBay;

import Producto.Producto;

import java.util.ArrayList;

public class Productos {

    private

        ArrayList<Producto> productos;

//--------------------------------------------------

    public Productos ()
    {
        this.productos = new ArrayList<Producto>();
    }

//--------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return this.productos.size();
    }

//--------------------------------------------------

    public void agregarProductoConPrecio (Producto unProducto)
    {
        this.productos.add(unProducto);
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------
}
