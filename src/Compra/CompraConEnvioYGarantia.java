package Compra;

import Producto.Producto;

public class CompraConEnvioYGarantia extends Compra {

    private static final int COSTODELENVIO = 100;
    private static final float COSTOSGARANTIA = (float) 1.1;

//---------------------------------------------------------

    public CompraConEnvioYGarantia ()
    {

    }

//---------------------------------------------------------

//---------------------------------------------------------

    @Override
    public int getPrecioTotalDe()
    {
        int total = 0;
        for (Producto unProducto : compra)
            total += unProducto.getPrecio();
        return (int) ((int) total*COSTOSGARANTIA)+COSTODELENVIO;
    }

//---------------------------------------------------------

}
