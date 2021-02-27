/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.informes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author alvar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxInformeBasico = new javax.swing.JComboBox<>();
        jLabelBasico = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jLabelAgrupado = new javax.swing.JLabel();
        jButtonAgrupado = new javax.swing.JButton();
        jLabelSubReport = new javax.swing.JLabel();
        jComboBoxSubReport = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonSubReport = new javax.swing.JButton();
        jLabelGrafico = new javax.swing.JLabel();
        jButtonGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxInformeBasico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dallas", "New York", "Seattle", "Boston", "Paris" }));

        jLabelBasico.setText("Informe Básico:");

        jButtonAceptar.setText("VER");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabelAgrupado.setText("Informe Datos Agrupados: ");

        jButtonAgrupado.setText("VER");
        jButtonAgrupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgrupadoActionPerformed(evt);
            }
        });

        jLabelSubReport.setText("Informe Subreportes:");

        jComboBoxSubReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "0" }));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Selecciona ID de la Factura");

        jButtonSubReport.setText("VER");
        jButtonSubReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubReportActionPerformed(evt);
            }
        });

        jLabelGrafico.setText("Informe con Gráfico:");

        jButtonGrafico.setText("VER");
        jButtonGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelBasico)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxInformeBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelAgrupado)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelSubReport)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxSubReport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabelGrafico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAgrupado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSubReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxInformeBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBasico)
                    .addComponent(jButtonAceptar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAgrupado)
                    .addComponent(jButtonAgrupado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSubReport)
                    .addComponent(jComboBoxSubReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGrafico)
                    .addComponent(jButtonGrafico))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("org.hsqldb.jdbcDriver").newInstance();
            Connection connection=DriverManager.getConnection("jdbc:hsqldb:hsql://127.0.0.1/","sa","");
            
            Map parametros=new HashMap();
            parametros.put("CIUDAD", jComboBoxInformeBasico.getSelectedItem());
            
            JasperPrint print=JasperFillManager.fillReport("E:\\Informes\\reportBasico.jasper", parametros,connection);
            JasperViewer.viewReport(print);
        }catch(Throwable e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonAgrupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgrupadoActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("org.hsqldb.jdbcDriver").newInstance();
            Connection connection=DriverManager.getConnection("jdbc:hsqldb:hsql://127.0.0.1/","sa","");
            
            JasperDesign jd=JRXmlLoader.load("E:\\Informes\\reportParametros.jrxml");
            String consulta="SELECT * FROM ADDRESS ORDER BY CITY";
            JRDesignQuery query=new JRDesignQuery();
            query.setText(consulta);
            
            JasperReport report=JasperCompileManager.compileReport(jd);
            JasperPrint print=JasperFillManager.fillReport(report, null,connection);
            
            JasperViewer.viewReport(print);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAgrupadoActionPerformed

    private void jButtonSubReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubReportActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("org.hsqldb.jdbcDriver").newInstance();
            Connection connection=DriverManager.getConnection("jdbc:hsqldb:hsql://127.0.0.1/","sa","");
            
            String file="E:\\Informes\\principal.jrxml";
            String subReport="E:\\Informes\\principal_subreport.jasper";
            //JasperReport subReport=JasperCompileManager.compileReport("E:\\Informes\\principal_subreport.jasper");
            
            JasperReport jasperReport=JasperCompileManager.compileReport(file);
            
            Map <String,Object> parametros=new HashMap<String,Object>();
            
            parametros.put("subReport", subReport);
            parametros.put("ID", jComboBoxSubReport);
            
            JasperPrint print=JasperFillManager.fillReport(jasperReport, parametros,connection);
            JasperViewer.viewReport(print);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSubReportActionPerformed

    private void jButtonGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficoActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("org.hsqldb.jdbcDriver").newInstance();
            Connection connection=DriverManager.getConnection("jdbc:hsqldb:hsql://127.0.0.1/","sa","");
            
            JasperDesign jd=JRXmlLoader.load("E:\\Informes\\grafico.jrxml");
            String consulta="SELECT * FROM ADDRESS ORDER BY CITY";
            JRDesignQuery query=new JRDesignQuery();
            query.setText(consulta);
            
            JasperReport report=JasperCompileManager.compileReport(jd);
            JasperPrint print=JasperFillManager.fillReport(report, null,connection);
            
            JasperViewer.viewReport(print);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonGraficoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAgrupado;
    private javax.swing.JButton jButtonGrafico;
    private javax.swing.JButton jButtonSubReport;
    private javax.swing.JComboBox<String> jComboBoxInformeBasico;
    private javax.swing.JComboBox<String> jComboBoxSubReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgrupado;
    private javax.swing.JLabel jLabelBasico;
    private javax.swing.JLabel jLabelGrafico;
    private javax.swing.JLabel jLabelSubReport;
    // End of variables declaration//GEN-END:variables
}
