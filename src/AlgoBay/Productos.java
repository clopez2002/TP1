package AlgoBay;

import Excepciones.ErrorProductoNoEstaEnProductos;
import Producto.Producto;
import com.sun.javaws.exceptions.ErrorCodeResponseException;

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

    public Producto getProducto (String descripcionDelProductoABuscar) throws ErrorProductoNoEstaEnProductos
    {
        Producto productoParaDevolver = null;
        int i;
        int cantidad = this.productos.size();
        for (i=0;i<cantidad;i++)
            if (descripcionDelProductoABuscar == this.productos.get(i).obtenerNombredelProducto())
                productoParaDevolver = productos.get(i);
        if (i>cantidad)
            throw new ErrorProductoNoEstaEnProductos();

        return productoParaDevolver;
    }

//--------------------------------------------------

//--------------------------------------------------
}
