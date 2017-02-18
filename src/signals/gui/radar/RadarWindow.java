/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals.gui.radar;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import signals.radar.RadarSimulator;
import signals.radar.RadarParameters;
import signals.radar.RadarResponse;

/**
 *
 * @author marr
 */
public class RadarWindow extends javax.swing.JFrame {

    private final RadarSimulator radarSimulator;
    private final RadarResponse response;
    private final DecimalFormat df = new DecimalFormat("0.####");

    /**
     * Creates new form RadarWindow
     *
     * @param parameters
     */
    public RadarWindow(RadarParameters parameters) {
        this.radarSimulator = new RadarSimulator(parameters);
        this.response = radarSimulator.generateResponse();
        initComponents();
        addCharts();
        addResults();
    }

    private void addCharts() {
        RadarChartsPanel chartsPanel = new RadarChartsPanel(response);
        jPanelCharts.setLayout(new java.awt.BorderLayout());
        jPanelCharts.add(chartsPanel, BorderLayout.CENTER);
        jPanelCharts.revalidate();
    }

    private void addResults() {
        jTextFieldDistance1.setText(df.format(response.getCalculatedInitialDistance()));
        jTextFieldDistance2.setText(df.format(response.getCalculateFinalDistance()));
        jTextFieldVelocity.setText(df.format(response.getCalculatedVelocity()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCharts = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDistance1 = new javax.swing.JTextField();
        jTextFieldDistance2 = new javax.swing.JTextField();
        jTextFieldVelocity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 0));
        setResizable(false);

        jPanelCharts.setPreferredSize(new java.awt.Dimension(1000, 800));

        javax.swing.GroupLayout jPanelChartsLayout = new javax.swing.GroupLayout(jPanelCharts);
        jPanelCharts.setLayout(jPanelChartsLayout);
        jPanelChartsLayout.setHorizontalGroup(
            jPanelChartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
        );
        jPanelChartsLayout.setVerticalGroup(
            jPanelChartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Analiza sygnałów");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Obliczona odległość po pierwszym pomiarze [m]");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Obliczona odległość po drugim pomiarze [m]");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Obliczona prędkość [m/s]");

        jTextFieldDistance1.setEditable(false);
        jTextFieldDistance1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDistance1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldDistance2.setEditable(false);
        jTextFieldDistance2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDistance2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldVelocity.setEditable(false);
        jTextFieldVelocity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldVelocity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDistance2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDistance1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCharts, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldDistance1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldDistance2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanelCharts, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelCharts;
    private javax.swing.JTextField jTextFieldDistance1;
    private javax.swing.JTextField jTextFieldDistance2;
    private javax.swing.JTextField jTextFieldVelocity;
    // End of variables declaration//GEN-END:variables
}
