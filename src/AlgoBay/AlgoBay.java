package AlgoBay;

import Producto.Producto;

public class AlgoBay {

    private

        Productos productos;

//--------------------------------------------------

    public AlgoBay ()
    {
        this.productos = new Productos();
    }

//--------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return this.productos.getCantidadDeProductos ();
    }

//--------------------------------------------------

    public Producto agregarProductoConPrecio (String nombre, int precio)
    {
        Producto unProducto  = new Producto(nombre, precio);
        this.productos.agregarProductoConPrecio(unProducto);
        return unProducto;
    }

//--------------------------------------------------

    public Producto getProducto (String descripcionDelProductoABuscar)
    {
        return productos.getProducto (descripcionDelProductoABuscar);
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}
