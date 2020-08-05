package Adicionales;

public class Envio {

    private

        boolean envio;

//-------------------------------------------------------------------

    public Envio ()
    {
        this.envio = false;
    }

//-------------------------------------------------------------------

    public boolean tieneEnvio ()
    {
        return this.envio;
    }

//-------------------------------------------------------------------

    public void establecerEnvio ()
    {
        this.envio = true;
    }

//-------------------------------------------------------------------


}
