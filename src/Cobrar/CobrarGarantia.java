package Cobrar;

import Compra.Compra;

public class CobrarGarantia extends Cobrar {

    @Override
    public int cobrar(Compra unaCompra) {
        return unaCompra.cobrar(this);
    }
}
