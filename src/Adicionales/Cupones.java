package Adicionales;

import java.util.ArrayList;
import Cupones.Cupon;

public class Cupones {

    private

        ArrayList<Cupon> cupones;

//-------------------------------------------------------------------

    public Cupones ()
    {
        this.cupones = new ArrayList<Cupon>();
    }

//-------------------------------------------------------------------

    public void agregarCupon (Cupon unCupon)
    {
        this.cupones.add(unCupon);
    }

//-------------------------------------------------------------------

    public int cuantosCuponesTengo ()
    {
        return this.cupones.size();
    }

//-------------------------------------------------------------------

    public int buscarMayorDescuento ()
    {
        Cupon cuponTemporal = null;
        int descuentoMaximo = 0;
        for (Cupon unCupon : cupones)
            if (unCupon.obtenerDescuento()>descuentoMaximo)
                cuponTemporal = unCupon;
        return cuponTemporal.obtenerDescuento();
    }

//-------------------------------------------------------------------

    public boolean tengoCupones()
    {
        return (this.cupones.size()!=0)?true:false;
    }

//-------------------------------------------------------------------

    public int efectuarDescuento (int precioSinDescuento)
    {
        int descuentoMaximo = this.buscarMayorDescuento();
        float total = precioSinDescuento*(1-(float)descuentoMaximo/100);
        return (int) total;
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}
