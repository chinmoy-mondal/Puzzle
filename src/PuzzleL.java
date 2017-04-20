
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cm
 */
public class PuzzleL extends javax.swing.JFrame {
    
    int x1=0,x2=2,x3=1,x4=1,x5=2,x6=0,x7=2,x8=1,x9=1;
    int v1=0,v2=0,v3=0,v4=0,v5=0,v6=0,v7=0,v8=0,v9=0;
    int count=0;
    /**
     * Creates new form PuzzleL
     */
    public PuzzleL() {
        initComponents();
        defult();
    }
    public void defultSame(int x5)
    {
        x1=x2=x3=x4=x6=x7=x8=x9=x5;
//        v1=v2=v3=v4=v5=v6=v7=v8=v9=0;
             
        if(x1==0){
            jButton1.setBackground(Color.red);
            
        }
        else if(x1==1){
            jButton1.setBackground(Color.green);
            
        }
        else if(x1==2){
            jButton1.setBackground(Color.blue);
            
        }
        
        
        if(x2==0){
            jButton2.setBackground(Color.red);
            
        }
        else if(x2==1){
            jButton2.setBackground(Color.green);
            
        }
        else if(x2==2){
            jButton2.setBackground(Color.blue);
            
        }
        
        
        if(x3==0){
            jButton3.setBackground(Color.red);

        }
        else if(x3==1){
            jButton3.setBackground(Color.green);

        }
        else if(x3==2){
            jButton3.setBackground(Color.blue);

        }
        
        
        if(x4==0){
            jButton4.setBackground(Color.red);

        }
        else if(x4==1){
            jButton4.setBackground(Color.green);

        }
        else if(x4==2){
            jButton4.setBackground(Color.blue);

        }
        
        
        if(x5==0){
            jButton5.setBackground(Color.red);

        }
        else if(x5==1){
            jButton5.setBackground(Color.green);

        }
        else if(x5==2){
            jButton5.setBackground(Color.blue);

        }        
        
        
        if(x6==0){
            jButton6.setBackground(Color.red);

        }
        else if(x6==1){
            jButton6.setBackground(Color.green);

        }
        else if(x6==2){
            jButton6.setBackground(Color.blue);

        }
        
        
        if(x7==0){
            jButton7.setBackground(Color.red);

        }
        else if(x7==1){
            jButton7.setBackground(Color.green);

        }
        else if(x7==2){
            jButton7.setBackground(Color.blue);

        }
        
        
        if(x8==0){
            jButton8.setBackground(Color.red);

        }
        else if(x8==1){
            jButton8.setBackground(Color.green);

        }
        else if(x8==2){
            jButton8.setBackground(Color.blue);

        }
        
        
        if(x9==0){
            jButton9.setBackground(Color.red);

        }
        else if(x9==1){
            jButton9.setBackground(Color.green);

        }
        else if(x9==2){
            jButton9.setBackground(Color.blue);

        }
        
    }
    public void defult()
    {
        x1=x6=0;x2=x7=x5=2;x3=x4=x8=x9=1;
        v1=v2=v3=v4=v5=v6=v7=v8=v9=0;
        count=0;
             
        if(x1==0){
            jButton1.setBackground(Color.red);
            
        }
        else if(x1==1){
            jButton1.setBackground(Color.green);
            
        }
        else if(x1==2){
            jButton1.setBackground(Color.blue);
            
        }
        
        
        if(x2==0){
            jButton2.setBackground(Color.red);
            
        }
        else if(x2==1){
            jButton2.setBackground(Color.green);
            
        }
        else if(x2==2){
            jButton2.setBackground(Color.blue);
            
        }
        
        
        if(x3==0){
            jButton3.setBackground(Color.red);

        }
        else if(x3==1){
            jButton3.setBackground(Color.green);

        }
        else if(x3==2){
            jButton3.setBackground(Color.blue);

        }
        
        
        if(x4==0){
            jButton4.setBackground(Color.red);

        }
        else if(x4==1){
            jButton4.setBackground(Color.green);

        }
        else if(x4==2){
            jButton4.setBackground(Color.blue);

        }
        
        
        if(x5==0){
            jButton5.setBackground(Color.red);

        }
        else if(x5==1){
            jButton5.setBackground(Color.green);

        }
        else if(x5==2){
            jButton5.setBackground(Color.blue);

        }
        
        
        if(x6==0){
            jButton6.setBackground(Color.red);

        }
        else if(x6==1){
            jButton6.setBackground(Color.green);

        }
        else if(x6==2){
            jButton6.setBackground(Color.blue);

        }
        
        
        if(x7==0){
            jButton7.setBackground(Color.red);

        }
        else if(x7==1){
            jButton7.setBackground(Color.green);

        }
        else if(x7==2){
            jButton7.setBackground(Color.blue);

        }
        
        
        if(x8==0){
            jButton8.setBackground(Color.red);

        }
        else if(x8==1){
            jButton8.setBackground(Color.green);

        }
        else if(x8==2){
            jButton8.setBackground(Color.blue);

        }
        
        
        if(x9==0){
            jButton9.setBackground(Color.red);

        }
        else if(x9==1){
            jButton9.setBackground(Color.green);

        }
        else if(x9==2){
            jButton9.setBackground(Color.blue);

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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Puzzle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        count++;
        if(x1==2)
        {
            x1=0;
        }
        else
            x1++;
        
        if(x1==0){
            jButton1.setBackground(Color.red);
            
        }
        else if(x1==1){
            jButton1.setBackground(Color.green);
            
        }
        else if(x1==2){
            jButton1.setBackground(Color.blue);
            
        }      
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        count++;        
        if(x2==2)
        {
            x2=0;
        }
        else
            x2++;
        
        if(x2==0){
            jButton2.setBackground(Color.red);
            
        }
        else if(x2==1){
            jButton2.setBackground(Color.green);
            
        }
        else if(x2==2){
            jButton2.setBackground(Color.blue);
            
        }
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        count++;
        if(x3==2)
        {
            x3=0;
        }
        else
            x3++;
        
        if(x3==0){
            jButton3.setBackground(Color.red);

        }
        else if(x3==1){
            jButton3.setBackground(Color.green);

        }
        else if(x3==2){
            jButton3.setBackground(Color.blue);

        }
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        count++;
        if(x4==2)
        {
            x4=0;
        }
        else
            x4++;
        
        if(x4==0){
            jButton4.setBackground(Color.red);

        }
        else if(x4==1){
            jButton4.setBackground(Color.green);

        }
        else if(x4==2){
            jButton4.setBackground(Color.blue);

        }
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        else if(x4==2 && x5==2 && x6==2){
            System.out.println("4,5,6 are equal");
            defultSame(x5);
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\nmiddle row is blue.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        count++;
        if(x5==2)
        {
            x5=0;
        }
        else
            x5++;
        
        if(x5==0){
            jButton5.setBackground(Color.red);

        }
        else if(x5==1){
            jButton5.setBackground(Color.green);

        }
        else if(x5==2){
            jButton5.setBackground(Color.blue);

        }
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        else if(x4==2 && x5==2 && x6==2){            
            System.out.println("4,5,6 are equal");
            defultSame(x5);
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\nmiddle row is blue\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        count++;        
        if(x6==2)
        {
            x6=0;
        }
        else
            x6++;
        
        if(x6==0){
            jButton6.setBackground(Color.red);

        }
        else if(x6==1){
            jButton6.setBackground(Color.green);

        }
        else if(x6==2){
            jButton6.setBackground(Color.blue);

        }
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        else if(x4==2 && x5==2 && x6==2){
            System.out.println("4,5,6 are equal");
            defultSame(x5);
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\nMiddle row is blue\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        count++;
        if(x7==2)
        {
            x7=0;
        }
        else
            x7++;
        
        if(x7==0){
            jButton7.setBackground(Color.red);

        }
        else if(x7==1){
            jButton7.setBackground(Color.green);

        }
        else if(x7==2){
            jButton7.setBackground(Color.blue);

        }
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        count++;
        if(x8==2)
        {
            x8=0;
        }
        else
            x8++;
        
        if(x8==0){
            jButton8.setBackground(Color.red);

        }
        else if(x8==1){
            jButton8.setBackground(Color.green);

        }
        else if(x8==2){
            jButton8.setBackground(Color.blue);

        }
        
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        count++;
        if(x9==2)
        {
            x9=0;
        }
        else
            x9++;
        
        if(x9==0){
            jButton9.setBackground(Color.red);

        }
        else if(x9==1){
            jButton9.setBackground(Color.green);

        }
        else if(x9==2){
            jButton9.setBackground(Color.blue);

        }
        System.out.println("x1 = "+x1+", x2 = "+x2+", x3 = "+x3+", \tx4 = "+x4+", x5 = "+x5+", x6 = "+x6+", \tx7 = "+x7+", x8 = "+x8+", x9 = "+x9);
        if(x1==x2 && x1==x3 && x1==x4 && x1==x5 && x1==x6 && x1==x7 && x1==x8 && x1==x9)
        {
            System.out.println("all are equal");
            JOptionPane.showMessageDialog(null, "Congratulation! You win.\n you needs "+count+" attemps.", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            defult();
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        defult();
    }//GEN-LAST:event_jButton_resetActionPerformed

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
            java.util.logging.Logger.getLogger(PuzzleL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
