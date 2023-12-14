package Vista;

public class Modificar extends javax.swing.JFrame {

        public Modificar() {
                initComponents();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                txtModDni = new javax.swing.JTextField();
                txtModNombre = new javax.swing.JTextField();
                txtModSueldo = new javax.swing.JTextField();
                txtModApellidos = new javax.swing.JTextField();
                txtModMatricula = new javax.swing.JTextField();
                txtModMes = new javax.swing.JTextField();
                txtModDia = new javax.swing.JTextField();
                txtModAnio = new javax.swing.JTextField();
                btnModCancelar = new javax.swing.JButton();
                btnModAceptar = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel2.setBackground(new java.awt.Color(0, 255, 255));

                jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
                jLabel1.setText("Modificar Trabajador");

                jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel2.setText("Nombre:");

                jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel3.setText("Dni:");

                jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel4.setText("Sueldo:");

                jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel5.setText("Fecha:");

                jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel6.setText("Apellidos:");

                jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel7.setText("Matricula:");

                btnModCancelar.setBackground(new java.awt.Color(0, 255, 204));
                btnModCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
                btnModCancelar.setIcon(new javax.swing.ImageIcon("Vista\\iconos\\cerrar-sesion.png")); // NOI18N
                btnModCancelar.setText("Cancelar");
                btnModCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnModCancelarActionPerformed(evt);
                        }
                });

                btnModAceptar.setBackground(new java.awt.Color(0, 255, 204));
                btnModAceptar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
                btnModAceptar.setIcon(new javax.swing.ImageIcon("Vista\\iconos\\aceptar.png")); // NOI18N
                btnModAceptar.setText("Aceptar");
                btnModAceptar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnModAceptarActionPerformed(evt);
                        }
                });

                jLabel8.setIcon(new javax.swing.ImageIcon(
                                "Vista\\iconos\\cuaderno.png")); // NOI18N

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                67,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(43, 43, 43)
                                                                                                                                .addComponent(txtModMatricula))
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                jPanel2Layout.createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                jPanel2Layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                jPanel2Layout
                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                jLabel3,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                67,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                jLabel2,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                67,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                jLabel6,
                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                67,
                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                67,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                67,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(43, 43, 43)
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(txtModDni,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                260,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(txtModNombre)
                                                                                                                                                .addComponent(txtModApellidos)
                                                                                                                                                .addComponent(txtModSueldo)
                                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(txtModDia,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                47,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(26, 26, 26)
                                                                                                                                                                .addComponent(txtModMes,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                47,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(33, 33, 33)
                                                                                                                                                                .addComponent(txtModAnio,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                73,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                                .addGap(329, 329, 329))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                jPanel2Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                211,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                54,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addContainerGap(
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(btnModAceptar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                101,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(44, 44, 44)
                                                                .addComponent(btnModCancelar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                110,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(jLabel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                53,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addComponent(jLabel1)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModDni,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModNombre,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModApellidos,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModSueldo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModDia,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModMes,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModAnio,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtModMatricula,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnModCancelar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnModAceptar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(76, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                526,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnModCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnModCancelarActionPerformed
                Datos pantalla = new Datos();
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);
        }// GEN-LAST:event_btnModCancelarActionPerformed

        private void btnModAceptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnModAceptarActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_btnModAceptarActionPerformed

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Modificar.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Modificar.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Modificar.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Modificar.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Modificar().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnModAceptar;
        private javax.swing.JButton btnModCancelar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField txtModAnio;
        private javax.swing.JTextField txtModApellidos;
        private javax.swing.JTextField txtModDia;
        private javax.swing.JTextField txtModDni;
        private javax.swing.JTextField txtModMatricula;
        private javax.swing.JTextField txtModMes;
        private javax.swing.JTextField txtModNombre;
        private javax.swing.JTextField txtModSueldo;
        // End of variables declaration//GEN-END:variables
}
