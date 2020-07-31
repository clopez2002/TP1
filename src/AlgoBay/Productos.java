package AlgoBay;

import UnProducto.Producto;

import java.util.ArrayList;

public class Productos {

    private

        ArrayList<Producto> productos;

//-------------------------------------------------------------------

    public Productos ()
    {
        this.productos = new ArrayList<Producto>();
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return this.productos.size();
    }

//-------------------------------------------------------------------

    public void agregarProductoConPrecio (Producto unProductoAAgregar)
    {
        this.productos.add(unProductoAAgregar);
    }

//-------------------------------------------------------------------

    public Producto getProducto (String descripcionDelProductoBuscado)
    {
        int i=0;
        Producto elProductoBuscado = null;
        for (Producto unProducto: productos)
            {

                if (unProducto.getProductoName() == descripcionDelProductoBuscado)
                    elProductoBuscado = this.productos.get(i);
                i+=1;
            }
        return elProductoBuscado;
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------
}
