/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals.gui;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import org.jfree.data.Range;
import signals.discreteSignals.abstracts.DiscreteSignal;
import signals.stats.SignalStats;

/**
 *
 * @author marr
 */
public class OutputWindow extends javax.swing.JFrame {

    private final DecimalFormat df = new DecimalFormat("0.####");
    private final OutputPanelFrequency freqChart;

    /**
     * Creates new form OutputWindow
     */
    public OutputWindow(DiscreteSignal signal, OutputPanelAmplitude aplitudeCharts, HistogramPanel hisPanel, OutputPanelModAndPhase modAndPhaseChart, HistogramPanel hisModAndPhase, OutputPanelFrequency freqCharts) {
        initComponents();

        this.freqChart = freqCharts;

        showStats(signal.getStats());

        jPanelAmp1.setLayout(new java.awt.BorderLayout());
        jPanelAmp1.add(aplitudeCharts, BorderLayout.CENTER);
        jPanelAmp1.revalidate();
        jPanelHist1.setLayout(new java.awt.BorderLayout());
        jPanelHist1.add(hisPanel, BorderLayout.CENTER);
        jPanelHist1.revalidate();

        jPanelAmp2.setLayout(new java.awt.BorderLayout());
        jPanelAmp2.add(modAndPhaseChart, BorderLayout.CENTER);
        jPanelAmp2.revalidate();
        jPanelHist2.setLayout(new java.awt.BorderLayout());
        jPanelHist2.add(hisModAndPhase, BorderLayout.CENTER);
        jPanelHist2.revalidate();

        jPanelFourier.setLayout(new java.awt.BorderLayout());
        jPanelFourier.add(freqCharts, BorderLayout.CENTER);
        jPanelFourier.validate();
        jSliderScale.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextMeanValue = new javax.swing.JTextField();
        jTextMeanPower = new javax.swing.JTextField();
        jTextVariance = new javax.swing.JTextField();
        jTextEffPower = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextAbsMeanValue1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelAmp1 = new javax.swing.JPanel();
        jPanelHist1 = new javax.swing.JPanel();
        jPanelAmp2 = new javax.swing.JPanel();
        jPanelHist2 = new javax.swing.JPanel();
        jPanelFourier = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSliderScale = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel3.setText("moc średnia");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel4.setText("wariancja");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel5.setText("moc skuteczna");

        jTextMeanValue.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextMeanValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMeanValue.setText("0");

        jTextMeanPower.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextMeanPower.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMeanPower.setText("0");

        jTextVariance.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextVariance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextVariance.setText("0");

        jTextEffPower.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextEffPower.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEffPower.setText("0");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("bezwzględna wartość średnia");

        jTextAbsMeanValue1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextAbsMeanValue1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAbsMeanValue1.setText("0");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("wartość średnia");

        jLabel2.setFont(new java.awt.Font("Yu Mincho", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Parametry sygnału");

        jTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelAmp1Layout = new javax.swing.GroupLayout(jPanelAmp1);
        jPanelAmp1.setLayout(jPanelAmp1Layout);
        jPanelAmp1Layout.setHorizontalGroup(
            jPanelAmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        jPanelAmp1Layout.setVerticalGroup(
            jPanelAmp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Wykres amplitud", jPanelAmp1);

        javax.swing.GroupLayout jPanelHist1Layout = new javax.swing.GroupLayout(jPanelHist1);
        jPanelHist1.setLayout(jPanelHist1Layout);
        jPanelHist1Layout.setHorizontalGroup(
            jPanelHist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        jPanelHist1Layout.setVerticalGroup(
            jPanelHist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Histogramy", jPanelHist1);

        javax.swing.GroupLayout jPanelAmp2Layout = new javax.swing.GroupLayout(jPanelAmp2);
        jPanelAmp2.setLayout(jPanelAmp2Layout);
        jPanelAmp2Layout.setHorizontalGroup(
            jPanelAmp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        jPanelAmp2Layout.setVerticalGroup(
            jPanelAmp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Wykres modułu i fazy", jPanelAmp2);

        javax.swing.GroupLayout jPanelHist2Layout = new javax.swing.GroupLayout(jPanelHist2);
        jPanelHist2.setLayout(jPanelHist2Layout);
        jPanelHist2Layout.setHorizontalGroup(
            jPanelHist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        jPanelHist2Layout.setVerticalGroup(
            jPanelHist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Histogram modułu i fazy", jPanelHist2);

        javax.swing.GroupLayout jPanelFourierLayout = new javax.swing.GroupLayout(jPanelFourier);
        jPanelFourier.setLayout(jPanelFourierLayout);
        jPanelFourierLayout.setHorizontalGroup(
            jPanelFourierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        jPanelFourierLayout.setVerticalGroup(
            jPanelFourierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Transformata Fouriera", jPanelFourier);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Skala osi X transformaty Fouriera (log2(n))");

        jSliderScale.setMajorTickSpacing(1);
        jSliderScale.setMaximum(10);
        jSliderScale.setPaintLabels(true);
        jSliderScale.setPaintTicks(true);
        jSliderScale.setSnapToTicks(true);
        jSliderScale.setValue(0);
        jSliderScale.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderScaleStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextMeanValue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextMeanPower, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextAbsMeanValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextVariance, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextEffPower, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jSliderScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMeanValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAbsMeanValue1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMeanPower))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVariance))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEffPower))
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(451, 451, 451))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderScaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderScaleStateChanged
        freqChart.setXScale(calculateNewTransformateRange(jSliderScale.getValue()));
    }//GEN-LAST:event_jSliderScaleStateChanged

    private void jTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneStateChanged
        if (jTabbedPane.getSelectedIndex() == 4) {
            jSliderScale.setEnabled(true);
        } else {
            jSliderScale.setEnabled(false);
        }
    }//GEN-LAST:event_jTabbedPaneStateChanged

    /**
     * @param args the command line arguments
     */
    private void showStats(SignalStats stats) {
        if (stats != null) {
            jTextMeanValue.setText(df.format(stats.getMeanValue()));
            jTextAbsMeanValue1.setText(df.format(stats.getAbsoluteMeanValue()));
            jTextEffPower.setText(df.format(stats.getEffectivePower()));
            jTextVariance.setText(df.format(stats.getVariance()));
            jTextMeanPower.setText(df.format(stats.getAveragePower()));
        }
    }

    private Range calculateNewTransformateRange(int n) {
        Range origRange = freqChart.getOriginalRange();
        double lowBound = origRange.getLowerBound();
        double uppBound = origRange.getUpperBound() / Math.pow(2, n);
        return new Range(lowBound, uppBound);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelAmp1;
    private javax.swing.JPanel jPanelAmp2;
    private javax.swing.JPanel jPanelFourier;
    private javax.swing.JPanel jPanelHist1;
    private javax.swing.JPanel jPanelHist2;
    private javax.swing.JSlider jSliderScale;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextField jTextAbsMeanValue1;
    private javax.swing.JTextField jTextEffPower;
    private javax.swing.JTextField jTextMeanPower;
    private javax.swing.JTextField jTextMeanValue;
    private javax.swing.JTextField jTextVariance;
    // End of variables declaration//GEN-END:variables
}
