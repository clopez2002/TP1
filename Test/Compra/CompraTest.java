package Compra;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompraTest {

    @Test
    public void test01CreamosInstanciaDeCompra () {

        Compra compra = new Compra();
        Assert.assertNotNull(compra);
    }

}