package AlgoBay;

import Compra.Compra;
import Excepciones.ErrorProductoNoEstaEnProductos;
import UnProducto.Producto;

public class AlgoBay {

    private

        Productos productos;

//-------------------------------------------------------------------

    public AlgoBay ()
    {
        this.productos = new Productos();
    }

//-------------------------------------------------------------------

    public int getCantidadDeProductos ()
    {
        return this.productos.getCantidadDeProductos ();
    }

//-------------------------------------------------------------------

    public Producto agregarProductoConPrecio (String nombre, int precio)
    {
        Producto unProducto = new Producto(nombre,precio);
        this.productos.agregarProductoConPrecio(unProducto);
        return unProducto;

    }

//-------------------------------------------------------------------

    public Producto getProducto (String descripcionDelProductoBuscado) throws ErrorProductoNoEstaEnProductos
    {
        return productos.getProducto (descripcionDelProductoBuscado);
    }
//-------------------------------------------------------------------

    public Compra crearNuevaCompra ()
    {
        return new Compra();
    }

//-------------------------------------------------------------------

    public void agregarProductoEnCompra (Producto unProductoParaAgregar, Compra compraDondeAgregamosProducto)
    {
        compraDondeAgregamosProducto.agregarProductoEnCompra(unProductoParaAgregar);
    }

//-------------------------------------------------------------------

    public int getPrecioTotalDe (Compra unaCompra)
    {
        return 1;
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------



}
