
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshit
 */
public class EmpSales extends javax.swing.JFrame {
PreparedStatement pst=null;
    /**
     * Creates new form EmpSales
     */
    public EmpSales() {
        initComponents();
        Update();
    }
    private void Update(){
        try{
            
            Class.forName("java.sql.Driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?zeroDateTimeBehavior=convertToNull","root","arora");
            String sql="Select * from empsale";
            pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            emps.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        emps = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deltext2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        deltext3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sale By", "Unit Name", "Builder", "Type", "Price Per Sq. Ft.", "Total", "Scheme", "Location", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emps);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Details");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deltext2.setText("Delete");
        deltext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltext2ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        deltext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltext3ActionPerformed(evt);
            }
        });

        jButton6.setText("Sort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(jButton6)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(deltext3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deltext2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(deltext3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deltext2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)emps.getModel();
try{
Class.forName("java.sql.Driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?zeroDateTimeBehavior=convertToNull","root","arora");
Statement st=con.createStatement();
String query="Select * from empsale";
ResultSet rs =st.executeQuery(query);
while(rs.next()){
    String d1=rs.getString("ID");
    String d2=rs.getString("Saleby");
    String d3=rs.getString("Salename");
    String d4=rs.getString("Builder");
    String d5=rs.getString("Type");
    String d6=rs.getString("Pricepsq");
    String d7=rs.getString("Price");
    String d8=rs.getString("Scheme");
    String d9=rs.getString("Location");
    String d10=rs.getString("Discount");
            
    model.addRow(new Object[]{d1,d2,d3,d4,d5,d6,d7,d8,d9,d10});
    
    
}
rs.close();
st.close();
con.close();

Update();



}

catch (Exception e){
    
    JOptionPane.showMessageDialog(this,"Error In Connectivity");
    
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AddSales d =new AddSales();
        d.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deltext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltext2ActionPerformed
        // TODO add your handling code here:
        String sql2 ="Delete from empsale where saleby=?";
     try{
         Class.forName("java.sql.Driver");
         Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?zeroDateTimeBehavior=convertToNull","root","arora");
         pst=con.prepareStatement(sql2);
         pst.setString(1,deltext3.getText());
         pst.execute();
         //JOptionPane.showMessageDialog(null,"Please make a selection");
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Action could not be Performed");
         
         if (deltext3.getText().equals(""))
         {
           JOptionPane.showMessageDialog(null,"Please make a selection");  
         }
     
     }
    
       Update();
       deltext3.setText("");
        
           
    }//GEN-LAST:event_deltext2ActionPerformed

    private void empsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empsMouseClicked
        // TODO add your handling code here:
        try{
        int row =emps.getSelectedRow();
        String Table_click=(emps.getModel().getValueAt(row, 0).toString());
        Class.forName("java.sql.Driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?zeroDateTimeBehavior=convertToNull","root","arora");
String sql ="select * from empsale where id='"+Table_click+"'";
pst=con.prepareStatement(sql);
ResultSet rs= pst.executeQuery();
if (rs.next()){

String add1=rs.getString("saleby");
deltext3.setText(add1);
}



pst.execute();



pst.close();
con.close();
        
        
        }
        catch(Exception e){}
        Update();
        
       
        
    }//GEN-LAST:event_empsMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Empsedit c=new Empsedit();
        c.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Emptable gobck4 = new Emptable();
        gobck4.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deltext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltext3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deltext3ActionPerformed

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
            java.util.logging.Logger.getLogger(EmpSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deltext2;
    private javax.swing.JTextField deltext3;
    private javax.swing.JTable emps;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
