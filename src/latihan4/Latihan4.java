/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author user
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        btnGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        rdb1 = new javax.swing.JRadioButton();
        edp2 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        Submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        Hapus = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Biodata Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(173, 13, 125, 22);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 54, 40, 16);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(46, 113, 50, 16);

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(44, 161, 50, 16);

        jLabel5.setText("Hobi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(44, 222, 40, 16);
        getContentPane().add(Nama);
        Nama.setBounds(124, 51, 166, 22);
        getContentPane().add(Absen);
        Absen.setBounds(124, 110, 166, 22);

        btnGroup.add(rdb1);
        rdb1.setText("RPL");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb1);
        rdb1.setBounds(124, 157, 49, 25);

        btnGroup.add(edp2);
        edp2.setText("TKJ");
        edp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edp2ActionPerformed(evt);
            }
        });
        getContentPane().add(edp2);
        edp2.setBounds(191, 157, 49, 25);

        cb1.setText("Programing");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(124, 218, 95, 25);

        cb2.setText("Animator");
        getContentPane().add(cb2);
        cb2.setBounds(124, 248, 81, 25);

        cb3.setText("Teknisi");
        getContentPane().add(cb3);
        cb3.setBounds(223, 218, 69, 25);

        cb4.setText("Designer");
        getContentPane().add(cb4);
        cb4.setBounds(223, 248, 79, 25);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(63, 289, 73, 25);

        jLabel6.setText("Hasil");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 330, 40, 16);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 360, 337, 142);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus);
        Hapus.setBounds(166, 289, 67, 25);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(267, 289, 53, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 2, 430, 550);

        setSize(new java.awt.Dimension(450, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi="";
        //untuk rd
        if (rdb1.isSelected())
            jurusan="RPL";
        else if (edp2.isSelected())
                jurusan ="TKJ";
        else
                jurusan = " ";
        //untuk checkbox
        if (cb1.isSelected())
            hobi+=cb1.getText()+", ";
        if (cb2.isSelected())
            hobi+=cb2.getText()+", ";
        if (cb3.isSelected())
            hobi+=cb3.getText()+", ";
        if (cb4.isSelected())
            hobi+=cb4.getText()+", ";
        hasil.setText("Nama siswa : " +nama+"\nAbsen siswa : "+absen+
                "\nJurusan anda : "+jurusan+
                "\nHobi anda : "+hobi);
                
    }//GEN-LAST:event_SubmitActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        btnGroup.clearSelection();
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
    }//GEN-LAST:event_HapusActionPerformed

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb1ActionPerformed

    private void edp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edp2ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JRadioButton edp2;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb1;
    // End of variables declaration//GEN-END:variables
}
