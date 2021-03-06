/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp.vistas;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ulp.modelo.Alumno;
import ulp.modelo.AlumnoData;
import ulp.modelo.Conexion;
import ulp.modelo.Cursada;
import ulp.modelo.CursadaData;

/**
 *
 * @author tinch
 */
public class VistaCargaNotas extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private ArrayList<Cursada> listaCursada;
    private CursadaData cursadaData;
    private AlumnoData alumnoData;
    private ArrayList<Alumno> listaAlumnos;
    private Conexion conexion;
    /**
     * Creates new form VistaCargaNotas
     */
   
    public VistaCargaNotas() {
        initComponents();
        try {
            conexion = new Conexion();
            modelo=new DefaultTableModel();
            cursadaData = new CursadaData(conexion);
            listaCursada = (ArrayList) cursadaData.obtenerCursadas();
            alumnoData=new AlumnoData(conexion);
            listaAlumnos=(ArrayList)alumnoData.obtenerAlumnos();
            
            
            for (Alumno it:listaAlumnos){
                jcAlumno.addItem(it);
            }
            
            armarCabeceraTabla();
            borrarFilas();
            cargaDatos();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCargaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCursada = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("CARGA DE NOTAS");

        jLabel2.setText("Alumnos:");

        jcAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnoActionPerformed(evt);
            }
        });

        jtCursada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtCursada);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnoActionPerformed
        borrarFilas();
        cargaDatos();
    }//GEN-LAST:event_jcAlumnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada=jtCursada.getSelectedRow();
        if(filaSeleccionada != -1){
            Alumno a = (Alumno)jcAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            double nota=Double.parseDouble((String)modelo.getValueAt(filaSeleccionada, 2));
            CursadaData cd=new CursadaData(conexion);
            cd.actualizarNotaCursada(a.getId(), idMateria, nota);
            borrarFilas();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
     public void armarCabeceraTabla(){
        //Titulo de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Materia");
        columnas.add("Nota");
        for(Object it:columnas){
            modelo.addColumn(it);
        }
        jtCursada.setModel(modelo);
    }
        
        public void borrarFilas(){
        int a = modelo.getRowCount()-1; // en a queda guardado el índice del último
        for (int i=a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
        
        public void cargaDatos(){
            Alumno a=(Alumno)jcAlumno.getSelectedItem();
            listaCursada=(ArrayList)cursadaData.obtenerCursadasXAlumno(a.getId());
            for(Cursada m:listaCursada){
                modelo.addRow(new Object[]{m.getMateria().getId(), m.getMateria().getNombre(), m.getNota()});
            }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> jcAlumno;
    private javax.swing.JTable jtCursada;
    // End of variables declaration//GEN-END:variables
}
