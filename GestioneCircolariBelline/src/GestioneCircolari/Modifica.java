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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author  f.caleffi i.costin
 */
public class Modifica extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Circolare debug;
    public Modifica() {
        initComponents();
        setResizable(false);
        ActionListener cbActionListener = new ActionListener() {
            /**
             * Intercetta un input dall'utente quando succede 
             * un determinato evento in questo caso
             * quando seleziono un oggetto nella combobox dell'anno o mese
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                int anno = Integer.parseInt(cmbAnno.getSelectedItem().toString());
                if (cmbMese.getSelectedItem().equals("2")) {
                    if (JavaBisestile.isBisestile(anno)) {
                        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                            "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
                    } else {
                        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7",
                            "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                            "26", "27", "28"
                        }));
                    }

                } else if (cmbMese.getSelectedItem().equals("11") || cmbMese.getSelectedItem().equals("4") || cmbMese.getSelectedItem().equals("6") || cmbMese.getSelectedItem().equals("9")) {

                    cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                        "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));

                } else {
                    cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7",
                        "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                        "26", "27", "28", "29", "30", "31"
                    }));
                }
            }
        };
        cmbMese.addActionListener(cbActionListener);
        cmbAnno.addActionListener(cbActionListener);
        //Controlla se la motivazione della circolare è di entrata(E) o di uscita
        if (Globale.archivio.getCircolare(Globale.indice) != null) {
            int temp = 0;
            if (Globale.archivio.getCircolare(Globale.indice).getTipo() == 'E') {
                temp = 0;
            } else {
                temp = 1;
            }
        //Inizializza gli oggetti del form con le variabili apposite
            txtNumeroCircolare.setText("" + Globale.archivio.getCircolare(Globale.indice).getNumeroCircolare());
            txtNumeroCircolare1.setText("" + Globale.archivio.getCircolare(Globale.indice).getNumeroCircolare());
            cmbTipo.setSelectedIndex(temp);
            cmbTipo1.setSelectedIndex(temp);
            cmbOra.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getHh());
            cmbOra1.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getHh());
            cmbGiorno.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getGg());
            cmbGiorno1.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getGg());
            cmbMese.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getMm());
            cmbMese1.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getMm());
            cmbAnno.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getYy());
            cmbAnno1.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getData().getYy());
            cmbClasse.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getClasse().getAnnoClasse());
            cmbClasse1.setSelectedItem("" + Globale.archivio.getCircolare(Globale.indice).getClasse().getAnnoClasse());
            cmbSezione.setSelectedItem(Globale.archivio.getCircolare(Globale.indice).getClasse().getSezone());
            cmbSezione1.setSelectedItem(Globale.archivio.getCircolare(Globale.indice).getClasse().getSezone());
            cmbArticolazione.setSelectedItem(Globale.archivio.getCircolare(Globale.indice).getClasse().getArticolazione());
            cmbArticolazione1.setSelectedItem(Globale.archivio.getCircolare(Globale.indice).getClasse().getArticolazione());
            txtOggetto.setText(Globale.archivio.getCircolare(Globale.indice).getAnnotazioni());
            txtOggetto1.setText(Globale.archivio.getCircolare(Globale.indice).getAnnotazioni());
            cmbMot.setSelectedItem(Globale.archivio.getCircolare(Globale.indice).getMotivazione());
            cmbMot1.setSelectedItem(Globale.archivio.getCircolare(Globale.indice).getMotivazione());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel2 = new java.awt.Panel();
        lblTestata1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblClasse = new javax.swing.JLabel();
        txtNumeroCircolare = new javax.swing.JTextField();
        lblNumeroCircolare = new javax.swing.JLabel();
        lblOggetto = new javax.swing.JLabel();
        lblCausa = new javax.swing.JLabel();
        cmbOra = new javax.swing.JComboBox();
        lblOra = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOggetto = new javax.swing.JTextArea();
        cmbMot = new javax.swing.JComboBox();
        cmbArticolazione = new javax.swing.JComboBox();
        cmbClasse = new javax.swing.JComboBox();
        cmbSezione = new javax.swing.JComboBox();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbAnno1 = new javax.swing.JComboBox();
        cmbMese1 = new javax.swing.JComboBox();
        cmbGiorno1 = new javax.swing.JComboBox();
        lblGiorno1 = new javax.swing.JLabel();
        lblMese1 = new javax.swing.JLabel();
        lblAnno1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblClasse1 = new javax.swing.JLabel();
        txtNumeroCircolare1 = new javax.swing.JTextField();
        lblNumeroCircolare1 = new javax.swing.JLabel();
        lblOggetto1 = new javax.swing.JLabel();
        lblCausa1 = new javax.swing.JLabel();
        cmdConferma1 = new javax.swing.JButton();
        cmbOra1 = new javax.swing.JComboBox();
        lblOra1 = new javax.swing.JLabel();
        cmdAnnulla1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOggetto1 = new javax.swing.JTextArea();
        cmbMot1 = new javax.swing.JComboBox();
        cmbArticolazione1 = new javax.swing.JComboBox();
        cmbClasse1 = new javax.swing.JComboBox();
        cmbSezione1 = new javax.swing.JComboBox();
        lblTipo1 = new javax.swing.JLabel();
        cmbTipo1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbAnno = new javax.swing.JComboBox();
        cmbMese = new javax.swing.JComboBox();
        cmbGiorno = new javax.swing.JComboBox();
        lblGiorno = new javax.swing.JLabel();
        lblMese = new javax.swing.JLabel();
        lblAnno = new javax.swing.JLabel();
        cmdElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 102, 153));

        panel2.setBackground(new java.awt.Color(51, 102, 153));

        lblTestata1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTestata1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/logo.png"))); // NOI18N

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 102, 153));

        lblClasse.setText("Classe");

        txtNumeroCircolare.setEnabled(false);

        lblNumeroCircolare.setText("N° Circolare");

        lblOggetto.setText("Oggetto");

        lblCausa.setText("Motivazione");

        cmbOra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12", "13" }));
        cmbOra.setEnabled(false);

        lblOra.setText("Ora");

        txtOggetto.setColumns(20);
        txtOggetto.setRows(5);
        txtOggetto.setEnabled(false);
        jScrollPane2.setViewportView(txtOggetto);

        cmbMot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assenza docente", "Assemblea", "Imprevisti", "Altro" }));
        cmbMot.setEnabled(false);

        cmbArticolazione.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B.T.", "LSSA", "AT", "B.A.", "EC", "EN", "ET", "IA", "MM", " " }));
        cmbArticolazione.setEnabled(false);
        cmbArticolazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArticolazioneActionPerformed(evt);
            }
        });

        cmbClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        cmbClasse.setEnabled(false);
        cmbClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasseActionPerformed(evt);
            }
        });

        cmbSezione.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I" }));
        cmbSezione.setEnabled(false);
        cmbSezione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSezioneActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENTRATA POSTICIPATA", "USCITA ANTICIPATA" }));
        cmbTipo.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ORIGINALE");

        cmbAnno1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        cmbAnno1.setEnabled(false);

        cmbMese1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMese1.setEnabled(false);
        cmbMese1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMese1ActionPerformed(evt);
            }
        });

        cmbGiorno1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbGiorno1.setEnabled(false);
        cmbGiorno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGiorno1ActionPerformed(evt);
            }
        });

        lblGiorno1.setText("Giorno");

        lblMese1.setText("Mese");

        lblAnno1.setText("Anno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCausa)
                    .addComponent(cmbMot, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCircolare, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroCircolare)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOggetto)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblClasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbClasse, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSezione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbArticolazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOra))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbGiorno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbMese1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGiorno1)
                                .addGap(18, 18, 18)
                                .addComponent(lblMese1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnno1)
                            .addComponent(cmbAnno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumeroCircolare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumeroCircolare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiorno1)
                            .addComponent(lblMese1)
                            .addComponent(lblAnno1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGiorno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMese1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAnno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(lblClasse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSezione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbArticolazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOggetto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCausa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(51, 102, 153));

        lblClasse1.setText("Classe");

        lblNumeroCircolare1.setText("N° Circolare");

        lblOggetto1.setText("Oggetto");

        lblCausa1.setText("Motivazione");

        cmdConferma1.setBackground(new java.awt.Color(51, 102, 153));
        cmdConferma1.setText("Conferma Modifica");
        cmdConferma1.setMaximumSize(new java.awt.Dimension(109, 23));
        cmdConferma1.setMinimumSize(new java.awt.Dimension(109, 23));
        cmdConferma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConferma1ActionPerformed(evt);
            }
        });

        cmbOra1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12", "13" }));

        lblOra1.setText("Ora");

        cmdAnnulla1.setBackground(new java.awt.Color(51, 102, 153));
        cmdAnnulla1.setText("Indietro");
        cmdAnnulla1.setMaximumSize(new java.awt.Dimension(109, 23));
        cmdAnnulla1.setMinimumSize(new java.awt.Dimension(109, 23));
        cmdAnnulla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnnulla1ActionPerformed(evt);
            }
        });

        txtOggetto1.setColumns(20);
        txtOggetto1.setRows(5);
        jScrollPane3.setViewportView(txtOggetto1);

        cmbMot1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assenza docente", "Assemblea", "Imprevisti", "Altro" }));

        cmbArticolazione1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B.T.", "LSSA", "AT", "B.A.", "EC", "EN", "ET", "IA", "MM", " " }));
        cmbArticolazione1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArticolazione1ActionPerformed(evt);
            }
        });

        cmbClasse1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        cmbClasse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasse1ActionPerformed(evt);
            }
        });

        cmbSezione1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I" }));
        cmbSezione1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSezione1ActionPerformed(evt);
            }
        });

        lblTipo1.setText("Tipo");

        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENTRATA POSTICIPATA", "USCITA ANTICIPATA" }));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("NUOVO");

        cmbAnno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        cmbMese.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMeseActionPerformed(evt);
            }
        });

        cmbGiorno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbGiorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGiornoActionPerformed(evt);
            }
        });

        lblGiorno.setText("Giorno");

        lblMese.setText("Mese");

        lblAnno.setText("Anno");

        cmdElimina.setBackground(new java.awt.Color(51, 102, 153));
        cmdElimina.setText("Elimina Circolare");
        cmdElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOggetto1)
                            .addComponent(txtNumeroCircolare1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroCircolare1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblClasse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbClasse1, 0, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSezione1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbArticolazione1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbOra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOra1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmbGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblGiorno)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMese)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnno)
                                    .addComponent(cmbAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(186, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCausa1)
                            .addComponent(cmbMot1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cmdElimina)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmdAnnulla1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmdConferma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroCircolare1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumeroCircolare1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOra1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiorno)
                            .addComponent(lblMese)
                            .addComponent(lblAnno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(lblClasse1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSezione1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbArticolazione1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOggetto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cmdConferma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cmdAnnulla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCausa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdElimina))
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbArticolazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArticolazioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbArticolazioneActionPerformed

    private void cmbClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasseActionPerformed

    private void cmbSezioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSezioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSezioneActionPerformed
/**
 * Controlla se i dati inseriti sono giusti, se sì modifica la circolare dento l'archivio
 * dentro la classe Globale dove viene trasformata di nuovo in una Circolare
 * se no segna l'errore all'utente con un mesaggio di errore
 * @param evt 
 */
    private void cmdConferma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConferma1ActionPerformed
       try {
            int anno = Integer.parseInt(cmbClasse1.getSelectedItem().toString());
            int num = Integer.parseInt(txtNumeroCircolare1.getText());
            int gg=Integer.parseInt(cmbGiorno.getSelectedItem().toString());
            int mm=Integer.parseInt(cmbMese.getSelectedItem().toString());
            int yy=Integer.parseInt(cmbAnno.getSelectedItem().toString());
            int hh=Integer.parseInt(cmbOra1.getSelectedItem().toString());
            Data d=new Data(gg,mm,yy,hh);
            char c = cmbSezione1.getSelectedItem().toString().charAt(0);
            Classe clas = new Classe(anno, cmbArticolazione1.getSelectedItem().toString(), c);
            Circolare circ=new Circolare(clas, cmbTipo1.getSelectedItem().toString().charAt(0), d, cmbMot1.getSelectedItem().toString(), txtOggetto1.getText(), num);
            if(Globale.archivio.getCircolare(Globale.indice) != null){
                Globale.archivio.modificaCircolare(Globale.indice,clas, cmbTipo1.getSelectedItem().toString().charAt(0), d, cmbMot1.getSelectedItem().toString(), txtOggetto1.getText(), num);
                JOptionPane.showMessageDialog(this, "Circolare modificata correttamente!");
            }else{
                JOptionPane.showMessageDialog(this, "Impossibile modificare questa circolare!");
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(this, "Errore, si prega di verificare che i campi siano inseriti correttamente!");
        }
    }//GEN-LAST:event_cmdConferma1ActionPerformed
/**
 * Rende invisibile il form di Modifica e
 * ritorna a quello di default che è la ricerca
 * @param evt 
 */
    private void cmdAnnulla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnnulla1ActionPerformed
        // TODO add your handling code here: this.setVisible(false);
        this.setVisible(false);
        try {
            Ricerca ricerca = new Ricerca(true);//True se l utente ha fatto il login
            ricerca.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Inserimento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmdAnnulla1ActionPerformed

    private void cmbArticolazione1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArticolazione1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbArticolazione1ActionPerformed

    private void cmbClasse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasse1ActionPerformed

    private void cmbSezione1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSezione1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSezione1ActionPerformed

    private void cmbMeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMeseActionPerformed

    }//GEN-LAST:event_cmbMeseActionPerformed

    private void cmbGiornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGiornoActionPerformed

    }//GEN-LAST:event_cmbGiornoActionPerformed

    private void cmbMese1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMese1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMese1ActionPerformed

    private void cmbGiorno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGiorno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGiorno1ActionPerformed
/**
 * Cerca la circolare tramite l'indice assegnatogli quando inserito, se l'indice non è null
 * elimina la circolare, se è null mostra un messaggio di errore all'utente
 * @param evt 
 */
    private void cmdEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminaActionPerformed
      try{
          if(Globale.archivio.getCircolare(Globale.indice) != null){
              Globale.archivio.eliminaCircolare(Globale.indice);
              JOptionPane.showMessageDialog(this, "Circolare eliminata correttamente!");
              
          }else{
              JOptionPane.showMessageDialog(this, "Errore, impossibile eliminare circolare!");
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Errore, impossibile eliminare circolare!");
      }
    }//GEN-LAST:event_cmdEliminaActionPerformed

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
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbAnno;
    private javax.swing.JComboBox cmbAnno1;
    private javax.swing.JComboBox cmbArticolazione;
    private javax.swing.JComboBox cmbArticolazione1;
    private javax.swing.JComboBox cmbClasse;
    private javax.swing.JComboBox cmbClasse1;
    private javax.swing.JComboBox cmbGiorno;
    private javax.swing.JComboBox cmbGiorno1;
    private javax.swing.JComboBox cmbMese;
    private javax.swing.JComboBox cmbMese1;
    private javax.swing.JComboBox cmbMot;
    private javax.swing.JComboBox cmbMot1;
    private javax.swing.JComboBox cmbOra;
    private javax.swing.JComboBox cmbOra1;
    private javax.swing.JComboBox cmbSezione;
    private javax.swing.JComboBox cmbSezione1;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JComboBox cmbTipo1;
    private javax.swing.JButton cmdAnnulla1;
    private javax.swing.JButton cmdConferma1;
    private javax.swing.JButton cmdElimina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAnno;
    private javax.swing.JLabel lblAnno1;
    private javax.swing.JLabel lblCausa;
    private javax.swing.JLabel lblCausa1;
    private javax.swing.JLabel lblClasse;
    private javax.swing.JLabel lblClasse1;
    private javax.swing.JLabel lblGiorno;
    private javax.swing.JLabel lblGiorno1;
    private javax.swing.JLabel lblMese;
    private javax.swing.JLabel lblMese1;
    private javax.swing.JLabel lblNumeroCircolare;
    private javax.swing.JLabel lblNumeroCircolare1;
    private javax.swing.JLabel lblOggetto;
    private javax.swing.JLabel lblOggetto1;
    private javax.swing.JLabel lblOra;
    private javax.swing.JLabel lblOra1;
    private javax.swing.JLabel lblTestata1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtNumeroCircolare;
    private javax.swing.JTextField txtNumeroCircolare1;
    private javax.swing.JTextArea txtOggetto;
    private javax.swing.JTextArea txtOggetto1;
    // End of variables declaration//GEN-END:variables
}
