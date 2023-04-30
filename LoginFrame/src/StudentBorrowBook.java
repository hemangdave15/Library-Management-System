/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class StudentBorrowBook extends javax.swing.JFrame {
    static int prn1;
    static String name1;
    /**
     * Creates new form BorrowBook
     */
    public StudentBorrowBook() {
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

        BG = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbBook = new javax.swing.JLabel();
        jborrow = new javax.swing.JTextField();
        btBorrow = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(0, 153, 153));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/491-4910202_law-faculty-symbiosis-international-university-pune-symbiosis.png"))); // NOI18N
        Logo.setText("jLabel1");

        lbBook.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        lbBook.setText("Enter a Book to Borrow");

        jborrow.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        btBorrow.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btBorrow.setText("Borrow");
        btBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrowActionPerformed(evt);
            }
        });

        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(btBorrow)
                .addGap(192, 192, 192)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jborrow))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jborrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBorrow)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        joutput.setColumns(20);
        joutput.setRows(5);
        jScrollPane1.setViewportView(joutput);

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrowActionPerformed
        try {
            String borrow=jborrow.getText();
            Connection con=StudentLogin.connect();
            ResultSet resultSet2;
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery("select AVAILABLE_COPIES from books where Sl_No="+borrow+";");
            int av_copies=0;
            while(resultSet.next()) {
                av_copies=resultSet.getInt("Available_Copies");
            }
            ResultSet rs=statement.executeQuery("select count(sl_no) as no from borrowed where prn="+prn1+";");
            int number=0;
            while(rs.next()) {
                number=rs.getInt("no");
            }
            if((av_copies>0) && (number<3)) {
                int update_copies = statement.executeUpdate("update books set AVAILABLE_COPIES=AVAILABLE_COPIES-1 WHERE sl_no="+borrow+";");
                LocalDate myObj = LocalDate.now();

                int update_borrowed=statement.executeUpdate("update students set borrowed= borrowed+1 where prn="+prn1+";");
                LocalDate dateObj = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String date = dateObj.format(formatter);
                System.out.println(date);
                int update_borrowed_list=statement.executeUpdate("insert into borrowed values("+prn1+","+borrow+", '"+date+"');");
                JOptionPane.showMessageDialog(jPanel1, "Book Issued successfully");
                jborrow.setText("");
            }
            else {
                joutput.setText("There is no available copies currently. Kindly check back later");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(StudentBorrowBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBorrowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentDashBoard sd=new StudentDashBoard();
        this.dispose();
        sd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(int prn,String name) {
        prn1=prn;
        name1=name;
        try {
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
                java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            Connection con=StudentLogin.connect();
            ResultSet resultSet2;
            Statement statement=con.createStatement();
            resultSet2 = statement.executeQuery(
                    "select * from books");
            
            System.out.println("No worries");
            
            int sl_no;
            String title1,str="";
            int tot_copies;
            int av_copies;
            
            while (resultSet2.next()) {
                try {
                    sl_no = resultSet2.getInt("sl_no");
                    title1 = resultSet2.getString("title").trim();
                    tot_copies = resultSet2.getInt("Total_Copies");
                    av_copies = resultSet2.getInt("Available_Copies");
                    str+="Sl_No : " + sl_no + "    "
                            + " Title : " + title1+"    "
                            + "Total Copies: "+ tot_copies+"    "
                            + "Available Copies: "+av_copies+"\n";
                } catch (SQLException ex) {
                    Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            joutput.setText(str);
            joutput.setLineWrap(true);
            joutput.setWrapStyleWord(true);
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new StudentBorrowBook().setVisible(true);
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(StudentBorrowBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btBorrow;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jborrow;
    static final javax.swing.JTextArea joutput = new javax.swing.JTextArea();
    private javax.swing.JLabel lbBook;
    // End of variables declaration//GEN-END:variables
}
