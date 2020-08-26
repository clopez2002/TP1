package Compra;

import Adicionales.Cupones;
import Adicionales.Envio;
import Adicionales.Garantia;
import AlgoBay.Productos;
import Cupones.Cupon;
import Producto.Producto;

public abstract class Compra implements iCobrable{


    protected

        Productos productosDeLaCompra;
        Envio envio;
        Garantia garantia;
        Cupones cupones;

//--------------------------------------------------

    public Compra ()
    {
        this.productosDeLaCompra = new Productos();
        this.envio = new Envio();
        this.garantia = new Garantia();
        this.cupones = new Cupones();
    }

//--------------------------------------------------

    public void agregarProductoEnCompra (Producto productoParaAgregar)
    {
        this.productosDeLaCompra.agregarProductoConPrecio(productoParaAgregar);
    }

//--------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return productosDeLaCompra.getCantidadDeProductos();
    }

//--------------------------------------------------

    public int getPrecioTotalDe ()
    {
        int totalDeLosProductos = 0;
        int precioConExtras = 0;
        int precioFinal = 0;
        totalDeLosProductos = productosDeLaCompra.getPrecioTotalDe();
        precioConExtras =  this.cobrarExtras(totalDeLosProductos);
        if (cupones.tengoCupones())
            return  cupones.efectuarDescuento (precioConExtras);
        else
            return precioConExtras;

    }

//--------------------------------------------------

    public boolean tieneEnvio ()
    {
        return this.envio.tengoEnvio();
    }

//--------------------------------------------------

    public boolean tieneGarantia ()
    {
        return this.garantia.tieneGarantia();
    }

//--------------------------------------------------

    public void agregarCuponEnCompra (Cupon unCupon)
    {
        this.cupones.agregarCupon (unCupon);
    }

//--------------------------------------------------
}
