package Compra;

import Cobrar.Cobrar;
import Cobrar.CobrarEnvio;
import Cobrar.CobrarGarantia;

public class CompraSimple extends Compra{

//-------------------------------------------------------------------

    @Override
    public int cobrar(Cobrar algoParaCobrar) {
        return 0;
    }

//-------------------------------------------------------------------

    @Override
    public int cobrar(CobrarEnvio envioParaCobrar) {
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

//-------------------------------------------------------------------

}
