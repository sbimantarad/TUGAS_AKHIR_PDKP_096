//Variabel tipe data sudah pasti modul 1
//GUI modul 8
package BookingMusicStudio;

public class Interface_Booking_Studio extends javax.swing.JFrame {
    double nama,harga,jmlhjual,total;
    Tabel_studio penjualan = new Tabel_studio();

    public Interface_Booking_Studio() {
        initComponents();
//setter getter modul 6
        tblInfoBooking.setModel(penjualan.getTabel());
//        kode item
        Tipe.addItem("Deluxe");
        Tipe.addItem("Royale");
        Tipe.addItem("Suite");
        Tipe.addItem("Standart");
        Tipe.addItem("Borneo");      
//        perulangan bulan pakai for modul 3
        for (int a=1; a<=31; a++){
            Tgl.addItem(a);
        }
        
        Bln.addItem("Januari");
        Bln.addItem("Februari");
        Bln.addItem("Maret");
        Bln.addItem("April");
        Bln.addItem("Mei");
        Bln.addItem("Juni");
        Bln.addItem("Juli");
        Bln.addItem("Agustus");
        Bln.addItem("September");
        Bln.addItem("Oktober");  
        Bln.addItem("November");
        Bln.addItem("Desember");
        
        for (int b=2016; b<=2021; b++){
        Thn.addItem(b);        
        } 
// jam buka dimulai pukul 8 pagi        
        Jam1.addItem("08.00");
        Jam1.addItem("09.00");
        Jam1.addItem("10.00");
        Jam1.addItem("11.00");
        Jam1.addItem("12.00");
        Jam1.addItem("13.00");
        Jam1.addItem("14.00");
        Jam1.addItem("15.00");
        Jam1.addItem("16.00");
        Jam1.addItem("17.00");
        Jam1.addItem("18.00");
        Jam1.addItem("19.00");
        Jam1.addItem("20.00");
        Jam1.addItem("21.00");
 // waktu tutup jam 10 malam       
        Jam2.addItem("09.00");
        Jam2.addItem("10.00");
        Jam2.addItem("11.00");
        Jam2.addItem("12.00");
        Jam2.addItem("13.00");
        Jam2.addItem("14.00");
        Jam2.addItem("15.00");
        Jam2.addItem("16.00");
        Jam2.addItem("17.00");
        Jam2.addItem("18.00");
        Jam2.addItem("19.00");
        Jam2.addItem("20.00");
        Jam2.addItem("21.00");
        Jam2.addItem("22.00");
        
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfoBooking = new javax.swing.JTable();
        btnBooking = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBand = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNoTelepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tgl = new javax.swing.JComboBox();
        Bln = new javax.swing.JComboBox();
        Thn = new javax.swing.JComboBox();
        Jam1 = new javax.swing.JComboBox();
        Jam2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Tipe = new javax.swing.JComboBox();
        jLabelGambarStudio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tipe Studio");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Bustaman's Music Studio");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tanggal Booking");

        tblInfoBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipe Studio", "Tanggal", "Waktu", "Pemesan", "Nama Band", "No Telepon"
            }
        ));
        jScrollPane2.setViewportView(tblInfoBooking);

        btnBooking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBooking.setText("BOOKING");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nama Pemesan");

        txtNama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("No Telepon");

        txtBand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBandKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nama Band");

        txtNoTelepon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNoTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTeleponActionPerformed(evt);
            }
        });
        txtNoTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoTeleponKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Durasi dan Waktu");

        Tgl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal" }));
        Tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TglActionPerformed(evt);
            }
        });

        Bln.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bulan" }));
        Bln.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Thn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun" }));
        Thn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThnActionPerformed(evt);
            }
        });

        Jam1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mulai" }));
        Jam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jam1ActionPerformed(evt);
            }
        });

        Jam2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selesai" }));
        Jam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jam2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));

        Tipe.setBorder(null);
        Tipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipeActionPerformed(evt);
            }
        });

        jLabelGambarStudio.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\Screenshots\\Screenshot (441).png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CONTACT PERSON: BIMA 081328694344");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtNoTelepon)
                            .addComponent(txtBand)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jLabelGambarStudio, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelGambarStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBooking)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed

        String[] data = new String[6];
        data[0] = (""+Tipe.getSelectedItem());
        data[1]= (""+Tgl.getSelectedItem()+" - "+Bln.getSelectedItem()+" - "+Thn.getSelectedItem());
        data[2] = (""+Jam1.getSelectedItem()+" - "+Jam2.getSelectedItem());
        data[3] = txtNama.getText();
        data[4] = txtBand.getText();
        data[5] = txtNoTelepon.getText();
        
   
        penjualan.getTabel().addRow(data);
       
    }//GEN-LAST:event_btnBookingActionPerformed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtBandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBandKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBandKeyPressed

    private void txtNoTeleponKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTeleponKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTeleponKeyPressed

    private void TglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TglActionPerformed

    private void txtNoTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTeleponActionPerformed

    private void ThnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThnActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_ThnActionPerformed

    private void Jam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jam1ActionPerformed

    private void Jam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jam2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jam2ActionPerformed

    private void TipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipeActionPerformed
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Interface_Booking_Studio().setVisible(true);
            }
        });
    }
    //Variabel dari DESIGN
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Bln;
    private javax.swing.JComboBox Jam1;
    private javax.swing.JComboBox Jam2;
    private javax.swing.JComboBox Tgl;
    private javax.swing.JComboBox Thn;
    private javax.swing.JComboBox Tipe;
    private javax.swing.JButton btnBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGambarStudio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblInfoBooking;
    private javax.swing.JTextField txtBand;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelepon;
    // End of variables declaration//GEN-END:variables
}
