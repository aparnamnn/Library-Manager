/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Aparna
 */
public class StudentReg extends javax.swing.JFrame {
    StudentDataBase sdb;
    /**
     * Creates new form StudentReg
     */
    public StudentReg() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StudName = new javax.swing.JTextField();
        StudRoll = new javax.swing.JTextField();
        StudPassword1 = new javax.swing.JPasswordField();
        ConfirmStudpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        StudRegSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Roll No.");

        jLabel4.setText("Password");

        jLabel5.setText("Confirm Password");

        StudName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudNameActionPerformed(evt);
            }
        });

        StudPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudPassword1ActionPerformed(evt);
            }
        });

        ConfirmStudpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmStudpassActionPerformed(evt);
            }
        });

        jLabel6.setText("Student Registration");

        StudRegSubmit.setText("Submit");
        StudRegSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudRegSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(StudName, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(StudRoll))
                            .addComponent(StudPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(StudRegSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmStudpass, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(StudName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StudRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StudPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ConfirmStudpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(StudRegSubmit)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudNameActionPerformed

    private void StudRegSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudRegSubmitActionPerformed
      String s1 = StudPassword1.getText();
      String s2 = ConfirmStudpass.getText();
      String n1 = StudName.getText();
      String r1 = StudRoll.getText();
      String b1=null;
      int flag=0;
      StudentDataBase sdb1=new StudentDataBase();
      ArrayList<StudentDataBase> al=new ArrayList();
      if(s1.equals("")||s2.equals("")||n1.equals("")||r1.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Fields must not be left blank!","Message",JOptionPane.ERROR_MESSAGE);
      }
      else
      {
           
      if(s1.equals(s2))
       {
           
           try{
             FileInputStream fis ;
             fis= new FileInputStream("students.txt");
             ObjectInputStream ois;
             ois =new ObjectInputStream(fis);
             while((sdb=(StudentDataBase)ois.readObject())!=null)
             {
                 if(sdb.getrollno().equals(StudRoll.getText()))
                 {
                     flag=1;
                     break;
                 }
                 al.add(sdb);
             }
             ois.close();
             fis.close();
        }
        catch(FileNotFoundException e)
        {
        }
        catch(EOFException e)
        {
        }
        catch(ClassNotFoundException e)
        {
        }
        catch(IOException e)
        {
               e.printStackTrace();
        }
       
       if(flag==0)
       {
       sdb1.addrecord(n1,r1,s1,b1);
       al.add(sdb1);
       
       try{
          // System.out.println("Entering try");
           FileOutputStream fos;
           fos=new FileOutputStream("students.txt");
           ObjectOutputStream oos;
           oos=new ObjectOutputStream(fos);
           Iterator i = al.iterator();
                while(i.hasNext())
                {
                    System.out.println("Inside while");
                    sdb=(StudentDataBase)i.next();
                    System.out.println("Inside while2");
                    oos.writeObject(sdb);
                    System.out.println("Inside while");
                }
                System.out.println("Outside while");
                fos.close();
                oos.close();
                JOptionPane.showMessageDialog(null, "You have successfully registered ","Message",JOptionPane.INFORMATION_MESSAGE);
           
       StudentLogIn sli1 = new StudentLogIn();
        sli1.setVisible(true);
        this.dispose();
                
                
               
           
       }catch(IOException e) {}
       
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Roll number already exists","Message",JOptionPane.ERROR_MESSAGE);
           StudentLogIn studlogin=new StudentLogIn();
           studlogin.setVisible(true);
           this.dispose();
       }
       
       
       
           
       }
       else
       {
          
           JOptionPane.showMessageDialog(null, "Passwords do not match ","Message",JOptionPane.ERROR_MESSAGE);
           StudPassword1.setText("");
           ConfirmStudpass.setText("");
           
       } 
       }// TODO add your handling code here:
    }//GEN-LAST:event_StudRegSubmitActionPerformed

    private void StudPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudPassword1ActionPerformed

    private void ConfirmStudpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmStudpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmStudpassActionPerformed

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
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmStudpass;
    private javax.swing.JTextField StudName;
    private javax.swing.JPasswordField StudPassword1;
    private javax.swing.JButton StudRegSubmit;
    private javax.swing.JTextField StudRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
