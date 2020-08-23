package Compra;

public class CompraConEnvioYGarantia extends Compra {

    private static final float COSTOGARANTIA = (float) 1.1;
    private static final int COSTOENVIO = 100;


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
        return (int) (COSTOENVIO+precioTotalDeLosProductos*COSTOGARANTIA);
    }
//-------------------------------------------------------------------

//-------------------------------------------------------------------

}
