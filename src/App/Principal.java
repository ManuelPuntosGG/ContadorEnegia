package App;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Principal extends javax.swing.JFrame {

    private int i = 1;

    public Principal() {
        initComponents();
        convertirIMG("/Media/Energia.png", lblEn);
        this.setTitle("Contador de Energía by ManuelPuntosGG");
        this.setAlwaysOnTop(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Media/Energia.png")));
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        btnCls = new javax.swing.JLabel();
        btnFin = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        lblN = new javax.swing.JLabel();
        lblRound = new javax.swing.JLabel();
        lblEn = new javax.swing.JLabel();
        btnWin = new javax.swing.JLabel();
        btnLose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/M.png"))); // NOI18N
        btnMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 30));

        btnReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/R.png"))); // NOI18N
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 30, 30));

        btnCls.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/X.png"))); // NOI18N
        btnCls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClsMouseClicked(evt);
            }
        });
        jPanel1.add(btnCls, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 30));

        btnFin.setBackground(new java.awt.Color(0, 0, 102));
        btnFin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFin.setForeground(new java.awt.Color(255, 255, 255));
        btnFin.setText("FIN DE RONDA");
        btnFin.setBorderPainted(false);
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        jPanel1.add(btnFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        btnP.setBackground(new java.awt.Color(0, 0, 102));
        btnP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnP.setForeground(new java.awt.Color(255, 255, 255));
        btnP.setText("-1");
        btnP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnP.setBorderPainted(false);
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        jPanel1.add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        btnG.setBackground(new java.awt.Color(0, 0, 102));
        btnG.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnG.setForeground(new java.awt.Color(255, 255, 255));
        btnG.setText("+1");
        btnG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnG.setBorderPainted(false);
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        jPanel1.add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 90, 30));

        lblN.setBackground(new java.awt.Color(255, 255, 255));
        lblN.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblN.setForeground(new java.awt.Color(255, 255, 255));
        lblN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblN.setText("3");
        jPanel1.add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 50, 70));

        lblRound.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRound.setForeground(new java.awt.Color(255, 255, 255));
        lblRound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRound.setText("RONDA 1");
        jPanel1.add(lblRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));
        jPanel1.add(lblEn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 60));

        btnWin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnWin.setForeground(new java.awt.Color(255, 255, 255));
        btnWin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Win.png"))); // NOI18N
        btnWin.setText("0");
        btnWin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWinMouseClicked(evt);
            }
        });
        jPanel1.add(btnWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 30));

        btnLose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLose.setForeground(new java.awt.Color(255, 255, 255));
        btnLose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Lose.png"))); // NOI18N
        btnLose.setText("0");
        btnLose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoseMouseClicked(evt);
            }
        });
        jPanel1.add(btnLose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        int n = Integer.parseInt(lblN.getText());
        if (n > 0) {
            lblN.setText(String.valueOf(n - 1));
        }
        actualizar();
    }//GEN-LAST:event_btnPActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        i++;
        lblRound.setText("RONDA " + (String.valueOf(i)));
        int n = Integer.parseInt(lblN.getText());
        if (n > 8) {
            lblN.setText("10");
        } else {
            lblN.setText(String.valueOf(n + 2));
        }
        actualizar();
    }//GEN-LAST:event_btnFinActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        int n = Integer.parseInt(lblN.getText());
        if (n < 10) {
            lblN.setText(String.valueOf(n + 1));
        }
        actualizar();
    }//GEN-LAST:event_btnGActionPerformed

    private void btnClsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClsMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnClsMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        i = 1;
        lblRound.setText("RONDA " + (String.valueOf(i)));
        lblN.setText("3");
        actualizar();
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnWinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWinMouseClicked
        int n = Integer.parseInt(btnWin.getText()) + 1;
        btnWin.setText(String.valueOf(n));
    }//GEN-LAST:event_btnWinMouseClicked

    private void btnLoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoseMouseClicked
        int n = Integer.parseInt(btnLose.getText()) + 1;
        btnLose.setText(String.valueOf(n));
    }//GEN-LAST:event_btnLoseMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    private void convertirIMG(String ruta, JLabel lbl) {
        ImageIcon ico = new javax.swing.ImageIcon(getClass().getResource(ruta));
        ImageIcon icono = new ImageIcon(ico.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
    }

    private void actualizar() {
        int n = Integer.parseInt(lblN.getText());
        if (n < 3) {
            lblN.setForeground(Color.red);
        } else if (2 < n && n < 6){
            lblN.setForeground(Color.yellow);
        } else {
            lblN.setForeground(Color.white);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCls;
    private javax.swing.JButton btnFin;
    private javax.swing.JButton btnG;
    private javax.swing.JLabel btnLose;
    private javax.swing.JLabel btnMin;
    private javax.swing.JButton btnP;
    private javax.swing.JLabel btnReset;
    private javax.swing.JLabel btnWin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel lblEn;
    private static javax.swing.JLabel lblN;
    private javax.swing.JLabel lblRound;
    // End of variables declaration//GEN-END:variables
}
