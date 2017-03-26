/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim_tp1;

import javax.swing.JOptionPane;
import sim_tp1.Generador.Generador;
import sim_tp1.Generador.GeneradorCongruencialLineal;

/**
 *
 * @author NICO
 */
public class EjercicioC extends javax.swing.JFrame {
    
    GeneradorCongruencialLineal generador;
    /**
     * Creates new form EjercicioC
     */
    public EjercicioC() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cantidad = new javax.swing.JLabel();
        lbl_intervalos = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        txt_intervalos = new javax.swing.JTextField();
        btn_generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_m = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();
        txt_x0 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_k = new javax.swing.JTextField();
        txt_g = new javax.swing.JTextField();
        txt_a = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Prueba de Frecuencias con Generador Mixto"));

        lbl_cantidad.setText("Cantidad:");

        lbl_intervalos.setText("Intervalos:");

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Generador de Números Aleatorios"));

        jLabel2.setText("a: ");

        jLabel3.setText("c: ");

        jLabel4.setText("M: ");

        jLabel5.setText("Semilla: ");

        txt_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_mKeyReleased(evt);
            }
        });

        jLabel6.setText("k:");

        jLabel7.setText("g:");

        txt_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kActionPerformed(evt);
            }
        });
        txt_k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_kKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_kKeyReleased(evt);
            }
        });

        txt_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gActionPerformed(evt);
            }
        });
        txt_g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_gKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_gKeyReleased(evt);
            }
        });

        txt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aActionPerformed(evt);
            }
        });
        txt_a.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_aPropertyChange(evt);
            }
        });
        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_aKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txt_k))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_x0, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_m, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(txt_c)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_g, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txt_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txt_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_x0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_cantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lbl_intervalos)
                        .addGap(18, 18, 18)
                        .addComponent(txt_intervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btn_generar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_intervalos)
                    .addComponent(txt_intervalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:

        if (verificarCampos()){
            System.out.println("Campos verificados.");

            // método temporal para mostrar los números
            double [] n = generarNumeros();
            //mostrarNumeros(n);
            //System.out.println(imprimirArreglo(contarFrecuenciaEnIntervalos(n,Integer.parseInt(this.txt_intervalos.getText()))));
            String s = imprimirArreglo(contarFrecuenciaEnIntervalos(n,Integer.parseInt(this.txt_intervalos.getText())));
            this.display.setText("Cantidad de números en cada intervalo: \n" + s);
            
            limpiarCampos();
        } else {
            System.out.println("Ocurrió un error");
        }

    }//GEN-LAST:event_btn_generarActionPerformed

    private void txt_mKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_mKeyPressed

    private void txt_mKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mKeyReleased
        // TODO add your handling code here:
        if (this.txt_m.getText().isEmpty()){
            this.txt_g.setEnabled(true);
        }
        else {
            this.txt_g.setEnabled(false);
        }
    }//GEN-LAST:event_txt_mKeyReleased

    private void txt_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kActionPerformed

    private void txt_kKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kKeyPressed

    private void txt_kKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kKeyReleased
        // TODO add your handling code here:
        if (this.txt_k.getText().isEmpty()){
            this.txt_a.setEnabled(true);
        }
        else {
            this.txt_a.setEnabled(false);
        }
    }//GEN-LAST:event_txt_kKeyReleased

    private void txt_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gActionPerformed

    private void txt_gKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_gKeyPressed

    private void txt_gKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gKeyReleased
        // TODO add your handling code here:
        if (this.txt_g.getText().isEmpty()){
            this.txt_m.setEnabled(true);
        }
        else {
            this.txt_m.setEnabled(false);
        }
    }//GEN-LAST:event_txt_gKeyReleased

    private void txt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aActionPerformed

    }//GEN-LAST:event_txt_aActionPerformed

    private void txt_aPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_aPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_aPropertyChange

    private void txt_aKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyPressed

    }//GEN-LAST:event_txt_aKeyPressed

    private void txt_aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyReleased
        // TODO add your handling code here:
        if (this.txt_a.getText().isEmpty()){
            this.txt_k.setEnabled(true);
        }
        else {
            this.txt_k.setEnabled(false);
        }
    }//GEN-LAST:event_txt_aKeyReleased

    private void txt_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aKeyTyped

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
            java.util.logging.Logger.getLogger(EjercicioC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioC().setVisible(true);
            }
        });
    }
    
    private void limpiarCampos()
    {
        this.txt_a.setText("");
        this.txt_g.setText("");
        this.txt_c.setText("");
        this.txt_k.setText("");
        this.txt_m.setText("");
        this.txt_x0.setText("");
        this.txt_intervalos.setText("");
        this.txt_cantidad.setText("");
        this.txt_k.setEnabled(true);
        this.txt_m.setEnabled(true);
        this.txt_a.setEnabled(true);
        this.txt_g.setEnabled(true);
        
    }
    
    private boolean verificarCampos() {
        
        if (this.txt_a.getText().isEmpty() && this.txt_k.getText().isEmpty()){
            return false;
        }
        
        if (this.txt_m.getText().isEmpty() && this.txt_g.getText().isEmpty()){
            return false;
        }
        
        if (this.txt_x0.getText().isEmpty()){
            return false;
        }
        
        
        if (this.txt_cantidad.getText().isEmpty()){
            return false;
        }
        
        if(this.txt_intervalos.getText().isEmpty()) return false;
        
        try {
            if (Integer.parseInt(this.txt_intervalos.getText()) > Integer.parseInt(this.txt_cantidad.getText())){
                // no puede haber más intervalos que números
                JOptionPane.showMessageDialog(null,"La cantidad de intervalos debe ser menor a la de los números generados");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Inserte sólo números enteros");
        }
        
        return true;
    }

    /**
     * 
     * @return un array de números generados aleatoriamente por Java 
     */
    private double[] generarNumeros() {
        
        generador = new GeneradorCongruencialLineal();
        
        double [] num = null;
        if(verificarCampos())
        {
        
        int N = Integer.parseInt(this.txt_cantidad.getText());
        num = new double[N];
        try {

            if (!this.txt_a.getText().isEmpty()){
                generador.setA(Integer.parseInt(this.txt_a.getText()));
            }
            else {
                 generador.setK(Integer.parseInt(this.txt_k.getText()));
            }
            
            
            if (!this.txt_m.getText().isEmpty()){
                generador.setM(Integer.parseInt(this.txt_m.getText()));
            }
            else {
                 generador.setG(Integer.parseInt(this.txt_g.getText()));
            }
          
            if (!this.txt_c.getText().isEmpty()){
                generador.setC(Integer.parseInt(this.txt_c.getText()));
            }
            generador.setX0(Integer.parseInt(this.txt_x0.getText()));
        
            
            
            for (int i = 0; i < num.length; i++) {
                num[i] = generador.calcularSiguiente();
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        }
        return num;
    }

    /**
     * Muestra los números generados en el display
     * @param num 
     */
    private void mostrarNumeros(double[] num) {
       
       String s = imprimirArreglo(num);
       this.display.setText(s);
        
    }

    /**
     * Toma el arreglo de doubles y lo convierte en un string
     * Después habría que hacer que se convierta en un arreglo, para dividir
     * más fácilmente en intervalos.
     * @param num
     * @return 
     */
    private String imprimirArreglo(double[] num) {
    
        String s = "";
        
        for (int i = 0; i < num.length; i++) {
            s += String.valueOf(num[i]) + ", ";
        }
        
        return s.substring(0, s.length()-2);
    }
    
    /**
     * Sobrecarga para permitir leer el array de int
     * @param num
     * @return 
     */
    private String imprimirArreglo(int[] num) {
    
        String s = "{ ";
        
        for (int i = 0; i < num.length; i++) {
            s += String.valueOf(num[i]) + ", ";
        }
        return s.substring(0, s.length()-2) + " }";
    }
    
    /**
     * Si alguno encuentra una forma mejor, ¯\_(ツ)_/¯
     * Cuenta la frecuencia en la que aparecen números en cada intervalo.
     *
     * @param num - el array de números aleatorios
     * @param intervalos - la cantidad de intervalos en los que se dividen
     * @return 
     */
    
    private int[] contarFrecuenciaEnIntervalos(double[] num, int intervalos) {
      
        int [] cont = new int [intervalos];
        // marca el límite para el primer casillero
        double limiteFijo = (double)1/intervalos;
        
        // recorro todos los números aleatorios
        for (int i = 0; i < num.length; i++) {
        
            double limiteVar = limiteFijo;
            int foo = 1; // multiplicador del límite
            int casillero = 0; // intervalo al que corresponde
         
            // mientras no corresponda a ese intervalo
            while (num[i] > limiteVar) {
                foo++;
                limiteVar = limiteFijo * foo; // e.g. si hay 10 intervalos crece como 0.1, 0.2, etc.
                casillero++;
            }
            // pero si entra en ese intervalo,
            cont[casillero]++;
        }
        
        return cont;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_intervalos;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_c;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_g;
    private javax.swing.JTextField txt_intervalos;
    private javax.swing.JTextField txt_k;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_x0;
    // End of variables declaration//GEN-END:variables
}
