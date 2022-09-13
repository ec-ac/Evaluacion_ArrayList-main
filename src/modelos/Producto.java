package modelos;

/**
 *
 * @author ecac
 */
public class Producto {
    
    private int codigoProd, precioProd, existenciaProd;
    private String nombreProd;
    
    public Producto () {
        
    }

    public Producto(int codigoProd, int precioProd, int existenciaProd, String nombreProd) {
        this.codigoProd = codigoProd;
        this.precioProd = precioProd;
        this.existenciaProd = existenciaProd;
        this.nombreProd = nombreProd;
    }

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public int getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(int precioProd) {
        this.precioProd = precioProd;
    }

    public int getExistenciaProd() {
        return existenciaProd;
    }

    public void setExistenciaProd(int existenciaProd) {
        this.existenciaProd = existenciaProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }
    
}
