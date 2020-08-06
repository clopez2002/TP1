package Compra;

import Adicionales.Envio;
import Adicionales.Garantia;
import Cobrar.Cobrar;
import Cobrar.CobrarEnvio;
import Cobrar.CobrarGarantia;
import UnProducto.Producto;

import java.util.ArrayList;

public abstract class Compra implements iCobrable{

    protected

    ArrayList<Producto> productosDeLaCompra;
    Envio envio;
    Garantia garantia;

//-------------------------------------------------------------------

    public Compra ()
    {
        this.productosDeLaCompra = new ArrayList<Producto>();
        this.envio = new Envio();
        this.garantia = new Garantia();
    }

//-------------------------------------------------------------------

    public void agregarProductoEnCompra (Producto unProductoParaAgregar)
    {
        this.productosDeLaCompra.add(unProductoParaAgregar);
    }

//-------------------------------------------------------------------

    public int obtenerCantidadDeProductosEnLaCompra ()
    {
        return this.productosDeLaCompra.size();
    }



//-------------------------------------------------------------------

    public abstract int cobrar (Cobrar algoParaCobrar);
    public abstract int cobrar (CobrarEnvio envioParaCobrar);
    public abstract int cobrar (CobrarGarantia garantiaParaCobrar);


//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}
