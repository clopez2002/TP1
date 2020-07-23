package Compra;

import Producto.Producto;

public class CompraSimpleConGarantia extends Compra {

    private static final float COSTOSGARANTIA = (float) 1.1;


//---------------------------------------------------------

    public CompraSimpleConGarantia ()
    {

    }

//---------------------------------------------------------

    public int getPrecioTotalDe()
    {
        int total = 0;
        for (Producto unProducto : compra)
            total += unProducto.getPrecio();
        return (int) ((int) total*COSTOSGARANTIA);
    }

//---------------------------------------------------------

//---------------------------------------------------------

}
