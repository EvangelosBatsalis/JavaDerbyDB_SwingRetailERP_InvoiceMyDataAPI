/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import schoolerpinvoicemydata.CRUD_Database;

/**
 *
 * @author User
 */
public class MainWindowFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainWindowFrame
     */
    public MainWindowFrame() {
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
        jButtonCancel = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        jLabel5.setText("UserName:");

        jLabel2.setText("Please enter credential to continue:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancel)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSubmit)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(jTextFieldUserName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSubmit))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Login Screen");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Welcome to");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        String SELECT_QUERY = "SELECT * FROM SA.EMPLOYEES WHERE USERNAME = "+"'"+jTextFieldUserName.getText()+"'";
        System.out.println(jTextFieldUserName.getText());
        System.out.println(jPasswordField.getText());
        if((jTextFieldUserName.getText().equals("")) || (jPasswordField.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Username or Password field is empty", this.getTitle(), JOptionPane.WARNING_MESSAGE);
        }else{
            if(databaseRecordCheck() == false){
                JOptionPane.showMessageDialog(null, "UserName is Incorrect", this.getTitle(), JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvoiceMyDataAPI","sa","sa");
                    Statement stmt = con.createStatement();
                    ResultSet result = stmt.executeQuery(SELECT_QUERY);
                    System.out.println(result);
                    while(result.next()){
                        //    PreparedStatement ps = con.prepareStatement("INSERT INTO SA.EMPLOYEE VALUES (?,?)");
                        //    ps.setString(1, jTextFieldUserName.getText());
                        //    ps.setString(2, jPasswordField.getText());
                        //    ps.executeUpdate();
                        String userName = result.getString("USERNAME");
                        String password = result.getString("PASSWORD");

                        if((userName.equals(jTextFieldUserName.getText())) && (!(password.equals(jPasswordField.getText())))){
                            JOptionPane.showMessageDialog(null, "Password Incorrect", this.getTitle(), JOptionPane.WARNING_MESSAGE);
                        }
                        //System.out.println("UserName: "+userName+ "\t"+ "Password: "+password);
                        else if((userName.equals(jTextFieldUserName.getText())) && (password.equals(jPasswordField.getText()))){
                            if((jTextFieldUserName.getText().equals("admin")) && (password.equals(jPasswordField.getText()))){
                                JOptionPane.showMessageDialog(null, "Welcome admin...all features are unlocked", this.getTitle(), JOptionPane.WARNING_MESSAGE);
                                jTextFieldUserName.setText("");
                                jPasswordField.setText("");
                                adminMainFrame amf = new adminMainFrame();
                                //amf.setAlwaysOnTop(true);
                                amf.pack();
                                amf.setLocationRelativeTo(null);
                                amf.setVisible(true); 
                                
                            }else{
                                JOptionPane.showMessageDialog(null, "Welcome "+jTextFieldUserName.getText(), this.getTitle(), JOptionPane.WARNING_MESSAGE);
                                jTextFieldUserName.setText("");
                                jPasswordField.setText("");
                                StageOneUserNameSelection so = new StageOneUserNameSelection();
                                //so.setAlwaysOnTop(true);
                                so.pack();
                                so.setLocationRelativeTo(null);
                                so.setVisible(true); 
                                
                            }
                                
                        }
                    }

                }catch(SQLException e){
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindowFrame().setVisible(true);
            }
        });
    }
    
    private Boolean databaseRecordCheck(){
        Boolean isEmpty = false;
        String userName = jTextFieldUserName.getText();
        String SELECT_QUERY = "SELECT * FROM SA.EMPLOYEES WHERE USERNAME = '"+userName+"'";//"SELECT * FROM SA.EMPLOYEES WHERE USERNAME = "+userName;
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvoiceMyDataAPI","sa","sa");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(SELECT_QUERY);
            System.out.println(result);
            System.out.println(isEmpty);
            if(result.next() == false){
                isEmpty = false;
            }else{
                isEmpty = true;
                do{ 
                    String uname = result.getString("USERNAME");
                    String password = result.getString("PASSWORD");
                    System.out.println(isEmpty);
                    System.out.println("UserName: "+userName+ "\t"+ "PassWord: "+password);
                }while(result.next());
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return isEmpty;
        
    }
    
    private Boolean passwordValidationCheck(){
        Boolean isNumber = false;
        while(true){
            try{
                Integer.parseInt(jPasswordField.getText());
                //JOptionPane.showMessageDialog(null, "Password Accepted", this.getTitle(), JOptionPane.WARNING_MESSAGE);
                isNumber = true;
                break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Only numbers are allowed", this.getTitle(), JOptionPane.WARNING_MESSAGE);
                isNumber = false;
                break;
            }
        }
        
        
        return isNumber;
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
