package Vista;

public class Filtrado extends javax.swing.JFrame {

        public Filtrado() {
                initComponents();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                txtFiltrarTrabajador = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtFiltrarNombre = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                txtFiltrarApellidos = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                txtFiltrarDia = new javax.swing.JTextField();
                txtFiltrarMes = new javax.swing.JTextField();
                txtFiltrarSueldo = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                txtFiltrarMatricula = new javax.swing.JTextField();
                btnFiltrarAceptar = new javax.swing.JButton();
                btnFiltrarCancelar = new javax.swing.JButton();
                comboSueldo = new javax.swing.JComboBox<>();
                txtFiltrarAnio = new javax.swing.JTextField();
                comboFecha = new javax.swing.JComboBox<>();
                btnFiltrarVerTodos1 = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(0, 255, 255));

                jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
                jLabel1.setText("Filtrado de Trabajadores");

                jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel3.setText("Dni:");

                jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel2.setText("Nombre:");

                jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel6.setText("Apellidos:");

                jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel4.setText("Sueldo:");

                jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel5.setText("Fecha:");

                txtFiltrarMes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtFiltrarMesActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                jLabel7.setText("Matricula:");

                btnFiltrarAceptar.setBackground(new java.awt.Color(0, 255, 204));
                btnFiltrarAceptar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
                btnFiltrarAceptar.setIcon(new javax.swing.ImageIcon(
                                "Vista\\iconos\\aceptar.png")); // NOI18N
                btnFiltrarAceptar.setText("Aceptar");
                btnFiltrarAceptar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFiltrarAceptarActionPerformed(evt);
                        }
                });

                btnFiltrarCancelar.setBackground(new java.awt.Color(0, 255, 204));
                btnFiltrarCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
                btnFiltrarCancelar.setIcon(new javax.swing.ImageIcon(
                                "Vista\\iconos\\cancelar.png")); // NOI18N
                btnFiltrarCancelar.setText("Cancelar");
                btnFiltrarCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFiltrarCancelarActionPerformed(evt);
                        }
                });

                comboSueldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

                comboFecha.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "-", "=", ">", "<", ">=", "<=", "<>" }));

                btnFiltrarVerTodos1.setBackground(new java.awt.Color(0, 255, 204));
                btnFiltrarVerTodos1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
                btnFiltrarVerTodos1.setIcon(new javax.swing.ImageIcon(
                                "Vista\\iconos\\mostrar.png")); // NOI18N
                btnFiltrarVerTodos1.setText("Ver Todos");
                btnFiltrarVerTodos1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFiltrarVerTodos1ActionPerformed(evt);
                        }
                });

                jLabel8.setIcon(new javax.swing.ImageIcon(
                                "Vista\\iconos\\cuaderno.png")); // NOI18N

                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenacion"));

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "(Sin ordenacion)", "Nombre", "Apellidos", "Sueldo", "Fecha",
                                                "Matricula" }));

                jRadioButton1.setText("ASC");

                jRadioButton2.setText("DESC");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                146,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53, 53, 53)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jRadioButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                70,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jRadioButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                58,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addComponent(jComboBox1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jRadioButton1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jRadioButton2)))
                                                                .addContainerGap(16, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                211,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                53,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addContainerGap(
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                67,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(43, 43, 43)
                                                                                                                                                .addComponent(txtFiltrarMatricula))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                                jPanel1Layout
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
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(txtFiltrarTrabajador,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(txtFiltrarNombre,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(txtFiltrarApellidos,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                comboSueldo,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                82,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                txtFiltrarSueldo,
                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                160,
                                                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(comboFecha,
                                                                                                                                                                                                0,
                                                                                                                                                                                                1,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                .addComponent(txtFiltrarDia,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                47,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                .addComponent(txtFiltrarMes,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                47,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                .addComponent(txtFiltrarAnio,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                64,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(329, 329, 329))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(btnFiltrarAceptar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                101,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(btnFiltrarVerTodos1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                121,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(btnFiltrarCancelar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                111,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(320, 320,
                                                                                                                                320)))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(jLabel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                53,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(jLabel1)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarTrabajador,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarNombre,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarApellidos,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(comboSueldo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarSueldo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarDia,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarMes,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarAnio,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(comboFecha,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFiltrarMatricula,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnFiltrarAceptar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnFiltrarVerTodos1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnFiltrarCancelar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(10, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                527,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
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

        private void btnFiltrarAceptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFiltrarAceptarActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_btnFiltrarAceptarActionPerformed

        private void btnFiltrarCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFiltrarCancelarActionPerformed
                Datos pantalla = new Datos();
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);

        }// GEN-LAST:event_btnFiltrarCancelarActionPerformed

        private void btnFiltrarVerTodos1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFiltrarVerTodos1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_btnFiltrarVerTodos1ActionPerformed

        private void txtFiltrarMesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFiltrarMesActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txtFiltrarMesActionPerformed

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
                        java.util.logging.Logger.getLogger(Filtrado.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Filtrado.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Filtrado.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Filtrado.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Filtrado().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnFiltrarAceptar;
        private javax.swing.JButton btnFiltrarCancelar;
        private javax.swing.JButton btnFiltrarVerTodos1;
        private javax.swing.JComboBox<String> comboFecha;
        private javax.swing.JComboBox<String> comboSueldo;
        private javax.swing.JComboBox<String> jComboBox1;
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
        private javax.swing.JRadioButton jRadioButton1;
        private javax.swing.JRadioButton jRadioButton2;
        private javax.swing.JTextField txtFiltrarAnio;
        private javax.swing.JTextField txtFiltrarApellidos;
        private javax.swing.JTextField txtFiltrarDia;
        private javax.swing.JTextField txtFiltrarMatricula;
        private javax.swing.JTextField txtFiltrarMes;
        private javax.swing.JTextField txtFiltrarNombre;
        private javax.swing.JTextField txtFiltrarSueldo;
        private javax.swing.JTextField txtFiltrarTrabajador;
        // End of variables declaration//GEN-END:variables
}
