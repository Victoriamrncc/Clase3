import edu.uca.producto.ProductoBase;
import edu.uca.Tienda;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void productToStringTest(){
        ProductoBase productoBase = new ProductoBase(1, "producto de prueba", 200);
        System.out.println(productoBase);
    }

    @Test
    public void tiendaAgregarProductoTest(){
        Tienda tienda = new Tienda();
        ProductoBase productoBase = new ProductoBase(1, "producto de prueba", 200);
        tienda.agregarProducto(productoBase);
        Assert.assertEquals(tienda.getSize(), 1);
    }

    @Test
    public void mostrarInventarioTest(){
        Tienda tienda = new Tienda();
        ProductoBase productoBase = new ProductoBase(1, "producto de prueba", 200);
        tienda.agregarProducto(productoBase);
        tienda.mostrarInventario();
    }
}
