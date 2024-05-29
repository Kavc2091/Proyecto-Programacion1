package projecto;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario extends javax.swing.JFrame {

    String dpi, nombre, telefono, direccion, numerocuenta, saldoinicial, datosUsuario, NumeroCuenta, tipcuenta, tipmoneda, saldoinicia;
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta = new ArrayList<String>();
    DefaultTableModel modelMovs = new DefaultTableModel();
    Cliente cliente;
    Cuenta cuenta;

    public Formulario() {
        initComponents();
        modelMovs.addColumn("Cuenta");
        modelMovs.addColumn("Fecha");
        modelMovs.addColumn("Tipo");
        modelMovs.addColumn("Monto");
        tblMovimientos.setModel(modelMovs);
        
        Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/fmi.png"));
        this.setIconImage(img);
        this.setLocationRelativeTo(null);
    }

    public void cargarTipoMoneda() {
        cboTipoMoneda.removeAllItems();
        cboTipoMoneda.addItem(String.valueOf("QUETZALES"));
        cboTipoMoneda.addItem(String.valueOf("DOLARES"));

        cboTipoMovimiento.addItem(String.valueOf("DEPOSITO"));
        cboTipoMovimiento.addItem(String.valueOf("RETIRO"));
        cboTipoMovimiento.addItem(String.valueOf("TRANSFERENCIA"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTipoCuenta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboTipoMoneda = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        lblNumeroCuenta = new javax.swing.JLabel();
        lblSaldoInicial = new javax.swing.JLabel();
        cboDPI = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cboConsultaCliente = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cboConsultaTipoCuenta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblCuentaCliente = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTipoMoneda = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        lblsaldo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cboTipoMovimiento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        btnAgregarMovimiento = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("NOMBRE: ");

        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREAR CUENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(298, 247));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("DPI:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("TIPO CUENTA:");

        cboTipoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONETARIA", "AHORRO" }));
        cboTipoCuenta.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("TIPO MONEDA:");

        cboTipoMoneda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboTipoMoneda.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("NO. CUENTA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("SALDO INICIAL:");

        btnCrearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        lblSaldoInicial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldoInicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cboDPI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboTipoMoneda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTipoCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSaldoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(65, 65, 65)
                                .addComponent(cboDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnCrearCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblNumeroCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cboTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSaldoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(btnCrearCuenta)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREAR USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DPI:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("TELEFONO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DIRECCION:");

        btnCrearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearUsuario.setText("CREAR USUARIO");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDPI))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(txtDireccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnCrearUsuario)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearUsuario)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANCO PROGRA");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUENTAS POR USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("DPI: ");

        cboConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaClienteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("No. CUENTA: ");

        cboConsultaTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaTipoCuentaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("NOMBRE: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("TELEFONO: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("DIRECCION: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("CUENTA:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("MONEDA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboConsultaTipoCuenta, 0, 131, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboConsultaCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13))
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCuentaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(lblNombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cboConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(3, 3, 3)
                        .addComponent(cboConsultaTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblCuentaCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblTelefonoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(lblDireccionCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblTipoMoneda)))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setText("REGRESAR MENU PRINCIPAL");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblsaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblsaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsaldo.setText("Q0.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnRegresar)
                        .addGap(35, 35, 35)
                        .addComponent(lblsaldo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRANSACCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("TRANSACCION: ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Monto: ");

        btnAgregarMovimiento.setText("Proceder");
        btnAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipoMovimiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtMontoMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnAgregarMovimiento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtMontoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("SALDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        Cliente c = new Cliente();
        c.setDpi(txtDPI.getText());
        c.setNombre(txtNombre.getText());
        c.setTelefono(txtTelefono.getText());
        c.setDireccion(txtDireccion.getText());
        listaClientes.add(c);
        llenarcboCliente();
        AgregarClientes(c);
        LimpiarUsuarios();
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        cliente = listaClientes.get(cboDPI.getSelectedIndex());
        Cuenta cuenta = new Cuenta();
        DepositoInicial();
        GenerarRandom();
        cuenta.setNumerocuenta(lblNumeroCuenta.getText());
        cuenta.setTipocuenta((cboTipoCuenta.getItemAt(cboTipoCuenta.getSelectedIndex())));
        cuenta.setTipomoneda(cboTipoMoneda.getSelectedItem().toString());
        cuenta.setSaldoinicial(Double.parseDouble(lblSaldoInicial.getText()));
        cliente.addCuenta(cuenta);
        

        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento("APERTURA");
        m.setMonto(Double.parseDouble(lblSaldoInicial.getText()));
        cuenta.addMovimiento(m);
        
        AgregarCuentas(cuenta);
        llenarCboTipoCuenta();
        LimpiarUsuarios();
        MostrarDatosCliente();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cboConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaClienteActionPerformed
        llenarCboTipoCuenta();
        MostrarDatosCliente();
    }//GEN-LAST:event_cboConsultaClienteActionPerformed

    private void cboConsultaTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaTipoCuentaActionPerformed
        MostrarDatosCliente();
    }//GEN-LAST:event_cboConsultaTipoCuentaActionPerformed

    private void btnAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimientoActionPerformed
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        cuenta = cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento(cboTipoMovimiento.getSelectedItem().toString());
        double monto = Double.parseDouble(txtMontoMovimiento.getText().toString());
        monto = m.getTipoMovimiento().endsWith("DEPOSITO") ? monto : (monto * -1);
        m.setMonto(monto);
        cuenta.addMovimiento(m);
        txtMontoMovimiento.setText("");
        verTransacciones();
    }//GEN-LAST:event_btnAgregarMovimientoActionPerformed

    public void AgregarClientes(Cliente e) {
        String archivo = "DatosClientes.csv";
        try(FileWriter fw = new FileWriter(archivo, true)){
            fw.write(e.getDpi()+";"+e.getNombre()+";"+e.getTelefono()+";"+e.getDireccion()+"\n");
        }catch(IOException rn){
            System.out.println("Ocurrio una exception");
        }
        System.out.println("Cliente agregado");
    }
    
        public void AgregarCuentas(Cuenta r) {
        String archivos = "DatosCuentas.csv";
        try(FileWriter fw = new FileWriter(archivos, true)){
            fw.write(r.getNumerocuenta()+";"+r.getTipocuenta()+";"+r.getTipomoneda()+";"+r.getSaldoinicial()+"\n");
        }catch(IOException rn){
            System.out.println("Ocurrio una exception");
        }
        System.out.println("Cuenta agregada");
    }

    public void RevisarEstudiante() {
        String dpis = txtDPI.getText();
        for (Cliente cd : listaClientes) {
            if (dpis.equals(cd.getDpi())) { //compara si los dos valores son iguales
                JOptionPane.showMessageDialog(this, "Cliente encontrado", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(this, "No se encontro ningun estudiante con ese carnet", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void LimpiarUsuarios() {
        txtDPI.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        lblNumeroCuenta.setText("");
        txtMontoMovimiento.setText("");

    }

    public void GenerarRandom() {
        Random rand = new Random();
        int numGenerado = 100 + 999999999;
        int int_random = rand.nextInt(numGenerado);
        lblNumeroCuenta.setText(Integer.toString(int_random));
    }

    public void DepositoInicial() {
        double valorInicial = 0.00;
        lblSaldoInicial.setText(Double.toString(valorInicial));
    }

    public void llenarcboCliente() {
        Object clientes[] = new Object[listaClientes.size()];
        int i = 0;
        for (Cliente c : listaClientes) {
            clientes[i] = c.getDpi();
            i++;
        }
        cboDPI.setModel(new DefaultComboBoxModel(clientes));
        cboConsultaCliente.setModel(new DefaultComboBoxModel(clientes));

    }

    public void llenarCboTipoCuenta() {
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        int i = 0;
        ArrayList<String> cuentas = new ArrayList<String>();
        for (Cuenta c : cliente.getMiscuentas()) {
            cuentas.add(c.getNumerocuenta());
        }
        cboConsultaTipoCuenta.setModel(new DefaultComboBoxModel(cuentas.toArray()));
    }

    public void verTransacciones() {
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        cuenta = cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
        double saldo = 0;
        while (modelMovs.getRowCount() > 0) {
            modelMovs.removeRow(0);
        }
        for (Movimiento m : cuenta.getMismovimientos()) {
            Object mov[] = new Object[4];
            mov[0] = cuenta.getTipocuenta();
            mov[1] = m.getFechaMovimiento();
            mov[2] = m.getTipoMovimiento();
            if (cuenta.getTipomoneda() == "DOLARES") {
                mov[3] = ("$" + m.getMonto());
                saldo += m.getMonto();
                modelMovs.addRow(mov);
            } else {
                mov[3] = ("Q" + m.getMonto());
                saldo += m.getMonto();
                modelMovs.addRow(mov);
            }
            tblMovimientos.setModel(modelMovs);
            if (cuenta.getTipomoneda() == "DOLARES") {
                lblsaldo.setText("$" + saldo);
            } else {
                lblsaldo.setText("Q" + saldo);
            }
        }
    }

 /*   public String aMoneda(double cantidad) {
        cantidad = Math.round(cantidad * 100.0) / 100.0;
        DecimalFormat formato = new DecimalFormat("Q #,###.##");
        return formato.format(cantidad);
    }*/

    public void MostrarDatosCliente() {
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        lblNombreCliente.setText(cliente.getNombre());
        lblTelefonoCliente.setText(cliente.getTelefono());
        lblDireccionCliente.setText(cliente.getDireccion());

        if (cliente.getMiscuentas().size() > 0) {
            cuenta = cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
            lblCuentaCliente.setText(cuenta.getNumerocuenta());
            lblTipoMoneda.setText(cuenta.getTipomoneda());
            verTransacciones();
        } else {
            lblCuentaCliente.setText("");
            JOptionPane.showMessageDialog(this, "El Cliente no tiene cuenta", "AVISO!", JOptionPane.WARNING_MESSAGE);
            modelMovs.setRowCount(0);
            lblsaldo.setText("");
            lblTipoMoneda.setText("");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    //dpi,nombre , telefono, direccion, numerocuenta, saldoinicial, datosUsuario
    public void llenarDatos() {
        dpi = txtDPI.getText();
        nombre = txtNombre.getText();
        telefono = txtTelefono.getText();
        direccion = txtDireccion.getText();
        NumeroCuenta = lblNumeroCuenta.getText();
        tipcuenta = cboTipoCuenta.getSelectedItem().toString();
        tipmoneda = cboTipoMoneda.getSelectedItem().toString();
        saldoinicia = lblSaldoInicial.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboConsultaCliente;
    private javax.swing.JComboBox<String> cboConsultaTipoCuenta;
    private javax.swing.JComboBox<String> cboDPI;
    private javax.swing.JComboBox<String> cboTipoCuenta;
    private javax.swing.JComboBox<String> cboTipoMoneda;
    private javax.swing.JComboBox<String> cboTipoMovimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuentaCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTipoMoneda;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
