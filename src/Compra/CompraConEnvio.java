package Compra;

import Cobrar.Cobrar;
import Cobrar.CobrarEnvio;
import Cobrar.CobrarGarantia;

public class CompraConEnvio extends Compra {

    private static final int COSTODELENVIO = 100;

//-------------------------------------------------------------------

    public CompraConEnvio ()
    {

    }

//-------------------------------------------------------------------

    @Override
    public int cobrar(Cobrar algoParaCobrar) {
        System.out.println("Cobrar una compra generica: aplico: ");
        return 0;
    }

//-------------------------------------------------------------------

    @Override
    public int cobrar(CobrarEnvio envioParaCobrar) {
        System.out.println("Cobro CompraConEnvio");
        return 0;
    }

//-------------------------------------------------------------------

    @Override
    public int cobrar(CobrarGarantia garantiaParaCobrar) {

        return 0;
    }

//-------------------------------------------------------------------




//-------------------------------------------------------------------

//-------------------------------------------------------------------
}
