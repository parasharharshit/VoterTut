
package votertut;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Parashar
 */
public class Voters extends javax.swing.JFrame {

    /**
     * Creates new form Voters
     */
    public Voters() {
        initComponents();
        DisplayVoters();
        GetElections();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VotersTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        VotNameTb = new javax.swing.JTextPane();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        VAgeTb = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        VElectionCb = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        VGendTb = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        VPassTb = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Elections Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        VotersTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        VotersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Gender", "Password", "Age", "Election"
            }
        ));
        VotersTable.setRowHeight(25);
        VotersTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        VotersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(VotersTable);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("MANAGE VOTERS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Age");

        jScrollPane4.setViewportView(VotNameTb);

        AddBtn.setBackground(new java.awt.Color(255, 255, 153));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 255, 153));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 153));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(255, 255, 153));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BackBtn.setText("Back");

        jScrollPane5.setViewportView(VAgeTb);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Gender");

        VElectionCb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Password");

        VGendTb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VGendTb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE", "OTHERS", " " }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Election");

        VPassTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPassTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(VElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(AddBtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(VPassTb, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(BackBtn)
                                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteBtn)
                                    .addComponent(VGendTb, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(486, 486, 486))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VGendTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VPassTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn))
                        .addGap(44, 44, 44)
                        .addComponent(BackBtn)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       int Vid ;
  Statement st1 = null;
  ResultSet rs1 = null;
    private void VotCount()
    {
        try{
        st1 = con.createStatement();
        rs1 = st1.executeQuery("Select Max(Vid) from voterstbl");
        rs1.next();
        Vid = rs1.getInt(1)+1;
    }catch(Exception Ex){
        
              }
    }
    private void DisplayVoters(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            st=con.createStatement(); 
            Ru = st.executeQuery("Select * from voterstbl");
            VotersTable.setModel(DbUtils.resultSetToTableModel(Ru));
    }catch(Exception e){
        
    }}
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Ru = null;
    Statement st = null;
    private void GetElections()
    {
                try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            st=con.createStatement(); 
            Ru = st.executeQuery("Select * from ElectionTbl");
            while(Ru.next()){
                String ElectId = Ru.getString("Eid");
                VElectionCb.addItem(ElectId);
            }
    }catch(Exception e){
        
    }
    }
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(VAgeTb.getText().isEmpty() || VotNameTb.getText().isEmpty()|| VElectionCb.getSelectedIndex()==-1||VGendTb.getSelectedIndex()==-1){

            JOptionPane.showMessageDialog(this,"Missing information");
        }else{
            try {
                VotCount();
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
                PreparedStatement Add = con.prepareStatement("insert into voterstbl values(?,?,?,?,?,?)");
                Add.setInt(1,Vid);
                Add.setString(2, VotNameTb.getText());
                Add.setInt(3,Integer.valueOf(VAgeTb.getText()));
                Add.setString(4, VPassTb.getText());
                Add.setString(5, (String) VGendTb.getSelectedItem());
                Add.setInt(6,Integer.valueOf(VElectionCb.getSelectedItem().toString()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Candidate Registered");
                con.close();
                DisplayVoters();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
        }

    }//GEN-LAST:event_AddBtnMouseClicked

    private void VPassTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPassTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VPassTbActionPerformed
    int key=-1;
    private void VotersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)VotersTable.getModel();
        int MyIndex = VotersTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        VotNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        VAgeTb.setText(model.getValueAt(MyIndex, 2).toString());
        VPassTb.setText(model.getValueAt(MyIndex, 3).toString());
        VGendTb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        VElectionCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_VotersTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        VotCount();      
        if (key== -1){
            JOptionPane.showMessageDialog(this,"Select the Voters to Delete");
        }else{try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            String Query="Delete from voterstbl where Vid ="+key;
            Statement Del = con.createStatement() ;
            Del.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Voter Deleted successfully");
            DisplayVoters();
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e);}}
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked

        if (VAgeTb.getText().isEmpty() || VotNameTb.getText().isEmpty()|| VElectionCb.getSelectedIndex()==-1||VGendTb.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            String Query="Update voterstbl set VName=?, VAge=?,VPass=?,VGen=?,VElection=? where Vid=?";
            
            PreparedStatement UpdateQuery = con.prepareStatement(Query) ;
            UpdateQuery.setString(1,VotNameTb.getText());
            UpdateQuery.setInt(2,Integer.valueOf(VAgeTb.getText()));
            UpdateQuery.setString(4, (String) VGendTb.getSelectedItem());
            UpdateQuery.setInt(5,Integer.valueOf(VElectionCb.getSelectedItem().toString())); 
            UpdateQuery.setString(3,VPassTb.getText());
            UpdateQuery.setInt(6,key);
            UpdateQuery.executeUpdate();
            JOptionPane.showMessageDialog(this,"Voter's Information Updated successfully");
            DisplayVoters();
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e);}}
    }//GEN-LAST:event_EditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextPane VAgeTb;
    private javax.swing.JComboBox<String> VElectionCb;
    private javax.swing.JComboBox<String> VGendTb;
    private javax.swing.JPasswordField VPassTb;
    private javax.swing.JTextPane VotNameTb;
    private javax.swing.JTable VotersTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
