/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals1.gui.inputForms;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import signals1.discreteSignals.Impulse;
import signals1.discreteSignals.ImpulseNoise;
import signals1.discreteSignals.abstracts.DiscreteSignal;

/**
 *
 * @author glabg
 */
public class DiscreetSignalsPanel extends javax.swing.JPanel {

    private Dimension dimension;

    public DiscreetSignalsPanel(Dimension dimension) {
        this.dimension = dimension;
        initComponents();

    }

    public DiscreteSignal getSingal() {
        try {
            int f = Integer.parseInt(frequency.getText());
            int d = Integer.parseInt(duration.getText());
            int ns = Integer.parseInt(sampleNumber.getText());
            double p = Double.parseDouble(probability.getText());
            double a = Double.parseDouble(aValue.getText());
            double s = Double.parseDouble(startTime.getText());
            switch (jComboBox1.getSelectedIndex()) {
                case 1:
                    return new ImpulseNoise(a, f, d, s, ns, p);
                default:
                    return new Impulse(f, d, ns);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Niepoprawna wartość", "Błąd", JOptionPane.ERROR_MESSAGE);
            return null;
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        frequency = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sampleNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        probability = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        aValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        startTime = new javax.swing.JTextField();

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(dimension);

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impuls jednostkowy", "Szum impulsowy" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Częstotliwość [Hz]");

        frequency.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        frequency.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        frequency.setText("5");
        frequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Czas trwania [s]");

        duration.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        duration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        duration.setText("10");
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Nr Próbki Skoku Amplitudy");

        sampleNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sampleNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sampleNumber.setText("1");
        sampleNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampleNumberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Prawdopodobieństwo");
        jLabel6.setAutoscrolls(true);
        jLabel6.setEnabled(false);

        probability.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        probability.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        probability.setText("0.5");
        probability.setEnabled(false);
        probability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probabilityActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Wartość Skoku Amplitudy");
        jLabel7.setAutoscrolls(true);
        jLabel7.setEnabled(false);

        aValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aValue.setText("1");
        aValue.setEnabled(false);
        aValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aValueActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Czas Początkowy [s]");
        jLabel8.setAutoscrolls(true);
        jLabel8.setEnabled(false);

        startTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        startTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startTime.setText("0");
        startTime.setEnabled(false);
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(probability, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aValue, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sampleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frequency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequency))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampleNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(probability)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aValue)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTime))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sampleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampleNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sampleNumberActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void frequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                jLabel5.setEnabled(false);
                jLabel6.setEnabled(true);
                jLabel7.setEnabled(true);
                jLabel8.setEnabled(true);
                sampleNumber.setEnabled(false);
                probability.setEnabled(true);
                aValue.setEnabled(true);
                startTime.setEnabled(true);
                break;
            case 0:
                jLabel5.setEnabled(true);
                jLabel6.setEnabled(false);
                jLabel7.setEnabled(false);
                jLabel8.setEnabled(false);
                sampleNumber.setEnabled(true);
                probability.setEnabled(false);
                aValue.setEnabled(false);
                startTime.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void probabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probabilityActionPerformed

    private void aValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aValueActionPerformed

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aValue;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField frequency;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField probability;
    private javax.swing.JTextField sampleNumber;
    private javax.swing.JTextField startTime;
    // End of variables declaration//GEN-END:variables
}
