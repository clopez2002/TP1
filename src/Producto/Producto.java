package Producto;

public class Producto {

    private

        Nombre nombre;
        Precio precio;

//---------------------------------------------------------

    public Producto (String nombre, int precio)
    {
        this.nombre = new Nombre(nombre);
        this.precio = new Precio(precio);
    }

//---------------------------------------------------------

    public String getProductName ()
    {
        return this.nombre.getNombre ();
    }

//---------------------------------------------------------

    public int getPrecio ()
    {
        return this.precio.obtenerPrecio();
    }

//---------------------------------------------------------

//---------------------------------------------------------
}
