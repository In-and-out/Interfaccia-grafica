/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneCircolari;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author  f.caleffi i.costin
 */
public class Inserimento extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    public Inserimento() {
        initComponents();
        setResizable(false);
        ActionListener cbActionListener = new ActionListener() {
            @Override
            /**
             * Intercetta un input dall'utente quando succede 
             * un determinato evento in questo caso
             * quando seleziono un oggetto nella combobox dell'anno o mese
             */
            public void actionPerformed(ActionEvent e) {
                int anno = Integer.parseInt(cmbAnno.getSelectedItem().toString());//"Anno" viene inizializzato con l'anno selezionato nella combobox
                if (cmbMese.getSelectedItem().equals("2"))//Controlla se il mese è il mese di Febbraio
                {
                    if (JavaBisestile.isBisestile(anno))//se l'anno è bisestile inizializzo i giorni da 01 a 29 se invece non lo è i giorni sono compresi tra 01 e 28
                    {
                        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9",
                            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
                    } else {
                        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7","8", "9", 
                            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25","26", "27", "28"}));
                    }

                } else { //I giorni dei mesi di "Novembre, Settembre, Giugno, Aprile" vengono inizializzati da 01 a 30 per gli altri da 01 a 31  
                    if (cmbMese.getSelectedItem().equals("11") || cmbMese.getSelectedItem().equals("4") || cmbMese.getSelectedItem().equals("6") || cmbMese.getSelectedItem().equals("9")) {

                        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"
                        }));

                    } else {
                        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7",
                            "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                            "26", "27", "28", "29", "30", "31"
                        }));
                    }

                }
            }
        };
        cmbMese.addActionListener(cbActionListener);
        cmbAnno.addActionListener(cbActionListener);
        int k=0;
        for(int i=0;i<Globale.archivio.getDim();i++){
            if(Globale.archivio.getCircolare(i)!=null){
                if(Globale.archivio.getCircolare(i).getNumeroCircolare()>k)
                k=Globale.archivio.getCircolare(i).getNumeroCircolare();
            }
        }
        k++;
        txtNumeroCircolare.setText(""+k);

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
        lblClasse = new javax.swing.JLabel();
        txtNumeroCircolare = new javax.swing.JTextField();
        lblNumeroCircolare = new javax.swing.JLabel();
        lblOggetto = new javax.swing.JLabel();
        lblCausa = new javax.swing.JLabel();
        cmdConferma = new javax.swing.JButton();
        cmbOra = new javax.swing.JComboBox();
        lblOra = new javax.swing.JLabel();
        cmdAnnulla = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOggetto = new javax.swing.JTextArea();
        cmbMot = new javax.swing.JComboBox();
        cmbClasse = new javax.swing.JComboBox();
        cmbClasse1 = new javax.swing.JComboBox();
        cmbClasse2 = new javax.swing.JComboBox();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        cmbGiorno = new javax.swing.JComboBox();
        cmbMese = new javax.swing.JComboBox();
        cmbAnno = new javax.swing.JComboBox();
        lblGiorno = new javax.swing.JLabel();
        lblMese = new javax.swing.JLabel();
        lblAnno = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        lblTestata1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 102, 153));

        lblClasse.setText("Classe");

        lblNumeroCircolare.setText("N° Circolare");

        lblOggetto.setText("Oggetto");

        lblCausa.setText("Motivazione");

        cmdConferma.setBackground(new java.awt.Color(51, 102, 153));
        cmdConferma.setText("Conferma");
        cmdConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfermaActionPerformed(evt);
            }
        });

        cmbOra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12", "13" }));

        lblOra.setText("Ora");

        cmdAnnulla.setBackground(new java.awt.Color(51, 102, 153));
        cmdAnnulla.setText("Indietro");
        cmdAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnnullaActionPerformed(evt);
            }
        });

        txtOggetto.setColumns(20);
        txtOggetto.setRows(5);
        jScrollPane2.setViewportView(txtOggetto);

        cmbMot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assenza docente", "Assemblea", "Imprevisti", "Altro" }));

        cmbClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B.T.", "LSSA", "AT", "B.A.", "EC", "EN", "ET", "IA", "MM", " " }));
        cmbClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasseActionPerformed(evt);
            }
        });

        cmbClasse1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        cmbClasse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasse1ActionPerformed(evt);
            }
        });

        cmbClasse2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I" }));
        cmbClasse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasse2ActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENTRATA POSTICIPATA", "USCITA ANTICIPATA" }));

        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbGiorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGiornoActionPerformed(evt);
            }
        });

        cmbMese.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMeseActionPerformed(evt);
            }
        });

        cmbAnno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        lblGiorno.setText("Giorno");

        lblMese.setText("Mese");

        lblAnno.setText("Anno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblClasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbClasse1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumeroCircolare, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroCircolare)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOggetto)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOra))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblGiorno)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMese)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnno)
                                    .addComponent(cmbAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCausa)
                    .addComponent(cmbMot, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumeroCircolare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroCircolare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOra)
                            .addComponent(lblGiorno)
                            .addComponent(lblMese)
                            .addComponent(lblAnno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(lblClasse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblOggetto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCausa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(cmdConferma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdAnnulla)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );

        panel2.setBackground(new java.awt.Color(51, 102, 153));

        lblTestata1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTestata1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/logo.png"))); // NOI18N
        lblTestata1.setLabelFor(panel2);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTestata1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTestata1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Rende invisibile il form di inserimento e
 * ritorna a quello di default che è la ricerca
 * @param evt 
 */
    private void cmdAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnnullaActionPerformed
        this.setVisible(false);
        try {
            Ricerca ricerca = new Ricerca(true);//True se L'utente ha fatto il login
            ricerca.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdAnnullaActionPerformed
/**
 * Controlla se i dati inseriti sono giusti, se sì inserisce la circolare dento l'archivio
 * dentro la classe Globale dove viene trasformata in una Circolare
 * se no segna l'errore all'utente con un mesaggio di errore
 * @param evt 
 */
    private void cmdConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfermaActionPerformed
        try {
            int anno = Integer.parseInt(cmbClasse1.getSelectedItem().toString());
            int num = Integer.parseInt(txtNumeroCircolare.getText());
            int gg=Integer.parseInt(cmbGiorno.getSelectedItem().toString());
            int mm=Integer.parseInt(cmbMese.getSelectedItem().toString());
            int yy=Integer.parseInt(cmbAnno.getSelectedItem().toString());
            int hh=Integer.parseInt(cmbOra.getSelectedItem().toString());
            Data d=new Data(gg,mm,yy,hh);
            char c = cmbClasse2.getSelectedItem().toString().charAt(0);
            Classe clas = new Classe(anno, cmbClasse.getSelectedItem().toString(), c);
            Circolare circ=new Circolare(clas, cmbTipo.getSelectedItem().toString().charAt(0), d, cmbMot.getSelectedItem().toString(), txtOggetto.getText(), num);
            Globale.archivio.aggiungiCircolare(circ);
            JOptionPane.showMessageDialog(this, "Circolare inserita correttamente!");
            this.setVisible(false);
        try {
            Ricerca ricerca = new Ricerca(true);//True se L'utente ha fatto il login
            ricerca.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(this, "Errore, si prega di verificare che i campi siano inseriti correttamente!");
        }


    }//GEN-LAST:event_cmdConfermaActionPerformed

    private void cmbClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasseActionPerformed

    private void cmbClasse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasse1ActionPerformed

    private void cmbClasse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasse2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasse2ActionPerformed

    private void cmbGiornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGiornoActionPerformed


    }//GEN-LAST:event_cmbGiornoActionPerformed

    private void cmbMeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMeseActionPerformed

    }//GEN-LAST:event_cmbMeseActionPerformed

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
            java.util.logging.Logger.getLogger(Inserimento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inserimento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inserimento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inserimento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAnno;
    private javax.swing.JComboBox cmbClasse;
    private javax.swing.JComboBox cmbClasse1;
    private javax.swing.JComboBox cmbClasse2;
    private javax.swing.JComboBox cmbGiorno;
    private javax.swing.JComboBox cmbMese;
    private javax.swing.JComboBox cmbMot;
    private javax.swing.JComboBox cmbOra;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JButton cmdAnnulla;
    private javax.swing.JButton cmdConferma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnno;
    private javax.swing.JLabel lblCausa;
    private javax.swing.JLabel lblClasse;
    private javax.swing.JLabel lblGiorno;
    private javax.swing.JLabel lblMese;
    private javax.swing.JLabel lblNumeroCircolare;
    private javax.swing.JLabel lblOggetto;
    private javax.swing.JLabel lblOra;
    private javax.swing.JLabel lblTestata1;
    private javax.swing.JLabel lblTipo;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtNumeroCircolare;
    private javax.swing.JTextArea txtOggetto;
    // End of variables declaration//GEN-END:variables

}
