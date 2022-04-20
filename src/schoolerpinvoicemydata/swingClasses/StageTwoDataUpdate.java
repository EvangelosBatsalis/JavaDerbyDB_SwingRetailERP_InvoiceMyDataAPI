/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata.swingClasses;

import entityClasses.Students;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class StageTwoDataUpdate extends javax.swing.JFrame {
    private String resultSetter;
    
    //just a flag for edit prompt message
    private Boolean editableFlag = false;
    
    public StageTwoDataUpdate(String resultSetter){
        this.resultSetter = resultSetter;
        System.out.println("Now Inside Stage two: "+resultSetter);
        initComponents();
        
        //New Object Entity recalling it for making SQL query 
        Students student = new Students();
        String[] splitedResultSetter = resultSetter.split(" "); //Splits first name and last name for use to tge query
        String studentFirstNameSplited = splitedResultSetter[1];//attention the names are in opposite Direction in array
        String studentLastNameSplited = splitedResultSetter[0];
        System.out.println(studentFirstNameSplited +"\t"+ studentLastNameSplited); //output test
        try{
            ResultSet result = student.getStudentsSpecificDataFromSQL(studentFirstNameSplited, studentLastNameSplited); //call the getStudentsSpecificDataFromSQL from Student entity
            //prints the ResultSet using while and print the output to Swing JtextBoxes
            System.out.println("result: "+result);
            while(result.next()){
                jTextCustomerID.setText(result.getString("CUSTOMERID"));
                jTextStudentFirstName.setText(result.getString("STUDENTFIRSTNAME"));
                jTextStudentLastName.setText(result.getString("STUDENTLASTNAME"));
                jTextParentFirstName.setText(result.getString("PARENTFIRSTNAME"));
                jTextParentLastName.setText(result.getString("PARENTLASTNAME"));
                jTextAddress.setText(result.getString("ADDRESS"));
                jTextPostalCode.setText(result.getString("POSTALCODE"));
                jTextArea.setText(result.getString("AREA"));
                jTextPhoneNumber1.setText(result.getString("PHONENUMBER1"));
                jTextPhoneNumber2.setText(result.getString("PHONENUMBER2"));
                jTextPhoneNumber3.setText(result.getString("PHONENUMBER3"));
                jTextEmail1.setText(result.getString("EMAIL1"));
                jTextEmail2.setText(result.getString("EMAIL2"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonSaveRecord = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonEditRecord = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextCustomerID = new javax.swing.JTextField();
        jTextStudentFirstName = new javax.swing.JTextField();
        jTextStudentLastName = new javax.swing.JTextField();
        jTextParentFirstName = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jTextParentLastName = new javax.swing.JTextField();
        jTextPostalCode = new javax.swing.JTextField();
        jTextPhoneNumber1 = new javax.swing.JTextField();
        jTextArea = new javax.swing.JTextField();
        jTextPhoneNumber2 = new javax.swing.JTextField();
        jTextPhoneNumber3 = new javax.swing.JTextField();
        jTextEmail1 = new javax.swing.JTextField();
        jTextEmail2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextGeneralNote = new javax.swing.JTextArea();
        jTextSnote = new javax.swing.JTextField();
        datePickerSDate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSaveRecord.setText("Save Record");
        jButtonSaveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveRecordActionPerformed(evt);
            }
        });

        jButtonLogout.setText("Logout");

        jButtonExit.setText("Exit");

        jButtonEditRecord.setText("Edit Record");
        jButtonEditRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonSaveRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jButtonLogout)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonExit))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonEditRecord)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveRecord)
                    .addComponent(jButtonLogout)
                    .addComponent(jButtonExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditRecord)
                .addContainerGap())
        );

        jTextCustomerID.setEditable(false);
        jTextCustomerID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextStudentFirstName.setEditable(false);
        jTextStudentFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextStudentLastName.setEditable(false);
        jTextStudentLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextParentFirstName.setEditable(false);
        jTextParentFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextAddress.setEditable(false);
        jTextAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextParentLastName.setEditable(false);
        jTextParentLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextPostalCode.setEditable(false);
        jTextPostalCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextPhoneNumber1.setEditable(false);
        jTextPhoneNumber1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextArea.setEditable(false);
        jTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextPhoneNumber2.setEditable(false);
        jTextPhoneNumber2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextPhoneNumber3.setEditable(false);
        jTextPhoneNumber3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextEmail1.setEditable(false);
        jTextEmail1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextEmail2.setEditable(false);
        jTextEmail2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setText("Customer ID:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText("Student's First Name:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setText("Student's Last Name:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Parent's First Name:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Parent's Last Name:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setText("Address:");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setText("Postal Code:");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setText("Area:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setText("PhoneNumber1:");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setText("PhoneNumber2:");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setText("PhoneNumber3:");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setText("e-mail 1:");
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setText("e-mail 2:");
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextParentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextParentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPhoneNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextParentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextParentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPhoneNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextGeneralNote.setColumns(20);
        jTextGeneralNote.setRows(5);
        jTextGeneralNote.setBackground(new java.awt.Color(204, 255, 255));
        jTextGeneralNote.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jTextGeneralNote);

        jTextSnote.setBackground(new java.awt.Color(204, 255, 255));

        datePickerSDate.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("General Note:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setText("SDate");
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setText("SNote");
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePickerSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jTextSnote, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSnote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePickerSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveRecordActionPerformed
        // TODO add your handling code here:
        //just a flag for edit message
        if(editableFlag == false){
            JOptionPane.showMessageDialog(null, "Save record is disabled please edit record first", this.getTitle(), JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/InvoiceMyDataAPI","sa","sa");
                PreparedStatement ps = con.prepareStatement("INSERT INTO SA.STUDENTS VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, jTextStudentFirstName.getText());
                ps.setString(2, jTextStudentLastName.getText());
                ps.setString(3, jTextParentFirstName.getText());
                ps.setString(4, jTextParentLastName.getText());
                ps.setString(5, jTextAddress.getText());
                ps.setInt(6, Integer.parseInt(jTextPostalCode.getText()));
                ps.setString(7, jTextArea.getText());
                ps.setInt(8, Integer.parseInt(jTextPhoneNumber1.getText()));
                ps.setInt(9, Integer.parseInt(jTextPhoneNumber2.getText()));
                ps.setInt(10, Integer.parseInt(jTextPhoneNumber3.getText()));
                ps.setString(11, jTextEmail1.getText());
                ps.setString(12, jTextEmail2.getText());

                int dialogButton = 0;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to store the entry?","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Entry updated succesfull!!", this.getTitle(), JOptionPane.WARNING_MESSAGE);
                    jTextStudentFirstName.setEditable(false);
                    jTextStudentLastName.setEditable(false);
                    jTextParentFirstName.setEditable(false);
                    jTextParentLastName.setEditable(false);
                    jTextAddress.setEditable(false);
                    jTextPostalCode.setEditable(false);
                    jTextArea.setEditable(false);
                    jTextPhoneNumber1.setEditable(false);
                    jTextPhoneNumber2.setEditable(false);
                    jTextPhoneNumber3.setEditable(false);
                    jTextEmail1.setEditable(false);
                    jTextEmail2.setEditable(false);
                }
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButtonSaveRecordActionPerformed

    private void jButtonEditRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRecordActionPerformed
        // TODO add your handling code here:
        
        editableFlag = true;
        jTextCustomerID.setEditable(true);
        jTextStudentFirstName.setEditable(true);
        jTextStudentLastName.setEditable(true);
        jTextParentFirstName.setEditable(true);
        jTextParentLastName.setEditable(true);
        jTextAddress.setEditable(true);
        jTextPostalCode.setEditable(true);
        jTextArea.setEditable(true);
        jTextPhoneNumber1.setEditable(true);
        jTextPhoneNumber2.setEditable(true);
        jTextPhoneNumber3.setEditable(true);
        jTextEmail1.setEditable(true);
        jTextEmail2.setEditable(true);
    }//GEN-LAST:event_jButtonEditRecordActionPerformed

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
            java.util.logging.Logger.getLogger(StageTwoDataUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StageTwoDataUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StageTwoDataUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StageTwoDataUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StageTwoDataUpdate("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePickerSDate;
    private javax.swing.JButton jButtonEditRecord;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSaveRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextArea;
    private javax.swing.JTextField jTextCustomerID;
    private javax.swing.JTextField jTextEmail1;
    private javax.swing.JTextField jTextEmail2;
    private javax.swing.JTextArea jTextGeneralNote;
    private javax.swing.JTextField jTextParentFirstName;
    private javax.swing.JTextField jTextParentLastName;
    private javax.swing.JTextField jTextPhoneNumber1;
    private javax.swing.JTextField jTextPhoneNumber2;
    private javax.swing.JTextField jTextPhoneNumber3;
    private javax.swing.JTextField jTextPostalCode;
    private javax.swing.JTextField jTextSnote;
    private javax.swing.JTextField jTextStudentFirstName;
    private javax.swing.JTextField jTextStudentLastName;
    // End of variables declaration//GEN-END:variables
}
