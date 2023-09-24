package javaapplication8;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

/** 
 * @author I.B
 */
public class NewJFrame extends javax.swing.JFrame {

   private int TotalTime;
   private Timer timer ;
   private int  hour,minute,second;
   
    public NewJFrame() {
        initComponents();
        SetIcon();
        setLocationRelativeTo(null);
    }
    //Execute command to windows cmd
    private void doCommand(String command){
        try{
            Runtime.getRuntime().exec(command);
        }catch(Exception exp){
            
            JOptionPane.showMessageDialog(null,"Error"+exp,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
   private void Cancel_the_Shutdown(){
        doCommand("shutdown -a");
    }
    private static String convertSeconds(int seconds) {
    int hours = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    int remainingSeconds = seconds % 60;
    return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
}
   private void StartTimer(){
                
            //Timer in lable
                ActionListener taskPerformer = (ActionEvent evt) -> {
                    Lable_Timer.setText(convertSeconds(TotalTime));
                    TotalTime--;
                };
                timer = new Timer(1000, taskPerformer);
                timer.setRepeats(true);
                timer.start();
   }
   private void StopTimer(){
       timer.stop();
   }
   private int getTime(){
               return( (hour*3600)+(minute*60)+(second) );
   }
   private void SetIcon(){
       try{
           setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
       }catch(Exception exp){
           
       }
       
   }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Lable_Timer = new javax.swing.JLabel();
        hourCBOX = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        minutCBOX = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        secondCBOX = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automatic shutdown");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("XM Yekan", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Time left to Shutdown:");

        jButton1.setBackground(new java.awt.Color(184, 184, 226));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("XM Yekan", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Shutdown after:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center>Note: 1-The computer will turn off after you select the time and press \"Start\". <br> 2- After you pressed \"Start\" you free to close the app if you want ,the computer will turn off in the selected time. </center></html>");
        jLabel4.setAlignmentX(5.0F);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton2.setBackground(new java.awt.Color(184, 184, 226));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Lable_Timer.setForeground(new java.awt.Color(0, 0, 0));
        Lable_Timer.setText("     00:00:00");

        hourCBOX.setBackground(new java.awt.Color(210, 210, 255));
        hourCBOX.setForeground(new java.awt.Color(0, 0, 0));
        hourCBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        hourCBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourCBOXActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("XM Yekan", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("hours");

        minutCBOX.setBackground(new java.awt.Color(210, 210, 255));
        minutCBOX.setForeground(new java.awt.Color(0, 0, 0));
        minutCBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutCBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutCBOXActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("XM Yekan", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("minutes");

        secondCBOX.setBackground(new java.awt.Color(210, 210, 255));
        secondCBOX.setForeground(new java.awt.Color(0, 0, 0));
        secondCBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        secondCBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondCBOXActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("XM Yekan", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("seconds");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(109, 109, 109)
                                .addComponent(Lable_Timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(hourCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(minutCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(secondCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Lable_Timer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hourCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(minutCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(secondCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Start Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
          try{
                TotalTime=getTime();
                if(TotalTime==0){
                    JOptionPane.showMessageDialog(null,"Sorry minimum time to turn off is one second.","Time limit",
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    
                doCommand("shutdown -s -t "+TotalTime);
                
                StartTimer();
           
                JOptionPane.showMessageDialog(null,"Done","Done",JOptionPane.INFORMATION_MESSAGE);
                }         
            }catch (Exception exp) {
                JOptionPane.showMessageDialog(null,"Error"+exp,"Error",JOptionPane.ERROR_MESSAGE);
            }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
//Cancel Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try{
            Cancel_the_Shutdown();
            Lable_Timer.setText("00:00:00");
            hourCBOX.setSelectedIndex(0);
            minutCBOX.setSelectedIndex(0);
            secondCBOX.setSelectedIndex(0);
            StopTimer();
            JOptionPane.showMessageDialog(null,"Canceled","Done",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception exp){
            JOptionPane.showMessageDialog(null,"Please set the time first.","Error",JOptionPane.ERROR_MESSAGE);
            
            }
            
    }//GEN-LAST:event_jButton2ActionPerformed
//The three next function is for comboBox.
    private void hourCBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourCBOXActionPerformed
       hour=Integer.parseInt(hourCBOX.getSelectedItem().toString());
    }//GEN-LAST:event_hourCBOXActionPerformed

    private void minutCBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutCBOXActionPerformed
         minute=Integer.parseInt(minutCBOX.getSelectedItem().toString());
    }//GEN-LAST:event_minutCBOXActionPerformed

    private void secondCBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondCBOXActionPerformed
        second=Integer.parseInt(secondCBOX.getSelectedItem().toString());
    }//GEN-LAST:event_secondCBOXActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lable_Timer;
    private javax.swing.JComboBox<String> hourCBOX;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> minutCBOX;
    private javax.swing.JComboBox<String> secondCBOX;
    // End of variables declaration//GEN-END:variables
}
