/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blood
 */
public class ClaseManejoAlumnos {
    
    DefaultTableModel model;
    
    public void crearColumnas (JTable tablaAlumnos){
        
       DefaultTableModel modelo = new DefaultTableModel();
        
       modelo.addColumn("Codigo");
       modelo.addColumn("Nombres");
       modelo.addColumn("ApPaterno");
       modelo.addColumn("ApMaterno");
       
       tablaAlumnos.setModel(modelo);
       
    }
    
    public void IngresoAlumnos(JTextField codigo, JTextField nombres, JTextField apepaterno, JTextField apematerno, JTable tablaAlumnos){
    
        model = (DefaultTableModel) tablaAlumnos.getModel();
        
        Clases.ClaseAlumno objetoAlumno = new Clases.ClaseAlumno();
        objetoAlumno.setCodigo(Integer.valueOf(codigo.getText()));
        objetoAlumno.setNombres(nombres.getText());
        objetoAlumno.setApePaterno(apepaterno.getText());
        objetoAlumno.setApeMaterno(apematerno.getText());
        
        Object [] filas = new Object[4];
        
        filas[0]= objetoAlumno.getCodigo();
        filas[1]= objetoAlumno.getNombres();
        filas[2]= objetoAlumno.getApePaterno();
        filas[3]= objetoAlumno.getApeMaterno();
        
        model.addRow(filas);
        
        tablaAlumnos.setModel(model);
        
        
    }
}
