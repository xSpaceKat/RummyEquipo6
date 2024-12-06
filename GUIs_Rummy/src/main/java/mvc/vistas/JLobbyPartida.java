package mvc.vistas;

import entidades.Partida;
import mvc.controladores.ControladorCrearPartida;
import mvc.controladores.ControladorLobbyPartida;
import mvc.controladores.ControladorPerfil;
import mvc.modelos.ConstantesVentanas;
import mvc.modelos.ModeloCrearPartida;
import mvc.modelos.ModeloObserver;
import mvc.modelos.ModeloPerfil;
import mvc.modelos.Observable;
import pyf.cliente.Cliente;

/**
 *
 * @author Katt
 */
public class JLobbyPartida extends javax.swing.JFrame implements ModeloObserver {

    private ControladorLobbyPartida controlador;

    /**
     * Creates new form JLobbyPartida
     */
    public JLobbyPartida(ControladorLobbyPartida controlador) {
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
            }else if (i == 2) {
                labelJugador3.setText(partida.getJugadores().get(i).getNombre());
            }else if (i == 3) {
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

        btnAtras = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnListo = new javax.swing.JButton();
        labelJugador1 = new javax.swing.JLabel();
        labelJugador2 = new javax.swing.JLabel();
        labelJugador3 = new javax.swing.JLabel();
        labelJugador4 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 400, 180, 60));

        btnPerfil.setBorder(null);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 90, 130));

        btnListo.setBorder(null);
        btnListo.setBorderPainted(false);
        btnListo.setContentAreaFilled(false);
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 180, 60));
        getContentPane().add(labelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 30));
        getContentPane().add(labelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 200, 40));
        getContentPane().add(labelJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 200, 30));
        getContentPane().add(labelJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 200, 30));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc/recursos/fondos/LobbyPartidaImg.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        controlador.mostrarPerfil();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelJugador1;
    private javax.swing.JLabel labelJugador2;
    private javax.swing.JLabel labelJugador3;
    private javax.swing.JLabel labelJugador4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void cambiarVentana(int ventana) {
        if (ventana == ConstantesVentanas.JCREARPARTIDA) {
            this.setVisible(false);
            ModeloCrearPartida m = new ModeloCrearPartida();
            //Cargamos controlador y le asignamos qué modelo controlar
            ControladorCrearPartida c = new ControladorCrearPartida(m);
            //Cargamos 2 vistas y asignamos cual queremos que sea su controlador 
            JCrearPartida v = new JCrearPartida(c);
            //añadimos observadores al modelo. En este caso, dos vistas.
            m.addObservador(v);
        } else if (ventana == ConstantesVentanas.JPERFIL) {
            this.setVisible(false);
            ModeloPerfil m = new ModeloPerfil();
            //Cargamos controlador y le asignamos qué modelo controlar
            ControladorPerfil c = new ControladorPerfil(m);
            //Cargamos 2 vistas y asignamos cual queremos que sea su controlador 
            JPerfil v = new JPerfil(c);
            //añadimos observadores al modelo. En este caso, dos vistas.
            m.addObservador(v);
        }
    }
}
