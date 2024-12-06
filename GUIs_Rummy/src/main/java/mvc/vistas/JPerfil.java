package mvc.vistas;

import mvc.controladores.ControladorPerfil;
import mvc.controladores.ControladorUnirsePartida;
import mvc.modelos.ConstantesVentanas;
import mvc.modelos.ModeloObserver;
import mvc.modelos.ModeloUnirsePartida;
import mvc.modelos.Observable;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Katt
 */
public class JPerfil extends javax.swing.JFrame implements ModeloObserver {

    private ControladorPerfil controlador;
    private Color ccolor1, ccolor2, ccolor3, ccolor4;

    /**
     * Creates new form JPerfil
     */
    public JPerfil(ControladorPerfil controlador) {
        initComponents();
        this.controlador = controlador;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuho = new javax.swing.JButton();
        btnPanda = new javax.swing.JButton();
        btnMapache = new javax.swing.JButton();
        btnZorro = new javax.swing.JButton();
        btnLobo = new javax.swing.JButton();
        btnGallo = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        color1 = new javax.swing.JButton();
        color2 = new javax.swing.JButton();
        color3 = new javax.swing.JButton();
        color4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuho.setBorder(null);
        btnBuho.setBorderPainted(false);
        btnBuho.setContentAreaFilled(false);
        getContentPane().add(btnBuho, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 60, 50));

        btnPanda.setBorder(null);
        btnPanda.setBorderPainted(false);
        btnPanda.setContentAreaFilled(false);
        getContentPane().add(btnPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 60, 50));

        btnMapache.setBorder(null);
        btnMapache.setBorderPainted(false);
        btnMapache.setContentAreaFilled(false);
        getContentPane().add(btnMapache, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 220, 60, 60));

        btnZorro.setBorder(null);
        btnZorro.setBorderPainted(false);
        btnZorro.setContentAreaFilled(false);
        getContentPane().add(btnZorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 60, 60));

        btnLobo.setToolTipText("");
        btnLobo.setBorder(null);
        btnLobo.setBorderPainted(false);
        btnLobo.setContentAreaFilled(false);
        getContentPane().add(btnLobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 293, 60, 50));

        btnGallo.setBorder(null);
        btnGallo.setBorderPainted(false);
        btnGallo.setContentAreaFilled(false);
        getContentPane().add(btnGallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 60, 60));

        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 270, 80));

        color1.setBackground(new java.awt.Color(255, 255, 255));
        color1.setForeground(new java.awt.Color(0, 0, 0));
        color1.setBorder(null);
        color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color1ActionPerformed(evt);
            }
        });
        getContentPane().add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 70, 100));

        color2.setBackground(new java.awt.Color(255, 255, 255));
        color2.setForeground(new java.awt.Color(0, 0, 0));
        color2.setBorder(null);
        color2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color2ActionPerformed(evt);
            }
        });
        getContentPane().add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 70, 100));

        color3.setBackground(new java.awt.Color(255, 255, 255));
        color3.setForeground(new java.awt.Color(0, 0, 0));
        color3.setBorder(null);
        color3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color3ActionPerformed(evt);
            }
        });
        getContentPane().add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 70, 100));

        color4.setBackground(new java.awt.Color(255, 255, 255));
        color4.setForeground(new java.awt.Color(0, 0, 0));
        color4.setBorder(null);
        color4.setBorderPainted(false);
        color4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color4ActionPerformed(evt);
            }
        });
        getContentPane().add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 70, 100));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Color 4:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Color 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Color 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color 3:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel5.setText("Seleccione el color");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 190, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel6.setText(" de las Fichas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        txtNombre.setBackground(new java.awt.Color(137, 91, 91));
        txtNombre.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 220, 40));

        labelFondo.setFont(new java.awt.Font("Niagara Solid", 0, 12)); // NOI18N
        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc/recursos/fondos/Perfilimg.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        controlador.agregarColores(ccolor1, ccolor2, ccolor3, ccolor4);
        controlador.mostrarUnirsePartida();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color1ActionPerformed
        JColorChooser colorsito = new JColorChooser();
        ccolor1 = colorsito.showDialog(null, "Selecciona un color nene", Color.RED);
        color1.setBackground(ccolor1);
    }//GEN-LAST:event_color1ActionPerformed

    private void color2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color2ActionPerformed
        JColorChooser colorsito = new JColorChooser();
        ccolor2 = colorsito.showDialog(null, "Selecciona un color nene", Color.BLUE);
        color2.setBackground(ccolor2);
    }//GEN-LAST:event_color2ActionPerformed

    private void color3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color3ActionPerformed
        JColorChooser colorsito = new JColorChooser();
        ccolor3 = colorsito.showDialog(null, "Selecciona un color nene", Color.GREEN);
        color3.setBackground(ccolor3);
    }//GEN-LAST:event_color3ActionPerformed

    private void color4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color4ActionPerformed
        JColorChooser colorsito = new JColorChooser();
        ccolor4 = colorsito.showDialog(null, "Selecciona un color nene", Color.YELLOW);
        color4.setBackground(ccolor4);
    }//GEN-LAST:event_color4ActionPerformed

    public void agregarColores() {
        controlador.agregarColores(ccolor1, ccolor2, ccolor3, ccolor4);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuho;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGallo;
    private javax.swing.JButton btnLobo;
    private javax.swing.JButton btnMapache;
    private javax.swing.JButton btnPanda;
    private javax.swing.JButton btnZorro;
    private javax.swing.JButton color1;
    private javax.swing.JButton color2;
    private javax.swing.JButton color3;
    private javax.swing.JButton color4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void cambiarVentana(int ventana) {
        if (ventana == ConstantesVentanas.JUNIRSEPARTIDA) {
            this.setVisible(false);
            ModeloUnirsePartida m = new ModeloUnirsePartida();
            //Cargamos controlador y le asignamos qué modelo controlar
            ControladorUnirsePartida c = new ControladorUnirsePartida(m);
            //Cargamos 2 vistas y asignamos cual queremos que sea su controlador 
            JUnirsePartida v = new JUnirsePartida(c);
            //añadimos observadores al modelo. En este caso, dos vistas.
            m.addObservador(v);
        }
    }
}
