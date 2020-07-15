package AlgoBay;

import Producto.CantidadDeProductos;
import Producto.Producto;

public class AlgoBay {

    private

        Producto producto;
        CantidadDeProductos cantidadDeProductos;

//---------------------------------------------------------

    public AlgoBay ()
    {
        this.cantidadDeProductos = new CantidadDeProductos();
    }

//---------------------------------------------------------
    public int getCantidadDeProductos ()
    {
        return this.cantidadDeProductos.getCantidadDeProductos();
    }

//---------------------------------------------------------

    public Producto agregarProductoConPrecio(String nombre, int precio)
    {
        Producto producto = new Producto(nombre,precio);
        this.cantidadDeProductos.agregarProducto (producto);
        return producto;
    }

//---------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------
}
