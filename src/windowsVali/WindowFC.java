/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowsVali;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import pachet.clase.valentin.FierCalcat;
import pachet.clasegeneratoare.vali.GeneratorFierCalcat;


public class WindowFC extends javax.swing.JFrame {

    /**
     * Creates new form Window2
     */
    public WindowFC() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(219, 230, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 204)), "Fier de calcat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("CAUTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jPanel3.setBackground(new java.awt.Color(219, 230, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 204)), "Producator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jComboBox1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Philips", "Tefal", "Hausberg", "Braun", "Zilian", "OEM", "Selecteaza o categorie" }));
        jComboBox1.setSelectedItem("Selecteaza o categorie");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 178, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 190, -1));

        jPanel5.setBackground(new java.awt.Color(219, 230, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 204)), "Pret", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jComboBox2.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sub 50 de lei", "Intre 50 si 100 de lei", "Intre 100 si 200 de lei", "Intre 200 si 500 de lei", "Peste 500 de lei", "Selecteaza o categorie" }));
        jComboBox2.setSelectedItem("Selecteaza o categorie");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 178, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 100, 190, -1));

        jPanel6.setBackground(new java.awt.Color(219, 230, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 204)), "Culoare", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jComboBox3.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negru", "Albastru", "Verde", "Rosu", "Galben", "Selecteaza o categorie" }));
        jComboBox3.setSelectedItem("Selecteaza o categorie");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 178, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 171, 190, -1));

        jPanel7.setBackground(new java.awt.Color(219, 230, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 204)), "Putere consumata", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jComboBox4.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sub 800 W", "Intre 800 si 1000 W", "Intre 1000 si 2000 W", "Intre 2000 si 3000 W", "Peste 3000 W", "Selecteaza o categorie" }));
        jComboBox4.setSelectedItem("Selecteaza o categorie");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox4, 0, 178, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 242, 190, -1));

        jPanel8.setBackground(new java.awt.Color(219, 230, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 204)), "Talpa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jComboBox5.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zola", "Iron", "Philips", "Prym", "Veronesi", "STB", "Selecteaza o categorie" }));
        jComboBox5.setSelectedItem("Selecteaza o categorie");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, 0, 178, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 313, 190, -1));

        jButton2.setText("Import");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jButton3.setText("Export");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jPanel2.setBackground(new java.awt.Color(209, 255, 172));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(0, 204, 51)), "Rezultate", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea1.setBackground(new java.awt.Color(255, 255, 204));
        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jPanel2.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(672, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //FierCalcat: numeProdus, producator, pret, culoare, putereConsumata, talpa, latime, lungime, adancime, lungimeCablu, greutate, debitAbur, functii
        FierCalcat[] obiectFC = new FierCalcat[10];
        
        /*
        obiectFC[0] = new FierCalcat("Fier de calcat", "Philips", 85.00, "Albastru", 1800, "Inox", 12, 15.3, 25, 2.1, 3.4, 100, "Auto-curatare");
        obiectFC[1] = new FierCalcat("Fier de calcat", "Tefal", 99.99, "Verde", 1500, "Ceramica", 15, 18, 23.4, 2.5, 3.1, 250, "Auto-curatare");
        obiectFC[2] = new FierCalcat("Fier de calcat", "Philips", 1600.99, "Negru", 3100, "Safir", 20.2, 24.3, 19.6, 2, 5.3, 300, "Auto-curatare, Anti-calcar, Anti-picurare, Oprire automata");
        obiectFC[3] = new FierCalcat("Fier de calcat", "Arctic", 510.99, "Verde", 2500, "Aluminiu", 14, 20.2, 21.4, 1.8, 5.2, 350, "Auto-curatare, Anti-calcar, Anti-picurare");
        obiectFC[4] = new FierCalcat("Fier de calcat", "Domo", 245.89, "Rosu", 1750, "Ceramica", 16, 23.5, 22.5, 2.4, 4.2, 500, "Anti-calcar, Auto-curatare");
        obiectFC[5] = new FierCalcat("Fier de calcat", "Domo", 30.99, "Galben", 890, "Aluminiu", 13, 24.6, 18.3, 1.9, 3.2, 120, "Anti-calcar");
        obiectFC[6] = new FierCalcat("Fier de calcat", "Vanora", 800.99, "Negru", 2950, "Titan", 18, 22.5, 16, 1.8, 4.5, 330, "Auto-curatare, Anti-calcar, Anti-picurare, Oprire automata");
        obiectFC[7] = new FierCalcat("Fier de calcat", "Tefal", 120.20, "Verde", 1200, "Inox", 19, 20.3, 22, 1.8, 3, 115, "Auto-curatare");
        obiectFC[8] = new FierCalcat("Fier de calcat", "Arctic", 170.99, "Negru", 1400, "Ceramica", 14, 20, 2.5, 2.3, 4.5, 230, "Auto-curatare, Anti-calcar");
        obiectFC[9] = new FierCalcat("Fier de calcat", "Philips", 1899.99, "Rosu", 3500, "Safir", 20.3, 22.7, 5.3, 2.5, 6.2, 530, "Auto-curatare, Anti-calcar, Anti-picurare, Oprire automata");
        */
        
        ArrayList<FierCalcat> listaFierCalcat = GeneratorFierCalcat.genereazaRandomFierCalcat(10);
		for (FierCalcat unFierCalcat : listaFierCalcat)
			System.out.println(unFierCalcat);
        
                
        obiectFC[0]=listaFierCalcat.get(0);
        obiectFC[1]=listaFierCalcat.get(1);
        obiectFC[2]=listaFierCalcat.get(2);
        obiectFC[3]=listaFierCalcat.get(3);
        obiectFC[4]=listaFierCalcat.get(4);
        obiectFC[5]=listaFierCalcat.get(5);
        obiectFC[6]=listaFierCalcat.get(6);
        obiectFC[7]=listaFierCalcat.get(7);
        obiectFC[8]=listaFierCalcat.get(8);
        obiectFC[9]=listaFierCalcat.get(9);
        
        
        //Setare ca textul sa fie null dupa fiecare cautare
        textArea1.setText(null);
        boolean verificareText = true;
        //Verificare campuri
        for(int i = 0; i < obiectFC.length; i++){
            
            boolean valid = true;
            if(jComboBox1.getSelectedItem() != "Selecteaza o categorie" && obiectFC[i].getProducator() != jComboBox1.getSelectedItem()) valid = false;
            
            if(jComboBox2.getSelectedItem() != "Selecteaza o categorie" && jComboBox2.getSelectedIndex() == 0  && (obiectFC[i].getPret() > 50 )) valid = false;
            if(jComboBox2.getSelectedItem() != "Selecteaza o categorie" && jComboBox2.getSelectedIndex() == 1  && (obiectFC[i].getPret() < 50 || obiectFC[i].getPret() > 100 )) valid = false;
            if(jComboBox2.getSelectedItem() != "Selecteaza o categorie" && jComboBox2.getSelectedIndex() == 2  && (obiectFC[i].getPret() < 100 || obiectFC[i].getPret() > 200 )) valid = false;
            if(jComboBox2.getSelectedItem() != "Selecteaza o categorie" && jComboBox2.getSelectedIndex() == 3  && (obiectFC[i].getPret() < 200 || obiectFC[i].getPret() > 500 )) valid = false;
            if(jComboBox2.getSelectedItem() != "Selecteaza o categorie" && jComboBox2.getSelectedIndex() == 4  && (obiectFC[i].getPret() < 500 )) valid = false;
            
            if(jComboBox3.getSelectedItem() != "Selecteaza o categorie" && obiectFC[i].getCuloare()!= jComboBox3.getSelectedItem()) valid = false;
            
            if(jComboBox4.getSelectedItem() != "Selecteaza o categorie" && jComboBox4.getSelectedIndex() == 0  && obiectFC[i].getPutereConsumata() > 800) valid = false;
            if(jComboBox4.getSelectedItem() != "Selecteaza o categorie" && jComboBox4.getSelectedIndex() == 1  && (obiectFC[i].getPutereConsumata() < 800 || obiectFC[i].getPutereConsumata() > 1000 )) valid = false;
            if(jComboBox4.getSelectedItem() != "Selecteaza o categorie" && jComboBox4.getSelectedIndex() == 2  && (obiectFC[i].getPutereConsumata() < 1000 || obiectFC[i].getPutereConsumata() > 2000 )) valid = false;
            if(jComboBox4.getSelectedItem() != "Selecteaza o categorie" && jComboBox4.getSelectedIndex() == 3  && (obiectFC[i].getPutereConsumata() < 2000 || obiectFC[i].getPutereConsumata() > 3000 )) valid = false;
            if(jComboBox4.getSelectedItem() != "Selecteaza o categorie" && jComboBox4.getSelectedIndex() == 4  && obiectFC[i].getPutereConsumata() < 3000 ) valid = false;
            
            if(jComboBox5.getSelectedItem() != "Selecteaza o categorie" && obiectFC[i].getTalpa() != jComboBox5.getSelectedItem()) valid = false;
            /*
            if(valid) {
                textArea1.append(obiectFC[i].afisare());
                verificareText = false;
            }
            */
            
            if(valid) {
                
            
            Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
String fileName = "obiectFC_" + formatter.format(date) + ".txt";
File file = new File(fileName);
FileWriter writer = null;
                


                try {
                    writer = new FileWriter(file,true);
                } catch (IOException ex) {
                    Logger.getLogger(WindowFC.class.getName()).log(Level.SEVERE, null, ex);
                }


                try {
                   
                    writer.write(obiectFC[i].afisare());
                } catch (IOException ex) {
                    Logger.getLogger(WindowFC.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(WindowFC.class.getName()).log(Level.SEVERE, null, ex);
                }

                  
                textArea1.append(obiectFC[i].afisare());
                verificareText = false;
            }
            
            
    
            
        }
        if(verificareText) textArea1.append("Nu s-a gasit niciun rezultat!");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
    int returnVal = chooser.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
        try {
            File file = chooser.getSelectedFile();
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            textArea1.setText(null);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                textArea1.append(line + System.lineSeparator());
            }
            bufferedReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                FileWriter writer = new FileWriter(file);
                writer.write(textArea1.getText());
                writer.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(WindowFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowFC().setVisible(true);
            }
        });
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
