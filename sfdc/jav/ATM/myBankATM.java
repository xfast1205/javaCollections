package com.mybank.ATM;

public class myBankATM extends javax.swing.JFrame {

    /**
     * Creates new form myBankATM
     */
    public myBankATM() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        balanceButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        amountField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        dashButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyArea = new javax.swing.JTextArea();
        statusField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("myBank ATM");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        balanceButton.setText("Check account balance");
        balanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceButtonActionPerformed(evt);
            }
        });
        jPanel2.add(balanceButton);

        depositButton.setText("Make a deposit");
        jPanel2.add(depositButton);

        withdrawButton.setText("Make withdrawal");
        jPanel2.add(withdrawButton);
        jPanel2.add(amountField);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(4, 3));

        oneButton.setText("1");
        jPanel3.add(oneButton);

        twoButton.setText("2");
        jPanel3.add(twoButton);

        threeButton.setText("3");
        jPanel3.add(threeButton);

        fourButton.setText("4");
        jPanel3.add(fourButton);

        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(fiveButton);

        sixButton.setText("6");
        jPanel3.add(sixButton);

        sevenButton.setText("7");
        jPanel3.add(sevenButton);

        eightButton.setText("8");
        jPanel3.add(eightButton);

        nineButton.setText("9");
        jPanel3.add(nineButton);

        zeroButton.setText("0");
        jPanel3.add(zeroButton);

        dashButton.setText("-");
        dashButton.setEnabled(false);
        jPanel3.add(dashButton);

        enterButton.setText("ENTER");
        jPanel3.add(enterButton);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        historyArea.setEditable(false);
        historyArea.setColumns(20);
        historyArea.setRows(5);
        jScrollPane1.setViewportView(historyArea);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        statusField.setEditable(false);
        statusField.setText("Welcome to myBank");
        getContentPane().add(statusField, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myBankATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton balanceButton;
    private javax.swing.JButton dashButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JTextArea historyArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JTextField statusField;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}