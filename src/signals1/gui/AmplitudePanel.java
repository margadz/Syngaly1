/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signals1.gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.apache.commons.math3.complex.Complex;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import signals1.signals.discrete.ImpulseInterface;
import signals1.signals.discrete.DiscreteSignal;

/**
 *
 * @author marr
 */
public class AmplitudePanel extends javax.swing.JPanel {

    private static final String SKŁADOWA_UROJONA = "składowa urojona";
    private static final String SKŁADOWA_RZECZYWISTA = "składowa rzeczywista";
    private static final String MODUL_LICZBY = "moduł z liczby zespolonej";
    private static final String FAZA_LICZBY = "faza liczby zespolonej";
    private static final String AMPLITUDA = "amplituda";
    private static final String CZAS = "czas";
    private final int chartDimensionX = 1150;
    private final int chartDimensionY = 350;

    /**
     * Creates new form AmplitudePanel
     */
    public AmplitudePanel(DiscreteSignal signal, boolean isModAndPhase) {
        initComponents();
        ChartPanel realChart;
        ChartPanel imgChart;

        if (isModAndPhase) {
            if (signal instanceof ImpulseInterface) {
                realChart = getScatterPlot(signal.getValuesModAndShift(), true, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
                imgChart = getScatterPlot(signal.getValuesModAndShift(), false, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
            } else {
                realChart = getChart(signal.getValuesModAndShift(), true, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
                imgChart = getChart(signal.getValuesModAndShift(), false, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
            }
        } else if (signal instanceof ImpulseInterface) {
            realChart = getScatterPlot(signal.getValues(), true, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
            imgChart = getScatterPlot(signal.getValues(), false, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
        } else {
            realChart = getChart(signal.getValues(), true, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
            imgChart = getChart(signal.getValues(), false, signal.getStartTime(), signal.getSamplingRate(), isModAndPhase);
        }

        jPanelReal.setLayout(new java.awt.BorderLayout());
        jPanelReal.add(realChart, BorderLayout.CENTER);
        jPanelReal.setVisible(true);
        jPanelReal.validate();

        jPanelImg.setLayout(new java.awt.BorderLayout());
        jPanelImg.add(imgChart, BorderLayout.CENTER);
        jPanelImg.setVisible(true);
        jPanelImg.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReal = new javax.swing.JPanel();
        jPanelImg = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1200, 810));

        jPanelReal.setPreferredSize(new java.awt.Dimension(1150, 400));

        javax.swing.GroupLayout jPanelRealLayout = new javax.swing.GroupLayout(jPanelReal);
        jPanelReal.setLayout(jPanelRealLayout);
        jPanelRealLayout.setHorizontalGroup(
            jPanelRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanelRealLayout.setVerticalGroup(
            jPanelRealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        jPanelImg.setPreferredSize(new java.awt.Dimension(1150, 400));

        javax.swing.GroupLayout jPanelImgLayout = new javax.swing.GroupLayout(jPanelImg);
        jPanelImg.setLayout(jPanelImgLayout);
        jPanelImgLayout.setHorizontalGroup(
            jPanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanelImgLayout.setVerticalGroup(
            jPanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelReal, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private ChartPanel getScatterPlot(Complex[] values, boolean isReal, double startTime, int samplingRate, boolean isModAndPhase) {
        String title = SKŁADOWA_RZECZYWISTA;
        if (!isReal) {
            title = SKŁADOWA_UROJONA;
        }
        if (isModAndPhase) {
            title = MODUL_LICZBY;
            if (!isReal) {
                title = FAZA_LICZBY;
            }
        }

        JFreeChart chart = ChartFactory.createScatterPlot(title, CZAS, AMPLITUDA, createDataset(values, isReal, startTime, title, samplingRate));
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(chartDimensionX, chartDimensionY));
        return chartPanel;
    }

    private ChartPanel getChart(Complex[] values, boolean isReal, double startTime, int samplingRate, boolean isModAndPhase) {
        String title = SKŁADOWA_RZECZYWISTA;
        if (!isReal) {
            title = SKŁADOWA_UROJONA;
        }
        if (isModAndPhase) {
            title = MODUL_LICZBY;
            if (!isReal) {
                title = FAZA_LICZBY;
            }
        }

        JFreeChart chart = ChartFactory.createXYLineChart(title, CZAS, AMPLITUDA,
                createDataset(values, isReal, startTime, title, samplingRate));
        NumberAxis xAxis = new NumberAxis();
        xAxis.setTickUnit(new NumberTickUnit(1));
        chart.getXYPlot().getRenderer().setSeriesStroke(0, new BasicStroke(0.6f));
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(chartDimensionX, chartDimensionY));
        return chartPanel;
    }

    protected XYSeriesCollection createDataset(Complex[] values, boolean isReal, double startTime, String title, int samplingRate) {
        XYSeries series = new XYSeries(title);
        int i = 0;
        double x;
        double y;
        for (Complex v : values) {
            if (isReal) {
                y = v.getReal();
            } else {
                y = v.getImaginary();
            }
            x = i + (startTime * samplingRate);
            series.add(x / samplingRate, y);
            i++;
        }
        return new XYSeriesCollection(series);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelImg;
    private javax.swing.JPanel jPanelReal;
    private javax.swing.JPanel jPanelReal1;
    // End of variables declaration//GEN-END:variables
}
