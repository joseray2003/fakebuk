package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class frmCerrar extends javax.swing.JFrame {

    int xMouse, yMouse;
    public frmCerrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        image();
    }

    public void image(){
     ImageIcon iconLogo = new ImageIcon(getClass().getResource("/img/despedida.png"));
        Image fotoLogo = iconLogo.getImage().getScaledInstance(Mascota.getWidth(), Mascota.getHeight(), 0);
        Mascota.setIcon(new ImageIcon(fotoLogo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mascota = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JLabel();
        pnlArrastrable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mascota.setText("Mascota");
        jPanel1.add(Mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 100));

        btnAceptar.setBackground(new java.awt.Color(82, 120, 206));

        btnEntrar.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("Salir");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAceptarLayout = new javax.swing.GroupLayout(btnAceptar);
        btnAceptar.setLayout(btnAceptarLayout);
        btnAceptarLayout.setHorizontalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAceptarLayout.setVerticalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAceptarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, 20));

        pnlArrastrable.setBackground(new java.awt.Color(244, 244, 244));
        pnlArrastrable.setOpaque(false);
        pnlArrastrable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlArrastrableMouseDragged(evt);
            }
        });
        pnlArrastrable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlArrastrableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlArrastrableLayout = new javax.swing.GroupLayout(pnlArrastrable);
        pnlArrastrable.setLayout(pnlArrastrableLayout);
        pnlArrastrableLayout.setHorizontalGroup(
            pnlArrastrableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        pnlArrastrableLayout.setVerticalGroup(
            pnlArrastrableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(pnlArrastrable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("<html>Esperamos que la hayas pasado bien en Fakebuk!!<html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 210, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnAceptar.setBackground(new Color(255, 51, 0));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnAceptar.setBackground(new Color(82,120,206));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void pnlArrastrableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArrastrableMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlArrastrableMousePressed

    private void pnlArrastrableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArrastrableMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_pnlArrastrableMouseDragged

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
            java.util.logging.Logger.getLogger(frmCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCerrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCerrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mascota;
    private javax.swing.JPanel btnAceptar;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlArrastrable;
    // End of variables declaration//GEN-END:variables
}
