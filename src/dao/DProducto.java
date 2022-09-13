package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

/**
 *
 * @author ecac
 */
public class DProducto {
    //se crea un arraylist de tipo Producto (user-defined class)
    private ArrayList<Producto> listProducto = new ArrayList<>();
    
    public DProducto() {
    }
    

    public DProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }
    
    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    //agregar objeto arraylist
    public int agregarProducto(int codigo, int precio, 
            int existencia, String nombre) {
        int b;
        b = 0;
        Producto prod = new Producto(codigo, precio, existencia, nombre);
        listProducto.add(prod);
        b = 1;
        return b;
    }
 
    //return tabla mostrando registros
    public DefaultTableModel getListProd() {
        //se crea nueva tabal de tipo "DefaultTableModel"
        DefaultTableModel dtm = new DefaultTableModel();
        
        //dtm = new DefaultTableModel(); si vd
        
        //atributos de tabla
        String titulo[] = {"CÓDIGO", "NOMBRE", "PRECIO ($USD)", "EXISTENCIA"};
        
        //asignar encabezados a columnas de tabla
        dtm.setColumnIdentifiers(titulo);
        
        for (Producto prod: listProducto) {
            String reg[] = new String[4];
            reg[0] = "" + prod.getCodigoProd();
            reg[1] = "" + prod.getNombreProd();
            reg[2] = "" + prod.getPrecioProd();
            reg[3] = "" + prod.getExistenciaProd();
            
            dtm.addRow(reg);
        }
        return dtm;
    }
}
