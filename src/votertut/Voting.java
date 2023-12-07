/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package votertut;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Parashar
 */
public class Voting extends javax.swing.JFrame {

    /**
     * Creates new form Voting
     */
    public Voting() {
        initComponents();
        DisplayCandidate();
        Bravo.setVisible(false);
    }
    int VotingId;
        public Voting(int VoterId) {
        initComponents();
        DisplayCandidate();
        Bravo.setVisible(false);
        VotingId=VoterId;
        //JOptionPane.showMessageDialog(this,VotingId);
        
    }
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet Ru = null;
    Statement st = null;
     private void DisplayCandidate(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            st=con.createStatement(); 
            Ru = st.executeQuery("Select * from CandidateTbl");
            CandidateTbl.setModel(DbUtils.resultSetToTableModel(Ru));
    }catch(Exception e){
        
    }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CandidateTbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        VoteBtn = new javax.swing.JButton();
        CandidatePhotoLb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandNameTb = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Bravo = new javax.swing.JLabel();

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
                .addContainerGap(386, Short.MAX_VALUE)
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Your Candidate");

        CandidateTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VoteId", "VoterId", "ElectId", "CandidateId"
            }
        ));
        CandidateTbl.setRowHeight(25);
        CandidateTbl.setSelectionBackground(new java.awt.Color(255, 153, 0));
        CandidateTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CandidateTbl);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("WELCOME TO MYCODING VOTING APPLICATION");

        VoteBtn.setBackground(new java.awt.Color(255, 255, 153));
        VoteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VoteBtn.setText("VOTE");
        VoteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VoteBtn.setSelected(true);
        VoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteBtnActionPerformed(evt);
            }
        });

        CandidatePhotoLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CandidatePhotoLb.setText("Photo");

        CandNameTb.setBackground(new java.awt.Color(204, 204, 204));
        CandNameTb.setForeground(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(CandNameTb);

        jLabel12.setBackground(new java.awt.Color(255, 255, 102));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Candidates List");

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        Bravo.setBackground(new java.awt.Color(204, 204, 204));
        Bravo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Bravo.setForeground(new java.awt.Color(102, 204, 0));
        Bravo.setText("Vote Counted!!! Bravo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(365, 365, 365))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(CandidatePhotoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(217, 217, 217)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VoteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bravo)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CandidatePhotoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bravo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(VoteBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton4)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                private ImageIcon ResizePhoto(String ImagePath, byte[] pic){
        ImageIcon MyImage = null;
        if(ImagePath != null){
           MyImage = new ImageIcon(ImagePath);
        }else{
           MyImage = new ImageIcon(pic); 
        }
        Image Img = MyImage.getImage();
        Image newImg  = Img.getScaledInstance(CandidatePhotoLb.getWidth(),CandidatePhotoLb.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    } 
    int key=-1;
    private void FetchPhoto(){
     String Query = "Select cphoto from CandidateTbl where CId="+key;
     Statement st;
     ResultSet rs;
     try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
    st=con.createStatement();
    rs= st.executeQuery(Query);
    if(rs.next()){
        CandidatePhotoLb.setIcon(ResizePhoto(null,rs.getBytes("Cphoto")));
    }
     }
    catch(Exception e){
        
    }
    }
    int VoteId ;
Statement st1 = null;
ResultSet rs1 = null;
    private void VoteCount(){
            try{
        st1 = con.createStatement();
        rs1 = st1.executeQuery("Select Max(VoteId) from VotesTbl");
        rs1.next();
        VoteId = rs1.getInt(1)+1;
    }catch(Exception Ex){
        
              }
}
    int VNumber;
 private void VoteCheck() {
    try {
        System.out.println("Checking vote for VoterId: " + VotingId + ", ElectId: " + ElecId);
        st1 = con.createStatement();
        rs1 = st1.executeQuery("SELECT * FROM VotesTbl WHERE VoterId = " + VotingId + " AND ElectId = " + ElecId);
        if (rs1.next()) {
            VNumber = 1;
            System.out.println("Vote found. VNumber set to 1.");
        } else {
            VNumber = 0;
            System.out.println("No vote found. VNumber set to 0.");
        }
    } catch (Exception e) {
        System.out.println("Exception caught: " + e.getMessage());
        JOptionPane.showMessageDialog(this, e);
    }
}
    private void VoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteBtnActionPerformed
            //Code to insert new elections in DB
        VoteCheck();
        if(key==-1){
            JOptionPane.showMessageDialog(this,"Select Your Candidate");
        }else if(VNumber > 0)
        {
            JOptionPane.showMessageDialog(this,"You Can Not Vote Twice!!!!");
        }
        else{
        try{
            VoteCount();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_db","root","");
            PreparedStatement Add = con.prepareStatement("insert into votestbl values(?,?,?,?)");
            Add.setInt(1,VoteId);
            Add.setInt(2,VotingId);
            Add.setInt(3,ElecId);
            Add.setInt(4,key);
            int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Vote Counted");
            con.close();
            Bravo.setVisible(true);
            DisplayCandidate();
            VoteBtn.setVisible(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            
        }}
    }//GEN-LAST:event_VoteBtnActionPerformed

    int ElecId;
    private void CandidateTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTblMouseClicked
        DefaultTableModel model =(DefaultTableModel)CandidateTbl.getModel();
        int MyIndex = CandidateTbl.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        ElecId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CandNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        FetchPhoto();
    }//GEN-LAST:event_CandidateTblMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
     new Login().setVisible(true);
     this.dispose();     
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bravo;
    private javax.swing.JTextPane CandNameTb;
    private javax.swing.JLabel CandidatePhotoLb;
    private javax.swing.JTable CandidateTbl;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
