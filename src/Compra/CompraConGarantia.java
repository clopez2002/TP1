package Compra;

public class CompraConGarantia extends Compra{

    private static final float COSTOGARANTIA = (float) 1.1;

//--------------------------------------------------

    public CompraConGarantia ()
    {
        super();
        this.garantia.establecerGarantia();
    }

//--------------------------------------------------

    public boolean tengoGarantia ()
    {
        return this.garantia.tieneGarantia();
    }

//--------------------------------------------------

//--------------------------------------------------

    @Override
    public int cobrarExtras(int precioTotalDeLosProductos) {
        return (int) (precioTotalDeLosProductos*COSTOGARANTIA);
    }

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

//--------------------------------------------------

}
