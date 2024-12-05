/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mvc.vistas;

import entidades.Partida;
import mvc.controladores.ControladorTablero;
import mvc.modelos.ModeloObserver;
import mvc.modelos.ModeloTablero;
import mvc.modelos.Observable;
import pyf.cliente.Cliente;

/**
 *
 * @author PERSONAL
 */
public class JTablero extends javax.swing.JFrame implements ModeloObserver {

    ControladorTablero controlador;

    /**
     * Creates new form JTablero
     */
    public JTablero(ControladorTablero controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Cliente cliente = Cliente.getInstancia();
        Partida partida = cliente.getPartidaCliente();
        for (int i = 0; i < partida.getJugadores().size(); i++) {
            if (i == 0) {
                labelJugador1.setText(partida.getJugadores().get(i).getNombre());
            } else if (i == 1) {
                labelJugador2.setText(partida.getJugadores().get(i).getNombre());
            } else if (i == 2) {
                labelJugador3.setText(partida.getJugadores().get(i).getNombre());
            } else if (i == 3) {
                labelJugador4.setText(partida.getJugadores().get(i).getNombre());
            }
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

        btnJalarFicha = new javax.swing.JButton();
        labelJugador1 = new javax.swing.JLabel();
        labelJugador2 = new javax.swing.JLabel();
        labelJugador3 = new javax.swing.JLabel();
        labelJugador4 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJalarFicha.setBorderPainted(false);
        btnJalarFicha.setContentAreaFilled(false);
        btnJalarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJalarFichaActionPerformed(evt);
            }
        });
        getContentPane().add(btnJalarFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 140, 130));
        getContentPane().add(labelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));
        getContentPane().add(labelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 30));
        getContentPane().add(labelJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));
        getContentPane().add(labelJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 30));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc/recursos/fondos/fondoTablero.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJalarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJalarFichaActionPerformed
        controlador.evtTerminarTurno();
        controlador.evtJalarFicha();
    }//GEN-LAST:event_btnJalarFichaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJalarFicha;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelJugador1;
    private javax.swing.JLabel labelJugador2;
    private javax.swing.JLabel labelJugador3;
    private javax.swing.JLabel labelJugador4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {

        //Lógica específica para actualizar componentes
        
        // Fuerza la actualización visual
        this.revalidate();
        this.repaint();
    }

    @Override
    public void cambiarVentana(int ventana) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}