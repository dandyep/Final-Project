/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasi.penjualan;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dandy
 */
public class Beli extends javax.swing.JInternalFrame {
Sambung k= new Sambung();
ResultSet rs=null;
    /**
     * Creates new form Beli
     */
    public void tampilkandata(){
DefaultTableModel tbbeli = new DefaultTableModel();
        tbbeli.addColumn("No_Transaksi");
        tbbeli.addColumn("No_Pelanggan");
        tbbeli.addColumn("Nama_Toko");
        tbbeli.addColumn("Nama_Pelanggan");
        tbbeli.addColumn("Tgl_Transaksi");
        tbbeli.addColumn("Jenis_Beras");
        tbbeli.addColumn("Harga");
        tbbeli.addColumn("Jumlah");
        tbbeli.addColumn("Total_Harga");
        tbbeli.addColumn("Bayar");
        tbbeli.addColumn("Kembali");
        
        
        try {
            rs=k.ambilData("select * from pembelian2 order by No_Transaksi");
            
            
            while (rs.next()) {
                tbbeli.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
                ,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            }
           jTable1.setModel(tbbeli);
        notrans.setText("");
        idpmasok.setText("");
        nmpmsok.setText("");
        tgl.setText("");
        total.setText("");
        almt.setText("");
        
        jmlh.setText("");
        idpmasok.setEnabled(true);
        notrans.requestFocus();
        notrans.setEnabled(true);
        nmpmsok.setEnabled(true);
        almt.setEnabled(true);
        jenis.setSelectedItem("Pandan Wangi");
        hrga.setText("");
        byr.setText("");
        kmbl.setText("");
        

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Table Tidak Ditemukan");
        }
}
    public Beli() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        notrans = new javax.swing.JTextField();
        idpmasok = new javax.swing.JTextField();
        nmpmsok = new javax.swing.JTextField();
        almt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tgl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hrga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jmlh = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        byr = new javax.swing.JTextField();
        kmbl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("INPUT DATA PEMBELIAN");

        jLabel2.setText("No_Transaksi");

        jLabel3.setText("Id_Pemasok");

        jLabel4.setText("Nama_Pemasok");

        jLabel5.setText("Alamat");

        idpmasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpmasokActionPerformed(evt);
            }
        });
        idpmasok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idpmasokKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/cr.jpg"))); // NOI18N
        jButton1.setText("CARI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/ed.jpg"))); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/dt.jpg"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/sv.jpg"))); // NOI18N
        jButton4.setText("SIMPAN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/tm.jpg"))); // NOI18N
        jButton5.setText("TAMPILKAN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tgl_Transaksi");

        jLabel7.setText("(yyyy-mm-dd)");

        jLabel8.setText("Jenis_Beras");

        jLabel9.setText("Harga");

        jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pandan Wangi", "Rojolele", "Sentra Ramos", "C4" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        jLabel10.setText("Jumlah_Beli");

        jLabel11.setText("Karung");

        jmlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlhActionPerformed(evt);
            }
        });
        jmlh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmlhKeyPressed(evt);
            }
        });

        jLabel12.setText("Total");

        jLabel13.setText("Bayar");

        jLabel14.setText("Kembali");

        byr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                byrKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No_Transaksi", "Id_Pemasok", "Nama_Pemasok", "Alamat", "Tgl_Transaksi", "Jenis Beras", "Harga", "Jumlah ", "Total_Harga", "Bayar", "Kembali"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jmlh)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel11))
                                .addComponent(hrga, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(byr, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(notrans, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idpmasok, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(nmpmsok))
                                        .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tgl)))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4))
                                .addComponent(jButton5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(notrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idpmasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nmpmsok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(hrga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jmlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addGap(6, 6, 6))
                            .addComponent(byr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        tampilkandata();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String notrx=notrans.getText();
        String noplg=idpmasok.getText();
        String nmps=nmpmsok.getText();
        String almat=almt.getText();
        String tglt=tgl.getText();
        String jnis=jenis.getSelectedItem().toString();
        String hrg=hrga.getText();
        String jml=jmlh.getText();
        String tot=total.getText();
        String byrp=byr.getText();
        String kmblp=kmbl.getText();

        boolean j = k.simpanData("insert into pembelian2 value('"+notrx+"','"+noplg+"','"+nmps+"','"+almat+"','"+tglt+"'"
            + ",'"+jnis+"','"+hrg+"','"+jml+"','"+tot+"','"+byrp+"','"+kmblp+"')");
        tampilkandata();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int hasil = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin ingin Hapus?", "Yakin?", JOptionPane.YES_NO_OPTION);
        if (hasil == 0) {
        try{
        int baris=jTable1.getSelectedRow();
        String not=(String)jTable1.getModel().getValueAt(baris, 0);
        boolean j=k.simpanData("delete from pembelian2 where No_Transaksi='"+not+"'");
        tampilkandata();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "KLIK PADA TABLENYA");
        }
        }
        else{
            tampilkandata();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idpmasokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idpmasokKeyPressed
        // TODO add your handling code here:
        String a=idpmasok.getText();
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        try {
            rs=k.ambilData("select * from Pemasok2 where Id_Pem='"+a+"'");
            
            
            if (rs.next()) {
                nmpmsok.setText(rs.getString(2));
                almt.setText(rs.getString(3));
            tgl.requestFocus();
          idpmasok.setEnabled(false);   
          nmpmsok.setEnabled(false);
          almt.setEnabled(false);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Ditemukan");
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Table Tidak Ditemukan");
        }
         }
    }//GEN-LAST:event_idpmasokKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tr=notrans.getText();
        String id=idpmasok.getText();
        String nm=nmpmsok.getText();
        String almta=almt.getText();
        String no=notrans.getText();
        String tglt=tgl.getText();
        String jnis=jenis.getSelectedItem().toString();
        String hrg=hrga.getText();
        String jml=jmlh.getText();
        String tot=total.getText();
        String byr2=byr.getText();
        String kmbl2=kmbl.getText();
         if((no.equals(""))||(tr.equals("")||(id.equals("")||(nm.equals("")
                ||(tglt.equals("")||(jnis.equals("")||(hrg.equals("")||(jml.equals("")||(tot.equals("")
                ||(byr2.equals("")||(kmbl2.equals(""))))))))))))
                 
            {
                JOptionPane.showMessageDialog(rootPane, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
                notrans.requestFocus();
            }
            else {
         boolean j=k.simpanData("Update Pembelian2 SET Tgl='"+tglt+"'," + "Jenis_Beras='"+jnis+"',"+
                "Harga='"+hrg+ "',"+"Jumlah='"+jml+"',"+"Total='"+tot+"',"+"Bayar='"+byr2+"',"+"Kembali='"+kmbl2+"'"+"Where No_Transaksi='"+no+"'");
        JOptionPane.showMessageDialog(rootPane, "Berhasil di Update");     
        tampilkandata();
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cari=notrans.getText();
        DefaultTableModel tbbeli = new DefaultTableModel();
        tbbeli.addColumn("No_Transaksi");
        tbbeli.addColumn("No_Pelanggan");
        tbbeli.addColumn("Nama_Toko");
        tbbeli.addColumn("Nama_Pelanggan");
        tbbeli.addColumn("Tgl_Transaksi");
        tbbeli.addColumn("Jenis_Barang");
        tbbeli.addColumn("Harga");
        tbbeli.addColumn("Jumlah");
        tbbeli.addColumn("Total_Harga");
        tbbeli.addColumn("Bayar");
        tbbeli.addColumn("Kembali");
        if(cari.equals("")){
            JOptionPane.showMessageDialog(rootPane, "NO TRANSAKSI HARUS DI ISI", "INFORMASI", WIDTH, null);
                notrans.requestFocus();
        }
        else{
         try {
             rs=k.ambilData("Select * from Pembelian2 where No_Transaksi='"+cari+"'");
             
            if (rs.next()) {
        idpmasok.setText(rs.getString(2));
        nmpmsok.setText(rs.getString(3));
        almt.setText(rs.getString(4));
        tgl.setText(rs.getString(5));
        jenis.setSelectedItem(rs.getString(6));
        hrga.setText(rs.getString(7));
        jmlh.setText(rs.getString(8));
        total.setText(rs.getString(9));
        byr.setText(rs.getString(10));
        kmbl.setText(rs.getString(11));

       tbbeli.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
        ,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            jTable1.setModel(tbbeli);
            notrans.setEnabled(false);
            idpmasok.setEnabled(false);
            nmpmsok.setEnabled(false);
            almt.setEnabled(false);
            tgl.requestFocus();
            }          
            else{
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Ditemukan");
                notrans.requestFocus();
            }
           } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error Pengambilan Data ");
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
        String a= jenis.getSelectedItem().toString();
        if("Pandan Wangi".equals(a)){
            hrga.setText("225000");
            
        }
        else if("Rojolele".equals(a)){
            hrga.setText("212500");
            
        }
        else if("Sentra Ramos".equals(a)){
            hrga.setText("195000");
        }
        else {
            hrga.setText("175000");
        }
    }//GEN-LAST:event_jenisActionPerformed

    private void jmlhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmlhKeyPressed
        // TODO add your handling code here:
        String a =hrga.getText();
        String b=jmlh.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        int y=c*d;
        
        total.setText(Integer.toString(y));
        byr.requestFocus();
        }
    }//GEN-LAST:event_jmlhKeyPressed

    private void byrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_byrKeyPressed
        // TODO add your handling code here:
        String a =total.getText();
        String b=byr.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        int y=d-c;
        if(y<0){
            JOptionPane.showMessageDialog(rootPane, "Uang Anda Kurang");
        }
        else{
        kmbl.setText(Integer.toString(y));
        }
        }
    }//GEN-LAST:event_byrKeyPressed

    private void jmlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlhActionPerformed

    private void idpmasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpmasokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpmasokActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almt;
    private javax.swing.JTextField byr;
    private javax.swing.JTextField hrga;
    private javax.swing.JTextField idpmasok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jenis;
    private javax.swing.JTextField jmlh;
    private javax.swing.JTextField kmbl;
    private javax.swing.JTextField nmpmsok;
    private javax.swing.JTextField notrans;
    private javax.swing.JTextField tgl;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
