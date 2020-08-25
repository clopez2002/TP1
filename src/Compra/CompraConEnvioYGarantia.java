package Compra;

import javax.swing.*;

public class CompraConEnvioYGarantia extends Compra {

    private static final float COSTOGARANTIA = (float) 1.1;
    private static final int COSTOENVIO = 100;
    private static final int VALORMINIMOPARABONIFICARENVIO = 5000;


//-------------------------------------------------------------------

    public CompraConEnvioYGarantia ()
    {
        super();
        this.envio.establecerEnvio();
        this.garantia.establecerGarantia();
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------
    @Override
    public int cobrarExtras(int precioTotalDeLosProductos) {
        System.out.println((6000 * 1.1)+0);
        float monto = (float) 0.0;
        if (precioTotalDeLosProductos > VALORMINIMOPARABONIFICARENVIO)
            monto = (int) (precioTotalDeLosProductos*COSTOGARANTIA);
        else
            monto = (int) (COSTOENVIO+precioTotalDeLosProductos*COSTOGARANTIA);
        return (int) monto;
    }
//-------------------------------------------------------------------

//-------------------------------------------------------------------

}
