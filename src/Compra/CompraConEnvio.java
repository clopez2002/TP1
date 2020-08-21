package Compra;

public class CompraConEnvio extends Compra{

    private static final int COSTODELENVIO = 100;

//--------------------------------------------------

    public CompraConEnvio ()
    {
        super();
        this.envio.establecerEnvio();
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

    @Override
    public int cobrarExtras(int precioTotalDeLosProductos) {
        return precioTotalDeLosProductos + COSTODELENVIO;
    }

//--------------------------------------------------

//--------------------------------------------------


}
