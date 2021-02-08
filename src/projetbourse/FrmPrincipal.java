/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbourse;

import ClassesMetier.Action;
import ClassesMetier.Trader;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacqu
 */
public class FrmPrincipal extends javax.swing.JFrame {

    DefaultTableModel dtmTraders;
    DefaultTableModel dtmActions;
    Vector v;
    ArrayList<Trader> mesTraders;
    int numTrader;
    int numAction;
    public FrmPrincipal() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTraders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActions = new javax.swing.JTable();
        lblMessage = new javax.swing.JLabel();
        lblPortefeuille = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantiteVendue = new javax.swing.JTextField();
        btnVendre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Projet Bourse");

        jLabel2.setText("Liste des traders");

        tblTraders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom"
            }
        ));
        tblTraders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTradersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTraders);

        jLabel3.setText("Liste des actions du trader");

        tblActions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom", "Cours réel", "Prix achat", "Quantité achetée"
            }
        ));
        tblActions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActionsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblActions);

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));

        lblPortefeuille.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPortefeuille.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPortefeuille.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));

        jLabel4.setText("Quantité vendue");

        txtQuantiteVendue.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnVendre.setText("Vendre");
        btnVendre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblPortefeuille, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantiteVendue, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnVendre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPortefeuille, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantiteVendue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVendre))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        dtmTraders = (DefaultTableModel)tblTraders.getModel();
        dtmActions = (DefaultTableModel)tblActions.getModel();
        mesTraders = new ArrayList<>();
        
        // A vous de jouer
        
        Trader trad1= new Trader(1, "Enzo");
        Trader trad2= new Trader(2, "Noa");
        Trader trad3= new Trader(3, "Lilou");
        Trader trad4= new Trader(4, "Milo");
        
        Action act1=new Action(1, "Twitter", 169.15, 159, 110);
        Action act2=new Action(2, "Apple", 171.89, 163, 54);
        Action act3=new Action(3, "Facebook", 105.67, 98.45, 145);
        Action act4=new Action(4, "Microsoft", 110, 113.08, 32);
        Action act5=new Action(5, "Dell", 56.12, 54, 78);
        Action act6=new Action(6, "VMWare", 121.56, 123.91, 43);
        Action act7=new Action(7, "IBM", 42.61, 40.98, 126);
        
        trad1.getLesActionsAchetes().add(act1);
        trad1.getLesActionsAchetes().add(act2);
        trad1.getLesActionsAchetes().add(act7);
        
        trad2.getLesActionsAchetes().add(act1);
        trad2.getLesActionsAchetes().add(act3);
        trad2.getLesActionsAchetes().add(act4);
        trad2.getLesActionsAchetes().add(act5);
        
        trad3.getLesActionsAchetes().add(act6);
        trad3.getLesActionsAchetes().add(act7);
        
        trad4.getLesActionsAchetes().add(act4);
        trad4.getLesActionsAchetes().add(act5);
        trad4.getLesActionsAchetes().add(act1);
        
        mesTraders.add(trad1);
        mesTraders.add(trad2);
        mesTraders.add(trad3);
        mesTraders.add(trad4);
        
        for(Trader trad:mesTraders)
        {
            v=new Vector();
            v.add(trad.getIdTrader());
            v.add(trad.getNomTrader());
            
            dtmTraders.addRow(v);
        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void tblTradersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTradersMouseClicked
        
        // A vous de jouer
        dtmActions.getDataVector().removeAllElements();
        for(Trader trad : mesTraders)
        {
            if(trad.getIdTrader()==Integer.parseInt(tblTraders.getValueAt(tblTraders.getSelectedRow(), 0).toString()))
            {
                for(Action a:trad.getLesActionsAchetes())
                {
                    v=new Vector();
                    v.add(a.getIdAction());
                    v.add(a.getNomAction());
                    v.add(a.getValeurActuelAction());
                    v.add(a.getPrixAchatAction());
                    v.add(a.getQuantiteAcheteAction());
                    dtmActions.addRow(v);
                }
            }
        }
        
    }//GEN-LAST:event_tblTradersMouseClicked

    private void tblActionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActionsMouseClicked
        
        // A vous de jouer
        double montant=0;
        for(Trader trad : mesTraders)
        {
            for(Action a:trad.getLesActionsAchetes())
            {
                if(trad.getIdTrader()==Integer.parseInt(tblTraders.getValueAt(tblTraders.getSelectedRow(), 0).toString()))
                {
                montant=montant+(a.getValeurActuelAction()*a.getQuantiteAcheteAction())-(a.getPrixAchatAction()*a.getQuantiteAcheteAction());
                }
            }
        }
        lblPortefeuille.setText(String.valueOf(Math.round(montant)));
    }//GEN-LAST:event_tblActionsMouseClicked

    private void btnVendreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendreMouseClicked
        
        // A vous de jouer
        
    }//GEN-LAST:event_btnVendreMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVendre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPortefeuille;
    private javax.swing.JTable tblActions;
    private javax.swing.JTable tblTraders;
    private javax.swing.JTextField txtQuantiteVendue;
    // End of variables declaration//GEN-END:variables
}
