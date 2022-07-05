
package tic_tac_toe_ultimate_game;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AS2018479  H.D.M.Perera
 */
public class StartPage_main extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public StartPage_main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\TicTacToe\\tictactoe nw.jpg")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\TicTacToe\\tictactoe nw.jpg")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\TicTacToe\\gettyimages-200449775-001-2048x2048.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(900, 410));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 410));
        setSize(new java.awt.Dimension(900, 410));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 65)); // NOI18N
        jButton1.setText("Continue");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 260, 333, 46);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 65)); // NOI18N
        jButton2.setText("New game");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 300, 333, 78);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("   Tic_Tac_T oe_Ultimate                                                           H.D.M.Perera / AS2018479 / dasunandmalshan@gmail.com / T.P :-+94754875098                                                              Tic_Tac_Toe_Ultimate");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 390, 760, 13);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic_tac_toe_ultimate_game/new_tictactoe_home.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 790, 220);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic_tac_toe_ultimate_game/TictocToeBoard.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-360, -90, 1290, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new TicTacToeUltimate().continueCheck = 1;
        
        try{
            Scanner in = new Scanner(new File("SaveData.txt"));
            
                TicTacToeUltimate.nameX = in.next();
                TicTacToeUltimate.Xpoint = Integer.parseInt(in.next());
                TicTacToeUltimate.nameO = in.next();
                TicTacToeUltimate.Opoint = Integer.parseInt(in.next());
                
                TicTacToeUltimate.boardValues = in.next();
                TicTacToeUltimate.winLabelValues = in.next();
                              
                TicTacToeUltimate.button1 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button2 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button3 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button4 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button5 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button6 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button7 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button8 =  Integer.parseInt(in.next());
                TicTacToeUltimate.button9 =  Integer.parseInt(in.next());
                
               
                TicTacToeUltimate.checkX1= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO1= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX2= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO2= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX3= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO3= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX4= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO4= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX5= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO5= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX6= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO6= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX7= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO7= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX8= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO8= Integer.parseInt(in.next());
                
                TicTacToeUltimate.checkX9= Integer.parseInt(in.next());
                TicTacToeUltimate.checkO9= Integer.parseInt(in.next());
                
                TicTacToeUltimate.check= Integer.parseInt(in.next());
                
            new TicTacToeUltimate().setVisible(true);
            
            this.dispose();
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FirstPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StartPage_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
