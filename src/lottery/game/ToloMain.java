/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery.game;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjeewa Kulathunga
 */
public class ToloMain extends javax.swing.JFrame {

    /**
     * Creates new form Tolo
     */
    public ToloMain() {
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

        ToloMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        txtNum4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLuckey = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        superBet = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tolo Game 1.0");
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("ToloMain"); // NOI18N
        setResizable(false);

        ToloMain.setBackground(new java.awt.Color(254, 234, 230));
        ToloMain.setName("ToloMain"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Draw Numbers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        jLabel1.setText("Choose Your Numbers Here");

        txtNum1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });

        txtNum2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });

        txtNum3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtNum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum3KeyTyped(evt);
            }
        });

        txtNum4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtNum4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lucky Number");

        txtLuckey.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtLuckey.setForeground(new java.awt.Color(0, 0, 255));
        txtLuckey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLuckey.setEnabled(false);
        txtLuckey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLuckeyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLuckeyKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLuckey, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLuckey, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel3.setText("Choose Your Bet Amount:");
        jLabel3.setToolTipText("");

        txtBet.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txtBet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBetKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("???");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBet)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        superBet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        superBet.setText("Give Me a Super Bet");
        superBet.setToolTipText("");
        superBet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                superBetMouseClicked(evt);
            }
        });
        superBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superBetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(superBet, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(superBet, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title.JPG"))); // NOI18N

        javax.swing.GroupLayout ToloMainLayout = new javax.swing.GroupLayout(ToloMain);
        ToloMain.setLayout(ToloMainLayout);
        ToloMainLayout.setHorizontalGroup(
            ToloMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToloMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToloMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ToloMainLayout.setVerticalGroup(
            ToloMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ToloMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToloMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToloMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ToloMain.getAccessibleContext().setAccessibleName("");
        ToloMain.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean isUnique(){
        int T1=Integer.parseInt(txtNum1.getText());
        int T2=Integer.parseInt(txtNum2.getText());
        int T3=Integer.parseInt(txtNum3.getText());
        int T4=Integer.parseInt(txtNum4.getText());
        int[] UNums = {T1,T2,T3,T4};
        UNums=NumSort(UNums);
        for(int i=0;i<(UNums.length)-1;i++){
            if(UNums[i]==UNums[i+1]){
                return false;
            }
        }
        return true;  
    }
    private int[] NumSort(int[] arr){
       int[] num=arr;
       int n = num.length;  
       int temp = 0; 
       for(int i=0; i < n; i++){
           for(int j=1; j < (n-i); j++){
               if(num[j-1] > num[j]){  
                    temp = num[j-1];  
                    num[j-1] = num[j];  
                    num[j] = temp;  
                } 
           }
       }
       return num;
    }
    private void txtNum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyReleased
        try{
            if(Integer.parseInt(txtNum1.getText())<1 || Integer.parseInt(txtNum1.getText())>20){
                JOptionPane.showMessageDialog(this,"Number must be between 1 and 20","Alert",JOptionPane.WARNING_MESSAGE);
                txtNum1.setText("");
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtNum1KeyReleased

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        try{
            char enter = evt.getKeyChar();
            if(!(Character.isDigit(enter))){
            evt.consume();
            }
        }catch(Exception ignore){}
            
        
        
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtNum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyReleased
        try{
            if(Integer.parseInt(txtNum2.getText())<1 || Integer.parseInt(txtNum2.getText())>20){
                JOptionPane.showMessageDialog(this,"Number must be between 1 and 20","Alert",JOptionPane.WARNING_MESSAGE);
                txtNum2.setText("");
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtNum2KeyReleased

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
         try{
            char enter = evt.getKeyChar();
            if(!(Character.isDigit(enter))){
            evt.consume();
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtNum2KeyTyped

    private void txtNum3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum3KeyReleased
        try{
            if(Integer.parseInt(txtNum3.getText())<1 || Integer.parseInt(txtNum3.getText())>20){
                JOptionPane.showMessageDialog(this,"Number must be between 1 and 20","Alert",JOptionPane.WARNING_MESSAGE);
                txtNum3.setText("");
            }
        }catch(Exception ignore){}
 
    }//GEN-LAST:event_txtNum3KeyReleased

    private void txtNum3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum3KeyTyped
        try{
            char enter = evt.getKeyChar();
            if(!(Character.isDigit(enter))){
            evt.consume();
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtNum3KeyTyped

    private void txtNum4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum4KeyReleased
        try{
            if(Integer.parseInt(txtNum4.getText())<1 || Integer.parseInt(txtNum4.getText())>20){
                JOptionPane.showMessageDialog(this,"Number must be between 1 and 20","Alert",JOptionPane.WARNING_MESSAGE);
                txtNum4.setText("");
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtNum4KeyReleased

    private void txtNum4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum4KeyTyped
        try{
            char enter = evt.getKeyChar();
            if(!(Character.isDigit(enter))){
            evt.consume();
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtNum4KeyTyped

    private void txtLuckeyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLuckeyKeyReleased
        try{
            if(Integer.parseInt(txtLuckey.getText())<1 || Integer.parseInt(txtLuckey.getText())>10){
                JOptionPane.showMessageDialog(this,"Number must be between 1 and 10","Alert",JOptionPane.WARNING_MESSAGE);
                txtLuckey.setText("");
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtLuckeyKeyReleased

    private void txtLuckeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLuckeyKeyTyped
        try{
            char enter = evt.getKeyChar();
            if(!(Character.isDigit(enter))){
            evt.consume();
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtLuckeyKeyTyped

    private void txtBetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBetKeyTyped
        try{
            char enter = evt.getKeyChar();
            if(!(Character.isDigit(enter))){
            evt.consume();
            }
        }catch(Exception ignore){}
    }//GEN-LAST:event_txtBetKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if(!txtBet.getText().equals("")){
                if(!txtNum1.getText().equals("") && !txtNum2.getText().equals("") && !txtNum3.getText().equals("") && !txtNum4.getText().equals("")){
                    if((Integer.parseInt(txtNum1.getText())>0 && Integer.parseInt(txtNum1.getText())<21) && (Integer.parseInt(txtNum2.getText())>0 && Integer.parseInt(txtNum2.getText())<21) && (Integer.parseInt(txtNum3.getText())>0 && Integer.parseInt(txtNum3.getText())<21) && (Integer.parseInt(txtNum4.getText())>0 && Integer.parseInt(txtNum4.getText())<21) && (Integer.parseInt(txtNum1.getText())>0 && Integer.parseInt(txtNum1.getText())<21)){
                        if(isUnique()){
                            if(superBet.isSelected()){
                                if(!txtLuckey.getText().equals("") && (Integer.parseInt(txtLuckey.getText())>0 && Integer.parseInt(txtLuckey.getText())<21)){
                                    Tolo STB = new Tolo();
                                    STB.createSuperBet(Integer.parseInt(txtNum1.getText()), Integer.parseInt(txtNum2.getText()), Integer.parseInt(txtNum3.getText()), Integer.parseInt(txtNum4.getText()), Integer.parseInt(txtBet.getText()),Integer.parseInt(txtLuckey.getText()));
                                    ToloResults TR = new ToloResults();
                                    TR.ReceiveResults(STB.getDrawNumbers(), STB.getUserNumbers(),STB.getGain(), STB.getSuperNumber(),Integer.parseInt(txtLuckey.getText()), STB.getMatchNCount(),STB.getMatchedNumbers());
                                    TR.setResults();
                                    TR.setVisible(true);
                                    this.setVisible(false);
                                }else{
                                    JOptionPane.showMessageDialog(this,"Invalid Luckey Number","Alert",JOptionPane.WARNING_MESSAGE);
                                }
                            }else{
                                Tolo STB = new Tolo();
                                STB.createBet(Integer.parseInt(txtNum1.getText()), Integer.parseInt(txtNum2.getText()), Integer.parseInt(txtNum3.getText()), Integer.parseInt(txtNum4.getText()), Integer.parseInt(txtBet.getText()));
                                ToloResults TR = new ToloResults();
                                TR.ReceiveResults(STB.getDrawNumbers(), STB.getUserNumbers(),STB.getGain(),0,0, STB.getMatchNCount(),STB.getMatchedNumbers());
                                TR.setResults();
                                TR.setVisible(true);
                                this.setVisible(false);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Please Enter Unique Four Numbers","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Invalid Numbers","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Please Select Your Four Number","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,"Please Select Your Bet Amount","Alert",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void superBetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superBetMouseClicked
        if(superBet.isSelected()==true){
            txtLuckey.setEnabled(true);
        }else{
            txtLuckey.setEnabled(false);
        }
    }//GEN-LAST:event_superBetMouseClicked

    private void superBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superBetActionPerformed
        if(superBet.isSelected()==true){
            txtLuckey.setEnabled(true);
        }else{
            txtLuckey.setEnabled(false);
        }
    }//GEN-LAST:event_superBetActionPerformed

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
            java.util.logging.Logger.getLogger(ToloMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToloMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToloMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToloMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToloMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ToloMain;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox superBet;
    private javax.swing.JTextField txtBet;
    private javax.swing.JTextField txtLuckey;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JTextField txtNum4;
    // End of variables declaration//GEN-END:variables
}
