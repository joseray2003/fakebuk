package vista;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import control.usuarioController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.usuarioModel;
import org.bson.Document;

public class frmLogin extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public frmLogin() {
        initComponents();
        setSize(900, 515);
        setLocationRelativeTo(null);
        setTitle("FakëBuk");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/soloLogo.png")));
        img();
    }    
    
    public void img(){
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/img/logoFakeBuk.png"));
        Image fotoLogo = iconLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), 0);
        logo.setIcon(new ImageIcon(fotoLogo));
        
        ImageIcon iconBg = new ImageIcon(getClass().getResource("/img/blueWhiteGradient.jpg"));
        Image fotoBg = iconBg.getImage().getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), 0);
        bgImg.setIcon(new ImageIcon(fotoBg));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        separadorCorreo = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        separadorPassword = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        pnlEntrar = new org.netbeans.modules.form.InvalidComponent();
        btnEntrar = new javax.swing.JLabel();
        pnlSalir = new org.netbeans.modules.form.InvalidComponent();
        btnSalir = new javax.swing.JLabel();
        bgImg = new javax.swing.JLabel();
        Arrastrable = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(82, 120, 206));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("logo");

        label.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Navega por todo el fakeVerso y conecta con los demás");

        label2.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Mira publicaciones de cualquier persona");

        label3.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Sin censura");

        label4.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Libre de expresión");

        Label5.setFont(new java.awt.Font("Sans Serif Collection", 0, 10)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 255, 255));
        Label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label5.setText("Todos los derechos reservados by Martín Borbón - Eric Carballo - Raymundo López");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(Label5)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 420, 520));

        lblCorreo.setFont(new java.awt.Font("Sans Serif Collection", 0, 24)); // NOI18N
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("Correo");
        bg.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 30));

        txtCorreo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setText("Ingrese Correo");
        txtCorreo.setBorder(null);
        txtCorreo.setOpaque(false);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        bg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 250, 40));

        separadorCorreo.setForeground(new java.awt.Color(51, 51, 51));
        bg.add(separadorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 250, 10));

        lblPassword.setFont(new java.awt.Font("Sans Serif Collection", 0, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Contraseña");
        bg.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 480, 30));

        separadorPassword.setForeground(new java.awt.Color(51, 51, 51));
        bg.add(separadorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, 10));

        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("******");
        txtPassword.setBorder(null);
        txtPassword.setOpaque(false);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        bg.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 250, 40));

        pnlEntrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("ENTRAR");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        pnlEntrar.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        bg.add(pnlEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 120, 40));

        pnlSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        pnlSalir.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        bg.add(pnlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 120, 40));
        bg.add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 480, 480));

        Arrastrable.setBackground(new java.awt.Color(255, 255, 255));
        Arrastrable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ArrastrableMouseDragged(evt);
            }
        });
        Arrastrable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ArrastrableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ArrastrableLayout = new javax.swing.GroupLayout(Arrastrable);
        Arrastrable.setLayout(ArrastrableLayout);
        ArrastrableLayout.setHorizontalGroup(
            ArrastrableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        ArrastrableLayout.setVerticalGroup(
            ArrastrableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(Arrastrable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
          if (txtCorreo.getText().equals("Ingrese Correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
            txtPassword.setText("******");
            txtPassword.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
         if (String.valueOf(txtPassword.getPassword()).equals("******")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        }
        
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese Correo");
        txtCorreo.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txtPasswordMousePressed

    private void ArrastrableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrastrableMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ArrastrableMousePressed

    private void ArrastrableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrastrableMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_ArrastrableMouseDragged

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        pnlEntrar.setBackground(new Color(82,120,206));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        pnlEntrar.setBackground(new Color(62,143,80));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked

        try {
            String email = txtCorreo.getText();
            String password = txtPassword.getText();

            String query = "{ 'correo': '" + email + "', 'password': '" + password + "' }";
            System.out.println(query);
            Document filtro = Document.parse(query);

            usuarioController UC = new usuarioController();
            List<Document> usuario = UC.ListarFiltro(filtro);
            Gson gson = new Gson();

            for (Document user : usuario) {
                usuarioModel u = gson.fromJson(user.toJson(), usuarioModel.class);

                if( email.equals(u.getEmail()) && password.equals(u.getPassword()) ) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + u.getNombre(), "Frame Principal", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Correo o Contraseña Incorrecto", "Error Inicio Sesión", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Correo o Contraseña Incorrecto", "Error Inicio Sesión", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        pnlSalir.setBackground(new Color(82,120,206));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        pnlSalir.setBackground(new Color(255, 51, 0));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?", "FakeBuk", JOptionPane.YES_NO_OPTION);
        if(opcion != 1){
            System.exit(0);
            return;
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arrastrable;
    private javax.swing.JLabel Label5;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgImg;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel logo;
    private org.netbeans.modules.form.InvalidComponent pnlEntrar;
    private org.netbeans.modules.form.InvalidComponent pnlSalir;
    private javax.swing.JSeparator separadorCorreo;
    private javax.swing.JSeparator separadorPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
