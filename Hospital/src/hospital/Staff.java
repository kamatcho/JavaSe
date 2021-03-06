/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author kamatacho
 */
public class Staff extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pre = null;
    ResultSet rs = null;

    /**
     * Creates new form Staff
     */
    public Staff() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtFamilyName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        cDay = new javax.swing.JComboBox();
        cMonth = new javax.swing.JComboBox();
        cYear = new javax.swing.JComboBox();
        cSpecialization = new javax.swing.JComboBox();
        cGender = new javax.swing.JComboBox();
        cBloodGroup = new javax.swing.JComboBox();
        bSave = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("Name");

        jLabel3.setText("Father Name");

        jLabel4.setText("Family Name");

        jLabel5.setText("Mobile");

        jLabel6.setText("E-mail");

        jLabel7.setText("Address");

        jLabel8.setText("Date Of Joining");

        jLabel9.setText("Specialization");

        jLabel10.setText("Gender");

        jLabel11.setText("Blood Group");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        cDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "18", "20", "21", "22", "23", "24", "25", "26", "27", "27", "28", "29", "30" }));
        cDay.setSelectedIndex(-1);

        cMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cMonth.setSelectedIndex(-1);

        cYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));
        cYear.setSelectedIndex(-1);
        cYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cYearActionPerformed(evt);
            }
        });

        cSpecialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Nurse", "Reception", "Pharmacy", "X-Ray", "Lab", "Accountancy", "Admin" }));
        cSpecialization.setSelectedIndex(-1);

        cGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cGender.setSelectedIndex(-1);

        cBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "O+", "O-", "B+", "B-" }));
        cBloodGroup.setSelectedIndex(-1);

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("Get Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bNew.setText("New");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtId)
                            .addComponent(txtName)
                            .addComponent(txtFatherName)
                            .addComponent(txtFamilyName)
                            .addComponent(txtMobile)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(bNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBloodGroup, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cSpecialization, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFamilyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void cYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cYearActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter User Id");
        }
        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Name");
        }
        if (txtFatherName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Name");
        }
        if (txtFamilyName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Family Name");
        }
        if (txtMobile.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Email");
        }
        if (txtAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Address");
        }
        if (cDay.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Day Of Joining");
        }
        if (cMonth.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Month Of Joining");
        }
        if (cYear.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Year Of Joining");
        }
        if (cSpecialization.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Specialization");
        }
        if (cGender.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Gender");
        }
        if (cBloodGroup.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The Blood Group");
        }
        con = Connect.connect();
        if (cSpecialization.getSelectedItem().equals("Doctor")) {
            try {
                String sql = "SELECT `doctorid` FROM `doctor` WHERE doctorid ='" + txtId.getText() + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "insert into `doctor`(`doctorid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        if (cSpecialization.getSelectedItem().equals("Nurse")) {
            try {
                String sql = "SELECT `nurseid`, FROM `nurse` WHERE nurseid='" + txtId + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "INSERT INTO `nurse`(`nurseid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        if (cSpecialization.getSelectedItem().equals("Lab")) {
            try {
                String sql = "SELECT `labid`, FROM `lab` WHERE labid='" + txtId + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "INSERT INTO `lab`(`labid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        if (cSpecialization.getSelectedItem().equals("Pharmacy")) {
            try {
                String sql = "SELECT `pharmacyid`, FROM `lab` WHERE pharmacyid='" + txtId + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "INSERT INTO `pharmacy`(`pharmacyid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        if (cSpecialization.getSelectedItem().equals("X-Ray")) {
            try {
                String sql = "SELECT `xrayid`, FROM `lab` WHERE xrayid='" + txtId + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "INSERT INTO `xray`(`xrayid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        if (cSpecialization.getSelectedItem().equals("Accountancy")) {
            try {
                String sql = "SELECT `accountantid`, FROM `lab` WHERE accountantid='" + txtId + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "INSERT INTO `accountant`(`accountantid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        if (cSpecialization.getSelectedItem().equals("Reception")) {
            try {
                String sql = "SELECT `receptionid`, FROM `lab` WHERE receptionid='" + txtId + "'";
                con = Connect.connect();
                pre = con.prepareStatement(sql);
                rs = pre.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The Id Is Already Exists");
                }
                String sql2 = "INSERT INTO `reception`(`receptionid`, `name`, `fathername`, `familyname`, `mobile`, `email`, `address`, `dateofjoining`, `specialization`, `gender`, `bloodgroup`) VALUES" + " ('" + txtId.getText() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "'" + ",'" + cYear.getSelectedItem() + cMonth.getSelectedItem() + cDay.getSelectedItem() + "','" + cSpecialization.getSelectedItem() + "','" + cGender.getSelectedItem() + "','" + cBloodGroup.getSelectedItem() + "')";
                con = Connect.connect();
                pre = con.prepareStatement(sql2);
                pre.execute();
                JOptionPane.showMessageDialog(null, "Ok");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }


    }//GEN-LAST:event_bSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        StaffTabelInfo s = new StaffTabelInfo();
        s.setVisible(true);

// TODO add your handling code here: Get Data
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bUpdate;
    protected javax.swing.JComboBox cBloodGroup;
    protected javax.swing.JComboBox cDay;
    protected javax.swing.JComboBox cGender;
    protected javax.swing.JComboBox cMonth;
    protected javax.swing.JComboBox cSpecialization;
    protected javax.swing.JComboBox cYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JTextField txtAddress;
    protected javax.swing.JTextField txtEmail;
    protected javax.swing.JTextField txtFamilyName;
    protected javax.swing.JTextField txtFatherName;
    protected javax.swing.JTextField txtId;
    protected javax.swing.JTextField txtMobile;
    protected javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
