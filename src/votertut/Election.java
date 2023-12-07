package votertut;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
    
public class Election extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Ru = null;
    Statement st = null;
    public Election() {
        initComponents();
        DisplayElections();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ElectionName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ElectionTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ElectionNameTb = new javax.swing.JTextPane();
        AddButton = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ElectionDate = new com.toedter.calendar.JDateChooser();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(547, Short.MAX_VALUE)
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

        ElectionName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ElectionName.setText("Name");

        ElectionTable.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        ElectionTable.setColumnSelectionAllowed(true);
        ElectionTable.setRowHeight(25);
        ElectionTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        ElectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ElectionTable);
        ElectionTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("MANAGE ELECTION");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Date");

        jScrollPane4.setViewportView(ElectionNameTb);

        AddButton.setBackground(new java.awt.Color(255, 255, 153));
        AddButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BackBtn)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EditBtn)
                                        .addGap(69, 69, 69)
                                        .addComponent(DeleteBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(456, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(415, 415, 415)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(ElectionName))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(181, 181, 181)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddButton)
                                .addComponent(EditBtn)
                                .addComponent(DeleteBtn))
                            .addGap(27, 27, 27)
                            .addComponent(BackBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int Eid ;
Statement st1 = null;
ResultSet rs1 = null;
    private void ElecCount()
    {
        try{
        st1 = con.createStatement();
        rs1 = st1.executeQuery("Select Max(Eid) from ElectionTbl");
        rs1.next();
        Eid = rs1.getInt(1)+1;
    }catch(Exception Ex){
        
              }
    }
    private void DisplayElections(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            st=con.createStatement(); 
            Ru = st.executeQuery("Select * from ElectionTbl");
            ElectionTable.setModel(DbUtils.resultSetToTableModel(Ru));
    }catch(Exception e){
        
    }}
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        //Code to insert new elections in DB
        if(ElectionName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Enter the Elction Name");
        }else{
        try{
            String Day = String.valueOf(ElectionDate.getDate().getDay());
            String Month = String.valueOf(ElectionDate.getDate().getMonth());
            String Year = String.valueOf(ElectionDate.getDate().getYear());
            String EDate = Day + "/" + Month + "/" + Year;
            ElecCount();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            PreparedStatement Add = con.prepareStatement("insert into ElectionTbl values(?,?,?)");
            Add.setInt(1,Eid);
            Add.setString(2,ElectionNameTb.getText());
            Add.setString(3,EDate);
            int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Election Added Successfully");
            con.close();
            DisplayElections();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            
        }
    }
    }//GEN-LAST:event_AddButtonMouseClicked
int key =-1;
    private void ElectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)ElectionTable.getModel();
        int MyIndex = ElectionTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        ElectionNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        
    }//GEN-LAST:event_ElectionTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (key == -1){
            JOptionPane.showMessageDialog(this,"Select the Election to Delete");
        }else{try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            String Query="Delete from ElectionTbl where Eid ="+key;
            Statement Del = con.createStatement() ;
            Del.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Election Deleted successfully");
            DisplayElections();
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e);}}
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked

        if (key == -1 || ElectionDate.getDate().toString().isEmpty()){
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{try{
            String Day = String.valueOf(ElectionDate.getDate().getDay());
            String Month = String.valueOf(ElectionDate.getDate().getMonth());
            String Year = String.valueOf(ElectionDate.getDate().getYear());
            String EDate = Day + "/" + Month + "/" + Year;            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            String Query="Update ElectionTbl set EName=?, EDate=? where EId=?";
            
            PreparedStatement UpdateQuery = con.prepareStatement(Query) ;
            UpdateQuery.setString(1,ElectionNameTb.getText());
            UpdateQuery.setString(2,EDate);
            UpdateQuery.setInt(3,key);
            UpdateQuery.executeUpdate();
            JOptionPane.showMessageDialog(this,"Election Updated successfully");
            DisplayElections();
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
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Election().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private com.toedter.calendar.JDateChooser ElectionDate;
    private javax.swing.JLabel ElectionName;
    private javax.swing.JTextPane ElectionNameTb;
    private javax.swing.JTable ElectionTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
