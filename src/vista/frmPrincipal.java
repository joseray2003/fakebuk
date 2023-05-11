package vista;

import com.google.gson.Gson;
import control.usuarioController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.usuarioModel;
import org.bson.Document;
import static vista.frmPerfil.lblFotoPerfil;

public class frmPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    Image salir;

    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ShowJPanel(new frmMural());
        lblAtras.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/soloLogo.png")));
        pnlPrincipal.setSize(1000, 3300);
        salir = cargarImg(btnLogOut, "/img/cerrar-sesion.png");
        btnLogOut.setIcon(new ImageIcon(salir));
    }

    private void InitContent() {
        ShowJPanel(new frmMural());
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(1038, 3500);
        p.setLocation(0, 0);

        pnlPrincipal.removeAll();
        pnlPrincipal.add(p, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Close = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tamaño = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        Lupa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PerfilUsuario = new javax.swing.JPanel();
        Separador = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCiudad = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JLabel();
        PanelCrearPublicacion = new javax.swing.JPanel();
        EnQueEstasPensando = new javax.swing.JLabel();
        btnPublicar = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JLabel();
        Emojis = new javax.swing.JLabel();
        pnlAtras = new javax.swing.JPanel();
        lblAtras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();
        scpRecomendados = new javax.swing.JScrollPane();
        Recomendados = new javax.swing.JPanel();
        UsuariosFakeVerso = new javax.swing.JLabel();
        PerfilUno = new javax.swing.JPanel();
        FotoPerfilUno = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreRecomendacion = new javax.swing.JLabel();
        txtEstatus1 = new javax.swing.JLabel();
        PerfilUno1 = new javax.swing.JPanel();
        FotoPerfilUno2 = new javax.swing.JLabel();
        lblStatus2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreRecomendacion2 = new javax.swing.JLabel();
        txtEstatus3 = new javax.swing.JLabel();
        rutaRecomendacion2 = new javax.swing.JLabel();
        rutaRecomendacion1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fakebuk");
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1046, 609));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setBackground(new java.awt.Color(82, 120, 206));
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CloseMouseReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");

        javax.swing.GroupLayout CloseLayout = new javax.swing.GroupLayout(Close);
        Close.setLayout(CloseLayout);
        CloseLayout.setHorizontalGroup(
            CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CloseLayout.setVerticalGroup(
            CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        bg.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 30, 30));

        Tamaño.setBackground(new java.awt.Color(82, 120, 206));
        Tamaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TamañoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TamañoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TamañoMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_");

        javax.swing.GroupLayout TamañoLayout = new javax.swing.GroupLayout(Tamaño);
        Tamaño.setLayout(TamañoLayout);
        TamañoLayout.setHorizontalGroup(
            TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
        );
        TamañoLayout.setVerticalGroup(
            TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TamañoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        bg.add(Tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

        btnActualizar.setBackground(new java.awt.Color(82, 120, 206));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 30, 30));

        Barra.setBackground(new java.awt.Color(82, 120, 206));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chiquito.png"))); // NOI18N
        Barra.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 39));

        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setText("Buscar");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        Barra.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 0, 236, 30));

        btnBuscar.setBackground(new java.awt.Color(82, 120, 206));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(Lupa)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(Lupa))
        );

        Barra.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 0, 30, 28));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoBarra.png"))); // NOI18N
        Barra.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, -1));

        bg.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 30));

        PerfilUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separador.setText("________________________________________________");
        PerfilUsuario.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 346, -1, -1));

        lblFotoPerfil.setToolTipText("");
        lblFotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PerfilUsuario.add(lblFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 11, 100, 100));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nombre:");
        PerfilUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 139, 68, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Correo:");
        PerfilUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Ciudad:");
        PerfilUsuario.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 68, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNombre.setText("*nombre usuario*");
        PerfilUsuario.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 139, 130, -1));

        txtCorreo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCorreo.setText("*correo usuario*");
        PerfilUsuario.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 157, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ver Perfil");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        PerfilUsuario.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 80, -1));

        jSeparator1.setForeground(new java.awt.Color(82, 120, 206));
        PerfilUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 100, 10));

        txtCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCiudad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCiudad.setText("Navojoa.");
        PerfilUsuario.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 157, -1));

        txt.setForeground(new java.awt.Color(240, 240, 240));
        PerfilUsuario.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 60, 20));

        ruta.setForeground(new java.awt.Color(240, 240, 240));
        PerfilUsuario.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 70, 30));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("edad:");
        PerfilUsuario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 68, -1));

        txtEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEdad.setText("edad");
        PerfilUsuario.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 157, -1));

        bg.add(PerfilUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 360));

        PanelCrearPublicacion.setBackground(new java.awt.Color(255, 255, 255));
        PanelCrearPublicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnQueEstasPensando.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EnQueEstasPensando.setText("¿En que estas pensando?");
        PanelCrearPublicacion.add(EnQueEstasPensando, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 12, 170, -1));

        btnPublicar.setBackground(new java.awt.Color(82, 120, 206));

        btnEntrar.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("Publicar");
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

        javax.swing.GroupLayout btnPublicarLayout = new javax.swing.GroupLayout(btnPublicar);
        btnPublicar.setLayout(btnPublicarLayout);
        btnPublicarLayout.setHorizontalGroup(
            btnPublicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnPublicarLayout.setVerticalGroup(
            btnPublicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPublicarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelCrearPublicacion.add(btnPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 170, 20));

        Emojis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emojis.png"))); // NOI18N
        PanelCrearPublicacion.add(Emojis, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 310, 40));

        pnlAtras.setBackground(new java.awt.Color(255, 255, 255));
        pnlAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseExited(evt);
            }
        });

        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Atras.png"))); // NOI18N
        lblAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAtrasLayout = new javax.swing.GroupLayout(pnlAtras);
        pnlAtras.setLayout(pnlAtrasLayout);
        pnlAtrasLayout.setHorizontalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAtrasLayout.setVerticalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PanelCrearPublicacion.add(pnlAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        bg.add(PanelCrearPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 940, 40));

        jScrollPane1.setHorizontalScrollBar(null);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1349, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlPrincipal);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 72, 940, 700));

        Recomendados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuariosFakeVerso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        UsuariosFakeVerso.setText("Usuarios en el FakeVerso:");
        Recomendados.add(UsuariosFakeVerso, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 190, -1));

        PerfilUno.setBackground(new java.awt.Color(225, 225, 225));
        PerfilUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PerfilUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilUnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PerfilUnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfilUnoMouseExited(evt);
            }
        });
        PerfilUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FotoPerfilUno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PerfilUno.add(FotoPerfilUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        lblStatus.setFont(new java.awt.Font("Sans Serif Collection", 0, 11)); // NOI18N
        PerfilUno.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 20, 20));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Estatus");
        PerfilUno.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Nombre:");
        PerfilUno.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        txtNombreRecomendacion.setFont(new java.awt.Font("Sans Serif Collection", 0, 11)); // NOI18N
        txtNombreRecomendacion.setText("*nombre usuario*");
        PerfilUno.add(txtNombreRecomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, -1));

        txtEstatus1.setFont(new java.awt.Font("Sans Serif Collection", 0, 11)); // NOI18N
        txtEstatus1.setText("Desconectado");
        PerfilUno.add(txtEstatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 80, 20));

        Recomendados.add(PerfilUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, -1));

        PerfilUno1.setBackground(new java.awt.Color(225, 225, 225));
        PerfilUno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PerfilUno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilUno1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PerfilUno1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfilUno1MouseExited(evt);
            }
        });
        PerfilUno1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FotoPerfilUno2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PerfilUno1.add(FotoPerfilUno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        lblStatus2.setFont(new java.awt.Font("Sans Serif Collection", 0, 11)); // NOI18N
        PerfilUno1.add(lblStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 20, 20));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setText("Estatus");
        PerfilUno1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel13.setText("Nombre:");
        PerfilUno1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        txtNombreRecomendacion2.setFont(new java.awt.Font("Sans Serif Collection", 0, 11)); // NOI18N
        txtNombreRecomendacion2.setText("*nombre usuario*");
        PerfilUno1.add(txtNombreRecomendacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, -1));

        txtEstatus3.setFont(new java.awt.Font("Sans Serif Collection", 0, 11)); // NOI18N
        txtEstatus3.setText("Conectado");
        PerfilUno1.add(txtEstatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 60, 20));

        Recomendados.add(PerfilUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, -1));

        rutaRecomendacion2.setForeground(new java.awt.Color(240, 240, 240));
        Recomendados.add(rutaRecomendacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, 20));

        rutaRecomendacion1.setForeground(new java.awt.Color(240, 240, 240));
        Recomendados.add(rutaRecomendacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 20));

        btnLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogOut.setText("salir");
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        Recomendados.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 60, 50));

        scpRecomendados.setViewportView(Recomendados);

        bg.add(scpRecomendados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 290, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image cargarImg(JLabel lbl, String ruta) {
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image foto = icon.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), 0);
        return foto;
    }

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        Close.setBackground(new Color(255, 51, 0));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        Close.setBackground(new Color(82, 120, 206));
    }//GEN-LAST:event_CloseMouseExited

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased

    }//GEN-LAST:event_CloseMouseReleased

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        frmPreguntaSalir pr = new frmPreguntaSalir();
        pr.setVisible(true);
    }//GEN-LAST:event_CloseMouseClicked

    private void TamañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamañoMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_TamañoMouseClicked

    private void TamañoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamañoMouseEntered
        Tamaño.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_TamañoMouseEntered

    private void TamañoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamañoMouseExited
        Tamaño.setBackground(new Color(82, 120, 206));
    }//GEN-LAST:event_TamañoMouseExited

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if (txtBuscar.getText().equals("Buscar")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_txtBuscarMousePressed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(82, 120, 206));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(82, 120, 206));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        frmPublicar pub = new frmPublicar();
        pub.setVisible(true);

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnPublicar.setBackground(new Color(62, 143, 80));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnPublicar.setBackground(new Color(82, 120, 206));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void PerfilUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUnoMouseClicked
        ShowJPanel(new frmPerfil());
        lblAtras.setVisible(true);

        String qu = "{ 'correo': '"+ rutaRecomendacion1.getText() +"' }";
        Document doc = Document.parse(qu);
        usuarioController UC = new usuarioController();
        List<Document> use = UC.ListarFiltro(doc);
        Gson gs = new Gson();

        for (Document l : use) {
            usuarioModel e = gs.fromJson(l.toJson(), usuarioModel.class);
            
            ImageIcon iconFoto = new ImageIcon(getClass().getResource(e.getImg()));
            Image foto = iconFoto.getImage().getScaledInstance(120, 120, 0);
            frmPerfil.lblFotoPerfil.setIcon(new ImageIcon(foto));
            frmPerfil.txtNombreUsuario.setText(e.getNombre() + " " + e.getApellido());
            frmPerfil.txtCiudad.setText(e.getCiudad());
            frmPerfil.txtEdad.setText(e.getEdad()+"");
            frmPerfil.txtSeguidores.setText("992K");
            ImageIcon iconPortada = new ImageIcon(getClass().getResource("/img/fondo1.jpg"));
            Image fotoPortada = iconPortada.getImage().getScaledInstance(560, 250, 0);
            frmPerfil.portada.setIcon(new ImageIcon(fotoPortada));
        }
    }//GEN-LAST:event_PerfilUnoMouseClicked

    private void PerfilUnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUnoMouseEntered
        PerfilUno.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PerfilUnoMouseEntered

    private void PerfilUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUnoMouseExited
        PerfilUno.setBackground(new Color(225, 225, 225));
    }//GEN-LAST:event_PerfilUnoMouseExited

    private void pnlAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseExited

    }//GEN-LAST:event_pnlAtrasMouseExited

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        pnlAtras.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblAtrasMouseExited

    private void lblAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseEntered
        pnlAtras.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_lblAtrasMouseEntered

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        ShowJPanel(new frmMural());
        lblAtras.setVisible(false);
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        ShowJPanel(new frmPerfil());
        lblAtras.setVisible(true);
        ImageIcon iconFoto = new ImageIcon(getClass().getResource(ruta.getText()));
        Image fotoFoto = iconFoto.getImage().getScaledInstance(120, 120, 0);
        frmPerfil.lblFotoPerfil.setIcon(new ImageIcon(fotoFoto));
        frmPerfil.txtNombreUsuario.setText(txtNombre.getText());
        frmPerfil.txtSeguidores.setText("1.6M");
        frmPerfil.txtCiudad.setText(txtCiudad.getText());
        frmPerfil.txtEdad.setText(txtEdad.getText());
        ImageIcon iconPortada = new ImageIcon(getClass().getResource("/img/fondo3.jpg"));
        Image fotoPortada = iconPortada.getImage().getScaledInstance(560, 250, 0);
        frmPerfil.portada.setIcon(new ImageIcon(fotoPortada));
    }//GEN-LAST:event_jLabel16MouseClicked

    private void PerfilUno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUno1MouseClicked
        ShowJPanel(new frmPerfil());
        lblAtras.setVisible(true);

        String qu = "{ 'correo': '"+ rutaRecomendacion2.getText() +"' }";
        Document doc = Document.parse(qu);
        usuarioController UC = new usuarioController();
        List<Document> use = UC.ListarFiltro(doc);
        Gson gs = new Gson();

        for (Document l : use) {
            usuarioModel e = gs.fromJson(l.toJson(), usuarioModel.class);
            
            ImageIcon iconFoto = new ImageIcon(getClass().getResource(e.getImg()));
            Image foto = iconFoto.getImage().getScaledInstance(120, 120, 0);
            frmPerfil.lblFotoPerfil.setIcon(new ImageIcon(foto));
            frmPerfil.txtNombreUsuario.setText(e.getNombre() + " " + e.getApellido());
            frmPerfil.txtCiudad.setText(e.getCiudad());
            frmPerfil.txtEdad.setText(e.getEdad()+"");
            frmPerfil.txtSeguidores.setText("1.8M");
            ImageIcon iconPortada = new ImageIcon(getClass().getResource("/img/fondo2.jpg"));
            Image fotoPortada = iconPortada.getImage().getScaledInstance(560, 250, 0);
            frmPerfil.portada.setIcon(new ImageIcon(fotoPortada));
        }

    }//GEN-LAST:event_PerfilUno1MouseClicked

    private void PerfilUno1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUno1MouseEntered
        PerfilUno1.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PerfilUno1MouseEntered

    private void PerfilUno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUno1MouseExited
        PerfilUno1.setBackground(new Color(225, 225, 225));
    }//GEN-LAST:event_PerfilUno1MouseExited

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        frmLogin login = new frmLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogOutMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Close;
    private javax.swing.JLabel Emojis;
    private javax.swing.JLabel EnQueEstasPensando;
    public static javax.swing.JLabel FotoPerfilUno;
    public static javax.swing.JLabel FotoPerfilUno2;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Lupa;
    private javax.swing.JPanel PanelCrearPublicacion;
    private javax.swing.JPanel PerfilUno;
    private javax.swing.JPanel PerfilUno1;
    private javax.swing.JPanel PerfilUsuario;
    public static javax.swing.JPanel Recomendados;
    private javax.swing.JLabel Separador;
    private javax.swing.JPanel Tamaño;
    private javax.swing.JLabel UsuariosFakeVerso;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel btnLogOut;
    private javax.swing.JPanel btnPublicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtras;
    public static javax.swing.JLabel lblFotoPerfil;
    public static javax.swing.JLabel lblStatus;
    public static javax.swing.JLabel lblStatus2;
    private javax.swing.JPanel pnlAtras;
    private javax.swing.JPanel pnlPrincipal;
    public static javax.swing.JLabel ruta;
    public static javax.swing.JLabel rutaRecomendacion1;
    public static javax.swing.JLabel rutaRecomendacion2;
    private javax.swing.JScrollPane scpRecomendados;
    public static javax.swing.JLabel txt;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JLabel txtCiudad;
    public static javax.swing.JLabel txtCorreo;
    public static javax.swing.JLabel txtEdad;
    public static javax.swing.JLabel txtEstatus1;
    public static javax.swing.JLabel txtEstatus3;
    public static javax.swing.JLabel txtNombre;
    public static javax.swing.JLabel txtNombreRecomendacion;
    public static javax.swing.JLabel txtNombreRecomendacion2;
    // End of variables declaration//GEN-END:variables
}
