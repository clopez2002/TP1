package Producto;

public class Producto {

        private

            Nombre nombre;
            Precio precio;

//--------------------------------------------------

    public Producto (String nombre, int precio)
    {
        this.nombre = new Nombre(nombre);
        this.precio = new Precio(precio);
    }

//--------------------------------------------------

    public String obtenerNombredelProducto ()
    {
        return this.nombre.obtenerNombre ();
    }

//--------------------------------------------------

    public int obtenerPrecioDelProducto ()
    {
        return this.precio.obtenerPrecio();
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}
