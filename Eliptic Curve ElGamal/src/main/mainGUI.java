/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//Parameter
//A:7 B:-639 P:257
//A:-499 B:-200 P:277
//A:-368 B:-10 P:281

import algorithm.EllipticCurveAlgorithm;
import algorithm.Point;
import algorithm.PointProccessor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author user
 */
public class mainGUI extends javax.swing.JFrame {

    private EllipticCurveAlgorithm ECC;
    private Point P;
    private PointProccessor PP;
    /**
     * Creates new form mainGUI
     */
    public mainGUI() {
        initComponents();
        
        ECC = new EllipticCurveAlgorithm();
        P = new Point();
        PP = new PointProccessor();
        
        ALabel.setText(String.valueOf(ECC.A));
        BLabel.setText(String.valueOf(ECC.B));
        PLabel.setText(String.valueOf(ECC.P));
        basePointLabel.setText(ECC.base.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EncryptDecrypt = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        privateKeyLabel = new javax.swing.JLabel();
        privateKeyField = new javax.swing.JTextField();
        publicKeyLabel = new javax.swing.JLabel();
        publicKeyField = new javax.swing.JLabel();
        savePrivateKey = new javax.swing.JButton();
        savePublicKey = new javax.swing.JButton();
        generateKey = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        publicKeyInput = new javax.swing.JTextField();
        publicKeyLabel1 = new javax.swing.JLabel();
        publicKeyLabel2 = new javax.swing.JLabel();
        fileTextInputEncrypt = new javax.swing.JTextField();
        searchPublic = new javax.swing.JButton();
        searchFileText = new javax.swing.JButton();
        encrypt = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        InputText = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        InputTeksArea = new javax.swing.JTextArea();
        OutputText = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTeksArea = new javax.swing.JTextArea();
        saveOutput = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        privateKeyLabel1 = new javax.swing.JLabel();
        privateKeyInput = new javax.swing.JTextField();
        searchPrivate = new javax.swing.JButton();
        publicKeyLabel5 = new javax.swing.JLabel();
        fileTextInputDecrypt = new javax.swing.JTextField();
        searchFileText2 = new javax.swing.JButton();
        decrypt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ALabel = new javax.swing.JLabel();
        BLabel = new javax.swing.JLabel();
        PLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        basePointLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Key Generator"));

        privateKeyLabel.setText("Private Key :");

        privateKeyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateKeyFieldActionPerformed(evt);
            }
        });

        publicKeyLabel.setText("Public Key :");

        savePrivateKey.setText("Save As");
        savePrivateKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePrivateKeyActionPerformed(evt);
            }
        });

        savePublicKey.setText("Save As");
        savePublicKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePublicKeyActionPerformed(evt);
            }
        });

        generateKey.setText("Generate");
        generateKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateKeyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(publicKeyField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(privateKeyLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicKeyLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(privateKeyField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePrivateKey)
                    .addComponent(savePublicKey)))
            .addComponent(generateKey)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(generateKey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(privateKeyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privateKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePrivateKey))
                .addGap(18, 18, 18)
                .addComponent(publicKeyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePublicKey)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Encryption File"));

        publicKeyLabel1.setText("Public Key :");

        publicKeyLabel2.setText("File Text :");

        searchPublic.setText("Search");
        searchPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPublicActionPerformed(evt);
            }
        });

        searchFileText.setText("Search");
        searchFileText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFileTextActionPerformed(evt);
            }
        });

        encrypt.setText("Encrypt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicKeyLabel1)
                    .addComponent(publicKeyLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileTextInputEncrypt)
                    .addComponent(publicKeyInput))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPublic, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchFileText, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(encrypt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicKeyLabel1)
                    .addComponent(publicKeyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPublic))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicKeyLabel2)
                    .addComponent(fileTextInputEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFileText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encrypt)
                .addGap(7, 7, 7))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Result"));

        InputText.setText("Input Text :");

        InputTeksArea.setColumns(20);
        InputTeksArea.setRows(5);
        jScrollPane2.setViewportView(InputTeksArea);

        OutputText.setText("Output Text :");

        OutputTeksArea.setColumns(20);
        OutputTeksArea.setRows(5);
        jScrollPane1.setViewportView(OutputTeksArea);

        saveOutput.setText("Save");
        saveOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(OutputText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveOutput))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(InputText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OutputText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(saveOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(396, 396, 396))
        );

        OutputText.getAccessibleContext().setAccessibleName("OutputText");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Kriptografi - Elliptical Curve El Gamal");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Decryption File"));

        privateKeyLabel1.setText("Private Key :");

        searchPrivate.setText("Search");
        searchPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPrivateActionPerformed(evt);
            }
        });

        publicKeyLabel5.setText("File Text :");

        searchFileText2.setText("Search");
        searchFileText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFileText2ActionPerformed(evt);
            }
        });

        decrypt.setText("Decrypt");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(privateKeyLabel1)
                    .addComponent(publicKeyLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(privateKeyInput)
                    .addComponent(fileTextInputDecrypt))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPrivate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchFileText2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(decrypt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchPrivate)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(privateKeyLabel1)
                            .addComponent(privateKeyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicKeyLabel5)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fileTextInputDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchFileText2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decrypt)
                .addGap(7, 7, 7))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ECC Parameter"));

        jLabel2.setText("A : ");

        jLabel3.setText("B : ");

        jLabel4.setText("P : ");

        jLabel5.setText("Base Point : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(BLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(PLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(basePointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(BLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(PLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(basePointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savePrivateKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePrivateKeyActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showSaveDialog(this);
       
        // process selected file
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            try {
                PrintWriter out = new PrintWriter(file);
                out.println(privateKeyField.getText());
                out.flush();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            //System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_savePrivateKeyActionPerformed

    private void savePublicKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePublicKeyActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showSaveDialog(this);
       
        // process selected file
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            try {
                PrintWriter out = new PrintWriter(file);
                out.println(publicKeyField.getText());
                out.flush();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            //System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_savePublicKeyActionPerformed

    private void searchPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPrivateActionPerformed
        // TODO add your handling code here:
        
        int returnVal = fileChooser.showOpenDialog(this);
        
        // process selected file
        String filePath = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        //load selected file
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        privateKeyInput.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_searchPrivateActionPerformed

    private void searchPublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPublicActionPerformed
        // TODO add your handling code here:
        
        int returnVal = fileChooser.showOpenDialog(this);
        
        // process selected file
        String filePath = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        //load selected file
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        publicKeyInput.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_searchPublicActionPerformed

    private void searchFileTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFileTextActionPerformed
        // TODO add your handling code here:
        
        int returnVal = fileChooser.showOpenDialog(this);
        
        // process selected file
        String filePath = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        //load selected file
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            fileTextInputEncrypt.setText(fileChooser.getSelectedFile().getAbsolutePath());
            InputTeksArea.read(bufferedReader, filePath);
        } catch (IOException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFileTextActionPerformed

    private void privateKeyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateKeyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_privateKeyFieldActionPerformed

    private void generateKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateKeyActionPerformed
        // TODO add your handling code here:
        
        String privateKey = privateKeyField.getText();
        Point publicKey = ECC.generatePublicKey(Long.parseLong(privateKey));
        publicKeyField.setText(publicKey.toString());
    }//GEN-LAST:event_generateKeyActionPerformed

    private void searchFileText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFileText2ActionPerformed
        // TODO add your handling code here:
        
        int returnVal = fileChooser.showOpenDialog(this);
        
        // process selected file
        String filePath = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        //load selected file
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            fileTextInputDecrypt.setText(fileChooser.getSelectedFile().getAbsolutePath());
            InputTeksArea.read(bufferedReader, filePath);
        } catch (IOException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFileText2ActionPerformed

    private void saveOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOutputActionPerformed
        // TODO add your handling code here:
        
        int returnVal = fileChooser.showSaveDialog(this);
       
        // process selected file
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            try {
                PrintWriter out = new PrintWriter(file);
                out.println(OutputTeksArea.getText());
                out.flush();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            //System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_saveOutputActionPerformed

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
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALabel;
    private javax.swing.JLabel BLabel;
    private javax.swing.JRadioButton DecryptRadioButton1;
    private javax.swing.ButtonGroup EncryptDecrypt;
    private javax.swing.JRadioButton EncryptRadioButton1;
    private javax.swing.JButton ExecuteButton1;
    private javax.swing.JTextArea InputTeksArea;
    private java.awt.Label InputText;
    private javax.swing.JTextArea OutputTeksArea;
    private java.awt.Label OutputText;
    private javax.swing.JLabel PLabel;
    private javax.swing.JLabel basePointLabel;
    private javax.swing.JButton decrypt;
    private javax.swing.JButton encrypt;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextField fileTextInput1;
    private javax.swing.JTextField fileTextInputDecrypt;
    private javax.swing.JTextField fileTextInputEncrypt;
    private javax.swing.JButton generateKey;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField privateKeyField;
    private javax.swing.JTextField privateKeyInput;
    private javax.swing.JTextField privateKeyInput2;
    private javax.swing.JLabel privateKeyLabel;
    private javax.swing.JLabel privateKeyLabel1;
    private javax.swing.JLabel privateKeyLabel2;
    private javax.swing.JLabel publicKeyField;
    private javax.swing.JTextField publicKeyInput;
    private javax.swing.JTextField publicKeyInput1;
    private javax.swing.JLabel publicKeyLabel;
    private javax.swing.JLabel publicKeyLabel1;
    private javax.swing.JLabel publicKeyLabel2;
    private javax.swing.JLabel publicKeyLabel3;
    private javax.swing.JLabel publicKeyLabel4;
    private javax.swing.JLabel publicKeyLabel5;
    private javax.swing.JButton saveOutput;
    private javax.swing.JButton savePrivateKey;
    private javax.swing.JButton savePublicKey;
    private javax.swing.JButton searchFileText;
    private javax.swing.JButton searchFileText1;
    private javax.swing.JButton searchFileText2;
    private javax.swing.JButton searchPrivate;
    private javax.swing.JButton searchPrivate1;
    private javax.swing.JButton searchPublic;
    private javax.swing.JButton searchPublic1;
    // End of variables declaration//GEN-END:variables
}
