package Producto;

import Excepciones.ErrorProductoNoEstaAgregado;

import java.util.ArrayList;

public class CantidadDeProductos {

    private final static int NUMERO_QUE_INDICA_QUE_EL_PRODUCTO_NO_ESTA = -1;

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

    public Producto getProducto (String nombreDelProductoBuscado)
    {
        int indiceDelProducto = 0;
        int i;
        Producto productoBuscado = null;
        for (i=0;i<productos.size();i++)
            {
                if (nombreDelProductoBuscado == productos.get(i).getProductName())
                    productoBuscado = productos.get(i);
            }
        return productoBuscado;
    }

//---------------------------------------------------------

//---------------------------------------------------------
}
